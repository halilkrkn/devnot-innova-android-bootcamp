package com.example.introkotlin.nesnetabanliprogramlama.hataayiklama

fun main() {
    val x = 10
    val y = 2

    val dizi = Array<Int>(2){0}

    try {
        println("Sonuç : ${x/y}")
        println("İşlem Tamam")
        dizi[4] = 8
    }catch (e:Exception){
        if (e is ArithmeticException){
            println("Bölen Sıfır Olamaz.")
        }
        if (e is ArrayIndexOutOfBoundsException){
            println("Dizinin Boyutunu Aştınız.")
        }
    }

/*    catch (e: ArithmeticException){
        println("Bölen Sıfır Olamaz.")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("Dizinin Boyutunu Aştınız.")
    }
*/
}