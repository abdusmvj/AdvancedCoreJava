/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class MultiCatchExcep 
{

    public static void main(String args[])
    {  
        if(args.length>=2)
        {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
       int c=a/b;
       
        
        System.out.println("the Result of C is;"+c);
        }
    }
}
