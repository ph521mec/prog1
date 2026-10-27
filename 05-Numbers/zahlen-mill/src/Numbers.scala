@main def main() =
  println(51966.toBinaryString);
  println(51966.toHexString);
  println(Int.MaxValue + 1);
  println(0.1 + 0.2);
  println(fac(25));
  println((1 to 20 by 4).toList);

def fac(n: BigInt): BigInt = if n == 0 then 1 else n * fac(n - 1)
