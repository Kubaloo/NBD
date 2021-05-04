package NBD2

trait Nauczyciel extends Pracownik {
  override def podatek(): Double = pensja * 0.1
}
