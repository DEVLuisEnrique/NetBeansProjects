package ventanas;


public class VentanaRegistrarUsuario extends javax.swing.JFrame {

   
    public VentanaRegistrarUsuario() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jrComun = new javax.swing.JRadioButton();
        jrAdmin = new javax.swing.JRadioButton();
        txtUserUsuario = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtApellidosUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNacimientoUsuario = new javax.swing.JTextField();
        jlRegresar = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Usuario - Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 18), new java.awt.Color(238, 112, 82))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(238, 112, 82));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 112, 82));
        jLabel1.setText("Tipo de usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("Clave de acceso:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setBackground(new java.awt.Color(238, 112, 82));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 112, 82));
        jLabel4.setText("Fecha de Nacimeinto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jrComun.setBackground(new java.awt.Color(255, 255, 255));
        jrComun.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jrComun.setForeground(new java.awt.Color(102, 102, 102));
        jrComun.setText("Comun");
        jPanel1.add(jrComun, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        jrAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jrAdmin.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jrAdmin.setForeground(new java.awt.Color(102, 102, 102));
        jrAdmin.setText("Administrador");
        jPanel1.add(jrAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        txtUserUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtUserUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUserUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtUserUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 190, -1));

        txtNombreUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 250, -1));

        txtApellidosUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtApellidosUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtApellidosUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtApellidosUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 250, -1));

        jLabel5.setBackground(new java.awt.Color(238, 112, 82));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 112, 82));
        jLabel5.setText("Nombre:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtNacimientoUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtNacimientoUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtNacimientoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNacimientoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacimientoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtNacimientoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, -1));

        jlRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/corner-down-left.png"))); // NOI18N
        jlRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlRegresar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlRegresarMouseMoved(evt);
            }
        });
        jlRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlRegresarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlRegresarMouseExited(evt);
            }
        });
        jPanel1.add(jlRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 364, 40, 30));

        btnRegistrar.setText("Registrar Usuario");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabel7.setBackground(new java.awt.Color(238, 112, 82));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 112, 82));
        jLabel7.setText("Nombre de usuario:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        txtClave.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        txtClave.setForeground(new java.awt.Color(102, 102, 102));
        txtClave.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 190, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user-plus (1).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 70, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void txtNacimientoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacimientoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacimientoUsuarioActionPerformed

    private void jlRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlRegresarMouseClicked
       ventanaLogin vl = new ventanaLogin();
       vl.setVisible(true);
       vl.setLocationRelativeTo(null);
       this.dispose();
       
        
        
    }//GEN-LAST:event_jlRegresarMouseClicked

    private void jlRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlRegresarMouseExited
       jlRegresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jlRegresarMouseExited

    private void jlRegresarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlRegresarMouseMoved
        jlRegresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jlRegresarMouseMoved

   
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
            java.util.logging.Logger.getLogger(VentanaRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlRegresar;
    private javax.swing.JRadioButton jrAdmin;
    private javax.swing.JRadioButton jrComun;
    private javax.swing.JTextField txtApellidosUsuario;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtNacimientoUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtUserUsuario;
    // End of variables declaration//GEN-END:variables
}
