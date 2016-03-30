/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrator
 */
import java.util.*;
public class ArrayListAddAll {
    


 public static void main(String args[]){

 ArrayList<String> al=new ArrayList<String>();
 al.add("Ravi");
 al.add("Vijay");
 al.add("Ajay");

 ArrayList<String> al2=new ArrayList<String>();
 al2.add("Sonoo");
 al2.add("Hanumat");

 al.addAll(al2);

 Iterator itr=al.iterator();
 while(itr.hasNext())
    {
         System.out.println(itr.next());
     }
 }
}
