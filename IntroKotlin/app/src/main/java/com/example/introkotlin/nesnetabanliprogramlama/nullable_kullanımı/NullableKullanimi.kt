package com.example.introkotlin.nesnetabanliprogramlama.nullable_kullanımı

fun main() {

    var str1 : String? = null
    str1 = "merhaba"

    // Yöntem 1: " ? "şu demek eğer string değeri içerisindeki null ise sana null dönderirim ama değer varsa o edğeri dönderirim demektir.
    println("Sonuç 1: ${str1?.trim()}")

    // Yöntem 2: " ! " şu demek eğer string değeri içerisindeki değer olduğun ben eminim diyorsan hata olmadığına inanılıyorsa kullanılıyor.
//    var str2 : String? = null
//    println("Sonuç 2: ${str2!!.trim()}")

    // Yöntem 3 : " if koşul kullanımı " sayesinde de yapılabilyor.
    var str3 : String = "merhaba"
    if (str3 != null) {
        println("Sonuç 3: ${str3.trim()}")
    }

    // Yöntem 4: " let " kullanımı ise içerisinde değer varsa kullanılıyor ama değer null ise çalıştırmıyor.
    var str4 : String = "merhaba"
    str4.let{
        println("Sonuç 4: ${str4.trim()}")
    }
}