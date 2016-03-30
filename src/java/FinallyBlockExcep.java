/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class FinallyBlockExcep 
 {
    public static void main(String args[])
    {       
            
        try
        {
    
        int result=25/0;
        System.out.println("Thr resultandt output is:"+result); //this line is not executed if exception has occured
    
         }
        catch(ArithmeticException aex)
        {
        System.out.println(aex.toString());
        System.out.println("Exception has occured::::"+aex);
        }
        finally
           
        {
            System.out.println("Finnaly block is alwys executed if exception has occured or not");
        }
    }
}
            
            
            
            
            
            
            
            
            
            
            
        
    

    

