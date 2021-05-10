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
public class CurrentPolls extends javax.swing.JFrame {
    
    JPanel jPanelGroupNames;
    
    /**
     * Creates new form CurrentPolls
     */
    public CurrentPolls() {
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

            jLabelTitle.setText(userLastName + "'s Current Polls!");
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
        jButton1 = new javax.swing.JButton();
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

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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
                .addGap(304, 304, 304)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonHomePage)
                .addGap(18, 18, 18)
                .addComponent(jButtonSignOut)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSignOut)
                        .addComponent(jButtonHomePage))
                    .addComponent(jButton1))
                .addGap(0, 623, Short.MAX_VALUE))
        );

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTitle.setText("userName's Current Polls");

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
                .addContainerGap(499, Short.MAX_VALUE))
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
            Scanner input = new Scanner(new File("polls.txt"));
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
            java.util.logging.Logger.getLogger(CurrentPolls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrentPolls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrentPolls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrentPolls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrentPolls().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonHomePage;
    private javax.swing.JButton jButtonSignOut;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
