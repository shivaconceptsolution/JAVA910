/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scs.collection.shivagtm;

/**
 *
 * @author SHIVA
 */
public class A {
    int a;
    A(int a){
        this.a=a;
    }
    public String toString()
    {
        return "value is "+a;
    }
    public static void main(String[] args) {
        A obj = new A(100);
        System.out.println(obj);
    }
}
