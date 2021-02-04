package horafecha;
    import java.util.Date;
    import java.text.SimpleDateFormat;
    import java.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class vHoraFeccja extends javax.swing.JFrame implements Runnable {
    String hora,minutos,segundos,amPm;
    Thread hilos;
    public vHoraFeccja() {
        initComponents();
        jlFecha.setText(fecha());
        
        hilos = new Thread(this);
        hilos.start();
        
    }
    
    public void hora(){
        Calendar calendario = new GregorianCalendar();
        Date horaActual = new Date();
        calendario.setTime(horaActual);
        
        this.hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+
                calendario.get(Calendar.HOUR_OF_DAY):"0"+
                calendario.get(Calendar.HOUR_OF_DAY);
        
      this.minutos = calendario.get(Calendar.MINUTE)>9?""+
                calendario.get(Calendar.MINUTE):"0"+
                calendario.get(Calendar.MINUTE);
      
      this.segundos = calendario.get(Calendar.SECOND)>9?""+
                calendario.get(Calendar.SECOND):"0"+
                calendario.get(Calendar.SECOND);
        
    }
    
    public void calcula(){
        Calendar calendario = new GregorianCalendar();
        Date horaActual = new Date();
        calendario.setTime(horaActual);
        
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
    
    @Override
    public void run(){
        
        Thread current = Thread.currentThread();
        
        while(current == hilos)
            {
                calcula();
                jlHora.setText(hora+":"+minutos+":"+segundos+" "+amPm);
            }
        
    }
    
    public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        
        return formatoFecha.format(fecha);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlHora = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Hora: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 49, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Fecha:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 101, -1, -1));

        jlHora.setBackground(new java.awt.Color(255, 255, 255));
        jlHora.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlHora.setText("00:00:00");
        jPanel1.add(jlHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 49, -1, -1));

        jlFecha.setBackground(new java.awt.Color(255, 255, 255));
        jlFecha.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jlFecha.setText("DD/MM/YY");
        jPanel1.add(jlFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vHoraFeccja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vHoraFeccja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vHoraFeccja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vHoraFeccja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vHoraFeccja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlHora;
    // End of variables declaration//GEN-END:variables
}
