import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect{
    
    static Connection conn;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank","root","");
            return conn;
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
    return null;
        }
    }
    
}