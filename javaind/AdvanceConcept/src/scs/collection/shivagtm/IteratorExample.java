/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs.collection.shivagtm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author SHIVA
 */
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
       // HashSet obj = new HashSet();
        obj.add("C");
        obj.add("CPP");
        obj.add(1000);
        obj.add(2000);
        obj.add("JAVA");
      /*  Iterator i = obj.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }*/
        ListIterator l = obj.listIterator();
        System.out.println("Forward");
        while(l.hasNext())
        {
            System.out.println(l.next());
        }
        System.out.println("Reverse");
        while(l.hasPrevious())
        {
            System.out.println(l.previous());
        }
        
    }
    
}
