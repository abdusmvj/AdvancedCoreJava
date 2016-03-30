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
public class AllThreadMethod 
{
    public static void main(String args[])
    {
        Thread t1=new Thread();
       // System.out.println(t1);
        System.out.println(t1.currentThread());
        System.out.println("No of Threads="+t1.activeCount());
        System.out.println("No of Threads="+Thread.activeCount());  //output same as privious line
        System.out.println("Name of Threads="+t1.getName());
        System.out.println("priority of Threads="+t1.getPriority());
        System.out.println("Id of Threads="+t1.getId()); 
        System.out.println("Name of Threads Group="+t1.getThreadGroup());
        System.out.println("Now set all  Threads.............................");
        t1.setName("Abdus Thread");
        t1.setPriority(7);
       
        System.out.println("After set all  Threads.............................");
        System.out.println("Name is =" +t1.getName());
        System.out.println("Priority is=" +t1.getPriority());
        
        
    }
}
