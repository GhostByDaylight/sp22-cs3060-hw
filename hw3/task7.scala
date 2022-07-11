def foo(list1 : List[Int], list2 : List[Int]):List[(Int, Int)] = {
    
    var listOfTuples = List[(Int, Int)]()
    var c = List[(Int, Int)]()
    var x = if (list1.length > list2.length) list2.length else list1.length
    for (i <- 0 until x) {
        var k = list1(i)
        var j = list2(i)
        
        var tuple = (k, j)
        
        c = c :+ tuple
    }

return c
}

println(foo(List(1,2,3), List(21, 22, 23)))
println(foo(List(1,2,3), List(21, 23)))
println(foo(List(1,2), List(21, 22, 23)))
