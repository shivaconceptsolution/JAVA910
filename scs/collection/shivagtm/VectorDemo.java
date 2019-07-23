/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs.collection.shivagtm;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author SHIVA
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector obj = new Vector();
        obj.add("1001");
        obj.add("1003");
        obj.add("1002");
        obj.add("1004");
        obj.remove("1001");
        
        for(Object o:obj)
        {
            System.out.println(o);
        }
                
        
    }
    
}
