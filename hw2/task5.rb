=begin
(12 points) Task #5: In this task, your code creates a random list of 50 shape objects, then traverses the list
from start to end, and computes the total area of the shape objects. First you need to implement the class
hierarchy diagram of the shape types, which is attached. Shape is an abstract class which has only a "color"
attribute whereas (regular) Octagon class and (regular) Hexagon class are concrete children of Shape class,
and they have more attributes and constructors. Note that you do not know beforehand the order of the
shape objects (i.e. Octagons and Hexagons) created in the random list, e.g., you do not know beforehand
whether the 1st item is Octagon or Hexagon. Writing readme carries 1 point.
Note. When you traverse the list to calculate the total area, you call the area() function of each shape
object (without considering whether it is Ocagon or Hexagon). That means, you will use the concept of
polymorphism.
Hint: While building the list of shape objects, use rand(2) to generate a random number 0 or 1; if 0, then
you may add a Octagon object, else add a Hexagon object to the list.
=end


class Shape
		@@color = "blue"
end

class Octagon < Shape
	attr_accessor :side
	def initialize()
		@side = 2.0
	end
	def area()
		return 2 *(side * side) * (1 + Math.sqrt(2))
	end
end

class Hexagon < Shape
	attr_accessor :side
	def initialize()
		@side = 3.0
	end
	def area()
		return ((3 * Math.sqrt(3)) / 2) * (side * side)
	end
end



size = 50
numOct = 0
numHex = 0
list = []
for val in 0..size-1
	randomVal = rand(2)
	if randomVal == 0
		oct = Octagon.new()
		numOct += 1
		list.push(oct)
	else
		hex = Hexagon.new()
		numHex += 1
		list.push(hex)
	end
end

p "The total number of Octagons is #{numOct}"
p "The total number of Hexagons is #{numHex}"



totalArea = 0
list.each {|element|
	totalArea += element.area()
}

p "The total area of all the shape objects is #{totalArea}"
