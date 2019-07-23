/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs.collection.shivagtm;

import java.util.TreeSet;

/**
 *
 * @author SHIVA
 */
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student> obj = new TreeSet<Student>(new FeesComparator());
         obj.add(new Student(1001,"xyz","CS",15000));
        obj.add(new Student(1002,"abc","CS",25000));
        obj.add(new Student(1003,"mno","EC",5000));
        obj.add(new Student(1004,"test","IT",65000));
        for(Student s:obj)
        {
            System.out.println(s);
        }
    }
    
}
