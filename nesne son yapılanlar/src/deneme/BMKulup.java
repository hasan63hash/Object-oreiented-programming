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
public class BMKulup {
    ArrayList<Ogrenci> ogrenciList= new ArrayList();
    
    public ArrayList kitaplariYazdir(String isim){
        for(int a=0; a<ogrenciList.size(); a++){
            if(ogrenciList.get(a).isim.equalsIgnoreCase(isim)){
                return ogrenciList.get(a).kitaplar;
            }
        }
        return null;
    }
}
