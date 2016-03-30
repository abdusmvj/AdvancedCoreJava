/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//retrive record from table
package JDBC;

/**
 *
 * @author Administrator
 */

import java.util.*;
import java.sql.*;
import oracle.jdbc.*;
class RecordRetrive
{
	OracleConnection oconn;
	PreparedStatement pstmt;
	OracleResultSet ors;
	String scomm;
	String vusername,vpassword,url;
	Scanner sc = new Scanner(System.in);
	public RecordRetrive()
	{
		try
		{
                     //The forName() method of Class class is used to register the driver class. This method is used to dynamically load the driver class.
                       //Class.forName("oracle.jdbc.driver.OracleDriver"); 
			DriverManager.registerDriver(new OracleDriver());
		}
                //catch(ClassNotFoundException ex)
		catch(SQLException ex)
		{
			System.out.println(ex.toString());
		}
		System.out.print("Enter User Name: ");
		vusername = sc.next();
		System.out.print("Enter Password: ");
		vpassword = sc.next();
		url = "jdbc:oracle:thin:@localhost:1521:ORCL";	
		try
		{
			oconn = (OracleConnection)DriverManager.getConnection(url,vusername,vpassword);	
		
			scomm = "select * from DEPT";
                        
                                
			//instantiating the oracle statement
			pstmt = (PreparedStatement)oconn.prepareStatement(scomm); 	
			//instantiating the oracle resultset
                        
                        
                        /*
                            4) Execute the query
                            The executeQuery() method of Statement interface is used to execute queries to the
                            database. This method returns the object of ResultSet that can be used to get all the
                            records of a table.
                         */
                        ors=(OracleResultSet)pstmt.executeQuery(); //WHEN RETRIVE USE executeQuery() method and When INSERT DEN USE executeUpdate() method.
                        while(ors.next())
                        {
                            System.out.println(ors.getString(1)+" "+ors.getString(2)+" "+ors.getString(3));
                            //System.out.println(ors.getString(1)+"\t"+ors.getString(2)+"\t"+ors.getString(3));
                        }
                       ors.close();
                       pstmt.close();
                       oconn.close();
                }
                catch(SQLException ex)
		{
			System.out.println(ex.toString());
		}
        }
}

            

public class RetriveRecord 
{
    public static void main(String args[])
    {
        RecordRetrive rt=new RecordRetrive();
    }
}



