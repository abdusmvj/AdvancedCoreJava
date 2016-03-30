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

class ForClas1 extends Thread

{
	public void run()
	{
		for(int i=1; i<=30; i++)
		{
		System.out.println("Symbol no." +i+ ": $$$$$$$$$$");
                    try
                    {
                    Thread.sleep(1000);
                    }
                    catch(Exception ex)
                    {
                        System.out.println(ex.toString());
                    }
		}
	}
}

class ForClas2 extends Thread
{
	public void run()
	{
		for(int i=1; i<=30; i++)
		{
		System.out.println("Symbol no." +i+ ": @@@@@@@@@");
                    try
                    {
                        Thread.sleep(1000);
                    }
                    catch(Exception ex)
                    {
                        System.out.println(ex.toString());
                    }
                
		}
	}
}
class ForClas3 extends Thread
{		
	public void run()
	{
		for(int i=1; i<=30; i++)
		{
		System.out.println("Symbol no." +i+ ": ############");
                try
                    {
                        Thread.sleep(1000);
                    }
                    catch(Exception ex)
                    {
                        System.out.println(ex.toString());
                    }

		}
	}
}
	


public class ThreadTryCatch
{
	public static void main(String args[])
	{
	ForClas1 f1=new ForClas1();
	ForClas2 f2=new ForClas2();
	ForClas3 f3=new ForClas3();
	f1.start();
	f2.start();
	f3.start();
	
	}
}