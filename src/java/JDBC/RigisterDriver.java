/*
The DriverManager class acts as an interface between user and
drivers.
The DriverManager class maintains a list of Driver classes that have registered themselves by
calling the method DriverManager.registerDriver().
 */

package JDBC;


import java.util.*;
import java.sql.*;
import oracle.jdbc.*;
class RegisOpen
{
	OracleConnection oconn;
	String HOSTNAME,PORTNUMBER,SID;
	String vusername,vpassword,url;
	Scanner sc = new Scanner(System.in);
	public RegisOpen()
	{
		try
		{
                            //DriverManager.registerDriver(new OracleDriver());
                         //The forName() method of Class class is used to register the driver class. This method is used to dynamically load the driver class.
                        Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Drivers within the current java program has been registered successfully");		
		}
                //catch(SQLException ex)
		catch(ClassNotFoundException ex)
		{
			System.out.println(ex.toString());
		}
		System.out.print("Enter Host Name: ");
		HOSTNAME = sc.next();
		System.out.print("Enter Port Number: ");
		PORTNUMBER = sc.next();
		System.out.print("Enter SID: ");
		SID = sc.next();
		System.out.print("Enter User Name: ");
		vusername = sc.next();
		System.out.print("Enter Password: ");
		vpassword = sc.next();
                // 2. creating the address to locate the oracle database
		url = "jdbc:oracle:thin:@" + HOSTNAME + ":" + PORTNUMBER + ":" + SID;	
		try
		{
			oconn = (OracleConnection)DriverManager.getConnection(url,vusername,vpassword);	
			System.out.println("Connection established successfully");
                        oconn.close();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.toString());
		}
	

	}
}
public class RigisterDriver
{
	public static void main(String [] args)
	{
		RegisOpen ro = new RegisOpen();
	}
}
