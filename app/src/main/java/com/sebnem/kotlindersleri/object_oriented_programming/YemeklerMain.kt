package com.sebnem.kotlindersleri.object_oriented_programming

fun main() {
    //nesne oluşturma
    val y1 = Yemekler(100,"köfte",249)
    //Deger okuma
    y1.bilgiAl()

    //Değer değiştirme - atama
    y1.fiyat= 350
    y1.bilgiAl()

    println("--------------")
    val y2 = Yemekler(200,"baklava",300)
    y2.bilgiAl()
    y2.ad = "Soguk Baklava"
    y2.bilgiAl()

}