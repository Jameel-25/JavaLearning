package com.RetrieveAndDiplayValues;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class RetrieveIt {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##emp","123");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM PRODUCT");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
			rs.close();
			stm.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
