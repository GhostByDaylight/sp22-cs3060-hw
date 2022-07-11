/* Do Task 3b again, but now you are using the par (i.e. parallel collection). How much
time does the concurrency usage save compared to the serial run in Task 3b?
*/
import scala.io.StdIn.readLine
import scala.io.Source

print("Please input the url you would like to check: ")
val url = readLine()
println("--- Calculating Execution Time ---")

val page = io.Source.fromURL(url)("ISO-8859-1").mkString
val linkPattern = "(?i)<a.+?href=\"(http.+?)\".*?>(.+?)</a>".r
val imagePattern = """(http)?s?:?(\/\/[^"']*\.(jpg|jpeg|gif|png|svg))""".r

val startSerial = System.currentTimeMillis()

val numLinksSerial = linkPattern.findAllIn(page).matchData.toList.map(_.group(1))
var numImagesSerial = imagePattern.findAllIn(page).matchData.toList

var totalImagesSerial = numImagesSerial.size

numLinksSerial.foreach { link =>
    val processedLink = io.Source.fromURL(link)("ISO-8859-1").mkString
    numImagesSerial = imagePattern.findAllIn(processedLink).matchData.toList
    totalImagesSerial += numImagesSerial.size
    
}
println()

val endSerial = System.currentTimeMillis()
val parallelStart = System.currentTimeMillis()

val numLinksParallel = linkPattern.findAllIn(page).matchData.toList.map(_.group(1)).par
var numImagesParallel = imagePattern.findAllIn(page).matchData.toList.par
var totalImagesParallel = numImagesParallel.size

numLinksParallel.foreach { link =>
    val processedLink = io.Source.fromURL(link)("ISO-8859-1").mkString
    numImagesParallel = imagePattern.findAllIn(processedLink).matchData.toList.par
    totalImagesParallel += numImagesParallel.size
    
}
println()

val parallelEnd = System.currentTimeMillis()

println("\nSerial Execution Time:    " + ((endSerial - startSerial)/1000.0) +  " seconds")
println("Parallel Execution Time:  " + ((parallelEnd - parallelStart)/1000.0) +  " seconds")
println("Time Saved With Parallel: " + (((endSerial - startSerial)/1000.0) - (parallelEnd - parallelStart)/1000.0) + " seconds")
