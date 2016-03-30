/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MultiThread;

/**
 *
 * @author Administrator
 */

class NamesThread extends Thread
{
    public void run() //called thread method run()
    {
        System.out.println("Name of Thread is running ... ="+Thread.currentThread());
        System.out.println("Name of Thread is running ... ="+Thread.currentThread().getName());
        System.out.println("Id of Thread is running ... ="+Thread.currentThread().getId());
        System.out.println("Active count of Thread is running ... ="+Thread.activeCount());
      
        
    }
}
public class NamingThread
{
    public static void main(String args[])
    {
       NamesThread m1 =new NamesThread(); 
       m1.start();
    }
}
