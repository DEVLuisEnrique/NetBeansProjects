package horafecha;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class ventanaReloj extends javax.swing.JFrame implements Runnable{
    String hora,minutos,segundos ,amPm;
    Calendar calendario;
    Thread hilos;
    
    public ventanaReloj() {
        initComponents();
        hilos = new Thread(this);
        hilos.start();
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlHora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlHora.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jlHora.setText("00:00:00");
        jPanel1.add(jlHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("Hora:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
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
}
