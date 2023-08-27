package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	 String url="jdbc:postgresql://localhost:5432/Person";
	 String user="postgres";
	 String password="root";
	public boolean login(String name,String pass) {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			String sql ="select * from login where userName=?";
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			
			preparedStatement.setString(1, name);
			ResultSet rs=preparedStatement.executeQuery();
			
			if(rs.next()) {
				String passr=rs.getString(2);
				if(pass.equals(passr)) {
					System.out.println("login sucessfull");
					return true;
				}
				else
					System.out.println("password mismatch...!");
				
			}
			else {
				System.out.println("user not found");
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
}
