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
class Hello
{
    String display()
    {
        return "Hello World";
    }
}
public class ThreadExample1 extends Hello implements Runnable{

    public ThreadExample1() {
        Thread t = new Thread(this);
        t.start();
    }

    
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
            System.out.println("process "+i+ super.display());
        }
    }
    
    public static void main(String[] args) {
        ThreadExample1 t1 = new ThreadExample1();  //normal object 
        
       
       
        
    }
}
