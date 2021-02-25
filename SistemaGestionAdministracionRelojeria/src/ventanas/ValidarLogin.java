
package ventanas;

import conexionDB.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ValidarLogin {
    //Connection con = Conexion.getConnection();
    
    
    public int validarIngreso(){
        String usuario = ventanas.ventanaLogin.txtUsuario.getText();
        String clave = String.valueOf(ventanas.ventanaLogin.jpClave.getPassword());
        
        int resultado = 0;
        
        String sql = "SELECT * FROM UsuarioRegistro WHERE nombre_usuario='"+usuario+"' and clave_acceso=('"+clave+"')";
         Connection con = null;
         
         try {
            con = Conexion.getConnection();
            Statement st  = con.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            
            if(rs.next())
                {
                    resultado = 1;
                }
             
        } catch (SQLException e) {
            System.out.println(e.toString());
            //JOptionPane.showMessageDialog(null, "Usuario no registrado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        
    return resultado;
    }
    
    
}
