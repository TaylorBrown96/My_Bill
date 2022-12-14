package mybill_taylor_and_lester;

import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;

import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.Activity_Fee;
import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.CAPS;
import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.Classes;
import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.School_Name;
import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.Student_FinAid;
import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.Student_ID;
import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.Student_Name;
import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.Student_Refund;
import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.Student_Subtotal;
import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.Student_Total;
import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.Technology_Fee;
import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.Term;

/**
 *
 * @author Taylor
 */
public class MyBill_JF_Schedule extends javax.swing.JFrame {

    
    // Displays the doubles to the houndreth decimal place for USD
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    /**
     * Creates new form MyBill_JF_Schedule
     */
    public MyBill_JF_Schedule() {
        initComponents();
        
        GenerateTable();
        
        String header = "Student Name: " + Student_Name
                      + "\nStudent ID: " + Student_ID
                      + "\nSchool Name: " + School_Name
                      + "\nSemester Term: " + Term;
        
        
        // Prints the students recipt
        String recipt = "\nYour Subtotal:         | $" + df.format(Student_Subtotal) 
                        + "\nActivity Fee:              | $" + df.format(Activity_Fee) 
                        + "\nTechnology Fee:     | $" + df.format(Technology_Fee)
                        + "\nCAPS Fee:               | $" + df.format(CAPS)
                        + "\n------------------------------------------"
                        + "\nTotal:                         | $" + df.format(Student_Total)
                        + "\nFinancial Aid:           | $" + df.format(Student_FinAid)
                        + "\n------------------------------------------"
                        + "\nNew Total:                | $" + df.format(Student_Refund);
        
        TP_Header.setText(header);
        TP_Recipt.setText(recipt);
    }
    
    // Populate table data from class objects
    public void GenerateTable()
    {
        // Get the genaric table model
        DefaultTableModel model = (DefaultTableModel)ScheduleTable.getModel();
        
        // Iterate through eaach object in the list
        for(Class section : Classes)
        {
            // Create a temp object
            Object[] o = new Object[7];
            
            // Each object property is assigned to an objects index
            o[0] = section.className;
            o[1] = section.dateRange;
            o[2] = section.meetingDays;
            o[3] = section.meetingTimes;
            o[4] = section.meetingLocation;
            o[5] = section.instructor;
            o[6] = section.creditHours;

            // Add new record to the table
            model.addRow(o);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ScheduleTable = new javax.swing.JTable();
        L_Recipt = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TP_Recipt = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TP_Header = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyBill | Taylor & Lester");

        ScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Title", "Course Dates", "Meeting Days", "Course Times", "Location", "Instructor", "Credits"
            }
        ));
        jScrollPane1.setViewportView(ScheduleTable);
        if (ScheduleTable.getColumnModel().getColumnCount() > 0) {
            ScheduleTable.getColumnModel().getColumn(0).setMinWidth(230);
            ScheduleTable.getColumnModel().getColumn(4).setMaxWidth(60);
            ScheduleTable.getColumnModel().getColumn(6).setMaxWidth(60);
        }

        jScrollPane2.setViewportView(TP_Recipt);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(TP_Header);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(L_Recipt)
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(352, 352, 352))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(L_Recipt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new MyBill_JF_FileSave().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyBill_JF_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyBill_JF_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyBill_JF_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyBill_JF_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyBill_JF_Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_Recipt;
    private javax.swing.JTable ScheduleTable;
    private javax.swing.JTextPane TP_Header;
    private javax.swing.JTextPane TP_Recipt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
