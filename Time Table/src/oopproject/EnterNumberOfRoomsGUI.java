/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class EnterNumberOfRoomsGUI extends javax.swing.JFrame {
    private static int nor;
    /**
     * Creates new form GUI
     */
    public EnterNumberOfRoomsGUI() {
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

        enternumberofrooms_label = new javax.swing.JLabel();
        enternumberofrooms_tf = new javax.swing.JTextField();
        enternumberofrooms_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enternumberofrooms_label.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        enternumberofrooms_label.setText("Enter Number Of Rooms:");

        enternumberofrooms_tf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        enternumberofrooms_btn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        enternumberofrooms_btn.setText("Enter");
        enternumberofrooms_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enternumberofrooms_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enternumberofrooms_label)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enternumberofrooms_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enternumberofrooms_btn)
                        .addGap(236, 236, 236))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(enternumberofrooms_label)
                .addGap(29, 29, 29)
                .addComponent(enternumberofrooms_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(enternumberofrooms_btn)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static int getNor() {
        return nor;
    }
    

    private void enternumberofrooms_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enternumberofrooms_btnActionPerformed
        // TODO add your handling code here:
        boolean ex;
        try{
            ex=false;
            nor = Integer.valueOf(enternumberofrooms_tf.getText());
        
        }
        catch(NumberFormatException nfe){
            ex=true;
            JOptionPane.showMessageDialog(rootPane, "Please Enter an Integer");

        }
        if(!ex){
            this.setVisible(false);
            AllRoomsGUI enterroomnameFrame = new AllRoomsGUI();
            enterroomnameFrame.setVisible(true);
        }
    }//GEN-LAST:event_enternumberofrooms_btnActionPerformed

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
            java.util.logging.Logger.getLogger(EnterNumberOfRoomsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterNumberOfRoomsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterNumberOfRoomsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterNumberOfRoomsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterNumberOfRoomsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enternumberofrooms_btn;
    private javax.swing.JLabel enternumberofrooms_label;
    private javax.swing.JTextField enternumberofrooms_tf;
    // End of variables declaration//GEN-END:variables
}