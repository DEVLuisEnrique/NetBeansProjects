package conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {


    public static Connection getConnection(){
        String url = "jdbc:sqlserver://localhost:1433;databasename=Relojeria;IntegratedSecurity=true";
        
        try {
                
            Connection con = DriverManager.getConnection(url);
            return con;
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
   
    }
    
}
