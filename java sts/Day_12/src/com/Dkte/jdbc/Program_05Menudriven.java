package com.Dkte.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Program_05Menudriven {

	public static void main(String[] args) {
		int ch;
		String  sql;
		Scanner sc=new Scanner(System.in);
		final String url="jdbc:mysql://localhost:3306/employee";
		final String username="root";
		final String password="komal";
		PreparedStatement stmt=null;
		Connection connection=null;
		Employee e=new Employee();
		try { 
				connection=DriverManager.getConnection(url,username,password);
			}
		catch (SQLException ie) 
		{
			ie.printStackTrace();
		}
		
		while(true)
		{
			System.out.println("**********************************");
			System.out.println("0.Exit");
			System.out.println("1.Add Employee ");
			System.out.println("2.Update Employee details ");
			System.out.println("3.Delete data ");
			System.out.println("4.Display Details");
			System.out.println("***********************************");
			System.out.println("Enter your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: sql="Insert into employee (name,salary,dept) values(?,?,?)";
						try
						{
							stmt=connection.prepareCall(sql);
							e.accept();
							stmt.setString(1, e.name);
							stmt.setDouble(2, e.salary);
							stmt.setString(3, e.dept);
							stmt.executeUpdate();
							System.out.println("Employee added ");
							
						} 
						catch (SQLException ie)
						{
							ie.printStackTrace();
						}
					    break;
				case 2: sql="update employee set salary=? where empid=? ";
						try
						{
							stmt=connection.prepareCall(sql);
							
							System.out.println("Enter the new salary ");
							double salary=sc.nextDouble();
							System.out.println("Enter the empid ");
							int empid=sc.nextInt();
							stmt.setDouble(1,salary );
							stmt.setInt(2, empid);
							stmt.executeUpdate();
							System.out.println("Employee update ");
							
						} 
						catch (SQLException ie)
						{
							ie.printStackTrace();
						}
					    break;
				case 3:sql="delete from employee where empid=?";
						try
						{
							stmt=connection.prepareCall(sql);
							
							System.out.println("Enter the empid ");
							int empid=sc.nextInt();
							
							stmt.setInt(1, empid);
							stmt.executeUpdate();
							System.out.println("Employee Deleted");
							
						} 
						catch (SQLException ie)
						{
							ie.printStackTrace();
						}
					    break;
				case 4:
						sql="select * from employee ";
						try 
						{
							stmt=connection.prepareCall(sql);
							ResultSet rs=stmt.executeQuery();
							while(rs.next())
							{
								
								e.empid=rs.getInt(1);
								e.name=rs.getString(2);
								e.salary=rs.getDouble(3);
								e.dept=rs.getString(4);
								System.out.println(e);
							}
						} 
						catch (SQLException e1)
						{
							e1.printStackTrace();
						}
						break;
				case 0:System.exit(0);
				default:break;
						
			}
		}
	}

}
