package com.sebnem.kotlindersleri.standart_programlama

fun main() {
    val yas = 19

    println(yas <= 17 )
    if(yas >= 18){
        println("Resitsiniz")
    }else{
        println("Resit Degilsiniz!")
    }


    val ka = "admin"
    val s = 123456
    val sayi = 10
    if (ka == "admin" && s == 123456){ //&& and(ve) true && true ise true diğer durumlarda false
        println("Hoş Geldiniz")
    }else{
        println("Hatalı giriş")
    }

    if(sayi == 9|| sayi == 10) {
        println("sayi 9 veya 10 dur")
    }else{
        println("sayi 9 veya 10 değildir")
    }
    // when, Diğer dillerde switch
    val number = 1

    when(number){
        1 -> println("Sayi 1'dir")
        2 -> println("Sayi 2'dir")
        else -> println("Tanımlanmayan sayi")
    }


}