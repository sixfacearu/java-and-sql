// import java.sql.*;
// class FirstApp{
// 	public static void main(String[] args){
// 		try{
// 			String dburl="jdbc:mysql://localhost:3306/student";
// 			String username="root";
// 			String password="kannan123$%123$%";
// 			Connection myconnection=DriverManager.getConnection(dburl,username,password);
// 			Statement mystatement=myconnection.createStatement();
// 			ResultSet myResultSet=mystatement.executeQuery("show tables");
// 			while(myResultSet.next()){
// 				System.out.println("student full name:"+myResultSet.getString("firstname")+" "+myResultSet.getString("lastname"));
				
// 			}
			
// 		}catch(Exception e){
// 			System.out.println(e.getMessage());
// 		}
// 	}
// }

import java.sql.*;
import java.util.*;
class Main
{
    public static void main(String a[])
    {
		//Creating the connection
		while(true){
        String url = "jdbc:mysql://localhost:3306/employe";
        String user = "root";
        String pass = "kannan123$%123$%";
 
        //Entering the data
		Scanner k = new Scanner(System.in);
		System.out.println("enter roll no");
        int roll = k.nextInt();
        System.out.println("enter first name");
        String name = k.next();
        
        System.out.println("enter last name");
        String cls =  k.next();
 
        //Inserting data using SQL query
        String sql = "insert into employe values('"+name+"','"+cls+"')";
        Connection con=null;
        try
        {
            // DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
 
            // //Reference to connection interface
            // con = DriverManager.getConnection(url,user,pass);
            Connection myconnection=DriverManager.getConnection(url,user,pass);
			//Statement st = con.createStatement();
			Statement mystatement=myconnection.createStatement();
            int m = mystatement.executeUpdate(sql);
            if (m == 1)
                System.out.println("inserted successfully : "+sql);
            else
                System.out.println("insertion failed");
            con.close();
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
    }
}
}