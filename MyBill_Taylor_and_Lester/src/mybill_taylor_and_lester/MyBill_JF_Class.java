/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybill_taylor_and_lester;

import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.Classes;
import static mybill_taylor_and_lester.MyBill_Taylor_and_Lester.addToList;

/**
 *
 * @author brownt7272
 */
public class MyBill_JF_Class
        extends javax.swing.JFrame
{

    /**
     * Creates new form MyBill_JF_Class
     */
    public MyBill_JF_Class()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TB_Category = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TB_CourseNum = new javax.swing.JTextField();
        TB_SectionNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TB_ClassName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TB_DR_Begin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TB_DR_End = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TB_MeetingDays = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TB_MeetingTimes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TB_BLDG = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TB_BLDGNum = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TB_Instructor = new javax.swing.JTextField();
        CB_CreditHours = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Btn_Add = new javax.swing.JButton();
        Btn_Done = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyBill | Taylor & Lester");

        jLabel1.setText("Class Name:");

        jLabel2.setText("-");

        jLabel3.setText("-");

        jLabel4.setText("|");

        jLabel5.setText("Date Range:");

        jLabel6.setText("-");

        jLabel7.setText("Meeting Days:");

        jLabel8.setText("Meeting Times:");

        jLabel9.setText("Meeting Location:");

        jLabel10.setText("-");

        jLabel11.setText("Instructor");

        CB_CreditHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        jLabel12.setText("Credit Hours:");

        Btn_Add.setText("Add Another");
        Btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AddActionPerformed(evt);
            }
        });

        Btn_Done.setText("Done");
        Btn_Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TB_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TB_CourseNum, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TB_SectionNum, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TB_ClassName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TB_BLDG, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TB_BLDGNum, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(TB_Instructor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Btn_Add)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Btn_Done)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TB_DR_Begin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(jLabel7)
                            .addComponent(TB_MeetingDays, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(TB_MeetingTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(TB_DR_End, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(CB_CreditHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TB_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TB_CourseNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TB_SectionNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TB_ClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TB_DR_Begin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(TB_DR_End, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TB_MeetingDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CB_CreditHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TB_MeetingTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TB_BLDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(TB_BLDGNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TB_Instructor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Add)
                    .addComponent(Btn_Done))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Btn_AddActionPerformed
    {//GEN-HEADEREND:event_Btn_AddActionPerformed
        // Gathering and formating form data
        String className = TB_Category.getText() + "-" + TB_CourseNum.getText() + "-" + TB_SectionNum.getText() + " | " + TB_ClassName.getText();
        String dateRange = TB_DR_Begin.getText() + "-"+ TB_DR_End.getText();
        String meetingDays = TB_MeetingDays.getText();
        String meetingTimes = TB_MeetingTimes.getText();
        String meetingLocation = TB_BLDG.getText() + "-" + TB_BLDGNum.getText();
        String instructor = TB_Instructor.getText();
        int creditHours = Integer.parseInt(CB_CreditHours.getSelectedItem().toString());
        
        // Creates a new object and sends it to be stored
        Class entry = new Class(className, dateRange, meetingDays, meetingTimes, meetingLocation, instructor, creditHours);
        addToList(entry);
        
        // Creates Identical form and closes the old form
        new MyBill_JF_Class().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_AddActionPerformed

    private void Btn_DoneActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Btn_DoneActionPerformed
    {//GEN-HEADEREND:event_Btn_DoneActionPerformed
        // Gathering and formating form data
        String className = TB_Category.getText() + "-" + TB_CourseNum.getText() + "-" + TB_SectionNum.getText() + " | " + TB_ClassName.getText();
        String dateRange = TB_DR_Begin.getText() + "-"+ TB_DR_End.getText();
        String meetingDays = TB_MeetingDays.getText();
        String meetingTimes = TB_MeetingTimes.getText();
        String meetingLocation = TB_BLDG.getText() + "-" + TB_BLDGNum.getText();
        String instructor = TB_Instructor.getText();
        int creditHours = Integer.parseInt(CB_CreditHours.getSelectedItem().toString());
        
        // Creates a new object and sends it to be stored
        Class entry = new Class(className, dateRange, meetingDays, meetingTimes, meetingLocation, instructor, creditHours);
        addToList(entry);
        
        // Opens next form and closes current
        new MyBill_JF_Residency().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_DoneActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MyBill_JF_Class.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MyBill_JF_Class.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MyBill_JF_Class.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MyBill_JF_Class.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MyBill_JF_Class().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Add;
    private javax.swing.JButton Btn_Done;
    private javax.swing.JComboBox<String> CB_CreditHours;
    private javax.swing.JTextField TB_BLDG;
    private javax.swing.JTextField TB_BLDGNum;
    private javax.swing.JTextField TB_Category;
    private javax.swing.JTextField TB_ClassName;
    private javax.swing.JTextField TB_CourseNum;
    private javax.swing.JTextField TB_DR_Begin;
    private javax.swing.JTextField TB_DR_End;
    private javax.swing.JTextField TB_Instructor;
    private javax.swing.JTextField TB_MeetingDays;
    private javax.swing.JTextField TB_MeetingTimes;
    private javax.swing.JTextField TB_SectionNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
