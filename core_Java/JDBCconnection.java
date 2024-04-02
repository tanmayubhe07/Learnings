package core_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		// For MySQL
		// DriverManager.getConnection("jdbc:mysql://" + host + ":" + port +
		// "DatabaseName", "username", "password");

		// For Oracle SQL Developer
		// DriverManager.getConnection("jdbc:oracle:thin:@//" + host + ":" + port +
		// "DatabaseName", "username", "password");

		String host = "172.16.11.41";
		String port = "1537";
		String databaseName = "CRMUATDB";

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//" + host + ":" + port + "/" + databaseName,
				"INTERFACES", "INTERFACES");
		Statement s = con.createStatement();
		
		//Note that we dont have to put semicolon(;) after the query 
		ResultSet rs = s.executeQuery("SELECT * FROM Siebel.S_ORG_EXT  WHERE row_id='1-C51T4BI'");

		while (rs.next()) {
			System.out.println(rs.getString("ROW_ID"));
		}
	}
}
