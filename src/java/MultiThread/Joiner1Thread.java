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
class Called extends Thread
{
	public void run()
	{
		for(int i=0; i<= 15; i ++)
		{
			System.out.println("Called Thread: " + i);
			try
			{
				Thread.sleep(3000);  //this one for called thread sleep delay
			}
			catch(InterruptedException iex)
			{
				System.out.println(iex.toString());
			}
		}
		
	}
}
public class Joiner1Thread
{
public static void main(String args[])
{
	Called c1 = new Called();
	for(int i=0; i<= 15; i ++)
	{
            System.out.println("Main Thread: " + i);
                    if(i == 5)
                        {
                            c1.start();
                        }
                    if(i == 10)
                    {
			try
			{
				c1.join(); //caller thread(main) will wait till called thread(called) finishes of its job
			}
			catch(InterruptedException iex)
			{
				System.out.println(iex.toString());
			}	
                    }	
                    
		try
		{
			Thread.sleep(1000);  //this one for main thread sleep delay
		}
		catch(InterruptedException iex)
		{
                    System.out.println(iex.toString());
		}
	}
}
}
