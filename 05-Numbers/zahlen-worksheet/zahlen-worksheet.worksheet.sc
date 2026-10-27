val asBin77 = 77.toBinaryString
val asHex77 = 77.toHexString

val asBin200 = 200.toBinaryString
val asHex200 = 200.toHexString

/*ausnahmsweise so gelöst da bei einer negativen zahl im zweierkomplement alle 32 bit von Int mit im string landen.
Da das erste bit das minus symbolisiert*/
val as2CMinus77 = (-77).toBinaryString.drop(24)

val intMaxPlusOne = Int.MaxValue + 1

val addDecimals = (0.1 + 0.2)

val toByte200 = 200.toByte

val list1To20By4 = (1 to 20 by 4).toList
