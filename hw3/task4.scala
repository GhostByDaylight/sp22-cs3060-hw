/* Write a Scala program called sumO f Power to calculate the sum 11 + 2
2 + 3
3 + ... +
1010 without using an exponent operator. You can do this using nested for loops. Verify: The sum equals
10405071317.
*/


var i:Long = 0
var j:Long = i
var value:Long = 0
var result:Long = 0


for (i <- 1 to 10) {
  result = 1
  for (j <- 1 to i) {
    result *= i
    } 
      value += result
  }
println(value)
