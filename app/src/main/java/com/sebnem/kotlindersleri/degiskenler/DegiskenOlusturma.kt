package com.sebnem.kotlindersleri.degiskenler

fun main() {
    var id = 1
    var ad = "Mont"
    var resim = "mont.png"
    var puan = 4.7
    var fiyat = 4500
    var stokDurum = true

    println("Id : $id ")
    println("Ad : $ad")
    println("Resim : $resim")
    println("Puan : $puan")
    println("Fiyat : $fiyat")
    println("Stok : $stokDurum")

    //sabitler
    var sayi = 30
    sayi = 180
    println(sayi)

    val numara = 50
    println(numara)

    //tür dönüşümü
    //1 sayısaldan sayısala dönüşüm

    val d = 89.56
    val i = 34
    val sonuc1 = d.toInt()
    val sonuc2 = i.toDouble()
    println(sonuc1)
    println(sonuc2)

    //sayısaldan metine dönüşüm

    var x = 85
    val sonuc3 = x.toString()
    println(sonuc3)

    // metinden sayısala dönüşüm

    val yazi = "48"
    val sonuc4 = yazi.toIntOrNull()
    println(sonuc4)


}