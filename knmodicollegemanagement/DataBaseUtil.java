package com.knmodicollege.collegemanagement.util;
import java.sql.*;

public class DataBaseUtil 
{
	//to store url of database server
	private static final String url = "jdbc:mysql://localhost:3306/collegemanagement";
	//to store username of the database
	private static final String username ="root";
	//to store password of the database
	private static final String password ="123456";
	
	//to store Connection data
	private static Connection con=null;
	
	//method to establish connection
	public static Connection establishConnection()
	{
		try
		{
			con = DriverManager.getConnection(url,username,password);
			//calling method to create a table
			createTables();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		return con;
	}
	
	//method to close the connection
	public static void closeConnection()
	{
		try {
			if(con!=null)
			{
				con.close();
			}
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
	}
	
	//method to create tables if not exists
	
	public static void createTables()
	{
		try
		{
			if(con != null)
			{
				//creating statement reference
				Statement stmt = con.createStatement();
				
				//Query for table creation
				String createQuery = "create table if not exists student("
						+"stdid varchar(30) primary key,"
						+"stdname varchar(300) not null,"
						+"standard varchar(100) not null,"
						+"age int not null)";
				// to execute the query 
				stmt.executeUpdate(createQuery);
			}
		}catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
	}
}
