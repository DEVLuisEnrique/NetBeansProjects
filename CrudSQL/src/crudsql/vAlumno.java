package crudsql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class vAlumno extends javax.swing.JFrame {
    ButtonGroup btnGr;
    
    public vAlumno() {
        initComponents();
        cargarTabla();
        //ocultar el codigo del estudiante
        txtId.setVisible(false);
        jlId.setVisible(false);
        
        ///
        btnGr = new ButtonGroup();
        btnGr.add(rMasculino);
        btnGr.add(rFemenino);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jlId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rFemenino = new javax.swing.JRadioButton();
        rMasculino = new javax.swing.JRadioButton();
        txtMatricula = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jlMinimizar = new javax.swing.JLabel();
        jlCerrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 112, 82));
        jLabel1.setText("dd/mm/yy");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "matricula", "nombre", "sexo", "email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAlumnos.setGridColor(new java.awt.Color(0, 0, 0));
        tblAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlumnos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 450, 390));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(238, 112, 82))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("Matricula:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 34, -1, -1));

        txtEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 180, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 170, -1));

        jlId.setBackground(new java.awt.Color(255, 255, 255));
        jlId.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jlId.setForeground(new java.awt.Color(238, 112, 82));
        jlId.setText("Cod.");
        jPanel2.add(jlId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        txtId.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 50, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 112, 82));
        jLabel5.setText("Sexo:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 112, 82));
        jLabel6.setText("Email:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        rFemenino.setBackground(new java.awt.Color(255, 255, 255));
        rFemenino.setText("Femenino");
        jPanel2.add(rFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        rMasculino.setBackground(new java.awt.Color(255, 255, 255));
        rMasculino.setText("Masculino");
        jPanel2.add(rMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        txtMatricula.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtMatricula.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 170, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        txtEdad.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 50, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 112, 82));
        jLabel7.setText("Edad:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 370, 390));

        jlMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimize.png"))); // NOI18N
        jlMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(jlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        jlCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jlCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x-square.png"))); // NOI18N
        jlCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(jlCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 112, 82));
        jLabel4.setText("Alumnos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 112, 82));
        jLabel8.setText("00:00:00 PM/AM");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 112, 82));
        jLabel9.setText("Hora:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 112, 82));
        jLabel10.setText("Fecha:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
        if(!(txtMatricula.getText().equals("") && txtNombre.getText().equals("") && txtEdad.getText().equals("") && txtEmail.getText().equals("")))
            {
                //DECLARACION DE VARIABLES
                String matricula = txtMatricula.getText();
                String nombre = txtNombre.getText();
                String email = txtEmail.getText();
                int edad = Integer.parseInt(txtEdad.getText()); 
                String sexo;

                //SEXO MASCULINO O FEMENINO
                if(rMasculino.isSelected() == true)
                    {
                        sexo = "M";
                    }
                else if(rFemenino.isSelected() == true)
                    {
                        sexo = "F";
                    }
                else{
                    sexo = "M";
                }

                try {
                    Connection con = Conexion.getConecction();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO alumnos ("
                            + "matricula, nombre, edad, sexo, email, activo) VALUES(?,?,?,?,?,?)");

                    ps.setString(1, matricula);
                    ps.setString(2, nombre);
                    ps.setInt(3, edad);
                    ps.setString(4, sexo);
                    ps.setString(5, email);
                    ps.setInt(6, 1);

                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro guardado.");
                    limpiar(); //metodo limpiar
                    cargarTabla(); //cargar tablas

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
            }
        else{
            JOptionPane.showMessageDialog(null, "No pudimos insertar los datos");
        }
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jlCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCerrarMouseClicked
       
        int dialog = JOptionPane.YES_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Desea salir del sistema? ","Exit",dialog);
        
        if(result == 0)
            {
                System.exit(0);
            }
            
        
    }//GEN-LAST:event_jlCerrarMouseClicked

    private void jlMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizarMouseClicked
        this.setState(vAlumno.ICONIFIED);
    }//GEN-LAST:event_jlMinimizarMouseClicked

    private void tblAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnosMouseClicked
        
        try {
            int fila = tblAlumnos.getSelectedRow();
            int id = Integer.parseInt(tblAlumnos.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            
            Connection con = Conexion.getConecction();
            ps = con.prepareStatement("SELECT matricula, nombre, edad, sexo, email FROM alumnos WHERE id = ?");
            ps.setInt(1, id);
            rs =  ps.executeQuery();
            
            while(rs.next())
                {
                    txtId.setText(String.valueOf(id));
                    txtMatricula.setText(rs.getString("matricula"));
                    txtNombre.setText(rs.getString("nombre"));
                    txtEdad.setText(rs.getString("edad"));
                    txtEmail.setText(rs.getString("email"));
                    
                    if(rs.getString("sexo").endsWith("M"))
                        {
                            rMasculino.setSelected(true);
                        }
                    else if(rs.getString("sexo").endsWith("F"))
                        {
                            rFemenino.setSelected(true);
                        }
                    
                }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }//GEN-LAST:event_tblAlumnosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       
       // int filaselected = tblAlumnos.getSelectedRow();
        
        if(!(txtMatricula.getText().equals("") && txtNombre.getText().equals("") && txtEdad.getText().equals("") && txtEmail.getText().equals("")))
            {    //DECLARACION DE VARIABLES
                int id = Integer.parseInt(txtId.getText());
                String matricula = txtMatricula.getText();
                String nombre = txtNombre.getText();
                String email = txtEmail.getText();
                int edad = Integer.parseInt(txtEdad.getText()); 
                String sexo;

                //SEXO MASCULINO O FEMENINO
                if(rMasculino.isSelected() == true)
                    {
                        sexo = "M";
                    }
                else if(rFemenino.isSelected() == true)
                    {
                        sexo = "F";
                    }
                else{
                    sexo = "M";
                }

                try {
                    Connection con = Conexion.getConecction();
                    PreparedStatement ps = con.prepareStatement("UPDATE alumnos SET matricula = ?, nombre = ?, edad = ?, sexo = ?, email = ? WHERE id = ?");

                    ps.setString(1, matricula);
                    ps.setString(2, nombre);
                    ps.setInt(3, edad);
                    ps.setString(4, sexo);
                    ps.setString(5, email);
                    ps.setInt(6, id);

                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro modificado.");
                    limpiar(); //metodo limpiar
                    cargarTabla(); //cargar tablas

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
            }
        else{
        JOptionPane.showMessageDialog(null,"Seleccione una fila para modificar");
        }
            
        
        
        
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       //DECLARACION DE VARIABLES
        int id = Integer.parseInt(txtId.getText());
       
        
        
        
        try {
            Connection con = Conexion.getConecction();
            //PreparedStatement ps = con.prepareStatement("DELETE FROM alumnos WHERE id = ?");
          PreparedStatement ps = con.prepareStatement("UPDATE alumnos SET activo = 0 WHERE id = ?");
            ps.setInt(1, id);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado.");
            limpiar(); //metodo limpiar
            cargarTabla(); //cargar tablas
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vAlumno().setVisible(true);
            }
        });
    }
    
    
    //##################METODOS################################################
    
    private void limpiar(){
        txtId.setText("");
        txtMatricula.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtEmail.setText("");
        btnGr.clearSelection();
    }
    
    private void cargarTabla(){
    
        DefaultTableModel modelo = (DefaultTableModel) tblAlumnos.getModel();
        modelo.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd; //para traer el nuemro de columnas
        int column;
        
        int anchos[] = {10,50,100,30,100};
        
        for(int i = 0; i < tblAlumnos.getColumnCount(); i++)
            {
                tblAlumnos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
        
        try {
          Connection con = Conexion.getConecction();
          ps = con.prepareStatement("SELECT id, matricula, nombre, sexo, email FROM alumnos WHERE activo = 1");
          rs =  ps.executeQuery();
          rsmd = rs.getMetaData();
          column = rsmd.getColumnCount();
          
          while(rs.next())
            {
                Object[] fila =new Object[column];
                
                for(int indice = 0; indice < column; indice++)
                    {
                        fila[indice] = rs.getObject(indice + 1);
                    }
                
                modelo.addRow(fila);
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlCerrar;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlMinimizar;
    private javax.swing.JRadioButton rFemenino;
    private javax.swing.JRadioButton rMasculino;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
