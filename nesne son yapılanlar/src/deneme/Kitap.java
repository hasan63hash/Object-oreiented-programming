/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Kitap {
    private String isim;
    ArrayList<String> kahramanlar;
    public Kitap(){
        
    }
    public Kitap(String isim){
        kahramanlar = new ArrayList();
        this.isim = isim;
    }
}
