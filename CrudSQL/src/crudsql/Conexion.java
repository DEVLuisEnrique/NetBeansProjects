
package crudsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    public static Connection getConecction(){
        String url = "jdbc:sqlserver://localhost:1433;"
                + "databasename=Escuela;"
                + "IntegratedSecurity=true";
        
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
            
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
          
    }
    
}
