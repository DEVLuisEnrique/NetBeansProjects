package ventanas;

import AppPackage.AnimationClass;
import javax.swing.JOptionPane;


public class ventanaLogin extends javax.swing.JFrame {

   
    public ventanaLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlMusica = new javax.swing.JLabel();
        jlInternet = new javax.swing.JLabel();
        jlCalculadora = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlIconUser = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jsSeparador2 = new javax.swing.JSeparator();
        jlIconUser32 = new javax.swing.JLabel();
        jpClave = new javax.swing.JPasswordField();
        jsSeparador1 = new javax.swing.JSeparator();
        jlIconKeys = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 40, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Menu_32px.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Multiply_32px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, 40));

        jlMusica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Musical_Notes_32px.png"))); // NOI18N
        jlMusica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jlMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 120, 40, 30));

        jlInternet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Globe_32px.png"))); // NOI18N
        jlInternet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jlInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 40, 40, 30));

        jlCalculadora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Calculator_32px.png"))); // NOI18N
        jlCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jlCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 80, 40, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DT Managment Sys");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 290, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LOGIN");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 290, 30));

        jlIconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_User_96px_2.png"))); // NOI18N
        jPanel1.add(jlIconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 100, 90));

        jLabel10.setBackground(new java.awt.Color(238, 112, 82));
        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 112, 82));
        jLabel10.setText("Contraseña:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        jLabel11.setBackground(new java.awt.Color(238, 112, 82));
        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(238, 112, 82));
        jLabel11.setText("Usuario:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setText("Ingrese Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 220, 30));
        jPanel1.add(jsSeparador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 220, 10));

        jlIconUser32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIconUser32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_customer_32px_1.png"))); // NOI18N
        jPanel1.add(jlIconUser32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, 30));

        jpClave.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jpClave.setForeground(new java.awt.Color(102, 102, 102));
        jpClave.setText("jPasswordField1");
        jpClave.setBorder(null);
        jpClave.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jpClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 220, 30));
        jPanel1.add(jsSeparador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 220, 10));

        jlIconKeys.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIconKeys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Key_32px.png"))); // NOI18N
        jPanel1.add(jlIconKeys, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 40, 30));

        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Enter_OFF.png"))); // NOI18N
        btnEnter.setBorder(null);
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Enter_ON.png"))); // NOI18N
        btnEnter.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Enter_ON.png"))); // NOI18N
        btnEnter.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Enter_OFF.png"))); // NOI18N
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, -1));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_registrar_OFF.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_registarse_on.png"))); // NOI18N
        btnRegistrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_registarse_on.png"))); // NOI18N
        btnRegistrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_registrar_OFF.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int opcion = JOptionPane.YES_OPTION;
        int resultado = JOptionPane.showConfirmDialog(null,"Desea salir?", "Exit", opcion);
        
        if(resultado == 0)
            {
                System.exit(0);
               
            }
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(ventanaLogin.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       AnimationClass internet = new AnimationClass();
       AnimationClass internet1 = new AnimationClass();
       internet.jLabelXRight(-40, 10, 10, 5, jlInternet);
       internet1.jLabelXLeft(10, -40, 10, 5, jlInternet);
       
       AnimationClass musica = new AnimationClass();
       AnimationClass musica1 = new AnimationClass();
       musica.jLabelXRight(-40, 10, 10, 5, jlMusica);
       musica1.jLabelXLeft(10, -40, 10, 5, jlMusica);
       
       AnimationClass calculadora = new AnimationClass();
       AnimationClass calculadora1 = new AnimationClass();
       calculadora.jLabelXRight(-40, 10, 10, 5, jlCalculadora);
       calculadora1.jLabelXLeft(10, -40, 10, 5, jlCalculadora);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        //para llamar a la ventana principal
        VentanaPrincipal vp = new VentanaPrincipal();
        
       vp.setVisible(true);
        vp.setLocationRelativeTo(null);
       this.setVisible(false);
        
        
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        VentanaRegistrarUsuarios vr = new VentanaRegistrarUsuarios();
        vr.setVisible(true);
        vr.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlCalculadora;
    private javax.swing.JLabel jlIconKeys;
    private javax.swing.JLabel jlIconUser;
    private javax.swing.JLabel jlIconUser32;
    private javax.swing.JLabel jlInternet;
    private javax.swing.JLabel jlMusica;
    private javax.swing.JPasswordField jpClave;
    private javax.swing.JSeparator jsSeparador1;
    private javax.swing.JSeparator jsSeparador2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
