/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;
import icons.FontAwesome;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jiconfont.swing.IconFontSwing;
import net.proteanit.sql.DbUtils;
import java.awt.Color;

/**
 *
 * @author alex
 */
public class Doctor_Patients extends javax.swing.JFrame {

    /**
     * Creates new form Doctor_PatientHistory
     */
    public Doctor_Patients() {
        IconFontSwing.register(FontAwesome.getIconFont());   
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

        jPanel1 = new javax.swing.JPanel();
        back_Button1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        patient_name = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        history_table = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        exams_table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        diagnosis_text = new javax.swing.JTextArea();
        save_Diagnosis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(150, 235, 240));

        back_Button1.setIcon(IconFontSwing.buildIcon(FontAwesome.ARROW_CIRCLE_LEFT, 50, Color.black));
        back_Button1.setBorderPainted(false);
        back_Button1.setContentAreaFilled(false);
        back_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_Button1ActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(150, 235, 240));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField1.setText("Ασθενείς");
        jTextField1.setBorder(null);
        jTextField1.setFocusable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/A4AD5659B5D44610AB530DF0BAB8279D.jpeg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Όνομα Ασθενή");

        search_button.setBackground(new java.awt.Color(0, 0, 0));
        search_button.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        search_button.setForeground(new java.awt.Color(255, 255, 255));
        search_button.setText("Αναζήτηση");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor.jpg"))); // NOI18N

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        history_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ονοματεπώνυμο", "Διάγνωση", "Ημερομηνία"
            }
        ));
        history_table.setEnabled(false);
        jScrollPane2.setViewportView(history_table);

        jTabbedPane1.addTab("Ιστορικό", jScrollPane2);

        exams_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ονοματεπώνυμο", "Τύπος_εξέτασης", "Ημερομηνία", "Αρχείο_εξέτασης"
            }
        ));
        exams_table.setEnabled(false);
        jScrollPane1.setViewportView(exams_table);

        jTabbedPane1.addTab("Εξετάσεις", jScrollPane1);

        diagnosis_text.setColumns(20);
        diagnosis_text.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        diagnosis_text.setRows(5);
        diagnosis_text.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        jScrollPane3.setViewportView(diagnosis_text);

        jTabbedPane1.addTab("Διάγνωση", jScrollPane3);

        save_Diagnosis.setBackground(new java.awt.Color(0, 0, 0));
        save_Diagnosis.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        save_Diagnosis.setForeground(new java.awt.Color(255, 255, 255));
        save_Diagnosis.setText("Αποθήκευση Διάγνωσης");
        save_Diagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_DiagnosisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(save_Diagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(back_Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(save_Diagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1215, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getDiagnosis() {

        try {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            LogIn_Staff login_staff = new LogIn_Staff();
            String user_id = login_staff.staff_userId();
            String fullname = patient_name.getText();
            String query1 = "SELECT CONCAT(first_name,' ',last_name) AS Ονοματεπώνυμο, textbox AS Διάγνωση, DATE(diagnosis_date) AS Ημερομηνία FROM diagnosis INNER JOIN user on patient_id = user_id WHERE last_name ='" + fullname + "' AND doctor_id='" + user_id + "' ";
            PreparedStatement pst = con.prepareStatement(query1);
            ResultSet rs = pst.executeQuery();

            if (!rs.isBeforeFirst()) {
                history_table.setModel(new DefaultTableModel(null, new String[]{"Ονοματεπώνυμο", "Διάγνωση", "Ημερομηνία"}));
                JOptionPane.showMessageDialog(this, "Δεν υπάρχει ιστορικό για αυτό τον ασθενή.");
            } else {
                history_table.setModel(DbUtils.resultSetToTableModel(rs));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getTestResults() {

        try {
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            String fullname = patient_name.getText();
            String query2 = "SELECT CONCAT(first_name,' ', last_name) AS Ονοματεπώνυμο, test_title AS Τύπος_εξέτασης, test_date AS Ημερομηνία, TO_BASE64(test_file) AS Αρχείο_εξέτασης FROM test_results INNER JOIN user on patient_id=user_id WHERE last_name ='" + fullname + "' ";
            PreparedStatement pst2 = con.prepareStatement(query2);
            ResultSet rs2 = pst2.executeQuery();

            if (!rs2.isBeforeFirst()) {
                exams_table.setModel(new DefaultTableModel(null, new String[]{"Ονοματεπώνυμο", "Τύπος_εξέτασης", "Ημερομηνία", "Αρχείο_εξέτασης"}));
                JOptionPane.showMessageDialog(this, "Δεν υπάρχουν εξετάσεις για αυτό τον ασθενή.");
            } else {
                exams_table.setModel(DbUtils.resultSetToTableModel(rs2));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void newDiagnosis() {
        try {
            if (diagnosis_text.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Παρακαλώ συμπληρώστε το πεδίο της διάγνωσης!");
            } else {
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
                LogIn_Staff login_staff = new LogIn_Staff();
                String user_id = login_staff.staff_userId();
                String fullname = patient_name.getText();
                String diagnosis = diagnosis_text.getText().trim();
                String query = "INSERT INTO diagnosis VALUES(NULL, (SELECT doctor_id FROM doctor WHERE doctor_id='" + user_id + "'), (SELECT user_id FROM user WHERE last_name ='" + fullname + "'), '" + diagnosis + "', DEFAULT)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Η διάγνωση αποθηκεύτηκε με επιτυχία!");
                diagnosis_text.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
   
    
    private void back_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_Button1ActionPerformed
        dispose();
        new Doctor().setVisible(true);
    }//GEN-LAST:event_back_Button1ActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed

        if (patient_name.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, ("Συμπληρώστε το όνομα του ασθενή!"));

        } else {
            getDiagnosis();
            getTestResults();
        }
    }//GEN-LAST:event_search_buttonActionPerformed

    private void save_DiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_DiagnosisActionPerformed
        
        if(patient_name.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,("Συμπληρώστε το όνομα του ασθενή!"));
            
        }
        else {
            newDiagnosis();
        }
        
    }//GEN-LAST:event_save_DiagnosisActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor_Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor_Patients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_Button1;
    private javax.swing.JTextArea diagnosis_text;
    private javax.swing.JTable exams_table;
    private javax.swing.JTable history_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField patient_name;
    private javax.swing.JButton save_Diagnosis;
    private javax.swing.JButton search_button;
    // End of variables declaration//GEN-END:variables
}
