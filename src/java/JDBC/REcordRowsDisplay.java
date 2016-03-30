/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDBC;

/*
 But we can make this object to move forward and backward direction by passing either
TYPE_SCROLL_INSENSITIVE or TYPE_SCROLL_SENSITIVE in createStatement(int,int) method as well as we can
make this object as updatable by:

* Syntax::;
* Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
 */

import java.util.*;
import java.sql.*;
import oracle.jdbc.*;
class TablerRows
{
	OracleConnection oconn;
	OracleStatement ostm;
	OracleResultSet ors;
	String scomm;
	String vusername,vpassword,url;
	Scanner sc = new Scanner(System.in);
	public TablerRows()
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
			ostm = (OracleStatement)oconn.createStatement(OracleResultSet.TYPE_SCROLL_SENSITIVE,OracleResultSet.CONCUR_UPDATABLE);  //The object of statement is responsible to execute queries with the database.	
			//instantiating the oracle resultset
                        
                        
                        /*
                            4) Execute the query
                            The executeQuery() method of Statement interface is used to execute queries to the
                            database. This method returns the object of ResultSet that can be used to get all the
                            records of a table.
                         */
                        ors=(OracleResultSet)ostm.executeQuery(scomm);
                        ors.absolute(3); // this means getting the record of only 3rd row is prited //ors.next() is not calling hare instead use only ors.abssolute(2)
                        System.out.println(ors.getString(1)+" "+ors.getString(2)+" "+ors.getString(3));
                        System.out.println(ors.getString(1)+"\t"+ors.getString(2)+"\t"+ors.getString(3));
                       ors.close();
                       ostm.close();
                       oconn.close();
                }
                catch(SQLException ex)
		{
			System.out.println(ex.toString());
		}
        }
}

            

public class REcordRowsDisplay 
{
    public static void main(String args[])
    {
        TablerRows tr=new TablerRows();
    }
}
