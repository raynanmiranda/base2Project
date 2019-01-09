package utils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectMySQL {
    private static Connection con;
    private Statement st;
    private ResultSet rs;
    private String name;
    private String url;
    private String password;
    private String driver;

    public ConnectMySQL() {
        this.name = "root";
        this.password = "root";
        this.url = "jdbc:mysql://localhost:3306/mantis?useTimezone=true&serverTimezone=UTC";
        this.driver = "com.mysql.cj.jdbc.Driver";
    }

    public Connection getConnection() throws SQLException {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "");
            st = con.createStatement();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
    
    public String getDataOfTask(String query, String result) {
    	
    	String dataExist = "0";
    	try {
    		
    		rs = st.executeQuery(query);
    		System.out.println("dataBDTask");
    		
    		while(rs.next()) {
				String description = rs.getString("summary");
    		if(description == null) {
    			dataExist = "0";
    			break;
    			}
    		else {
    				System.out.println("Description of task \n" + description);
    	    	    dataExist = "1";
    				}
    			
    		}
    		
    	
    	}catch(Exception ex) {
    		System.out.println(ex);
    		
    	}
		return result = dataExist;
    }
    
    
    public static void closeConnection() throws SQLException {
    	con.close();
    	
    }
}
	

