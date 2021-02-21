/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HASAN
 */
public class kayit {
    String isim;
    String soyisim;
    int tc;
    int numara;
    public kayit(){
        Scanner oku=new Scanner(System.in);
        Random rst=new Random();
        System.out.println("lütfen isminizi giriniz");
        isim=oku.next();
        System.out.println("lütfen soyisminizi giriniz");
        soyisim=oku.next();
        System.out.println("lütfen tc kimlik numaranızı giriniz");
        tc=oku.nextInt();
        System.out.println("doktor randevu numaranız ");
        System.out.println("\n");
        numara=rst.nextInt(100);
        System.out.println("hasta ismi = "+isim+" hastanın soyismi = "+soyisim+" hastanın tc kimlik numarası ="+tc+" hastanın numarasi= "+numara);
        
    }
}
