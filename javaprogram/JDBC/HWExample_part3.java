import java.sql.*;
import java.util.Scanner;
public class HWExample_part3 {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        PreparedStatement ps=null;
        Scanner sc=new Scanner(System.in);
        try{

            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//KOMAL:1521/XE","system", "newpassword");
            ps=conn.prepareStatement("delete from book where subject=?");

            System.out.println("Enter the subject name ");
            String name=sc.nextLine();
           
            ps.setString(1, name);
            int ans=ps.executeUpdate();
            System.out.println("Record updated:= "+ans);

        }
        catch(ClassNotFoundException ce)
        {
            System.out.println("exception occure");
        }
        finally
        {
            try{
                if(conn!=null)
                {
                    conn.close();
                }

            }
            catch(SQLException s)
            {
                System.out.println("Exception occure ");
            }
        }
    }
}