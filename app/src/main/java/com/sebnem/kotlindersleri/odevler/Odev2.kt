package com.sebnem.kotlindersleri.odevler

fun convertCelciusToFahrenhiet(degreeAsCelcius: Float): Float {
    return degreeAsCelcius * 1.8f + 32
}

fun calculateAreaOfRectangle(length: Int, width: Int): Int {
    return length * width
}

fun factorial(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    }
    var factorial = 1
    for (i in 2..n) {
        factorial *= i
    }
    return factorial
}

fun countNumberOfLetterA(text: String): Int {
    return text.count { it == 'a' }
}

fun calculateInteriorAngleSum(sideCount: Int): Int {
    return (sideCount - 2) * 180
}

const val REGULAR_HOURS = 160
fun calculateSalary(numberOfDays: Int): Int {
    val totalHours = numberOfDays * 8

    return if (totalHours <= REGULAR_HOURS) {
        totalHours * 10
    } else {
        (REGULAR_HOURS * 10) + ((totalHours - REGULAR_HOURS) * 20)
    }
}

const val GB_LIMIT = 50
fun calculateInternetFee(usedGB: Int): Int {

    return if (usedGB <= GB_LIMIT) {
        100
    } else {
        val exceededGB = usedGB - GB_LIMIT
        100 + (exceededGB * 4)
    }
}
