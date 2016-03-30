/*
Colletions Framwork:In Java Collection framwork standardizes the way in which groups of objects are handled by the programer.

 Java ArrayList class:
Java ArrayList class uses a dynamic array for storing the elements.It extends
AbstractList class and implements List interface.
Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because array works at the index basis.
In Java ArrayList class, manipulation is slow because a lot of shifting needs to
be occurred if any element is removed from the array list.

Two ways to iterate the elements of collection in java
1. By Iterator interface.
2. By foreach loop.
In the above example, we have seen traversing ArrayList by Iterator. Let's see the
example to traverse ArrayList elements using foreach
loop.
 */
import java.util.*;

public class ArrayListDemo 
{
     public static void main(String args[])
    {
        //now creating the arraylist
        //ArrayList<String> al = new ArrayList<String>();
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al Arraylist :"+al.size());
        
        //Adding element to arraylist
       al.add("Amit");
       al.add("Sumit");
       al.add("Arun");
       al.add("Vijay");
       al.add(2,"Roki");  //added in position 2 Roki  and move the name at position 2 to at  position 3
       System.out.println("After addition  size of al Arraylist :"+al.size());
       //Adding the integer value to the Arraylist.  [dont have that type methode->//al.add(345);
       
       al.add(new Integer(44));
       al.add(43);
       al.add("abdus");
       
       //display the Arraylist
         System.out.println("Contents of al is :"+al);
         
          //Creting iterator interface from List Interface
       Iterator itr=al.iterator();
       System.out.println("traversing elements in forward direction...");
       while(itr.hasNext())
       {
           Object OElement=itr.next();
            System.out.println(OElement.toString());
           
       }
       //Removing the element from ArrayList iterator
       al.remove("Amit");
       al.remove(4);
        System.out.println("After removing Contents of al is :"+al);
         
       
    
    }
}
