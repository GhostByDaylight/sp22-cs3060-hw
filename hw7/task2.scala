/* Let’s get back to Task 3 of HW4 (Scala) where we developed a mini web crawler.
You know that in Task 3c we did not use parallel computation (i.e. multi-Threaded processing) last time.
Your current task is to do exactly that, i.e., redo Task 3c through parallel computation. You need to use the
concept of par collection, and concept of functional programming while ensuring that your program is
free from side effect. */

import scala.io.StdIn.readLine
import scala.io.Source

print("Please input the url you would like to check: ")
val url = readLine()
val page = io.Source.fromURL(url)("ISO-8859-1").mkString
val linkPattern = "(?i)<a.+?href=\"(http.+?)\".*?>(.+?)</a>".r

val matchingLinks = linkPattern.findAllIn(page).matchData.toList.map(_.group(1)).par
var longLinks = 0

matchingLinks.foreach { link =>
    val processedLink = io.Source.fromURL(link)("ISO-8859-1").mkString
    if (processedLink.size > 50)
        longLinks += 1
}

println("Total number of long sites: " + longLinks)