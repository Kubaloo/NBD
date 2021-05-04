package NBD2

//2
class KontoBankowe(var stanKonta: Double) {

  def this() {
    this(0)
  }

  def wyplata(amount: Double): Double = {
      stanKonta -= amount
      amount
  }

  def wplata(amount: Double): Double = {
    stanKonta += amount
    stanKonta
  }


}
