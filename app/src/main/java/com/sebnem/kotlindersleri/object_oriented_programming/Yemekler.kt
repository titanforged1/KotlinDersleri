package com.sebnem.kotlindersleri.object_oriented_programming

data class Yemekler(var id: Int, var ad:String,var fiyat:Int) {
    //constructor - init fonksiyonu
    //Bu sınıftan nesne oluştuğunda çalışsın.
    init {
        println("***** Nesne oluştu *****")
    }

    fun bilgiAl(){
        println("--------------")
        println("Id : ${id}")
        println("Ad : ${ad}")
        println("Fiyat : ${fiyat}")
    }
    // this : Bulunduğu sınıfı temsil eder. Swift dilinde self
    //super : Kalıtım ile bir üst sınıfı temsil eder.
}