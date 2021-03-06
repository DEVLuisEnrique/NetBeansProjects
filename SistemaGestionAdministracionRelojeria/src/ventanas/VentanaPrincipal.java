package ventanas;


import AppPackage.AnimationClass;
import conexionDB.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class VentanaPrincipal extends javax.swing.JFrame implements Runnable{
   
    //variables
   private String hora,minutos,segundos,amPm;
   private Thread hilos;
   DefaultTableModel modelo  = new DefaultTableModel();
   ButtonGroup btnGr;
   Connection con;
   ///////////////////
   
    public VentanaPrincipal() {
        initComponents();
        jLFecha.setText(fecha());
        
        this.setLocationRelativeTo(null);
        hilos = new Thread(this);
        hilos.start();
       
        btnGr = new ButtonGroup();
        btnGr.add(jrAprobado);
        btnGr.add(jrControl);
        btnGr.add(jrListo);
        btnGr.add(jrTaller);
       // datosTabla();
       
       //usuario en el sistema
       try{
        con = Conexion.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        
        ps = con.prepareStatement("SELECT nombre,apellidos FROM UsuarioRegistro WHERE nombre_usuario ='"+ventanaLogin.txtUsuario.getText()+"'");
       // ps.setString(6, hora);
       rs = ps.executeQuery();
       
       while(rs.next())
        {
            JLUsuario.setText(rs.getString("nombre")+" "+rs.getString("apellidos"));
        }
        
        }catch(SQLException e)
            {
                System.out.println(e.toString());
            }
        
    }
    
    public void userInSystem(){
       
        try{
        con = Conexion.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        
        ps = con.prepareStatement("SELECT nombre, Apellidos FROM UsuarioRegistro WHERE nombre_usuario ="+ventanaLogin.txtUsuario);
       // ps.setString(6, hora);
       rs = ps.executeQuery();
       
       while(rs.next())
        {
            JLUsuario.setText(rs.getString("nombre"));
        }
        
        }catch(SQLException e)
            {
                System.out.println(e.toString());
            }
    
    }
    
    public void datosTabla(){
        
       modelo.addColumn("Codigo");
       modelo.addColumn("Nombre");
       modelo.addColumn("Apellidos");
       modelo.addColumn("Telefono");
       modelo.addColumn("Estatus");
       modelo.addColumn("Fecha_Entrada");
       modelo.addColumn("Fecha_Salida");
       modelo.addColumn("Garantia");
       modelo.addColumn("Marca_Reloj");
       modelo.addColumn("Foto_Reloj");
       modelo.addColumn("Serial_Reloj");
       modelo.addColumn("Modelo_Reloj");
       modelo.addColumn("Tipo_Servicio");
       modelo.addColumn("Costo_Servicio");
       
       
       
       jTablaGeneral.setModel(modelo);
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlHora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JLRELOJ_CLIENTE = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JLEliminar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaGeneral = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JLImprimir = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jrListo = new javax.swing.JRadioButton();
        jrAprobado = new javax.swing.JRadioButton();
        jrTaller = new javax.swing.JRadioButton();
        jrControl = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        JLModificar = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JLUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLFecha.setBackground(new java.awt.Color(238, 112, 82));
        jLFecha.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLFecha.setForeground(new java.awt.Color(238, 112, 82));
        jLFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLFecha.setText("dd/mm/yy");
        jPanel1.add(jLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("Fecha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SISTEMA DE GESTION Y ADMINISTACION DE RELOJ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        jlHora.setBackground(new java.awt.Color(238, 112, 82));
        jlHora.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jlHora.setForeground(new java.awt.Color(238, 112, 82));
        jlHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHora.setText("00:00:00 AM");
        jPanel1.add(jlHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, -1, -1));

        jLabel4.setBackground(new java.awt.Color(238, 112, 82));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 112, 82));
        jLabel4.setText("CLIENTES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, -1, -1));

        JLRELOJ_CLIENTE.setBackground(new java.awt.Color(255, 255, 255));
        JLRELOJ_CLIENTE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLRELOJ_CLIENTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file-plus.png"))); // NOI18N
        JLRELOJ_CLIENTE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JLRELOJ_CLIENTE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLRELOJ_CLIENTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLRELOJ_CLIENTEMouseClicked(evt);
            }
        });
        jPanel1.add(JLRELOJ_CLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 80, 70));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings-_1_.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 80, -1));

        JLEliminar.setBackground(new java.awt.Color(255, 255, 255));
        JLEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file-minus_2.png"))); // NOI18N
        JLEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JLEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(JLEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 80, 70));

        jTablaGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellidos", "Telefono", "Reloj_Marca", "Reloj_Modelo", "Serial", "Fecha_Entrada", "Fecha_Salidad", "Estatus", "Tipo_Servicio", "Costo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaGeneral.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTablaGeneral);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 1210, 330));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 112, 82));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ajustes");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 112, 82));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Reloj-Cliente");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 100, 20));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(238, 112, 82));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Eliminar");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        JLImprimir.setBackground(new java.awt.Color(255, 255, 255));
        JLImprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer.png"))); // NOI18N
        JLImprimir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JLImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(JLImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 80, 70));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(238, 112, 82));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Modificar");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        jLabel7.setBackground(new java.awt.Color(238, 112, 82));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 112, 82));
        jLabel7.setText("Hora:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro de busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_32px_2.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Search");
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 230, 30));

        jrListo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jrListo.setText("Listo para entrega");
        jPanel2.add(jrListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jrAprobado.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jrAprobado.setText("Aprobado");
        jPanel2.add(jrAprobado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jrTaller.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jrTaller.setText("Taller");
        jPanel2.add(jrTaller, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jrControl.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jrControl.setText("Cotrol de calidad");
        jPanel2.add(jrControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jButton1.setText("Buscar");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 90, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 390, 120));

        JLModificar.setBackground(new java.awt.Color(255, 255, 255));
        JLModificar.setForeground(new java.awt.Color(255, 255, 255));
        JLModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        JLModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JLModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(JLModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 80, 70));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(238, 112, 82));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Imprimir");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        jLabel8.setBackground(new java.awt.Color(238, 112, 82));
        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 112, 82));
        jLabel8.setText("Bienvenido:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        JLUsuario.setBackground(new java.awt.Color(238, 112, 82));
        JLUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        JLUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(JLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, 30));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem2.setText("Cotizacion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator2);

        jMenuItem4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem4.setText("Relojes");
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator3);

        jMenuItem5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem5.setText("Clientes");
        jMenu1.add(jMenuItem5);
        jMenu1.add(jSeparator4);

        jMenuItem6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem6.setText("Facturas");
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");
        jMenu2.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem1.setText("Regresar al Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator1);

        jMenuItem3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem3.setText("Salir del Sistema");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void JLRELOJ_CLIENTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLRELOJ_CLIENTEMouseClicked
       VentanaRelojCliente vrc = new VentanaRelojCliente();
       vrc.setVisible(true);
       vrc.setLocationRelativeTo(null);
    }//GEN-LAST:event_JLRELOJ_CLIENTEMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
       
        
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        int dialog = JOptionPane.YES_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Desea salir del sistema? ","Exit",dialog);
        
        if(result == 0)
            {
                System.exit(0);
            }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        ventanaLogin vl  = new ventanaLogin();
        vl.setVisible(true);
        vl.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLEliminar;
    private javax.swing.JLabel JLImprimir;
    private javax.swing.JLabel JLModificar;
    private javax.swing.JLabel JLRELOJ_CLIENTE;
    private javax.swing.JLabel JLUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTable jTablaGeneral;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlHora;
    private javax.swing.JRadioButton jrAprobado;
    private javax.swing.JRadioButton jrControl;
    private javax.swing.JRadioButton jrListo;
    private javax.swing.JRadioButton jrTaller;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
       Thread ct = Thread.currentThread();
       
       while(ct == hilos)
        {
            calcula();
            jlHora.setText(hora+":"+minutos+":"+segundos+" "+amPm);
        }
    }
    
    public void calcula(){
        Calendar calendario = new GregorianCalendar();
        Date fechaHora = new Date();
        
        calendario.setTime(fechaHora);
        amPm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM": "PM";
        
        if(amPm.equals("PM"))
            {
             int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
             hora = h > 9 ? ""+h:"0"+h;
            }
        else{
            this.hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+
                calendario.get(Calendar.HOUR_OF_DAY):"0"+
                calendario.get(Calendar.HOUR_OF_DAY);
        }
        
         this.minutos = calendario.get(Calendar.MINUTE)>9?""+
                calendario.get(Calendar.MINUTE):"0"+
                calendario.get(Calendar.MINUTE);
      
        this.segundos = calendario.get(Calendar.SECOND)>9?""+
                calendario.get(Calendar.SECOND):"0"+
                calendario.get(Calendar.SECOND);
    }
    
    public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        
        return formatoFecha.format(fecha);
    }
}
