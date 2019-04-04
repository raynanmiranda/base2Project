package utils;

import java.io.File;
import java.net.URISyntaxException;
import java.security.CodeSource;
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

			while (rs.next()) {
				String description = rs.getString("summary");
				if (description == null) {
					dataExist = "0";
					break;
				} else {
					System.out.println("Description of task \n" + description);
					dataExist = "1";
				}

			}

		} catch (Exception ex) {
			System.out.println(ex);

		}
		return result = dataExist;
	}

	public static void closeConnection() throws SQLException {
		con.close();

	}

	public static void restoreDB() throws SQLException, URISyntaxException {
		
		CodeSource codeSource = ConnectMySQL.class.getProtectionDomain().getCodeSource();
        File jarFile = new File(codeSource.getLocation().toURI().getPath());
        String jarDir = jarFile.getParentFile().getPath();
		
		String dbName = "mantis";
		String user = "root";
		String pass = "root";
		
		String folderPath = jarDir + "\\resources";
		File f1 = new File(folderPath);
        f1.mkdir();
        String restorePath = "D:\\JavaProjects\\base2Project\\resources\\restoreDB\\mantis.sql";
		//String[] restoreCmd = new String[] {"C:/xampp/mysql/bin/mysql.exe","--user="+user,"--password="+pass,"-e","source "+System.getProperty("user.dir")+"\\resources\\restoreDB\\mantis.sql"};
        String[] dropTable = new String[] { "mysql.exe> DROP TABLE 'mantis_api_token_table', 'mantis_bugnote_table', 'mantis_bugnote_text_table', 'mantis_bug_file_table', 'mantis_bug_history_table', 'mantis_bug_monitor_table', 'mantis_bug_relationship_table', 'mantis_bug_revision_table', 'mantis_bug_table', 'mantis_bug_tag_table', 'mantis_bug_text_table', 'mantis_category_table', 'mantis_config_table', 'mantis_custom_field_project_table', 'mantis_custom_field_string_table', 'mantis_custom_field_table', 'mantis_email_table', 'mantis_filters_table', 'mantis_news_table', 'mantis_plugin_table', 'mantis_project_file_table', 'mantis_project_hierarchy_table', 'mantis_project_table', 'mantis_project_user_list_table', 'mantis_project_version_table', 'mantis_sponsorship_table', 'mantis_tag_table', 'mantis_tokens_table', 'mantis_user_pref_table', 'mantis_user_print_pref_table', 'mantis_user_profile_table', 'mantis_user_table';"};
		String executeCmd = "mysql.exe -u " + user+ " -p " + " "+ dbName +" < "+ restorePath;
		String executeCmd2 = "";
		Process process;
		try {
			process = Runtime.getRuntime().exec(dropTable);
			process = Runtime.getRuntime().exec(executeCmd);
			process = Runtime.getRuntime().exec(executeCmd2);
			int procCom = process.waitFor();
			
			if(procCom == 0) {
				System.out.println("Restore success!");
				
			}
			else {
				System.out.println("Restore Failed!");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
