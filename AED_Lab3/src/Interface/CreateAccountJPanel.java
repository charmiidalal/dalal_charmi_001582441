/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
/* Import nedded libraries */
import Business.Account;
import Business.AccountDirectory;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author charmidalal
 */
public class CreateAccountJPanel extends javax.swing.JPanel {
    /* Initialize variables of card layout */
    private JPanel userProcessContainer;
    private AccountDirectory accountDirectory;
    /**
     * Creates new form createAccountJPanel
     */
    CreateAccountJPanel(JPanel userProcessContainer, AccountDirectory accountDirectory) {
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

        lblCreateAccount = new javax.swing.JLabel();
        txtRoutingNumber = new javax.swing.JTextField();
        btnCreateAccount = new javax.swing.JButton();
        lblRoutingNumber = new javax.swing.JLabel();
        lblAccountNumber = new javax.swing.JLabel();
        lblBankName = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();
        txtBankName = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 177, 210));

        lblCreateAccount.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCreateAccount.setText("Create Account");

        btnCreateAccount.setBackground(new java.awt.Color(204, 204, 204));
        btnCreateAccount.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnCreateAccount.setText("Create Account");
        btnCreateAccount.setBorderPainted(false);
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        lblRoutingNumber.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblRoutingNumber.setText("Routing Number:");

        lblAccountNumber.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblAccountNumber.setText("Account Number:");

        lblBankName.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblBankName.setText("Bank Name:");

        lblBalance.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblBalance.setText("Balance:");

        txtBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalanceActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("< Back");
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBalance)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBankName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRoutingNumber)
                                    .addComponent(lblAccountNumber)
                                    .addComponent(btnBack))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(254, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(lblCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lblRoutingNumber)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAccountNumber)
                            .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankName)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBalance)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBalanceActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here
        /* Check if all the fields are not empty */
        Pattern pattern1 = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher matchAccNum = pattern1.matcher(txtAccountNumber.getText());
        boolean checkAccNum = matchAccNum.find();
        Matcher matchRoutNum = pattern1.matcher(txtRoutingNumber.getText());
        boolean checkRoutingNum = matchRoutNum.find();
        Matcher matchBankName = pattern1.matcher(txtBankName.getText());
        boolean checkBankName = matchBankName.find();
        if(txtAccountNumber.getText().equals("") || txtRoutingNumber.getText().equals("")
           || txtBankName.getText().equals("") || txtBalance.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill out all fields.");
        }else if(checkAccNum ||  checkRoutingNum || checkBankName || txtAccountNumber.getText().matches("^[a-zA-Z]*$") 
           || txtRoutingNumber.getText().matches("^[a-zA-Z]*$")){
            JOptionPane.showMessageDialog(null, "Please enter only alphanumeric "
            + "value in Routing Number, Account Number and Bank Name!");
        }else if(txtBankName.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Please enter only alphabet "
            + "value Bank Name!");
        }
        else if(!txtBalance.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "Please enter valid balance!");
        }
        else
        {
            /* Add all the fields in account object and then in array */
            String routingNumber = txtRoutingNumber.getText();
            String accountNumber = txtAccountNumber.getText();
            String bankName = txtBankName.getText();
            int balance = Integer.parseInt(txtBalance.getText());

            Account account = accountDirectory.addAccount();
            account.setRoutingNumber(routingNumber);
            account.setAccountNumber(accountNumber);
            account.setBankName(bankName);
            account.setBalance(balance);

            JOptionPane.showMessageDialog(null, "Account Created Successfully!");
        }
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        /* traverse thogh previous window on click of back button */
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblCreateAccount;
    private javax.swing.JLabel lblRoutingNumber;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtRoutingNumber;
    // End of variables declaration//GEN-END:variables
}
