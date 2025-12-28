import java.sql.*;
import java.util.Scanner;
public class  jdbcApp1 {

    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        Scanner sc=new Scanner(System.in);

        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//KOMAL:1521/XE", "system", "newpassword");
            Statement st=conn.createStatement();
            System.out.println("Enter the Student id:= ");
            int id=sc.nextInt();
            System.out.println("Enter the student name:= ");
            sc.nextLine();
            String name=sc.next();
            

            System.out.println("Enter the Student Age:=");
            int age=sc.nextInt();
            int rs=st.executeUpdate("INSERT INTO STUDENT VALUES(" + id + ", '" + name + "', " + age + ")");
            System.out.println("Record inserted:="+rs);

        }
        catch(ClassNotFoundException se)
        {
            System.out.println("class not found");

        }
        finally
        {
            try{
                if(conn!=null)
                {
                    conn.close();
                    System.out.println("Connection closed successfully !!");

                }
            }
            catch(SQLException se)
            {
                se.getErrorCode();
                System.out.println("Exception occurs");
            }
        }
    }
}
