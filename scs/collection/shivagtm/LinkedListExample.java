/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs.collection.shivagtm;

import java.util.LinkedList;

/**
 *
 * @author SHIVA
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList ref = new LinkedList();
        ref.add("item1");
        ref.add("item2");
        ref.remove("item1");
        ref.addFirst("item");
        ref.add(1,"i");
        ref.addLast("item33");
        for(Object o:ref)
        {
            System.out.println(o);
        }
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(23);
        l.addFirst(11);
        l.addFirst(12);
        l.set(0, 111);
        l.add(34);
        l.add(45);
        l.add(0, 2);
       
      //  l[0]=111;
        for(int a:l)
        {
            System.out.println(a);
        }
        
        
    }
    
}
