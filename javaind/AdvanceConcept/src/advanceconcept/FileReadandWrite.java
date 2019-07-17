/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanceconcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHIVA
 */
public class FileReadandWrite {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        //Student obj = new Student(1001,"xyz");
        File f = new File("d://xyz.txt");
        if(!f.exists())
        {
            f.createNewFile();
        }
       // FileOutputStream fo = new FileOutputStream(f);
       // ObjectOutputStream oo = new ObjectOutputStream(fo);
       // oo.writeObject(obj);
       // oo.close();
        Student s=null;
        FileInputStream fi = new FileInputStream(f);
        ObjectInputStream oi = new ObjectInputStream(fi);
        s = (Student)oi.readObject();
        System.out.println(s.rno+" "+s.sname);
        oi.close();
        
    }
    
}
