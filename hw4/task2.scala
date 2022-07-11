/* In this task, your code creates a random list of 25 shape objects, then traverses the list
from start to end, and computes the total area of the shape objects. First you need to implement the class
hierarchy diagram of the shape types, which is available in the same directory. Shape is an abstract class
which has only a "color" attribute whereas Circle class, and Hexagon class are concrete children of Shape
class. Note that you do not know beforehand the order of the shape objects (i.e. Circles, and Hexagons)
created in the random list, e.g. you do not know beforehand whether the 1st item is Circle or Hexagon.
Writing README carries 1 point.

Note. When you traverse the list to calculate the total area, you need to call the area() function of each
shape object.

Hint: While building the list of shape objects, generate a random number 0 or 1; if 0, then you may add a
Circle object; else add a Hexagon object to the list. */

import scala.collection.mutable.ListBuffer

class Shape {
	var color:String = "blue"
	def area():Double = {
		return 0
	}
}

class Circle extends Shape {
	var radius:Double = 2.0
	
	override def area():Double = {
		return 3.14 * radius * radius
	}
}

class Hexagon extends Shape {
	var side:Double = 3.0
	
	override def area():Double = {
		return ((3 * java.lang.Math.sqrt(3) * (side * side)) / 2)
	}
}


var size:Int = 25
var numCirc:Int = 0
var numHex:Int = 0
var shapeList = ListBuffer[Shape]()

for (i <- 0 until size) {
	var randomVal = scala.util.Random
	if (randomVal.nextInt(2) == 0) {
		var circ = new Circle
		numCirc += 1
		shapeList += circ
	}
	else {
		var hex = new Hexagon
		numHex += 1
		shapeList += hex
	}

}
//println(shapeList)
println("Number of Circles: " + numCirc)
println("Number of Hexagons: " + numHex)

var totalArea:Double = 0

for (i <- 0 until shapeList.length) {
	//println(shapeList(i).area())
	totalArea = totalArea + shapeList(i).area()
}
println("The Total area is: " + totalArea)






