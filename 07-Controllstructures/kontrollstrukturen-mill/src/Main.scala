import scala.io.StdIn.readLine
import scala.compiletime.ops.double
@main def main() =
  val noten = Array(1.5, 1.7, 3.2, 5.0, 2.3, 1.1)

  println(f"Meine Durchschnittsnote ist: ${durchschnitt(noten)}%.2f")
  println(f"Meine Bestnote ist: ${beste(noten)}")
  println(f"Meine schlechteste Note ist: ${schlechteste(noten)}")

def durchschnitt(werte: Array[Double]): Double =
  if (werte.length == 0) Double.NaN
  else
    var summe = 0.0
    for i <- werte
    do summe += i
    summe / werte.length

def beste(werte: Array[Double]): Double =
  if (werte.length == 0) Double.NaN
  else
    var beste = Double.MaxValue
    for
      i <- werte
      if i < beste
    do beste = i
    beste

def schlechteste(werte: Array[Double]): Double =
  if (werte.length == 0) Double.NaN
  else
    var schlechteste = Double.MinPositiveValue
    for
      i <- werte
      if i > schlechteste
    do schlechteste = i
    schlechteste
