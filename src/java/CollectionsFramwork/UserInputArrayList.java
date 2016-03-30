/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionsFramwork;
import java.util.*;
public class UserInputArrayList 
{
    public static void main(String args[])
    {
        //List<Object> al = new ArrayList<Object>();
        //ArrayList<String> al = new ArrayList<String>();
        ArrayList<Object> al = new ArrayList<Object>();
        String velement;
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting Enter the ArrayList element ");
        char ans;
        do
        {
           System.out.print("Enter element value into the ArrayList:");
           velement=sc.next();
           al.add(velement);
           System.out.println("Element is added successfully...");
           System.out.print("Do you enter more element into the ArrayList(y/n):");
           ans=sc.next().charAt(0);
        }
        while(ans=='Y' || ans=='y');
        System.out.println(" The Contents of al is :"+al);
        System.out.println(" Printing the elements in the list using a for each loop or Iterator....");
        for(Object element:al)
        {
            System.out.println(element);
        }
        
        System.out.println(" after printing Do  you enter  again more element into the ArrayList(y/n):");
         do
        {
         
         System.out.print("Enter element value into the ArrayList:");
         velement=sc.next();
         al.add(velement);
         System.out.println("Element is added successfully...");
           System.out.print("Do you enter more element into the ArrayList(y/n):");
           ans=sc.next().charAt(0);
        }
        while(ans=='Y' || ans=='y');
        System.out.println(" The Contents of al again is :"+al);
        System.out.println(" Printing all the elements in the list using a for each loop or Iterator==========");
        for(Object element1:al)
        {
            System.out.println(element1);
        } 
    }
    
}
