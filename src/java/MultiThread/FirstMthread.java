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

class ForClass1 extends Thread

{
	public void run()
	{
		for(int i=1; i<=30; i++)
		{
		System.out.println("Symbol no." +i+ ": $$$$$$$$$$");
		}
	}
}

class ForClass2 extends Thread
{
	public void run()
	{
		for(int i=1; i<=30; i++)
		{
		System.out.println("Symbol no." +i+ ": @@@@@@@@@");
		}
	}
}
class ForClass3 extends Thread
{		
	public void run()
	{
		for(int i=1; i<=30; i++)
		{
		System.out.println("Symbol no." +i+ ": ############");

		}
	}
}
	

public class FirstMthread 
{
	public static void main(String args[])
	{
	ForClass1 f1=new ForClass1();
	ForClass2 f2=new ForClass2();
	ForClass3 f3=new ForClass3();
	f1.start();
	f2.start();
	f3.start();
	
	}
}