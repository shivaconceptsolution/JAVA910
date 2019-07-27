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
public class ArrayListPrime {
    
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<Integer>();
        obj.add(12);
        obj.add(2);
        obj.add(3);
        obj.add(5);
        obj.add(6);
     
        for(int num:obj)
        {
            int c=0;
            for(int j=1;j<=num;j++)
            {
                if(num%j==0)
                    c++;
            }
            if(c==2)
                System.out.println(num);
                
        }
        
        
        
        
        
        
    }
    
}
