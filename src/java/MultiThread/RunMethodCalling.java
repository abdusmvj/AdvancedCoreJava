

/*
 What if we call run() method directly
instead start() method?

*Each thread starts in a separate call stack.
*Invoking the run() method from main thread, the run()
method goes onto the current call stack rather than at the
beginning of a new call stack.
 */

package MultiThread;  

class TestCallRun2 extends Thread
{
    public void run()
    {
       for(int a=1; a<=5; a++)
        {
            try
            {
                Thread.sleep(1000);
               // System.out.println("hellow");
               // Thread.sleep(2000);
                  //System.out.println("hiiiiiii");
            }
        
            catch(InterruptedException ex)
            {
                System.out.println(ex);
            }
         System.out.println(a);
        }
    }
}
public class RunMethodCalling 
{
    public static void main(String args[])
    {
    TestCallRun2 t1=new TestCallRun2();
    TestCallRun2 t2=new TestCallRun2();
    t1.run();
    t2.run();
    //t1.start(); //fine, but does not start a separate call stack
   // t2.start();
    }
 }

/*
As you can see in the above program that there is no contextswitching
because here t1 and t2 will be treated as normal object
not thread object

 */
