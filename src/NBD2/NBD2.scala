package NBD2

object NBD2 extends App {


  val workingDay: String = "Monday"
  val workingDay2: String = "Tuesday"
  val weekendDay: String = "Sunday"
  val other: String = "Test"

  //1
  println("ZADANIE 1")
  println(patternMatching(workingDay))
  println(patternMatching(workingDay2))
  println(patternMatching(weekendDay))
  println(patternMatching(other))


  def patternMatching(x: String): String = x match {
    case "Monday" => "Praca"
    case "Tuesday" => "Praca"
    case "Wednesday" => "Praca"
    case "Thursday" => "Praca"
    case "Friday" => "Praca"
    case "Saturday" => "Wolne"
    case "Sunday" => "Wolne"
    case _ => "Nie ma takiego dnia"
  }

  //2
  println("ZADANIE 2")
  val konto0 = new KontoBankowe() // x and y are both set to 0
  val konto100 = new KontoBankowe(100)
  println(konto100.wyplata(50))
  println(konto100.wplata(152))

  //3
  println("ZADANIE 3")
  val osoba1 = new Osoba("Andrzej", "Dada", 0)
  val osoba2 = new Osoba("Ktos", "Ktosiowy", 0)
  val osoba3 = new Osoba("Test", "Testowy", 0)
  val osoba4 = new Osoba("EEEEE", "EEEEEEEEEE", 0)

  println(osobaPatternMatching(osoba1))
  println(osobaPatternMatching(osoba2))
  println(osobaPatternMatching(osoba3))
  println(osobaPatternMatching(osoba4))

  def osobaPatternMatching(x: Osoba): String = x.imie match {
    case "Andrzej" => "Witaj Andrzej Dada"
    case "Ktos" => "Witam Pana Ktosia"
    case "Test" => "Siemaneczko Panie Testowy"
    case _ => "Witam nieznajomego Pana"
  }

  //4
  println("ZADANIE 4 ")
  val fun = (x: Int) => x * x

  def toTheSquare(x: Int, fun: Int => Int) {
    println(fun(x))
  }
  toTheSquare(5, fun)
  toTheSquare(3, fun)
  toTheSquare(4, fun)


  //5
  println("ZADANIE 5")
  val pracownik = new Osoba2("Jan","Kowalski") with Pracownik
  println(pracownik.podatek())

  val student = new Osoba2("Student", "AAA") with Student
  println(student.podatek())

  val nauczyciel = new Osoba2("Nauczyciel1", "eeee") with Nauczyciel
  println(nauczyciel.podatek())

  val studentPracownik = new Osoba2("test", "eee") with Student with Pracownik
  println(studentPracownik.podatek())

  val pracownikStudent = new Osoba2("eee", "bbb") with Pracownik with Student
  println(pracownikStudent.podatek())
}
