/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyaıslemleri;

import java.io.*;

/**
 *
 * @author User
 */
public class DosyaIslemleri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        /*
        // Dosyaya yazma --------------------------
        String str = "Write this down";

        File file = new File("file.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(str);
        bWriter.close();
        */
        // Dosyaya yazma --------------------------
        
        
        // Dosyadan okuma ---------------------------
        /*
        File file = new File("file.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileReader = new FileReader(file);
        String line;
        
        BufferedReader br = new BufferedReader(fileReader);
        while( (line = br.readLine()) != null ){
            System.out.println(line);
        }
        br.close();
        */
        // Dosyadan okuma ---------------------------
        
        // Bir resmi yada internet üzerinden çektiğin dosyayı kayıt etmek istiyorsak
        /*
        byte[] data = { 0x01, 0x02};
        File binaryFile = new File("binary.dat");
        FileOutputStream fos = new FileOutputStream(binaryFile);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(data);
        bos.close();
        */
        // Bir resmi yada internet üzerinden çektiğin dosyayı kayıt etmek istiyorsak
        
        File dosya2 = new File("C:\\Users\\User\\Desktop\\File2.txt");
        
        if (! dosya2.exists()) {
            dosya2.createNewFile();
        }
    }

}
