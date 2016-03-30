/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDBC;

/**
 *
 * @author Administrator
 */
//import java.sql.DriverManager;
import java.sql.*;

import java.util.*;
//import oracle.jdbc.OracleConnection;
import oracle.jdbc.*;

class DeleteTableRow1
{
    public DeleteTableRow1()
    {
        String vLOC;
        Scanner sc =new Scanner(System.in);
        System.out.println("Preparering for deleting a record from the table");
        System.out.print("Enter the vLOC:");
        vLOC=sc.next();
        
        // 1.registering the java program with oracle....
        try
        {
            //The forName() method of Class class is used to register the driver class. This method is used to dynamically load the driver class.
           Class.forName("oracle.jdbc.driver.OracleDriver"); 
           // 2. creating the address to locate the oracle database
           String url="jdbc:oracle:thin:@Islam-PC:1521:ORCL";
           // 3.creating and instantiating the connection object.. i.e connecting to the oracle database ....
           OracleConnection conn=(OracleConnection)DriverManager.getConnection(url,"ABDUS","SAMAD");  //The getConnection() method of DriverManager class is used to establish connection with the database.
           System.out.println("Connection with Oracle database estsblised successfully.......");
           // 4.creating and instantiating the statement object...
           PreparedStatement pstmt=conn.prepareStatement("DELETE FROM DEPT WHERE LOC='"+vLOC+"'");  
           
           // 5.Executing the query ....
          
           int rowsAffected=pstmt.executeUpdate();
           System.out.println("No of rows DELETED is : " + rowsAffected);
           //7. Closing the connections....
           pstmt.close();
           conn.close();
        }
        catch(ClassNotFoundException|SQLException ex)
        {
            System.out.println(ex.toString());
        }
        
        
    }
}
public class DeleteRecordTable1 
{
    public static void main(String args[])
    {
        DeleteTableRow1 ic=new DeleteTableRow1();
    }
}



