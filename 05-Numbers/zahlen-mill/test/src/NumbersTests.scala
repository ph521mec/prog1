class NumbersTests extends munit.FunSuite {
  test("fac0") {
    val obtained = fac(0)
    val expected = BigInt("1")
    assertEquals(obtained, expected)
  }
  test("fac1") {
    val obtained = fac(1)
    val expected = BigInt("1")
    assertEquals(obtained, expected)
  }
  test("fac3") {
    val obtained = fac(3)
    val expected = BigInt("6")
    assertEquals(obtained, expected)
  }
  test("fac25") {
    val obtained = fac(25)
    val expected = BigInt("15511210043330985984000000")
    assertEquals(obtained, expected)
  }

}
