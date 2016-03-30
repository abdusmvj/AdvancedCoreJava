/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionsFramwork;

import java.io.FileReader;

import java.util.Properties;

/**
 Now if you change the value of the properties file, you don't need to compile
the java class again. That means no maintenance problem.
 */
public class ColleprptesClas 
{
    public static void main (String args []) throws Exception
    {
        FileReader fr=new FileReader("NameMailP.properties");
        Properties pts= new Properties();
        //pts.setProperty("name","Abdus Samad");
       // pts.setProperty("email","abdus.mvj@gmail.com");
        pts.load(fr);
        System.out.println(pts.getProperty("name"));
        System.out.println(pts.getProperty("email"));
        
    }
}
