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
public abstract class Cihaz {
    public double fiyat;
    public String isim;
    private String model;
    public abstract double fiyatHesapla();
    
    protected String getModel(){
        return model;
    }
}
