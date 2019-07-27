/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs.collection.shivagtm;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author SHIVA
 */
public class SetExample {
    void setExample()
    {
       // LinkedHashSet obj = new LinkedHashSet();
        TreeSet obj = new TreeSet();
        obj.add(5);
        obj.add(1);
        obj.add(2);
        obj.add(4);
        
        for(Object o:obj)
        {
            System.out.println(o);
        }
         TreeSet<String> h = new  TreeSet<String>(); 
  
        // Adding elements into HashSet usind add() 
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("India");// adding 
        for(Object o1:h)
        {
            System.out.println(o1);
        }
    }
    public static void main(String[] args) {
        SetExample obj = new SetExample();
        obj.setExample();
    }
    
}
