/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuyerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

/**
 *
 * @author anush
 */
public class ViewHouseDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHouseJPanel
     */
    private JPanel userProcessContainer;
    private PropertyDirectory propertyDirectory;
    private Property property;
    private EcoSystem system;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Network network;
    private Organization organization;

    /**
     * Creates new form ViewDetailsJPanel
     *
     * @param userProcessContainer
     * @param property
     * @param propertyDirectory
     * @param system
     * @param userAccount
     */
    public ViewHouseDetailJPanel(JPanel userProcessContainer, Property property, PropertyDirectory propertyDirectory, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.property = property;
        this.propertyDirectory = propertyDirectory;
        this.userAccount = userAccount;
        this.system = system;

        populateRequestTable();
    }
    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(460, 280, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    private void populateRequestTable() {
        nameTxt.setText(property.getPropertyName());
        cityTxt.setText(property.getCity());
        addressTxt.setText(property.getStreet());
        pinTxt.setText(property.getPincode());
        stateTxt.setText(property.getState());
        priceTxt.setText(Double.toString(property.getPrice()));
        bhkTxt.setText(Integer.toString(property.getBhk()));
        bathroomTxt.setText(Double.toString(property.getBathroom()));
        String imgIcon = property.getUploadImg();
        imgupload.setIcon(ResizeImage(imgIcon));
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
        jLabel1 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        stateTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pinTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        bathroomTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bhkTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        imgupload = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 241, 242));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        nameTxt.setBackground(new java.awt.Color(153, 204, 255));
        nameTxt.setEnabled(false);
        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 188, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Address:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        addressTxt.setBackground(new java.awt.Color(153, 204, 255));
        addressTxt.setEnabled(false);
        jPanel1.add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 188, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("City:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        cityTxt.setBackground(new java.awt.Color(153, 204, 255));
        cityTxt.setEnabled(false);
        jPanel1.add(cityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 188, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("State:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        stateTxt.setBackground(new java.awt.Color(153, 204, 255));
        stateTxt.setEnabled(false);
        jPanel1.add(stateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 188, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Pincode:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText(" Photo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Price:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 670, -1, -1));

        pinTxt.setBackground(new java.awt.Color(153, 204, 255));
        pinTxt.setEnabled(false);
        jPanel1.add(pinTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 188, -1));

        priceTxt.setBackground(new java.awt.Color(153, 204, 255));
        priceTxt.setEnabled(false);
        jPanel1.add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, 188, -1));

        bathroomTxt.setBackground(new java.awt.Color(153, 204, 255));
        bathroomTxt.setEnabled(false);
        bathroomTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bathroomTxtActionPerformed(evt);
            }
        });
        jPanel1.add(bathroomTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 600, 190, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Bathroom:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, -1, -1));

        bhkTxt.setBackground(new java.awt.Color(153, 204, 255));
        bhkTxt.setEnabled(false);
        bhkTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhkTxtActionPerformed(evt);
            }
        });
        jPanel1.add(bhkTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 188, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("BHK:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 37, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("HOUSE DETAILS");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));
        jPanel1.add(imgupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 340, 200));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/HOUSE1.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 30, 540, 690));

        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/back.png"))); // NOI18N
        btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 30, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void bathroomTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bathroomTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bathroomTxtActionPerformed

    private void bhkTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhkTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bhkTxtActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed
    
    // Variables declaration - do not modify                     

    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblimage;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBHK;
    private javax.swing.JTextField txtBathroom;
    private javax.swing.JTextField txtCity;
    private javax.swing.JLabel txtImage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPincode;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtState;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField bathroomTxt;
    private javax.swing.JTextField bhkTxt;
    private javax.swing.JButton btnBack1;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JLabel imgupload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField pinTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField stateTxt;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
