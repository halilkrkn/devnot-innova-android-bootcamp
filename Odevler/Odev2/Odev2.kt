fun main() {
    
	//     2.ÖDEV
    //  1. Soru
	val derece = sicaklikDönüşüm(10.0)
    println("1. Derece: $derece")	   
    
    // 2. Soru
    dikdortgenCevre(10,20)
    
    // 3. Soru
    val hesapla = faktoriyelHesaplama(5)
    println("3. faktoriyelHesaplama: $hesapla")
    
    // 4. Soru
    kelimeAdetGoster("innova",'n')
    
    // 5. Soru
    icAcilarToplami(16)
    
    // 6. Soru
    maasHesabi(19,8)
    
    // 7. Soru
    kotaUcreti(51,2)
	
}

fun sicaklikDönüşüm(derece:Double):Double{
    val fahrenhiet = derece * 1.8 + 32
    return fahrenhiet  
}

fun dikdortgenCevre(kısaKenar:Int, uzunKenar:Int){
    val dikdortgenCevre = 2 * (kısaKenar + uzunKenar)
    println("2. Dikdörtgen Çevre: $dikdortgenCevre")  
}

fun faktoriyelHesaplama(n: Int):Int {
    var fakto = 1
    for(i in 1..n){
		fakto *= i   
    }
    return fakto
}

fun kelimeAdetGoster(kelime: String, harf: Char){
	val harfSayisi = kelime.filter { it == harf }.count()

   println("4. Kelime : '${kelime}' kelimesi içinde ${harfSayisi} tane '${harf}' harfi var.")
}


fun icAcilarToplami(n:Int): Int{
    val icAcilarToplami = (n-2)*180
    if (n > 2){
        println("5. İç Açılar Toplamı : $icAcilarToplami")
        
    } else if(n == 2) {
         println("5. İç Açılar Toplamı : $icAcilarToplami")
    }
    
    else {
        println("5. Hata Yapildi.")
    }
    
    return icAcilarToplami   	
}

fun maasHesabi(gun: Int, gunlukSaati:Int, mesaiSaati: Int = 0) : Int {

    val calismaSaatiUcreti = 10 // çalışma saat ücreti
    val mesaiSaatiUcreti = 20 // mesai saat ücreti
    
    val calismaSaati = gun * gunlukSaati
    
    val gunlukCalismaSaatiUcreti = gun * gunlukSaati * calismaSaatiUcreti
    val gunlukMesaiSaatiUcreti = gunlukCalismaSaatiUcreti + mesaiSaati * mesaiSaatiUcreti
    
    if(calismaSaati < 160){
        println("6. Normal Çalışmaya Göre Maaş: $gunlukCalismaSaatiUcreti")
         return gunlukCalismaSaatiUcreti
    } else {
        println("6. Mesaili Çalışma Göre Maaş: $gunlukMesaiSaatiUcreti")
        return gunlukMesaiSaatiUcreti
    }
   
}

fun kotaUcreti(kullanilanGB:Int, kotaAsimiGBMiktari: Int = 1):Int{
	val elliGB = 100 // 50GB 100tl
    val herBirGB = 2 // 100/50 herbir gb 2tl'dir.
    val gbHesaplama = kullanilanGB * herBirGB
    val kotaAsimi = kotaAsimiGBMiktari * 4 
    val kotaAsimliUcret = elliGB + kotaAsimi
    if(kullanilanGB > 50){
        println("7. Kota Aşımlı Ücreti: $kotaAsimliUcret tl'dir.")
        return kotaAsimliUcret
    }else {
        println("7. Normal Ücret: $gbHesaplama tl'dir.")
		return gbHesaplama
    }
}