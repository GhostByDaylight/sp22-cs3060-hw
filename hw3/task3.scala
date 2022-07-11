/* Write a Scala program which prints the string “The cube root of x is y” 10 times while 
substituting x by numbers from 15 to 24 where y is x 1/3 */

def foo(x: Double) = {  
        var res:Double = 0
           
      

        res= scala.math.cbrt(x)
        println("result: "+res);
 
}
var Range = 15 to 24
var test:Double = 0.0
for (test <- Range) {
  foo(test)
}
