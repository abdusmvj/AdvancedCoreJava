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

class MainThreadName extends Thread
{
    public void run() //called thread method run()
    {
        System.out.println("Called Thread is running......... ");
    }
}
public class GetSetNameThread 
{
    public static void main(String args[])
    {
       MainThreadName m1 =new MainThreadName(); 
       MainThreadName m2 =new MainThreadName();
       MainThreadName m3 =new MainThreadName();
       System.out.println("Name of main Thread m1:"+m1.getName());
       System.out.println("Name of main Thread m2:"+m2.getName());
       System.out.println("Name of main Thread m3:"+m3.getName());
       System.out.println("Id of main Thread m1:"+m1.getId());
       System.out.println("Id of main Thread m3:"+m3.getId());
         m1.start();//invoking the called thread method
         m2.start();
       
       m1.setName("Abdus Thread");
       System.out.println("After I AM  Setting or changing a main Thread m1 is:"+m1.getName());
      
    }
}
