
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion {
    
    Statement sql;
    public static Connection getConnection(){
     
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=Northwind;"
                    + "integratedSecurity=true";
        try {
           Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException e ) {
            System.out.println(e.toString());
             return null;
        }
    
    }
    
}
