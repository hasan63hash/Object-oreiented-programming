/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Bilgisayar extends Donanim{
    ArrayList<Yazilim> yazilimlar = new ArrayList();
    String isim;
    
    public Bilgisayar(String isim){
        this.isim = isim;
    }
    public int yazilimVarmi(Yazilim y){
        int indis = -1;
        for (int i = 0; i < yazilimlar.size(); i++) {
            if(yazilimlar.get(i) == y){
                indis = i;
                break;
            }
        }
        return indis;
    }
}
