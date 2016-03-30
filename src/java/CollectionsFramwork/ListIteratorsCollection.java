/*
 Java List Interface
List Interface is the subinterface of Collection.It contains methods to
insert and delete elements in index basis.It is a factory of ListIterator
interface.
Commonly used methods of List Interface:
1. public void add(int index,Object element);
2. public boolean addAll(int index,Collection c);
3. public object get(int Index position);
4. public object set(int index,Object element);
5. public object remove(int index);
6. public ListIterator listIterator();
7. public ListIterator listIterator(int i);

Java ListIterator Interface:
ListIterator Interface is used to traverse the element in backward and
forward direction.
Commonly used methods of ListIterator Interface:
1. public boolean hasNext();
2. public Object next();
3. public boolean hasPrevious();
4. public Object previous();
 */

package CollectionsFramwork;
import java.util.*;
public class ListIteratorsCollection
{
    public static void main(String args[])
    {
        //now creating the arraylist
        ArrayList<String> al = new ArrayList<String>();
       al.add("Amit");
       al.add("Sumit");
       al.add("Arun");
       al.add("Vijay");
       System.out.println("element at 2nd position: "+al.get(2));
       al.add(2,"Sachin"); //addding in number position in 2 and position 2 will move to 3 position
        System.out.println(" after add element at 2nd position: "+al.get(2)); 
        System.out.println("now element at 3nd position: "+al.get(3));
        
       //Creting listiterator interface from List Interface
       ListIterator<String> litr=al.listIterator();
       
       System.out.println("traversing elements in forward direction...");
       while(litr.hasNext())
        {
            String OElement=litr.next();
            System.out.println(OElement.toString());
            //System.out.println(OElement);
        } 
       System.out.println("traversing elements in backward direction...");
       while(litr.hasPrevious())
       {
           String OElement1=litr.previous();
            System.out.println(OElement1);
       }
    }
 }