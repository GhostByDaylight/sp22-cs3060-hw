import scala.io.StdIn.readLine
import scala.io.Source

def countImages (url: String): Int = {
    val page = io.Source.fromURL(url)("ISO-8859-1").mkString

    val imgRegex = """(http)?s?:?(//[^"'].(jpg|jpeg|gif|png|svg))""".r

    val images = imgRegex.findAllIn(page).matchData.toList
    images.size
}

println("Please input the url you would like to check: ")
val url = readLine()
val page = io.Source.fromURL(url)("ISO-8859-1").mkString

val linkRegex = "(?i)<a.+?href="(http.+?)".?>(.+?)</a>".r

val links = linkRegex.findAllIn(page).matchData.toList.map(.group(1)).par :+ url
val totalImages = links.map(link => countImages(link))

println("Total Images Found: " + totalImages.reduce(+_))
