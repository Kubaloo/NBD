package NBD1

import scala.annotation.tailrec

object NBD1 extends App {

  val daysOfTheWeek: List[String] = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
  val map = Map(
    "Rower" -> 1000.0,
    "Woda" -> 5.0,
    "Cos" -> 333.0
  )
  val list: List[Int] = List(1, 2, 3, 0, 4, 0, 5, 6, 7, 0, 8, 0, 0, 9, 10)

  val listRzeczywiste = List(-8, 4.7, 33.12, 100)


  println(printAllDays(daysOfTheWeek))
  println(printDaysStartingWithP(daysOfTheWeek))
  println(printDaysWithWhileLoop(daysOfTheWeek))
  printDaysRecurency(0)
  reversePrintDaysRecurency(daysOfTheWeek.size - 1)
  printDaysTailRecurency(0)
  println(printDaysFoldl(daysOfTheWeek))
  println(printDaysFoldr(daysOfTheWeek))
  println(printDaysFoldlThatStartsWithP(daysOfTheWeek))
  println(collectionMapping(map))
  println(krotka())
  println(optionCase(map))
  println(removeZerosFromList(list))
  println(incrementAllElements(list))
  println(absoluteValues(listRzeczywiste))

  //1a
  def printAllDays(daysOfTheWeek: List[String]): String = {
    var createdString: String = ""
    for (n <- daysOfTheWeek) createdString = createdString + n + ", "
    createdString
  }

  //1b
  def printDaysStartingWithP(daysOfTheWeek: List[String]): String = {
    var createdString: String = ""
    for (n <- daysOfTheWeek) {
      createdString = createdString + {
        if (n.charAt(0) == 'P') n + ", " else ""
      }
    }
    createdString
  }

  //1c
  def printDaysWithWhileLoop(daysOfTheWeek: List[String]): String = {
    var createdString: String = ""
    val listSize = daysOfTheWeek.size
    var i: Int = 0
    while (i < listSize) {
      createdString = createdString + daysOfTheWeek(i) + ", "
      i += 1
    }
    createdString
  }

  //2a
  def printDaysRecurency(n: Int): String = {
    if (n == daysOfTheWeek.size) return ""
    else println(daysOfTheWeek(n))
    printDaysRecurency(n + 1)
  }

  //2b
  def reversePrintDaysRecurency(n: Int): String = {
    if (n < 0) return ""
    else println(daysOfTheWeek(n))
    reversePrintDaysRecurency(n - 1)
  }

  //3
  @tailrec
  def printDaysTailRecurency(n: Int): String = {
    if (n == daysOfTheWeek.size) return ""
    else println(daysOfTheWeek(n))
    printDaysTailRecurency(n + 1)
  }

  //4a
  def printDaysFoldl(daysOfTheWeek: List[String]): String = {
    daysOfTheWeek.foldLeft("") { (z, i) =>
      z + i + ","
    }
  }

  //4b
  def printDaysFoldr(daysOfTheWeek: List[String]): String = {
    daysOfTheWeek.foldRight("") { (z, i) =>
      z + ", " + i
    }
  }

  //4c
  def printDaysFoldlThatStartsWithP(daysOfTheWeek: List[String]): String = {
    daysOfTheWeek.foldLeft("") { (z, i) =>
      if (i.charAt(0).equals('P')) {
        println(i)
        i
      } else {
        ""
      }
    }
  }

  //5
  def collectionMapping(map: Map[String, Double]): Map[String, Double] = {
    map.map({ case (z, i) => z -> i * 0.9 })
  }

  //6
  def krotka(): Unit = {
    val krotka: (Int, Double, String) = (1, 1.0, "Test")
    println(krotka._1)
    println(krotka._2)
    println(krotka._3)
  }


  //7
  def optionCase(map: Map[String, Double]) {
    println(show(map.get("Rower")))
    println(show(map.get("Test")))
  }

  def show(x: Option[Double]) = x match {
    case Some(s) => s
    case None => "?"
  }

  //8
  def removeZerosFromList(list: List[Int]): List[Int] = {
    list.filter(x => x != 0)
  }

  //9
  def incrementAllElements(list: List[Int]): List[Int] = {
    list.map(i => i + 1)
  }

  //10
  def absoluteValues(list: List[Double]): List[Double] = {
    list.filter(i => i <= 12 && i >= -5.0).map(p => p.abs)
  }
}
