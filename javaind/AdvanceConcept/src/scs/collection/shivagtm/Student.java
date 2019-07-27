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
public class Student {
    int rno;
    String sname;
    String branch;
    int fees;
    Student(int rno,String sname,String branch,int fees)
    {
        this.rno=rno;
        this.sname=sname;
        this.branch=branch;
        this.fees=fees;
    }
    public String toString()
    {
        return "rno is "+rno+" name is "+sname+" branch is "+branch+" Fees is "+this.fees;
    }

   
    
    
    
    
    
}
