/* Write a function called mySplit which, given a string and a specific character, return
a list which is substrings of the original string from one instance of the specific character to the next. Of
course, do this without using built-in functions to the extent possible.
An example: if the given string is pq3xyz33abc and given char is 3, then the output should be List("xyz",
""). */

def mySplit(testString: String, testChar: Char):List[String] = {
  var returnedList = List[String]()
  var emptyString:String = ""
  //var bound:Boolean = false
  var i = 0
  
  
  while (i < testString.length) {
    if (testString(i) == testChar) {
      i += 1
      //bound = true
       
    
      
      while (i < testString.length && testString(i) != testChar) {
          
          
            emptyString = emptyString :+ testString(i)
            i += 1
      
      }
      if (i == testString.length) {
           // bound = false
          }
      else {
        returnedList = returnedList :+ emptyString
        emptyString = ""
      }
    }
    
    
    else {
      i += 1
    }
  
  
  
  
  }
  returnedList
}

println("Please input a string you would like to test: ")
var userString = scala.io.StdIn.readLine()
println("Please input a character to filter out: ")
var userChar = scala.io.StdIn.readLine()
println(mySplit(userString, userChar(0)))
