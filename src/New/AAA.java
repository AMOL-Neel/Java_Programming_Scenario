package New;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AAA 
{
	
		LinkedHashMap<Integer,LinkedHashMap<Integer,String>>  f_get_sql_result_map(String s_query)
		{
			String s_result;
			String connectionUrl;
			String DB_LOG_SERVER_NAME = "<Server name>";

			Map<String,String> map_result = new HashMap<String,String>(); 
			LinkedHashMap<Integer,String> o_clm_data;
			LinkedHashMap<Integer,LinkedHashMap<Integer,String>> tbl_map_result = new LinkedHashMap<Integer,LinkedHashMap<Integer,String>>();


			String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";  


			connectionUrl = "jdbc:sqlserver://" + DB_LOG_SERVER_NAME+";" +  
					"user=<username>;password=<password>;";  



			Connection conn = null;
			Statement stmt = null;
			ResultSet rs =null;
			try{
				//STEP 2: Register JDBC driver
				Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(connectionUrl);
				stmt = conn.createStatement();  
				rs = stmt.executeQuery(s_query);
				ResultSetMetaData rsmd = rs.getMetaData();

				int i_clm_count = rsmd.getColumnCount();

				int i_map_row_counter=0;
				while(rs.next()){					  
					o_clm_data = new LinkedHashMap<Integer,String>();
					for(int i=1;i<=i_clm_count;i++){
						o_clm_data.put(i-1,rs.getString(i));
					}//For closed
					tbl_map_result.put(i_map_row_counter, o_clm_data);
					i_map_row_counter = i_map_row_counter + 1;
				}//While Closed

				//System.out.println("Inside f_get_sql_result_multiple_records: " + map_result_query.get("ROW_1"));
				if(tbl_map_result.isEmpty()) {
					System.out.println("warn: Recordset is Empty. i.e. no records have been returned by the query. Connection Url: " + connectionUrl + " and Query: " + s_query);
				}else{
					System.out.println("info: Recordset has been stored in HashMap and returned. Connection Url: " + connectionUrl + " and Query: " + s_query);			    	  
				}
				return tbl_map_result;


			}catch(SQLException se){
				//Handle errors for JDBC
				System.out.println("warn:SQl Exception: " + se.toString() + " Query used: " + s_query);
				//se.printStackTrace();
				return tbl_map_result;
			}catch(Exception e){
				//Handle errors for Class.forName
				//e.printStackTrace();
				System.out.println("warn:Other General Exception: " + e.getMessage() + " Query used: " + s_query);
				return tbl_map_result;
			}finally{
				//finally block used to close resources
				try{
					if(stmt!=null)
						rs.close();
					conn.close();

				}catch(SQLException se){
					System.out.println("warn:Unable to close connection f_get_sql_result_multiple_records: " + se.getMessage());
				}// do nothing
				try{
					if(conn!=null)
						rs.close();
					conn.close();
				}catch(SQLException se){
					//se.printStackTrace();
					System.out.println("warn:Unable to close the Connection f_get_sql_result_multiple_records" + se.getMessage() + " Query used: " + s_query);
				}//end finally try
			}//end try


		}//End of Functi

}
