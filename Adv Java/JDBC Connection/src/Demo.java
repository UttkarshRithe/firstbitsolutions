import java.sql.*;

public class Demo {
    public static void main(String[] args) {
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class loaded successfully!!");
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","Yash@8435");
			System.out.println("Connection establish successfully!!");
			Statement stmt=conn.createStatement();
			System.out.println("Statement create hua ");
			ResultSet res = stmt.executeQuery("select * from employee");
			System.out.println("query execute karke result set mila");
			
//			System.out.println("id "+" |"+"Name "+" |"+"Salary");
//			while(res.next())
//			{
//				System.out.println(res.getString(1)+"  "+res.getString(2)+"  "+res.getString(3));
//			}
			
			ResultSetMetaData metadata = res.getMetaData();
			
			int x =metadata.getColumnCount();
			
			for(int i=1;i<=x;i++)
			{
				System.out.print(metadata.getColumnName(i)+ " ");
			}
			System.out.println();
			
			while(res.next())
			{
				for(int j=1;j<=x;j++)
				{
					System.out.print(res.getObject(j)+" ");
//					
				}
				System.out.println();
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
    }
}