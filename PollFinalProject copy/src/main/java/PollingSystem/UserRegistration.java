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
public class UserRegistration extends javax.swing.JFrame {

    /**
     * Creates new form UserRegistration
     */
    public UserRegistration() {
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
        jLabel2 = new javax.swing.JLabel();
        jTextUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();
        jButtonQuit = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jPasswordConfirm = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jTextEmployeeID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 800));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Username:");

        jTextUserName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUserNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("First Name:");

        jTextFirstName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFirstNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Last Name:");

        jTextLastName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLastNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Confirm Password:");

        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jButtonQuit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonQuit.setText("Quit");
        jButtonQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitActionPerformed(evt);
            }
        });

        jPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jPasswordConfirm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Employee ID:");

        jTextEmployeeID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmployeeIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSubmit)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonQuit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextUserName)
                            .addComponent(jTextLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jTextFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jPassword)
                            .addComponent(jPasswordConfirm)
                            .addComponent(jTextEmployeeID, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jTextEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTextLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSubmit)
                    .addComponent(jButtonQuit))
                .addContainerGap(275, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("User Registration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(491, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(471, 471, 471))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUserNameActionPerformed

    private void jTextFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFirstNameActionPerformed

    private void jTextLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLastNameActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:

        String employeeID = jTextEmployeeID.getText();
        String userNameInput = jTextUserName.getText();
        String lastNameInput = jTextLastName.getText();
        String passwordInput = jPassword.getText();
        String passwordInputConfirm = jPasswordConfirm.getText();

        int fail = 1;
        try {
            FileWriter input2 = new FileWriter("UHD_DB.txt", true);
            BufferedWriter input3 = new BufferedWriter(input2);
            Scanner input = new Scanner(new File("UHD_DB.txt"));
            while (input.hasNextLine() && passwordInput.equals(passwordInputConfirm) && passwordInput.length() >= 8) {
                String t = input.nextLine();
                String[] DB_array = t.split(";");

                System.out.println(DB_array[0]);

                if (employeeID.equals(DB_array[0])) {
                    fail = 0;

                    JOptionPane.showMessageDialog(null,
                            "Employee ID Already Exists.", "Error",
                            JOptionPane.ERROR_MESSAGE);

                    break;
                } else {
                    fail = 1;
                }
            }

            if (fail == 1) {
                JOptionPane.showMessageDialog(null,
                        "Credentials Accepted", "Account Created",
                        JOptionPane.INFORMATION_MESSAGE);
                input3.newLine();
                input3.write(employeeID + ";" + userNameInput + ";" + passwordInput + ";" + lastNameInput + ";");

                LoginWindow Info = new LoginWindow();
                dispose();
                Info.setVisible(true);
            }

            input3.flush();
            input3.close();
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

        if (passwordInput.equals(passwordInputConfirm) && passwordInput.length() >= 8) {
            //password checks
        } else if (passwordInput.length() < 8) {
            //error message
            JOptionPane.showMessageDialog(null, "Invalid Login Details: Passwords need to be eight characters or more.", "Login Error", JOptionPane.ERROR_MESSAGE);
            jPassword.setText(null);
            jPasswordConfirm.setText(null);
        } else if (!passwordInput.equals(passwordInputConfirm)) {
            JOptionPane.showMessageDialog(null, "Invalid Login Details: Passwords do not match.", "Login Error", JOptionPane.ERROR_MESSAGE);
            jPassword.setText(null);
            jPasswordConfirm.setText(null);
        }


    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonQuitActionPerformed

    private void jTextEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmployeeIDActionPerformed

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
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonQuit;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPasswordConfirm;
    private javax.swing.JTextField jTextEmployeeID;
    private javax.swing.JTextField jTextFirstName;
    private javax.swing.JTextField jTextLastName;
    private javax.swing.JTextField jTextUserName;
    // End of variables declaration//GEN-END:variables
}
