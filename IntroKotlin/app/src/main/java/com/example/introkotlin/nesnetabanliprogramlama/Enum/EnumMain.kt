package com.example.introkotlin.nesnetabanliprogramlama.Enum

fun main(){
    var toplamMaliyet = ucretHesapla(100,KonserveBoyut.KUCUK)
    println(toplamMaliyet)

}

fun ucretHesapla(adet:Int, boyut: KonserveBoyut){
    when(boyut){
        KonserveBoyut.KUCUK ->
            println("Toplam maliyet : ${30 * adet} tl")
        KonserveBoyut.ORTA ->
            println("Toplam maliyet : ${80 * adet} tl")
        KonserveBoyut.BUYUK ->
            println("Toplam maliyet : ${140 * adet} tl")
    }
}