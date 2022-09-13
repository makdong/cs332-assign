package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
//    print(pascal(1, 3))
//    println()
//    print(balance("((())".toList))
//    println()
//    print(balance("((()))".toList))
//    println()
//    print(balance("((())))".toList))
//    println()
//    print(balance("((())fewfwe".toList))
//    println()
//    print(balance("(sv(dfs()grr))fnewi".toList))
//    println()

    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

//    print(countChange(4, List(1, 2)))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0) 1
    else if (c == r) 1
    else pascal(c - 1, r -1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balance_recursive(chars: List[Char], left_count: Int): Boolean = {
     if (chars.isEmpty) left_count == 0
     else if (left_count < 0) false
     else {
      if (chars.head == '(') balance_recursive(chars.tail, left_count + 1)
      else if (chars.head == ')') balance_recursive(chars.tail, left_count - 1)
      else balance_recursive(chars.tail, left_count)
     }
    }
    balance_recursive(chars, 0)
  }


  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (coins.isEmpty) 0
    else {
      if (money - coins.head >= 0) countChange(money - coins.head, coins) + countChange(money, coins.tail)
      else countChange(money, coins.tail)
    }
  }
}
