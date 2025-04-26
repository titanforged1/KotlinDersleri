package com.sebnem.kotlindersleri.odevler

fun main() {
    val fahrenhiet = convertCelciusToFahrenhiet(21.5f)
    println(fahrenhiet)

    val areaOfRectangle = calculateAreaOfRectangle(5, 7)
    println(areaOfRectangle)

    val calculateFactorial = factorial(5)
    println(calculateFactorial)


    val sonuc = countNumberOfLetterA("merhaba dünya")
    println("a harfi sayısı: $sonuc")


    val sum = calculateInteriorAngleSum(6)
    println(sum)


    println(calculateSalary(20))  //
    println(calculateSalary(22))  //

    println(calculateInternetFee(45))
    println(calculateInternetFee(60))


}