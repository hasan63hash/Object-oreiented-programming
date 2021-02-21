/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyaıslemleri;

import java.io.*;

public class Game {
    int level;
    double money;
    String user_name;
    
    public Game(int level, double money, String user_name){
        this.level = level;
        this.money = money;
        this.user_name = user_name;
    }
    
    public void save() throws IOException{
        File saveFile = new File("save.txt");
        
        // Clear the file
        if(saveFile.exists()){
            FileWriter fw = new FileWriter(saveFile, false);
            fw.write("");
        }
        
        // Write Istatistics
        setIstatistics("Level = "+level);
        setIstatistics("Money = "+money);
        setIstatistics("User_name = "+user_name);
    }
    
    public void setIstatistics(String line) throws IOException{
        File saveFile = new File("save.txt");
        
        if(!saveFile.exists()){
            saveFile.createNewFile();
        }
        
        FileWriter fw = new FileWriter(saveFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(line);
        bw.newLine();
        bw.flush();
        bw.close();
    }
    
    public void getIstatistics(){
      File saveFile = new File("save.txt");
      
      if(!saveFile.exists()){
          System.out.println("Daha önceden kayıt dosyası bulunmuyor!");
          return;
      }
      
      try{
          FileReader fr = new FileReader(saveFile);
          BufferedReader br = new BufferedReader(fr);
          String temp = br.readLine();
          for (int i = 0; i < temp.length(); i++) {
              if(temp.charAt(i) != '='){
                  i++;
              }
              else{
                i+=2;
                level = Integer.valueOf(temp.substring(i, temp.length()));
                break;
              }
          }
          temp = br.readLine();
          for (int i = 0; i < temp.length(); i++) {
              if(temp.charAt(i) != '='){
                  i++;
              }
              else{
                i+=2;
                money = Double.valueOf(temp.substring(i, temp.length()));
                break;
              }
          }
          temp = br.readLine();
          for (int i = 0; i < temp.length(); i++) {
              if(temp.charAt(i) != '='){
                  i++;
              }
              else{
                i+=2;
                user_name = temp.substring(i, temp.length());
                break;
              }
              
          }
          br.close();
      }catch(IOException e){
          System.out.println(e);
      }
    }
    public void levelUp(){
        level++;
    }
    public void setUser_name(String user_name){
        this.user_name = user_name;
    }
    public void effectMoney(double effection){
        money += effection;
    }
    public void printIstatistics(){
        System.out.println("Level = "+level);
        System.out.println("Money = "+money);
        System.out.println("User Name : "+user_name);
    }
}
