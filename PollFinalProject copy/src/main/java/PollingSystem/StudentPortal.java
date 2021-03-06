/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PollingSystem;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author KenweiVI
 */
public class StudentPortal extends javax.swing.JFrame {

    /**
     * Creates new form StudentPortal
     */
    public StudentPortal() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldStudentID = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextFieldPollName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Student Portal");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 800));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Student ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Poll Name:");

        jTextFieldStudentID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStudentIDActionPerformed(evt);
            }
        });

        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonLogin.setText("Submit");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldPollName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jButtonLogin))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jTextFieldPollName))
                        .addGap(552, 552, 552))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(197, 197, 197)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPollName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(jButtonLogin)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(537, 537, 537)
                .addComponent(jLabel1)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStudentIDActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:

        String pollName = jTextFieldPollName.getText();
        String studentID = jTextFieldStudentID.getText();
        int fail = 1;

        if (pollName.equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Invalid Entry: Poll name cannot be blank.", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (studentID.equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Invalid Entry: Student ID cannot be blank.", "Error",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {

            try {
                FileWriter input2 = new FileWriter("studentLogin.txt", false);
                BufferedWriter input3 = new BufferedWriter(input2);
                Scanner input = new Scanner(new File("pollHistory.txt"));
                Scanner input5 = new Scanner(new File("polls.txt"));
                Scanner input4 = new Scanner(new File("groups.txt"));

                while (input.hasNextLine()) {
                    String t = input.nextLine();
                    String[] DB_array = t.split(";");

                    if (pollName.equals(DB_array[0])) {
                        while (input4.hasNextLine()) {
                            String x = input4.nextLine();
                            String[] DB_array2 = x.split(";");

                            if (DB_array[2].equals(DB_array2[0])) {
                                for (int i = 1; i < DB_array2.length; i++) {
                                    if (studentID.equals(DB_array2[i])) {
                                        fail = 1;
                                        JOptionPane.showMessageDialog(null,
                                                "Input Accepted", "Access Granted",
                                                JOptionPane.INFORMATION_MESSAGE);
                                        input3.write(pollName);
                                        input3.flush();
                                        input3.close();
                                        PollResults Info = new PollResults();
                                        dispose();
                                        Info.setVisible(true);
                                        break;
                                    } else {
                                        fail = 2;
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    } else {
                        fail = 0;
                    }
                }
                
                while (input5.hasNextLine()) {
                    String h = input5.nextLine();
                    String[] DB_array3 = h.split(";");
                    
                    if (pollName.equals(DB_array3[0])) {
                        while (input4.hasNextLine()) {
                            String x2 = input4.nextLine();
                            String[] DB_array20 = x2.split(";");

                            if (DB_array3[2].equals(DB_array20[0])) {
                                for (int i = 1; i < DB_array20.length; i++) {
                                    if (studentID.equals(DB_array20[i])) {
                                        fail = 1;
                                        JOptionPane.showMessageDialog(null,
                                                "Input Accepted", "Access Granted",
                                                JOptionPane.INFORMATION_MESSAGE);
                                        input3.write(pollName);
                                        input3.flush();
                                        input3.close();
                                        PollDisplay Info = new PollDisplay();
                                        dispose();
                                        Info.setVisible(true);
                                        break;
                                    } else {
                                        fail = 2;
                                    }
                                }
                                break;
                            }
                        }
                        break;
                        
                    } else {
                        fail = 0;
                    }
                }

                if (fail == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Ivalid Input: Poll name was not found.", "Error",
                            JOptionPane.ERROR_MESSAGE);

                } else if (fail == 2) {
                    JOptionPane.showMessageDialog(null,
                            "Invalid Input: Student ID not assigned to requested Poll.", "Access Denied",
                            JOptionPane.INFORMATION_MESSAGE);

                }
                input2.close();
                input.close();

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,
                        "University DB Not Found", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,
                        "University DB Not Found", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginWindow Info = new LoginWindow();
        dispose();
        Info.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldPollName;
    private javax.swing.JTextField jTextFieldStudentID;
    // End of variables declaration//GEN-END:variables
}
