import java.sql.*;
import java.util.Scanner;
public class HWExample_part2 {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        PreparedStatement ps=null;
        Scanner sc=new Scanner(System.in);
        try{

            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//KOMAL:1521/XE","system", "newpassword");
            ps=conn.prepareStatement("update book set BOOK_PRICE=BOOK_PRICE+? where subject=?");

            System.out.println("Enter the subject name ");
            String name=sc.nextLine();
           
            System.out.println("Enter the new book price ");
            float newprice=sc.nextFloat();

            
            ps.setFloat(1, newprice);
            ps.setString(2, name);
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