
package coneccionsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con = null;
    
    
    public  Conexion(){
        
         try
                {
                  String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Northwind;integratedSecurity=true;";

                   String sql="jdbc:sqlserver://localhost:1433;"
                           + "databaseName=practica;"
                           + "IntegratedSecurity=true";
                   con = DriverManager.getConnection(sql);
                  JOptionPane.showMessageDialog(null, "Conexion a la base de datos Exitosa ");
                }
            catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(null, "Conexion a DB erronea "+e);
                }
        
    }
    
    public Connection getConnection(){
        return con;
    }
            
    
}
