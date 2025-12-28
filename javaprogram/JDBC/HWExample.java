import java.sql.*;
import java.util.Scanner;
public class HWExample {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        PreparedStatement ps=null;
        Scanner sc=new Scanner(System.in);
        try{

            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//KOMAL:1521/XE","system", "newpassword");
            ps=conn.prepareStatement("insert into book values(?,?,?,?)");

            System.out.println("Enter the data into book table ");
            String choice;
            int count=0;
            do{
                System.out.println("Enter the book id:= ");
                int id=sc.nextInt();
                System.out.println("Enter the book name:= ");
                sc.nextLine();
                String bname=sc.nextLine();
                System.out.println("Enter the book price:= ");
                sc.nextLine();
                float bprice=sc.nextFloat();
                System.out.println("Enter the subject:= ");
                sc.nextLine();
                String sub=sc.nextLine();

                ps.setInt(1, id);
                ps.setString(2, bname);
                ps.setFloat(3, bprice);
                ps.setString(4, sub);

                int ans=ps.executeUpdate();
                if(ans==1)
                {
                    count++;
                }
                System.out.println("Do you want to contineu:- (yes/no)");
                choice=sc.next();


            }while(choice.equalsIgnoreCase("yes"));
            System.out.println("Total record inserted are:= "+count);

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
