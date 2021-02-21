/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author User
 */
public class Yazilim extends Cihaz implements Yuklenebilir,Sorgula{
    int kodSatirSayisi;
    private String isim;
    int cigolayt;
    public int versiyon;
    public int boyut;
    
    public int boyutHesapla(){
        
        return 1024*cigolayt;
    }

    @Override
    public double fiyatHesapla() {
        return fiyat*kodSatirSayisi / 60;
    }

    @Override
    public void yukle(Bilgisayar b) {
        int indis = b.yazilimVarmi(this);
        if( indis == -1){
            System.out.println("Yazılım yükleniyor ....");
            b.yazilimlar.add(this);
            System.out.println("Başarıyla yükelendi. ^_^");
        }
        else{
            System.out.println("Bu yazılım zaten yüklü ! ^o^");
        }
    }

    @Override
    public void kaldir(Bilgisayar b) {
        int indis = b.yazilimVarmi(this);
        if( indis == -1){
            System.out.println("Bu yazılım zaten yüklü değil. [] _ []");
        }
        else{
            b.yazilimlar.remove(b.yazilimlar.get(indis));
            System.out.println("Yazılım başarıyla kaldırıldı.");
        }
    }

    @Override
    public void guncelle(Bilgisayar b) {
        int indis = b.yazilimVarmi(this);
        if(indis == -1){
            System.out.println("Bu yazılım yüklü değil !!");
        }
        else{
            System.out.println("Guncelleniyor...");
            b.yazilimlar.set(indis, this);
            System.out.println("<-- Başarıyla güncellendi -->");
        }
        
    }

    @Override
    public void temizMi() {
        System.out.println("Yepyeni , sürücüleri perwolle yıkanmış");
    }
}
