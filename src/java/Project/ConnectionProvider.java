package Project;
import java.sql.* ;



public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms?zeroDateTimeBehavior=CONVERT_TO_NULL","root","8097500914");
            return con;
        }
            catch(Exception e)
            {
                return null;
            }
        
    }
}
