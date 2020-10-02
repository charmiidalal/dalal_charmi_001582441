/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
/* m port JPanel for dialogue box and card layout */
import Business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author charmidalal
 */
public class AccountMngWorkAreaJPanel extends javax.swing.JPanel {
    /* Initalize variable to access throgh class */
    private JPanel userProcessContainer;
    private AccountDirectory accountDirectory;

    /**
     * Creates new form AccountMngWorkAreaJPanel
     */
    AccountMngWorkAreaJPanel(JPanel userProcessContainer, AccountDirectory accountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.accountDirectory = accountDirectory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateAccount = new javax.swing.JButton();
        btnManageAccount = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 177, 210));

        btnCreateAccount.setBackground(new java.awt.Color(204, 204, 204));
        btnCreateAccount.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnManageAccount.setBackground(new java.awt.Color(204, 204, 204));
        btnManageAccount.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnManageAccount.setText("Manage Account");
        btnManageAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnManageAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(392, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btnManageAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:
        /* On create account open JPanel asking all the variables needed to craete an account */
        CreateAccountJPanel panel = new CreateAccountJPanel(userProcessContainer,accountDirectory);
        userProcessContainer.add("createAccountJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnManageAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAccountActionPerformed
        // TODO add your handling code here:
        /* On manage account open JPanel showing all the created accounts */
        ManageAccountJPanel panel = new ManageAccountJPanel(userProcessContainer,accountDirectory);
        userProcessContainer.add("manageAccountJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnManageAccount;
    // End of variables declaration//GEN-END:variables
}
