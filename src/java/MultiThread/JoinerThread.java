
/*
 The join() method waits for a thread to die. In other words, it causes
the currently running threads to stop executing until the thread it
joins with completes its task.

Syntax:
public void join()throws InterruptedException
public void join(long milliseconds)throws InterruptedException
 */

package MultiThread;


class Joiner extends Thread
{
    public void run()
    {
        for(int i=1; i<=6; i++)
        {
                try
                {
                Thread.sleep(3000);
                }
                catch(InterruptedException ex)
                {
                System.out.println(ex.toString());
                }
        
            System.out.println(i);  //for foorloop output only
        }
    }
}
public class JoinerThread
{
    public static void main(String args[])
    {
        
        Joiner t1=new Joiner();
        Joiner t2=new Joiner();
        Joiner t3=new Joiner();
        t1.start(); //start thread with t1 object
            try
            { 
                t1.join();
            }
            catch(InterruptedException ex)
            {
                System.out.println(ex.toString());
            }
        t2.start();
        t3.start();
        
        
    }
}
/**
 As you can see in the above example,when t1 completes its task
then t2 and t3 starts executing.
 */