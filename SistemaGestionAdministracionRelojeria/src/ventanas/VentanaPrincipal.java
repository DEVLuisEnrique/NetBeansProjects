package ventanas;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.table.DefaultTableModel;


public class VentanaPrincipal extends javax.swing.JFrame implements Runnable{
   private String hora,minutos,segundos,amPm;
   private Thread hilos;
   DefaultTableModel modelo  = new DefaultTableModel();
    
    public VentanaPrincipal() {
        initComponents();
        jLFecha.setText(fecha());
        
        this.setLocationRelativeTo(null);
        hilos = new Thread(this);
        hilos.start();
        
        datosTabla();
        
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaGeneral = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLFecha.setBackground(new java.awt.Color(238, 112, 82));
        jLFecha.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLFecha.setForeground(new java.awt.Color(238, 112, 82));
        jLFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLFecha.setText("dd/mm/yy");
        jPanel1.add(jLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("Fecha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SISTEMA DE GESTION Y ADMINISTACION DE RELOJ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 112, 82)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        jlHora.setBackground(new java.awt.Color(238, 112, 82));
        jlHora.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jlHora.setForeground(new java.awt.Color(238, 112, 82));
        jlHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlHora.setText("00:00:00 AM");
        jPanel1.add(jlHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel4.setBackground(new java.awt.Color(238, 112, 82));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 112, 82));
        jLabel4.setText("Hora:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file-plus.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 80, 70));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings-_1_.png"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 80, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file-minus_2.png"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 80, 70));

        jTablaGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablaGeneral.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTablaGeneral);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 1210, 450));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 70, 70));

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
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(238, 112, 82));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cotizacion");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/printer.png"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 80, 70));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(238, 112, 82));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Imprimir");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

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

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaGeneral;
    private javax.swing.JLabel jlHora;
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
