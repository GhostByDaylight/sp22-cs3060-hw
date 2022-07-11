p "please type the name of a file you wish to search:"

input = gets.chomp

interesting = /Scala|scala/
important = /Python|Ruby|python|ruby/
valuable = /Haskell|haskell/


f = File.open("#{input}", "r")


f.each {|line| 
	if line =~ interesting 
		puts "This file is interesting"
	elsif line =~ important
		puts "this file is important"
	elsif line =~ valuable
		puts "this file is valuable"
	else puts "this file is worthless"
	end
}
f.close

