/* Write a function foo which take a list b of strings as input. For each string s in b, foo uses the higher-order functon map to compute the number of unique characters present in string s. Finally foo returns a new list containing these numbers. As an exmaple, if T is ["pfcaabcdb", cbcdde], then foo should return [6,4] */




def foo1(b: List[String]):List[Int] = return b.map(_.distinct.length)
println(foo1(List("pfcaabcdb", "cbcdde")))




/* Write a function foo which takes a list of b1 integers as input. Function foo needs to construct (and return) a list b2 where b2 has the same items as b1, but pair-wise swapped. As an example, if b1 is List(3,4,15,16,17,18) then b2 is List(4,3,16,15,18,17). If the list has an odd number then the last element should stay in place. if input b1 is List(3,4,15,16,17) then b2 should be List(4,3,16,15,17) */

def foo2(b1: List[Int]) : List[Int] = {
  var b2:List[Int] = List()
  for (i <- 0 to b1.size-1) {
    if ((i % 2) == 1) {
      b2 = b2 :+ b1(i)
      b2 = b2 :+ b1(i-1)
    }
    else if (i == (b1.size-1)) {
      b2 = b2 :+ b1(i)
    }
  }
  return b2
  
}
println(foo2(List(3,4,15,16,17,18)))
println(foo2(List(3,4,15,16,17)))
