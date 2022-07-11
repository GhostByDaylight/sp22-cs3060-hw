
/* Go to http://www.textfiles.com/stories/ and check that this site 1 hosts multi-
ple stories while each story is in a textfile. Download two textfiles of your choice, which have atleast 1000
words, and save the files as story1.txt and story2.txt. Your program needs to read these files and pro-
cess them to collect some statistics. In particular, for each story x report the number of unique words in x,the fifth-most frequent word in x and its frequency. Also, find the number of unique words over these two
stories (i.e., if both the stories have a same word w , then we count it only once). Also, find the number of
unique common words over these two stories. Hints: You may use List, Map (or HashMap), and Set data
structures as they are available in Scala. You may design a regular expression to define a word. */
import scala.io.Source
import scala.collection.immutable.ListMap


def getWordFreq(wordList: List[String]): Map[String, Int] = {
	val wordlistMap = scala.collection.mutable.Map.empty[String, Int]
	for (word <- wordList) {
		val n = wordlistMap.getOrElse(word, 0)
      	wordlistMap += (word -> (n + 1))
	}
	return wordlistMap.toMap
}



val storyOne = "story1.txt"
val storyTwo = "story2.txt"



val lines1 = Source.fromFile(storyOne).getLines.mkString.toLowerCase
val lines2 = Source.fromFile(storyTwo).getLines.mkString.toLowerCase


val words1 = """([A-Za-z'])+""".r.findAllIn(lines1).toList
val words2 = """([A-Za-z'])+""".r.findAllIn(lines2).toList

var map1 = countWords(words1)
var map2 = countWords(words2)
map1 = ListMap(map1.toSeq.sortWith(_._2 > _._2):_*)
map2 = ListMap(map2.toSeq.sortWith(_._2 > _._2):_*)
      

var arrMap1 = map1.toArray
var arrMap2 = map2.toArray
      
val newLines = words1.distinct
val newLines2 = words2.distinct
      
var sameWords = 0
val newList = List.concat(newLines, newLines2)

      
println("Number Of Unique Words in Story 1 is: " + newLines.distinct.length)
println("The Fifth-Most Frequent Word And Its Frequency Is: " + arrMap1(4))
      
      
println("Number Of Unique Words in Story 2 is:" + newLines2.distinct.length)
println("The Fifth-Most Frequent Word And Its Frequency Is: " + arrMap2(4))
      
println("The Number Of Unique Words In Both stories is: " + newList.distinct.length)

val arrLines = lines.toArray
val arrLines2 = lines2.toArray
val arrLines3 = arrLines.intersect(arrLines2)

println("The Number Of Same Words In The Compared Two Stories Is: " + arrLines3.length)
     
    
