package com.sebnem.kotlindersleri.object_oriented_programming

class Functions {
    // Void - sadece işlem yapan
    fun selamla1(){// swift -> func
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }
    //return - hem çalışan hem veri transferi yapan
    fun selamla2() : String {
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }

    //parameter zorunlu değil ihtiyaç durumunda
    fun selamla3(isim: String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }
    //Overloading (mülakat sorusu)
    // Bir sınıf içerisinde aynı isimde fonksiyonları tekrar kullanmak

    fun topla(sayi1: Int, sayi2: Int){
        println("Toplama : ${sayi1+sayi2}")
    }
    fun topla(sayi1: Double, sayi2: Double){
        println("Toplama : ${sayi1+sayi2}")
    }
    fun topla(sayi1: Int, sayi2: Int,isim: String){
        println("Toplama : ${sayi1+sayi2} - İşlem yapan : $isim")
    }


    //
}