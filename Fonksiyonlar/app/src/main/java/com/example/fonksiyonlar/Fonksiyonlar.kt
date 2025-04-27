package com.example.fonksiyonlar

class Fonksiyonlar {

    //1. Sorunun Cevabı
    fun dereceHesaplama(c:Int) : Double {
            val f = c * 1.8 + 32
        return f

    }
// 2. sorunun cevabı
    fun dikdortgeninCevreHesaplama (a:Int,b :Int) {
           val sonuc = (a + b) * 2
                  println("dikdörtgenin çevresi : $sonuc")

    }



    // 3. sorunun cevabı
    fun faktoriyelHesaplama (a: Int) : Int {
        var sonuc = 1
        for (i in 1..a) {
            sonuc *= i
        }
        return sonuc

    }

    // If kullanarak Faktöriyel Hesaplayan Method
    fun faktoriyelHesapla1(sayi: Int): Int {
        if (sayi == 0 || sayi == 1) {
            return 1
        } else {
            var sonuc = 1
            for (i in 2..sayi) {
                sonuc *= i
            }
            return sonuc
        }
    }


    // Kelime içinde kaç adet 'a' harfi olduğunu bulan method
    fun aHarfiniSay(kelime: String): Int {
        var sayac = 0
        for (harf in kelime) {
            if (harf == 'a' || harf == 'A') {
                sayac++
            }
        }
        return sayac
    }

    //Kenar Sayısına Göre İç Açılar Toplamı

    fun icAcilarToplami (kenar : Int) : Int {
        val toplamIcAci = (kenar - 2) * 180
        return toplamIcAci
    }

    // Gün sayısına göre maaş hesaplayan method
    fun maasHesapla(gunSayisi: Int): Int {
        val toplamSaat = gunSayisi * 8
        val saatUcreti = 10
        val mesaiUcreti = 20
        val normalSaatLimiti = 160
        val maasSonucu : Int
        if (toplamSaat <= normalSaatLimiti) {
            maasSonucu = toplamSaat * saatUcreti
        } else {
            val normalSaat = normalSaatLimiti * saatUcreti
            val mesaiSaat = (toplamSaat - normalSaatLimiti) * mesaiUcreti
            maasSonucu= normalSaat + mesaiSaat
        }
        return maasSonucu
    }

    //Kota Ücreti Hesaplama
    fun kotaUcretiHesaplama (kotaMiktari : Int) : Int {
        val kotaUcreti: Int
        if (kotaMiktari <= 50) {
             kotaUcreti = 100
        }
        else {
            kotaUcreti = 100 + (kotaMiktari - 50) * 4
        }
        return kotaUcreti

    }










}



