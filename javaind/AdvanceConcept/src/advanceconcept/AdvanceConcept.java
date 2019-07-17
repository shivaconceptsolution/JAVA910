/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanceconcept;
import java.io.*;
/**
 *
 * @author SHIVA
 */
public class AdvanceConcept {

    
    public static void main(String[] args) throws IOException {
        File f = new File("d://mydemo.txt");
        if(!f.exists())
            f.createNewFile();
      /*  String s = "hello world";
        FileOutputStream fo = new FileOutputStream(f);
        byte arr[] = s.getBytes();  //char to byte conversion
        fo.write(arr);   //write data of array in file
        fo.close();*/
        FileInputStream fi = new FileInputStream(f);
      
        byte arr[] = new byte[100];
        int a=0;
        while((a=fi.read(arr))!=-1)   //  fi.read(arr)  arr = fi.read()
        {
            
            String s1 = new String(arr);  //byte to String
            System.out.println(s1);
            
        }
        fi.close();
          
       
    }
    
}
