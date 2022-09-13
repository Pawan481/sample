package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Details {

	
		
		public static void main(String[] args) throws Exception {
			
			//register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
						
			//get the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/people","root","entity");
					
			//creating a statement				
			Statement  st = con.createStatement();
			
			//execute a query
			ResultSet rs = st.executeQuery("select * from players");
			
			
			while(rs.next()) {
			String Name =rs.getString("name");
			int scores = rs.getInt("score");
			String Team = rs.getString("team");
			
			
			System.out.println(Name+" "+scores+ " "+Team);
			}		
			
			
			st.close();
			con.close();


	}

}
