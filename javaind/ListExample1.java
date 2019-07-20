/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs.collection.shivagtm;

import java.util.ArrayList;

/**
 *
 * @author SHIVA
 */
public class ListExample1 {
    void arrayListExample()
    {
       // ArrayList obj = new ArrayList();
        ArrayList<Integer> obj = new ArrayList<>();
        int a1=12;
        obj.add(a1);
        obj.add(23);
       // obj.add("ram");
       // obj.add(12.34);
       // obj.add(true);
        obj.remove("12");
        for(int i=0;i<obj.size();++i)
        {
            System.out.println(obj.get(i));
        }
        for(Object a:obj)
        {
            System.out.println(a);
        }
        
    }
    
    public static void main(String[] args) {
        ListExample1 obj = new ListExample1();
        obj.arrayListExample();
    }
    
}
