def arrayFuncton(arr)
	#Use the each method to find the last character in each string
	arr.each {|word|
		p "The last character in #{word} is #{word[-1, 1]}"
	}
	#Use the select method to find all the strings whose lengths are less than 4
	arr.select { |element|
		if element.length < 4
			p "#{element} has less than 4 letters"
			end
	}
	#Use the map method to build a new array with upper-case versions of the strings
	newArray = arr.map { |element|
		element.upcase
	}
	p newArray
	#Use inject method to find the sum of the length  of all strings
	sumLength = arr.inject(0) {|sum, current| 
		sum + current.length
	}
	p "The total number of characters in the string array is #{sumLength}"

end

arrayOfStrings = ["array", "of", "strings", "put", "into", "a", "function", "using", "several", "different", "methods", "thanks"]
arrayFuncton(arrayOfStrings)