package com.example.fonksiyonlar

fun main() {
    //class ı çağırdık!
val fonksiyonlar = Fonksiyonlar()

    val fsonuc = fonksiyonlar.dereceHesaplama(98)
    println("Fsonuc = $fsonuc")

//Dikdörtgenin Çevresini Hesaplama
    val a = 40
    val b = 10

fonksiyonlar.dikdortgeninCevreHesaplama(a,b)

// Faktöriyel Hesaplama 1
    val sayi = 6

    val faktoriyelSonucu = fonksiyonlar.faktoriyelHesaplama(sayi)

    println("$sayi sayısının faktöriyeli: $faktoriyelSonucu")

// Faktöriyel Hesaplama 2
    val sayi1 = 5

    val faktoriyelSonucu1 = fonksiyonlar.faktoriyelHesapla1(sayi1)

    println("$sayi1 sayısının faktöriyeli: $faktoriyelSonucu1")

// Kelime içinde kaç adet 'a' harfi olduğunu bulan method
    val kelime = "Ankara"

    val aSayisi = fonksiyonlar.aHarfiniSay(kelime)

    println("Kelimenin içinde $aSayisi adet 'a' harfi var.")

// İç Açılar Toplamı Yapan Fonksiyon
    val kenarSayisi = 5

    val icAcilarToplami = fonksiyonlar.icAcilarToplami(kenarSayisi)
    println("Kenar sayısına göre iç açılar toplamı = $icAcilarToplami")

    // Gün sayısına göre maaş hesaplayan method
    val gunSayisi = 25

    val maas = fonksiyonlar.maasHesapla(gunSayisi)

    println("$gunSayisi günde kazanılan maaş: €$maas")



    // Kota Ücreti
    val kotaMiktari = 75

    val kotaToplamUcret = fonksiyonlar.kotaUcretiHesaplama(kotaMiktari)
    println("Toplam Kota Ücreti : $kotaToplamUcret")

}





