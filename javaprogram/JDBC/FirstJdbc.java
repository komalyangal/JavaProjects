import java.sql.*;
class FirstJdbc
{
    public static void main(String[] args) throws SQLException{
        Connection conn=null;
        try{
            Class.forName("oracle.jdbc.OracleDriver"); 
            System.out.println("Driver Loaded Successfully");

            conn=DriverManager.getConnection("jdbc:oracle:thin:@//KOMAL:1521/XE","SAIL1","mypassword");

            System.err.println("Connection established Successfully connected");

            Statement st=conn.createStatement();

            System.out.println("Statement created successfully");

            ResultSet rs=st.executeQuery("select * from BANKDATA.ACCOUNT");

            while(rs.next())
            {
                System.out.println("Account Number "+rs.getInt(1)+", Balance "+rs.getString(2));
            }
            conn.close();
        }
        catch(ClassNotFoundException ce)
        {
            System.out.println("Class is not found");
        }
        finally{

            try
            {
                if(conn!=null){
                    conn.close();
                                System.out.println("connection close successfully");
                }
            }
            catch(SQLException se)
            {
                se.getErrorCode();
            }
            
        }
        
            
        
    }
}