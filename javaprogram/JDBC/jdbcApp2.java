import java.sql.*;
import java.util.Scanner;
public class jdbcApp2 {
    public static void main(String[] args) throws SQLException{
        Connection conn=null;
        Scanner sc=new Scanner(System.in);
        try{

            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//KOMAL:1521/XE", "system","newpassword");
            PreparedStatement st=conn.prepareStatement("insert into student values(?,?,?)");

            System.out.println("Enter the Student id:= ");
            int id=sc.nextInt();
            System.out.println("Enter the student name:= ");
            sc.nextLine();
            String name=sc.next();
            System.out.println("Enter the Student Age:=");
            int age=sc.nextInt();

            st.setInt(1,id);
            st.setString(2, name);
            st.setInt(3, age);
            int ans=st.executeUpdate();
            
            System.out.println("Record inserted:= "+ans);

        }
        catch(ClassNotFoundException c)
        {
            System.out.println("Class not found");
        }
        finally{

            try{
                if(conn!=null)
                {
                    conn.close();
                    System.out.println("Connection close successfully ");
                }
            }
            catch(SQLException s)
            {
                System.out.println("Exception occured ");
            }
        }
    }
}
