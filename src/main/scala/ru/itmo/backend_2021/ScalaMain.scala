package ru.itmo.backend_2021

object ScalaMain {
  def main(args: Array[String]): Unit = {
    println("Hello Scala")
  }

  def fib(n: Int): Int = {
    var first = 0
    var second = 1

    for (i <- 1 to n) {
      val sum = first + second
      first = second
      second = sum
    }

  return first
  }
}
