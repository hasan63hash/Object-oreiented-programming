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
public class Deneme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BMKulup bmk = new BMKulup();
        Ogrenci o1 = new Ogrenci();
        Ogrenci o2 = new Ogrenci();
        bmk.ogrenciList.add(o1);
        bmk.ogrenciList.add(o2);
        Kitap k1 = new Kitap("DcComics");
        k1.kahramanlar.add("Batman");
        k1.kahramanlar.add("Superman");
        k1.kahramanlar.add("Flash");
        
        
        Kitap k2 = new Kitap("LordOFTheRings");
        k2.kahramanlar.add("Legolas");
        k2.kahramanlar.add("Frodo");
        k2.kahramanlar.add("Batman");
        o1.kitaplar.add(k1);
        o1.kitaplar.add(k2);
        
        System.out.println(kahramanSay(o1, "Batman"));
    }
    
    public static int kahramanSay(Ogrenci o, String kahraman){
        int kahramanSay = 0, index = 0;
        Kitap gecici = new Kitap();
        while(o.kitaplar.size() > index){
            gecici = o.kitaplar.get(index);
            for(int i=0; i<gecici.kahramanlar.size(); i++){
                if(gecici.kahramanlar.get(i) == kahraman){
                    kahramanSay +=1;
                    break;
                }
            }
            index++;
        }
        return kahramanSay;
    }
    
    
}
