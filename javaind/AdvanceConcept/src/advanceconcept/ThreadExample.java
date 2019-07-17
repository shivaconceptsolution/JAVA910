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
public class ThreadExample extends Thread {
    public void run()
    {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
            System.out.println("process "+i);
        }
    
    }
 
    public static void main(String[] args) throws InterruptedException {
        ThreadExample t1 = new ThreadExample();  //thread object new state
        t1.start();//running state
        t1.setDaemon(true);
       
       // t1.join();
       // ThreadExample t2 = new ThreadExample();  //thread object new state
        //t2.start();//running state
        
    }
}
