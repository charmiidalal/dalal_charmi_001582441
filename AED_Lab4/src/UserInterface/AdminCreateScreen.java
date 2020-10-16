/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Abstract.User;
import Business.CustomerDirectory;
import Business.SupplierDirectory;
import Business.Users.Admin;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author AEDSpring2019
 */
public class AdminCreateScreen extends javax.swing.JPanel {

    /**
     * Creates new form AdminScreen
     */
    private JPanel panelRight;
    private Admin admin;
    private String username;
    private String password;
    private String reEnterPassword;
    private boolean roleSelected;
    private String requiredMsg;
    private boolean fieldsEmpty;
    private boolean validationError;
    
    public AdminCreateScreen(JPanel panelRight, Admin admin) {
        initComponents();
        this.panelRight = panelRight;
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnCreate = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPword = new javax.swing.JTextField();
        txtRePword = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblReEnterPassword = new javax.swing.JLabel();
        radioCustomer = new javax.swing.JRadioButton();
        radioSupplier = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblUser.setText("Username:");

        lblPassword.setText("Password:");

        lblReEnterPassword.setText("Re-enter Password :");

        buttonGroup1.add(radioCustomer);
        radioCustomer.setText("Customer");
        radioCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCustomerActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioSupplier);
        radioSupplier.setText("Supplier");

        btnBack.setText("< BACK");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReEnterPassword)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUser, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioCustomer)
                            .addComponent(radioSupplier)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReEnterPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSupplier)
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        javax.swing.border.Border redBorder = BorderFactory.createLineBorder(Color.RED, 1);
        javax.swing.border.Border noneBorder = BorderFactory.createEmptyBorder();
        
        this.fieldsEmpty = false;
        this.validationError = false;
        this.roleSelected = false;
        this.requiredMsg = "Please enter required field:\n";
        this.username = txtUser.getText();
        this.password = txtPword.getText();
        this.reEnterPassword = txtRePword.getText();
        if(radioCustomer.isSelected() ||radioSupplier.isSelected()){
            this.roleSelected = true;
        }
        if(this.username.isEmpty()){
           this.requiredMsg = this.requiredMsg+ "Username\n";
           this.fieldsEmpty = true;
        } 
        if(this.password.isEmpty()){
            this.requiredMsg = this.requiredMsg+ "Password\n";
            this.fieldsEmpty = true;
        }
        if(this.reEnterPassword.isEmpty()){
            this.requiredMsg = this.requiredMsg+ "Re-Enter Password\n";
            this.fieldsEmpty = true;
        }
        if(!this.roleSelected){
            this.requiredMsg = this.requiredMsg+ "Role";
            this.fieldsEmpty = true;
        }
        if(this.fieldsEmpty){
            JOptionPane.showMessageDialog(null,  this.requiredMsg);
        }
        if(!this.fieldsEmpty){
            Pattern usernameP = Pattern.compile("\\b[A-Za-z0-9._%-]+_+[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
            Matcher userMatch = usernameP.matcher(this.username);
            if (userMatch.find() == false){
                this.requiredMsg = "Please enter username in following format! \n 'xxx_xxx@xxx.xxx' \n";
                // set the border of this component
                txtUser.setBorder(redBorder);
                this.validationError = true;
            }else{
                 txtUser.setBorder(noneBorder);
            }
            Pattern passwordP = Pattern.compile("^(?=.*[0-9])"
                           + "(?=.*[a-z])(?=.*[A-Z])"
                           + "(?=.*[@#$%^&+=])"
                           + "(?=\\S+$).{6,20}$");
            Matcher passMatch = passwordP.matcher(this.password); 
            passMatch.matches();
            if (passMatch.matches() == false){
                this.requiredMsg += "Password should be at least 6 digits and contain at"
                + " least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.\n";
                this.validationError = true;
                // set the border of this component
                txtPword.setBorder(redBorder);
            } else{
                txtPword.setBorder(noneBorder);
            } 
            if(passMatch.matches() && !this.password.equals(reEnterPassword)){
                this.requiredMsg += "Passwords & Re-type passwords should match! ";
                this.validationError = true;
                txtRePword.setBorder(redBorder);
            }else{
               txtRePword.setBorder(noneBorder);
            }
            if(this.validationError){
                JOptionPane.showMessageDialog(null, this.requiredMsg);
            }
            else {
               if(radioCustomer.isSelected()){
                    Customer customer = new Customer(password,username);
                    admin.custDir.customerList.add(customer);
                    JOptionPane.showMessageDialog(null, "Customer created successfully!");
               }
               if(radioSupplier.isSelected()){
                    Supplier supplier = new Supplier(password,username);
                    admin.suppDir.supplierList.add(supplier);
                    JOptionPane.showMessageDialog(null, "Supplier created successfully!");
               }
            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void radioCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.remove(this);
        layout.previous(panelRight);
    }//GEN-LAST:event_btnBackActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblReEnterPassword;
    private javax.swing.JLabel lblUser;
    private javax.swing.JRadioButton radioCustomer;
    private javax.swing.JRadioButton radioSupplier;
    private javax.swing.JTextField txtPword;
    private javax.swing.JTextField txtRePword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
