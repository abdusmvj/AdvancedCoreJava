/*
 Daemon thread in java is a service provider thread that provides services
to the user thread. Its life depend on the mercy of user threads i.e. when
all the user threads dies, JVM terminates this thread automatically.

There are many java daemon threads running automatically e.g. gc,
finalizer etc.

You can see all the detail by typing the jconsole in the command prompt.
The jconsole tool provides information about the loaded classes, memory
usage, running threads etc.

Points to remember for Daemon Thread in Java:-
*It provides services to user threads for background supporting tasks.
*It has no role in life than to serve user threads.
*Its life depends on user threads.
*It is a low priority thread.

--Why JVM terminates the daemon thread if there is no user thread?
ans:
The sole purpose of the daemon thread is that it provides services to user
thread for background supporting task. If there is no user thread, why
should JVM keep running this thread. That is why JVM terminates the
daemon thread if there is no user thread.
 */

package MultiThread;


class DMthread extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon()) //checking for daemin Thread if cheking condition is satisfy den daemon thread runnig
        {
            System.out.println("Daemon Thread is wokring in this application");
            
        }
        else
        {
           System.out.println("User Thread is wokring in this application..................");  
        }
        
    }
}
public class DaemonThreads 
{
    public static void main(String args[])
    {
         DMthread t1=new DMthread();
         DMthread t2=new DMthread();
         DMthread t3=new DMthread();
         t1.setDaemon(true);//now t1 is daemon thread
         //do not invoking thread before set daemon  is true statement(privious line)
         t1.start();
         
         t2.start();
         t3.start();
         
         
    }
}
/**
 Note: If you want to make a user thread as Daemon, it must not
    be started otherwise it will throw IllegalThreadStateException
 */

