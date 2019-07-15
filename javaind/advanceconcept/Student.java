/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanceconcept;

import java.io.Serializable;

/**
 *
 * @author SHIVA
 */
public class Student implements Serializable {
    int rno;
    String sname;
    Student(int rno,String sname)
    {
        this.rno=rno;
        this.sname=sname;
    }
    
}
