fun main() {
    val firstNumber = Fraction(11, 11)
    val secondNumber = Fraction(3, 6)
    val thirdNumber = Fraction(1, 0)

    try {
        println(firstNumber) //ok 11/11 = 1     //ok
        println(secondNumber) //ok 3/6 = 1/2    //ok
        println(thirdNumber)                    //ok - złapało wyjątek
    } catch (e: ArithmeticException) {
        println("Exception: ${e.message}")
    }

    try {
        val sum = firstNumber.add(secondNumber) // ok 1 1/2, nie łapie wyjątku, nie ma 0
        println(sum)
    } catch (e: ArithmeticException) {
        println("Exception: ${e.message}")
    }

    try {
        val secondSum = firstNumber.add(thirdNumber) // ok, łapie wyjątek
        println(secondSum)
    } catch (e: ArithmeticException) {
        println("Exception: ${e.message}")
    }

    try {
        val sub = firstNumber.sub(secondNumber) //ok 1 - 1/2 = 1/2
        println(sub)
    } catch (e: ArithmeticException) {
        println("Exception: ${e.message}")
    }

    try {
        val secondSub = firstNumber.sub(thirdNumber)  // ok, łapie wyjątek
        println(secondSub)
    } catch (e: ArithmeticException) {
        println("Exception: ${e.message}")
    }

    try {
        val mul = firstNumber.mul(secondNumber) // ok, 1 * 1/2 = 1/2
        println(mul)
    } catch (e: ArithmeticException) {
        println("Exception: ${e.message}")
    }

    try {
        val secondMul = firstNumber.mul(thirdNumber)
        println(secondMul)
    } catch (e: ArithmeticException) { // ok, łapie wyjątek
        println("Exception: ${e.message}")
    }

    try {
        val inv = firstNumber.inv(secondNumber) // ok
        println(inv)
    } catch (e: ArithmeticException) {
        println("Exception: ${e.message}")
    }

    try {
        val secondInv = firstNumber.inv(thirdNumber)
        println(secondInv)
    } catch (e: ArithmeticException) { // ok, łapie wyjątek
        println("Exception: ${e.message}")
    }

    try {
        val div = firstNumber.div(secondNumber) // ok
        println(div)
    } catch (e: ArithmeticException) {
        println("Exception: ${e.message}")
    }

    try {
        val secondDiv = firstNumber.div(thirdNumber)
        println(secondDiv)
    } catch (e: ArithmeticException) { // ok, łapie wyjątek
        println("Exception: ${e.message}")
    }
}

