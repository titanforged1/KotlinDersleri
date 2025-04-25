package com.sebnem.kotlindersleri.standart_programlama

fun main() {
    //1,2,3
    for (i in 1..3) { // swift 1...3, i= index(Dizilerde ki indeks numara)
        println("Döngü 1: $i")
    }
    // 10 ile 20 arasında 5 er artsın
    for (x in 10..20 step 5) {
        println("Döngü 2: $x")
    }
    for (x in 20 downTo 10 step 5) {
        println("Döngü 3: $x")
    }

    //1,2,3
    var sayac = 1
    while (sayac < 4){ // hangi sayıyı görmek istiyorsak bir fazlasını yazacağız
        println("Döngü 4 : $sayac")
        sayac+=1//sayac = sayac +1
    }

    //1,2,3,4,5 - Döngüleri Kontrol Etmek isteyebilirz bunları 'break' ve 'continue' ile yaparız
    for (i in 1..5) {
        if (i == 3){
            break//döngüyü durdurur
        }
        println("Döngü 5 : $i")
    }
    for (i in 1..5) {
        if (i == 3){
            continue//bulunduğu adımı pas geçer
        }
        println("Döngü 6 : $i")
    }


}