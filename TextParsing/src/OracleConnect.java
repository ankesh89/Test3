import java.sql.*;  

public class OracleConnect {
	
public static void main(String args[]){  
		try{  
			
		String name="xyz";	
		//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:orcl","system","Keanureeves321");  
		  
		//step3 create the statement object
		//Statement stmt=con.createStatement(); 
		PreparedStatement stmt = con.prepareStatement("insert into student values(?,?,?)");
		
		
		  
		//step4 execute query
		
		/*ResultSet rs=stmt.executeQuery("select * from student");  
		while(rs.next())  
		
		System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3)); */
		/*stmt.executeUpdate("insert into student values('parmesh',2013014,23)");
		System.out.println("Insert is done ");*/
		
		stmt.setString(1,name);
		stmt.setInt(2,2013016);
		stmt.setInt(3,24);
		stmt.executeUpdate();
		System.out.println("Insert is done ");
		
		
		
		  
		//step5 close the connection object  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
		  
		
		

	}


