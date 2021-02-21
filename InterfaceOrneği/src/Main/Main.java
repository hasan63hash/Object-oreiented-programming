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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bilgisayar b = new Bilgisayar("MUHLAB*01");
        Yazilim  word = new Yazilim();
        word.yukle(b);
        word.yukle(b);
        word.kaldir(b);
        
    }
    
}
