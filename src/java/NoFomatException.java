/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class NoFomatException 
{
    public static void main(String args[])
    {
        try
        {
            String s1="Abdus";
            int s2=Integer.parseInt(s1);  //NumberFormatException this line is not executed if exception occured
            System.out.println("Sting s1  converted to integer s2 is:"+s2);
        }
        catch(NumberFormatException nfex)
        {
            System.out.println(nfex.toString());  
            System.out.println("Whenever u parse a String to Any Numeric type or digits and if it not posibble...."
                    + "bcoz Abdus string cannot be parse to Int");
            
        }
    }
}
