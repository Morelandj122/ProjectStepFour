/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PollingSystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author KenweiVI
 */
public class PollHistory extends javax.swing.JFrame {

    JPanel jPanelGroupNames;

    /**
     * Creates new form PollHistory
     */
    public PollHistory() {
        initComponents();

        jPanelGroupNames = new JPanel();
        setLayout(null);
        jPanelGroupNames.setBounds(200, 300, 1000, 800);
        jPanelGroupNames.setOpaque(true);
        //jPanelGroupNames.setBackground(Color.CYAN);
        add(jPanelGroupNames);

        try {
            Scanner input2 = new Scanner(new File("userLogin.txt"));
            Scanner input = new Scanner(new File("UHD_DB.txt"));
            String employeeID = input2.nextLine();
            String userLastName = "userLastName";

            while (input.hasNextLine()) {
                String t = input.nextLine();
                String[] DB_array = t.split(";");

                if (employeeID.equals(DB_array[0])) {
                    userLastName = DB_array[3];
                    break;
                }
            }

            jLabelTitle.setText(userLastName + "'s Poll History!");
            input2.close();
            input.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "University DB Not Found", "Error",
                    JOptionPane.ERROR_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jButtonHomePage = new javax.swing.JButton();
        jButtonSignOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldAddHistory = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 800));

        jButtonHomePage.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonHomePage.setText("Home Page");
        jButtonHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomePageActionPerformed(evt);
            }
        });

        jButtonSignOut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonSignOut.setText("Signout");
        jButtonSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignOutActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Add Poll to History:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldAddHistory.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldAddHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddHistoryActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldAddHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonHomePage)
                .addGap(18, 18, 18)
                .addComponent(jButtonSignOut)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSignOut)
                    .addComponent(jButtonHomePage)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jButton1)
                        .addComponent(jTextFieldAddHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(0, 623, Short.MAX_VALUE))
        );

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitle.setText("userName's Poll History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabelTitle)
                .addContainerGap(524, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomePageActionPerformed
        // TODO add your handling code here:
        HomePage Info = new HomePage();
        dispose();
        Info.setVisible(true);
    }//GEN-LAST:event_jButtonHomePageActionPerformed

    private void jButtonSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignOutActionPerformed
        // TODO add your handling code here:
        LoginWindow Info = new LoginWindow();
        dispose();
        Info.setVisible(true);
    }//GEN-LAST:event_jButtonSignOutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanelGroupNames.removeAll();

        try {
            Scanner input2 = new Scanner(new File("userLogin.txt"));
            Scanner input = new Scanner(new File("pollHistory.txt"));
            String employeeID = input2.nextLine();
            int i = 1;
            while (input.hasNextLine()) {
                String t = input.nextLine();
                String[] DB_array = t.split(";");

                if (employeeID.equals(DB_array[1])) {
                    //print "Group i" label
                    JLabel label1 = new JLabel();
                    label1.setText("Poll " + i + " Name: ");
                    label1.setFont(new java.awt.Font("Tahoma", 1, 24));
                    label1.setPreferredSize(new java.awt.Dimension(400, 40));
                    label1.setHorizontalAlignment(JLabel.RIGHT);
                    jPanelGroupNames.add(label1);
                    //print groupName label
                    JLabel groupName = new JLabel();
                    groupName.setText(DB_array[0]);
                    groupName.setFont(new java.awt.Font("Tahoma", 1, 24));
                    groupName.setPreferredSize(new java.awt.Dimension(400, 40));
                    jPanelGroupNames.add(groupName);
                    i++;
                }
            }
            jPanelGroupNames.validate();
            jPanelGroupNames.repaint();

            input2.close();
            input.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "University DB Not Found", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldAddHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAddHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAddHistoryActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String addHistoryPoll = jTextFieldAddHistory.getText();

        try {
            FileWriter input2 = new FileWriter("pollHistory.txt", true);
            BufferedWriter input3 = new BufferedWriter(input2);
            Scanner input = new Scanner(new File("userLogin.txt"));
            Scanner input4 = new Scanner(new File("polls.txt"));
            String employeeID = input.nextLine();
            int fail = 0;

            if (addHistoryPoll.equals("")) {
                fail = 1;
                JOptionPane.showMessageDialog(null,
                        "Invalid Entry: Poll name is blank.", "Error",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            while (input4.hasNextLine()) {
                String t = input4.nextLine();
                String[] DB_array = t.split(";");

                //System.out.println(DB_array[0]);
                if (addHistoryPoll.equals(DB_array[0])) {
                    if (employeeID.equals(DB_array[1])) {
                        fail = 0;

                        input3.newLine();
                        for (int i = 0; i < DB_array.length; i++) {
                            input3.write(DB_array[i] + ";");
                        }
                        //need to delete line from polls.txt here

                        break;

                    } else {
                        fail = 1;
                        JOptionPane.showMessageDialog(null,
                                "Invalid Request: Poll ownership is incorrect.", "Error",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                fail = 1;
            }
            if (fail == 1) {
                JOptionPane.showMessageDialog(null,
                        "Invalid Request: Poll was not found.", "Error",
                        JOptionPane.INFORMATION_MESSAGE);

            }

            input4.close();
            input3.flush();
            input3.close();
            input2.close();
            input.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "University DB Not Found", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(CreateGroup.class.getName()).log(Level.SEVERE, null, ex);
        }


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
            java.util.logging.Logger.getLogger(PollHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PollHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PollHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PollHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PollHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonHomePage;
    private javax.swing.JButton jButtonSignOut;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAddHistory;
    // End of variables declaration//GEN-END:variables
}
