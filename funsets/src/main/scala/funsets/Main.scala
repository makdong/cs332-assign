package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 2))
  println(contains(singletonSet(1), 1))
  println(contains(singletonSet(1), -1))
  println(contains(union(singletonSet(2),singletonSet(1)), 23))
  println(contains(union(singletonSet(23),singletonSet(1)), 23))
  val temp1 : Set = singletonSet(1)
  val temp2 : Set = singletonSet(2)
  val temp23 : Set = singletonSet(23)
  println(contains(intersect(union(temp1, temp2), union(temp1, temp23)), 23))
  println(contains(intersect(union(temp1, temp2), union(temp1, temp23)), 1))
  println(contains(diff(union(temp1, temp2), union(temp1, temp23)), 23))
  println(contains(diff(union(temp1, temp2), union(temp1, temp23)), 1))
  println(contains(diff(union(temp1, temp2), union(temp1, temp23)), 2))
  println(contains(filter(union(temp1, temp2), x => x < 0), 2))
  println(contains(filter(union(temp1, temp2), x => x > 0), 2))
  println(exists(union(temp1, temp2), x => x > 0))
  println(exists(union(temp1, temp2), x => x < 0))
  val temp1001 : Set = singletonSet(1001)
  val temp1002 : Set = singletonSet(1002)
  println(exists(union(temp1001, temp1002), x => x < 0))
  println(exists(union(temp1001, temp1002), x => x < 0))
  println(exists(map(union(temp1, temp2), x => x - 5), x => x < 0))
  println(exists(map(union(temp1, temp2), x => x - 5), x => x > 0))

}
