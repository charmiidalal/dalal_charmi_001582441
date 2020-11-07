/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Charmi Dalal
 */
public class ResturantInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResturantInfoJPanel
     */
    private final JPanel container;
    private Restaurant restaurant;
    private final EcoSystem system;

    public ResturantInfoJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, RestaurantDirectory restaurantDirectory, MenuDirectory menuDirectory) {
        initComponents();
        this.container = userProcessContainer;
        this.restaurant = restaurant;
        this.system = system;

        disableAllFields();

        for (Restaurant rest : restaurantDirectory.getRestaurantDirectory()) {
            if (rest.getRestaurantNo().equalsIgnoreCase(account.getEmployee().getName())) {
                this.restaurant = rest;
            }
        }

        txtResNo.setText(restaurant.getRestaurantNo());
        txtResName.setText(restaurant.getRestaurantName());
        txtManagerName.setText(restaurant.getOperatorName());
        txtStreetAdd.setText(restaurant.getStreetAddress());
        txtPhoneNo.setText(restaurant.getMobileNo());
        txtEmail.setText(restaurant.getEmail());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblResInfo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtResNo = new javax.swing.JTextField();
        txtResName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblPhoneNo = new javax.swing.JLabel();
        lblOperatorName = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        txtManagerName = new javax.swing.JTextField();
        lblStreetAddress = new javax.swing.JLabel();
        txtStreetAdd = new javax.swing.JTextField();
        txtZipcode = new javax.swing.JTextField();
        lblZipcode = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblPhoneNo1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));

        lblResInfo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblResInfo.setText("Restaurant Info");

        jLabel2.setText("Restaurant No:");

        lblName.setText("Name:");

        lblPhoneNo.setText("Phone No:");

        lblOperatorName.setText("Manager Name:");

        lblStreetAddress.setText("Street Address:");

        lblZipcode.setText("Zipcode:");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPhoneNo1.setText("Phone No:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblOperatorName)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhoneNo1)
                            .addComponent(lblStreetAddress)))
                    .addComponent(lblName))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStreetAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(txtManagerName)
                    .addComponent(txtResName)
                    .addComponent(txtEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZipcode)
                    .addComponent(lblPhoneNo)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtResNo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtZipcode)
                    .addComponent(txtPhoneNo))
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(saveBtn)
                .addGap(108, 108, 108)
                .addComponent(editBtn)
                .addGap(84, 84, 84)
                .addComponent(jButton1)
                .addGap(0, 259, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(lblResInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblResInfo)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtResName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNo)
                    .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOperatorName)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipcode)
                    .addComponent(lblStreetAddress)
                    .addComponent(txtStreetAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNo1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(saveBtn)
                    .addComponent(jButton1))
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        txtResName.setEditable(true);
        txtManagerName.setEditable(true);
        txtStreetAdd.setEditable(true);
        txtPhoneNo.setEditable(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String id = txtResNo.getText();
        String name = txtResName.getText();
        String manager = txtManagerName.getText();
        String address = txtStreetAdd.getText();
        String mobileNo = txtPhoneNo.getText();
        String zipcode = txtZipcode.getText();
        String email = txtEmail.getText();

        if (id.isEmpty() || name.isEmpty() || manager.isEmpty() || address.isEmpty() || mobileNo.isEmpty() || email.isEmpty()| zipcode.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all fields!");
        } else if (!system.checkValidPhoneFormat(mobileNo)) {
            JOptionPane.showMessageDialog(null, "Phone format incorrect!");
        }else if (!system.checkValidEmailFormat(email)) {
            JOptionPane.showMessageDialog(null, "Email format incorrect!");
        } else {
            restaurant.setOperatorName(manager);
            restaurant.setStreetAddress(address);
            restaurant.setMobileNo(mobileNo);
            restaurant.setEmail(email);
            restaurant.setRestaurantName(name);
            restaurant.setZipcode(zipcode);

            JOptionPane.showMessageDialog(null, "Changes saved sucessfully!");

            disableAllFields();
        }
    }//GEN-LAST:event_saveBtnActionPerformed
    public void disableAllFields() {
        txtResNo.setEditable(false);
        txtResName.setEditable(false);
        txtManagerName.setEditable(false);
        txtStreetAdd.setEditable(false);
        txtPhoneNo.setEditable(false);
        txtZipcode.setEditable(false);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOperatorName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblPhoneNo1;
    private javax.swing.JLabel lblResInfo;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtResName;
    private javax.swing.JTextField txtResNo;
    private javax.swing.JTextField txtStreetAdd;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
