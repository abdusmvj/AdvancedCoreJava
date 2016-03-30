/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDBC;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import java.sql.DriverManager;
import java.sql.*;

import java.util.*;
//import oracle.jdbc.OracleConnection;
import oracle.jdbc.*;

class UpdatingRow
{
    public UpdatingRow()
    {
        String vDNAME,vLOC;
        Scanner sc =new Scanner(System.in);
        System.out.println("Preparering for Updtting a record into the table");
        
        System.out.print("Enter the vDNAME:");
        vDNAME=sc.next();
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
           // 4.creating and instantiating the PREPAREstatement object...
           PreparedStatement pstmt=conn.prepareStatement("UPDATE  DEPT SET dname='"+vDNAME+"',loc='"+vLOC+"' WHERE DEPTNO=80");  
           
           // 5.Executing the query ....
           /*
           4) Execute the query
            The executeQuery() method of Statement interface is used to execute queries to the
            database. This method returns the object of ResultSet that can be used to get all the
             records of a table.
                */
           int rowsAffected=pstmt.executeUpdate();
           System.out.println("No of rows updatedted is : " + rowsAffected);
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
public class  UpdaingRecord
{
    public static void main(String args[])
    {
        UpdatingRow ur=new UpdatingRow();
    }
}


