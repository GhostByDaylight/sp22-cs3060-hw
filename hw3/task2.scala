import scala.io.Source
import java.io.File



def checkPattern (pat: String) : Unit = {
		
		
		if (pat == "ruby" || pat == "cplus") {
			println("The file is ok")
		}
		else if (pat == "haskell" || pat == "scala") {
			println("The file is great")
		}
		else {
			println("The file is uninteresting")
		}
	

}
println("Please type the name of the file you wish to search")
val input = scala.io.StdIn.readLine()


val lines = Source.fromFile(input).getLines
for (line <- lines) {
	checkPattern(line)
}
	



