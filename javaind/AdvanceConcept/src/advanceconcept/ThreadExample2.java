/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanceconcept;

/**
 *
 * @author SHIVA
 */
class Table
{
   synchronized public void displayTable(int num)  //synchronize=monitor+lock
    {
        for (int i = 1; i <= 10; i++) {
            try
            {
            System.out.println(num*i);
            notifyAll();
            wait(1000);
           
           // Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                
            }
            
        }
    }
}
class Thread1 extends Thread
{
    Table t;
    Thread1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.displayTable(5);
    }
    
}
class Thread2 extends Thread
{
     Table t;
    Thread2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.displayTable(9);
    }
}
public class ThreadExample2 {
    public static void main(String[] args) {
        Table t = new Table();
        Thread1 t1 = new Thread1(t);
        t1.start();
        Thread2 t2 = new Thread2(t);
        t2.start();
    }
}
