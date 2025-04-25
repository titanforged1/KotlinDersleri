package com.sebnem.kotlindersleri.object_oriented_programming

fun main() {
    val f = Functions()

    // void = Unit
    f.selamla1()


    //return
    val gelenSonuc= f.selamla2()
    println("Gelen Sonuc: $gelenSonuc")

    //parameter
    f.selamla3("Ayse")

    //overloading
    f.topla(10,20,"beyza")
}