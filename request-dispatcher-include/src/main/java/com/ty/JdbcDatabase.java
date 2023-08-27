package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDatabase {

	static String url="jdbc:postgresql://localhost:5432/Person";
	static String user="postgres";
	static String password="root";
	
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			String sql ="select * from login where userName=?";
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			String name="admin";
			preparedStatement.setString(1, name);
			ResultSet rs=preparedStatement.executeQuery();
			String passwo="12345";
			if(rs.next()) {
				String pass=rs.getString(2);
				if(pass.equals(passwo)) {
					System.out.println("login sucessfull");
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
	}
}
