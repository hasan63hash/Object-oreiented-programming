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
public class Donanim extends Cihaz{
    double hiz;
    String marka;
            
    public double enerjiHesapla(){
        double enerji = 100;
        return enerji;
    }

    @Override
    public double fiyatHesapla() {
        return fiyat + fiyat * 0.6;
    }
}
