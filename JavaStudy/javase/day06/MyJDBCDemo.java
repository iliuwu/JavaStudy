package day06;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class MyJDBCDemo {
	private static String url;
	private static String dbUser;
	private static String dbPassword;
	
	public static void getParam(String filename) {
		Properties propes = new Properties();
		File file = new File(filename);
		try {
			FileInputStream fis = new FileInputStream(file);
			propes.load(fis);
			url = propes.getProperty("url");
			dbUser = propes.getProperty("dbUser");
			dbPassword  = propes.getProperty("dbPassword");
		}catch (FileNotFoundException e ){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	public static void  getEmpData() {
		Connection connection	= null;
		Statement stmtStatement = null;
//		ResultSet rs = null;
	//	String sqlString = "select * from tbl_txn_log_a  where inst_date = '20140725'";
		try {
			connection = DriverManager.getConnection(url, dbUser, dbPassword);
			stmtStatement = (Statement) connection.createStatement();
			DatabaseMetaData dmData = connection.getMetaData();
			System.out.println(dmData.getDatabaseProductName());
			System.out.println(dmData.getDatabaseMajorVersion());
			System.out.println(dmData.getDatabaseProductVersion());
			System.out.println(dmData.getURL());
			System.out.println(dmData.getUserName());
		/*	rs =  stmtStatement.executeQuery(sqlString);
			while(rs.next()){
				int id = rs.getInt("inst_date");
				String nameString = rs.getString("inst_time");
				int age = rs.getInt("msg_src_id");
				System.out.println(id + " "+ nameString +  " "+age);
	
			}*/
		//	rs.close();
			stmtStatement.close();
			connection.close();
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		getParam("D:\\Program Files\\eclipse\\workspace\\JavaTest\\javase\\day06\\db_oracle.properties");
		getEmpData();
	}
	
}
