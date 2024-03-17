class Fraction(
    private var numerator: Int,
    private var denominator: Int
) {

    fun sum(vararg fractions: Fraction): Fraction {
        var sumNumerator = numerator
        var sumDenominator = denominator
        for (fraction in fractions) {
            val commonDenominator = sumDenominator * fraction.denominator
            sumNumerator = sumNumerator * fraction.denominator + fraction.numerator * sumDenominator
            sumDenominator = commonDenominator
        }
        return Fraction(sumNumerator, sumDenominator)
    }

    fun add(other: Fraction): Fraction {
        if (other.denominator == 0) {
            throw ArithmeticException("Impossible addition. Denominator cannot be 0!")
        }
        val commonDenominator = denominator * other.denominator
        val sumNumerator = numerator * other.denominator + other.numerator * denominator
        return Fraction(sumNumerator, commonDenominator)
    }

    fun sub(other: Fraction): Fraction {
        if (other.denominator == 0) {
            throw ArithmeticException("Impossible subtraction. Denominator cannot be 0!")
        }
        val commonDominator = denominator * other.denominator
        val subNominator = numerator * other.denominator - other.numerator * denominator
        return Fraction(subNominator, commonDominator)
    }

    fun mul(other: Fraction): Fraction {
        if (other.denominator == 0) {
            throw ArithmeticException("Impossible multiplication. Denominator cannot be 0!")
        }
        val numerators = numerator * other.numerator
        val denominators = denominator * other.denominator
        return Fraction(numerators, denominators)
    }

    fun inv(other: Fraction): Fraction {
        if (other.denominator == 0) {
            throw ArithmeticException("Impossible inversion. Denominator cannot be 0!")
        }
        val numerator = other.numerator
        val denominator = other.denominator
        return Fraction(denominator, numerator)
    }

    fun div(other: Fraction): Fraction {
        if (other.denominator == 0) {
            throw ArithmeticException("Impossible division. Denominator cannot be 0!")
        }
        return mul(other.inv(other))
    }

    private fun gcd(a: Int, b: Int): Int {
        var firstNumber = a
        var secondNumber = b

        while (secondNumber != 0) {
            val temp = secondNumber
            secondNumber = firstNumber % secondNumber
            firstNumber = temp
        }
        return firstNumber
    }

    override fun toString(): String {
        val gcd = gcd(numerator, denominator)
        val newNumerator = numerator / gcd
        val newDenominator = denominator / gcd

        return if (newDenominator == 1) {
            "$newNumerator"
        } else {
            val whole = newNumerator / newDenominator
            val remainder = newNumerator % newDenominator

            if (whole != 0) {
                if (remainder != 0) {
                    "$whole $remainder/$newDenominator"
                } else {
                    "$whole"
                }
            } else {
                "$newNumerator/$newDenominator"
            }
        }
    }
}
