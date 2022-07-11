/* Also, your program needs to count how many webpages (found in Task 3b) have more
than 50 characters. */

import scala.io.StdIn.readLine
import scala.io.Source

print("Please input the url you would like to check: ")
val url = readLine()
val page = io.Source.fromURL(url)("ISO-8859-1").mkString
val linkPattern = "(?i)<a.+?href=\"(http.+?)\".*?>(.+?)</a>".r

val matchingLinks = linkPattern.findAllIn(page).matchData.toList.map(_.group(1))
var longLinks = 0

matchingLinks.foreach { link =>
    val processedLink = io.Source.fromURL(link)("ISO-8859-1").mkString
    if (processedLink.size > 50)
        longLinks += 1
}

println("Total number of long sites: " + longLinks)