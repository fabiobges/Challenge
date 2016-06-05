
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class TelaData extends javax.swing.JFrame implements ActionListener{
    
    static boolean sensor;
    static GregorianCalendar  calendar;
    static GregorianCalendar calendarChanged ;
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    static String op;
    static int minutes;

 TelaData() {
        initComponents();
        setLocationRelativeTo(null);                      //Inicialização tela centralizada
        
        //Inicializando componentes
        calendar = (GregorianCalendar) GregorianCalendar.getInstance();
        calendarChanged = (GregorianCalendar)calendar.getInstance();
        String messagem = dayPeriod();
        labelDate.setText(messagem+sdf.format(calendar.getTime()));
        buttonChange.addActionListener(this);
        buttonVerify.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldIncrement = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonChange = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelChanced = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fieldMinutes = new javax.swing.JTextField();
        buttonVerify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Date and schecule!");

        labelDate.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        labelDate.setForeground(new java.awt.Color(0, 0, 153));
        labelDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Change this date and schedule");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Increment/Decrement:");

        fieldIncrement.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        fieldIncrement.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fieldIncrement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIncrementActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Amount in minutes: ");

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("(-  or +)");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 204));

        buttonChange.setBackground(new java.awt.Color(0, 0, 255));
        buttonChange.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        buttonChange.setForeground(new java.awt.Color(255, 255, 255));
        buttonChange.setText("Change");
        buttonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangeActionPerformed(evt);
            }
        });

        jLabel2.setEnabled(false);

        labelChanced.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Date changed:");

        fieldMinutes.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        fieldMinutes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fieldMinutes.setToolTipText("");
        fieldMinutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMinutesActionPerformed(evt);
            }
        });

        buttonVerify.setBackground(new java.awt.Color(51, 51, 255));
        buttonVerify.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        buttonVerify.setForeground(new java.awt.Color(255, 255, 255));
        buttonVerify.setText("Verify");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelChanced, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(30, 30, 30)
                                        .addComponent(fieldMinutes))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(fieldIncrement))
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonVerify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldIncrement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fieldMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(labelChanced, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(buttonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldIncrementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIncrementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIncrementActionPerformed

    private void buttonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonChangeActionPerformed

    private void fieldMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMinutesActionPerformed
        try {
            // TODO add your handling code here:
            changeDate();
        } catch (Exception ex) {}
        
    }//GEN-LAST:event_fieldMinutesActionPerformed

  
    
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
            java.util.logging.Logger.getLogger(TelaData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonChange;
    private javax.swing.JButton buttonVerify;
    private javax.swing.JTextField fieldIncrement;
    private javax.swing.JTextField fieldMinutes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelChanced;
    private javax.swing.JLabel labelDate;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == buttonChange){
            op = fieldIncrement.getText();
            minutes = Integer.parseInt(fieldMinutes.getText());
            try {
                calculesDate(op,minutes);
            } catch (Exception ex) {
                Logger.getLogger(TelaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(e.getSource() == buttonVerify){
            try {
                changeDate();
            } catch (Exception ex) {}
        }
        
    }
    
    private void calculesDate(String op, int minutes) throws Exception{
        //Chama método que verifica erro dos campos e passa dados
        verifyError();
        //Faz soma e subtração de minutos
        if(op.equals("-")){
                calendar.set(calendar.MINUTE,calendar.get(GregorianCalendar.MINUTE)-minutes);   
        }else if(op.equals("+")){
                calendar.set(GregorianCalendar.MINUTE,calendar.get(GregorianCalendar.MINUTE)+minutes);      
        }else{
            JOptionPane.showMessageDialog(rootPane, "The increment/decrement must have only - or + !");
            throw new Exception("The increment/decrement must have only - or + !");
        }
        
        //Chamando método para verificar período do dia
        String message;
        message = dayPeriod();
        //Inserindo data com período e apagando campos
        labelChanced.setText(null);
        labelDate.setText(message+sdf.format(calendar.getTime()));
        fieldMinutes.setText(null);
    
    }
    
    public String dayPeriod(){
        //Defnindo período referente ao horário
        if(calendar.get(GregorianCalendar.HOUR_OF_DAY)> 06 && calendar.get(GregorianCalendar.HOUR_OF_DAY) < 12){
            return "Good Morning! Today is ";
        }else if(calendar.get(GregorianCalendar.HOUR_OF_DAY)> 12 && calendar.get(GregorianCalendar.HOUR_OF_DAY) < 18){
            return "Good Afternoon! Today is ";
        }else if(calendar.get(GregorianCalendar.HOUR_OF_DAY)>18 && calendar.get(GregorianCalendar.HOUR_OF_DAY) <= 23 ){
            return "Good Night! Today is ";
        }else{
            return "Good Dawn! Today is ";
        }
        
    }
    
    public void changeDate() throws Exception{
        
        verifyError();
        //Passando para CalendarChanged os valores de calendar
        exchange();
        //Subtraindo minutos
        if(op.equals("-")){
            calendarChanged.set(calendarChanged.MINUTE,calendarChanged.get(calendarChanged.MINUTE)-minutes);
        }else if(op.equals("+")){
            calendarChanged.set(calendarChanged.MINUTE,calendarChanged.get(calendarChanged.MINUTE)+minutes);
        }
        //Inserindo valor de calendarChanged na label conforme Verify é clicado
        labelChanced.setText(sdf.format(calendarChanged.getTime()));
    }
    
    public void exchange(){
        //Passando valores de calendar para calendarChanged
        calendarChanged.set(GregorianCalendar.MINUTE,calendar.get(GregorianCalendar.MINUTE));
        calendarChanged.set(GregorianCalendar.HOUR_OF_DAY,calendar.get(GregorianCalendar.HOUR_OF_DAY));
        calendarChanged.set(GregorianCalendar.DAY_OF_MONTH,calendar.get(GregorianCalendar.DAY_OF_MONTH));
        calendarChanged.set(GregorianCalendar.MONTH,calendar.get(GregorianCalendar.MONTH));
        calendarChanged.set(GregorianCalendar.YEAR,calendar.get(GregorianCalendar.YEAR));
    }
    
    public void verifyError() throws Exception{
        try{
            minutes = Integer.parseInt(fieldMinutes.getText()); 
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "The minutes filed must have only numbers!");
        }
        op = fieldIncrement.getText();
        System.out.println(op);
        if(!op.equals("-")&&!op.equals("+")){
            JOptionPane.showMessageDialog(rootPane, "The increment/decrement must have only - or + !");
            throw new Exception("The increment/decrement must have only - or + !");
        }else{
            
        }
    }
            
}
