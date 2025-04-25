package com.sebnem.kotlindersleri.object_oriented_programming
// Extension kullanımı
//var olan yapıyı genişletmek
fun main() {
    val sonuc = 5 carp 2// infix yoksa 5.carp(2)
    println(sonuc)
}

//her yerden erişim olsun diye mainin altında yazıyoruz


infix fun Int.carp(sayi: Int): Int {
    return this * sayi// this(bağlı olduğu sınıfı temsil ediyor)

}