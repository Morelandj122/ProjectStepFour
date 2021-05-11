/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PollingSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author KenweiVI
 */
public class PollResults extends javax.swing.JFrame {

    JPanel jPanelPollInfo;

    /**
     * Creates new form PollResults
     */
    public PollResults() {
        initComponents();
        jPanelPollInfo = new JPanel();

        setLayout(null);
        jPanelPollInfo.setBounds(200, 200, 1000, 800);
        jPanelPollInfo.setOpaque(true);

        add(jPanelPollInfo);

        try {
            Scanner input = new Scanner(new File("studentLogin.txt"));
            String pollName = "pollName";

            if (input.hasNextLine()) {
                pollName = input.nextLine();
            }

            jLabelTitle.setText("Welcome to Poll " + pollName + "!");
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
        jButtonSignOut = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 800));

        jButtonSignOut.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonSignOut.setText("Signout");
        jButtonSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignOutActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSignOut)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButtonSignOut))
                .addContainerGap(617, Short.MAX_VALUE))
        );

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitle.setText("Welcome to pollID's Results");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
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

    private void jButtonSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignOutActionPerformed
        // TODO add your handling code here:
        LoginWindow Info = new LoginWindow();
        dispose();
        Info.setVisible(true);
    }//GEN-LAST:event_jButtonSignOutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanelPollInfo.removeAll();

        try {
            Scanner input2 = new Scanner(new File("studentLogin.txt"));
            Scanner input = new Scanner(new File("pollHistory.txt"));
            String pollName = input2.nextLine();

            while (input.hasNextLine()) {
                String t = input.nextLine();
                String[] DB_array = t.split(";");
                int j = 1;
                String result;

                if (pollName.equals(DB_array[0])) {

                    for (int i = 3; i < DB_array.length; i += 2) {
                        //print "Group i" label
                        JLabel label1 = new JLabel();
                        label1.setText("Question " + j + ": ");
                        label1.setFont(new java.awt.Font("Tahoma", 1, 24));
                        label1.setPreferredSize(new java.awt.Dimension(200, 40));
                        label1.setHorizontalAlignment(JLabel.RIGHT);
                        jPanelPollInfo.add(label1);
                        //print groupName label
                        JLabel question = new JLabel();
                        question.setText(DB_array[i]);
                        question.setFont(new java.awt.Font("Tahoma", 1, 24));
                        question.setPreferredSize(new java.awt.Dimension(200, 40));
                        jPanelPollInfo.add(question);

                        if (DB_array.length <= i+1) {
                            JLabel label2 = new JLabel();
                            label2.setText("Q" + j + " Result: ");
                            label2.setFont(new java.awt.Font("Tahoma", 1, 24));
                            label2.setPreferredSize(new java.awt.Dimension(200, 40));
                            label2.setHorizontalAlignment(JLabel.RIGHT);
                            jPanelPollInfo.add(label2);

                            JLabel groupName = new JLabel();
                            groupName.setText("false");
                            groupName.setFont(new java.awt.Font("Tahoma", 1, 24));
                            groupName.setPreferredSize(new java.awt.Dimension(200, 40));
                            jPanelPollInfo.add(groupName);
                            break;
                        } else if (DB_array[i + 1].equals("1")) {
                            result = "true";
                        } else {
                            result = "false";
                        }

                        JLabel label2 = new JLabel();
                        label2.setText("Q" + j + " Result: ");
                        label2.setFont(new java.awt.Font("Tahoma", 1, 24));
                        label2.setPreferredSize(new java.awt.Dimension(200, 40));
                        label2.setHorizontalAlignment(JLabel.RIGHT);
                        jPanelPollInfo.add(label2);

                        JLabel qAnswer = new JLabel();
                        qAnswer.setText(result);
                        qAnswer.setFont(new java.awt.Font("Tahoma", 1, 24));
                        qAnswer.setPreferredSize(new java.awt.Dimension(200, 40));
                        jPanelPollInfo.add(qAnswer);
                        j++;
                    }
                }
            }
            jPanelPollInfo.validate();
            jPanelPollInfo.repaint();

            input2.close();
            input.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "University DB Not Found", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

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
            java.util.logging.Logger.getLogger(PollResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PollResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PollResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PollResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PollResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSignOut;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
