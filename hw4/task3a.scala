/* Write a Scala program which takes a webpage url (say x) from the user (or as a pa-
rameter), and then download webpage x. Count the number of images (i.e. "<img .../>") and scripts (i.e.
"<script ...> </script>") present in x. As an example, url x can be "https://www.cnn.com". */


import scala.io.StdIn.readLine
import scala.io.Source

print("Please input the url you would like to check: ")
val url = readLine()
var imgCounter = 0
var scriptCounter = 0


val page = io.Source.fromURL(url)("ISO-8859-1").mkString
val linkRegex = "(?i)<a.+?href=\"(http.+?)\".*?>(.+?)</a>".r
val imagePattern = """(http)?s?:?(\/\/[^"']*\.(jpg|jpeg|gif|png|svg))""".r
val scriptPattern = """(?s)<script.*?</script>""".r

val numImages = imagePattern.findAllIn(page).matchData.toList
val numScripts = scriptPattern.findAllIn(page).matchData.toList


println("Number of images in " + url + ":  " + numImages.size)
println("Number of scripts in " + url + ":  " + numScripts.size)