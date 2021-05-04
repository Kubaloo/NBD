package NBD2

trait Pracownik extends Osoba2 {
  var pensja: Double = 1000.0;

  override def podatek(): Double = pensja * 0.2
}
