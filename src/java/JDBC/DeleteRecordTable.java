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

class DeleteTableRow
{
    public DeleteTableRow()
    {
        String vDEPTNO;
        Scanner sc =new Scanner(System.in);
        System.out.println("Preparering for deleting a record from the table");
        System.out.print("Enter the vDeptno:");
        vDEPTNO=sc.next();
        
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
           Statement stmt=conn.createStatement();  //The object of statement is responsible to execute queries with the database.
           
           // 5.Executing the query ....
           /*
           4) Execute the query
            The executeQuery() method of Statement interface is used to execute queries to the
            database. This method returns the object of ResultSet that can be used to get all the
             records of a table.
                */
           int rowsAffected=stmt.executeUpdate("DELETE FROM DEPT WHERE DEPTNO='"+vDEPTNO+"'");
           System.out.println("No of rows DELETED is : " + rowsAffected);
           //7. Closing the connections....
           stmt.close();
           conn.close();
        }
        catch(ClassNotFoundException|SQLException ex)
        {
            System.out.println(ex.toString());
        }
        
        
    }
}
public class DeleteRecordTable 
{
    public static void main(String args[])
    {
        DeleteTableRow ic=new DeleteTableRow();
    }
}


