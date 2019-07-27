/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs.collection.shivagtm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author SHIVA
 */
public class GenericArrayList {
    public static void main(String[] args) {
       
        ArrayList<Student> obj = new ArrayList<Student>();
        obj.add(new Student(1001,"xyz","CS",15000));
        obj.add(new Student(1002,"abc","CS",25000));
        obj.add(new Student(1003,"mno","EC",5000));
        obj.add(new Student(1004,"test","IT",65000));
       Collections.sort(obj,new FeesComparator());
        Iterator it = obj.iterator();
        while(it.hasNext())
        {
           Student s = (Student)it.next();
           System.out.println(s);
        }
        
    }
    
}
