
import java.io.File
import java.io.PrintWriter
import scala.io.Source


        val writer = new PrintWriter(new File("file.txt"))

        for (i <- 1 to 3) {
            println("Please type out an input for line " + i)
            val input = scala.io.StdIn.readLine()
            writer.write(input + "\n")
        }

        writer.close()

