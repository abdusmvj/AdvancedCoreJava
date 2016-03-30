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


import java.util.*;
import java.sql.*;
import oracle.jdbc.*;
class SingleValDisplay
{
	OracleConnection oconn;
	OracleStatement ost;
	OracleResultSet ors;
	String scomm;
	String vusername,vpassword,url;
	Scanner sc = new Scanner(System.in);
	public SingleValDisplay()
	{
		try
		{
			DriverManager.registerDriver(new OracleDriver());
		}
		catch(SQLException ex)
		{
			System.out.println(ex.toString());
		}
		System.out.print("Enter User Name: ");
		vusername = sc.next();
		System.out.print("Enter Password: ");
		vpassword = sc.next();
		url = "jdbc:oracle:thin:@Islam-PC:1521:ORCL";	//change the hostname as per ur PC (ISlam-PC)
		try
		{
			oconn = (OracleConnection)DriverManager.getConnection(url,vusername,vpassword);	
                        System.out.println("Oracle Connection successfully");
                        System.out.println("Now Please See all the Table Name to view its record ......: ");
			scomm = "select TNAME from TAB";
			//instantiating the oracle statementabdus
                       
                                
			ost = (OracleStatement)oconn.createStatement();	
			//instantiating the oracle resultset
                       
			ors = (OracleResultSet)ost.executeQuery(scomm);
			while(ors.next())
			{
                            
				System.out.println(ors.getString(1));
			}	
			System.out.print("Please enter a Table Name to view its Single Value: ");
			String tableName = sc.next();
			scomm = "select * from "+tableName;
			ors = (OracleResultSet)ost.executeQuery(scomm);
			if(ors.next())
			{
				System.out.println("The Top - Left value is "+ors.getString(1));
			}
			else
			{
				System.out.println("Either Table does not exists or Records does not exists...");
			}
			ors.close();
			ost.close();
			oconn.close();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.toString());
		}

	}
}
public class SingleValueDisplay
{
	public static void main(String [] args)
	{
		SingleValDisplay ro = new SingleValDisplay();
	}
}

