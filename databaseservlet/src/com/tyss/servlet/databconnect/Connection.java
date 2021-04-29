package com.tyss.servlet.databconnect;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;

public class Connection extends HttpServlet {
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	   static java.sql.Connection con=null;
	    static PreparedStatement pst=null;
	
			static {
				
					try {
						Class.forName("com.mysql.jdbc.Driver");
						con=DriverManager.getConnection("jdbc:mysql://localhost:3306/FaceBookLogin","root","root");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
				
					
			public static java.sql.Connection getcon() {
				return con;
				
			}	
	
			
	
}
