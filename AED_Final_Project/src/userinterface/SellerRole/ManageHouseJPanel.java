/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SellerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Property.Property;
import Business.Property.PropertyDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anush
 */
public class ManageHouseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    /**
     * Creates new form ManageHouseJPanel
     */
    private Enterprise enterprise;
    private UserAccount useraccount;
    private PropertyDirectory propertyDirectory;
    private EcoSystem system;

    public ManageHouseJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.useraccount = useraccount;
        this.system = system;
        this.propertyDirectory = (system.getPropertyDirectory() == null) ? new PropertyDirectory() : system.getPropertyDirectory();
        populateTable();
        disableLabels();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) jtblHouse.getModel();
        dtm.setRowCount(0);
        for (Property property : propertyDirectory.getPropertyList()) {
            if (property.getSeller().getUsername().equals(useraccount.getUsername())) {
                Object[] row = new Object[11];
                row[0] = property;
                row[1] = property.getPropertyName();
                row[2] = property.getStreet();
                row[3] = property.getCity();
                row[4] = property.getState();
                row[5] = property.getPincode();
                row[6] = property.getBhk();
                row[7] = property.getBathroom();
                row[8] = property.getPrice();
                row[9] = property.getStatus();
                row[10]= property.getBuyer();
                dtm.addRow(row);
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblHouse = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnDeleteHouse = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBuyers = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stateTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pinTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jbtnUpdate = new javax.swing.JButton();
        bhkTxt = new javax.swing.JTextField();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        bathroomTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        txtSoldTo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bhklbl = new javax.swing.JLabel();
        homeNamelbl = new javax.swing.JLabel();
        bathroomlbl = new javax.swing.JLabel();
        pricelbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 242));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblHouse.setAutoCreateRowSorter(true);
        jtblHouse.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtblHouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Property ID", "Name", "Address", "City", "State", "Zipcode", "BHK", "Bathroom", "Rate", "Status", "SoldTo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblHouse.setSelectionBackground(new java.awt.Color(0, 0, 51));
        jScrollPane1.setViewportView(jtblHouse);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 930, 190));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("LIST OF ADVERTISES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        btnDeleteHouse.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnDeleteHouse.setForeground(new java.awt.Color(0, 0, 51));
        btnDeleteHouse.setText("Delete House");
        btnDeleteHouse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHouseActionPerformed(evt);
            }
        });
        add(btnDeleteHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        btnEdit.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(0, 0, 51));
        btnEdit.setText("Edit House");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        btnBuyers.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnBuyers.setForeground(new java.awt.Color(0, 0, 51));
        btnBuyers.setText("View Interested Buyers");
        btnBuyers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuyers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyersActionPerformed(evt);
            }
        });
        add(btnBuyers, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 188, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("House Address:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 188, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("City:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));
        add(cityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 188, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("State:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, -1));
        add(stateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 188, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Pincode:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, -1, -1));
        add(pinTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 188, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("BHK:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 37, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Bathroom:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, 30));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("Rent:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Status:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, -1, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("SoldTo:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, -1, -1));

        jbtnUpdate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });
        add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 88, -1));

        bhkTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhkTxtActionPerformed(evt);
            }
        });
        add(bhkTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 160, -1));

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacant", "Sold" }));
        add(jComboBoxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 166, -1));

        bathroomTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bathroomTxtActionPerformed(evt);
            }
        });
        add(bathroomTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 160, -1));
        add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 166, -1));

        txtSoldTo.setEnabled(false);
        add(txtSoldTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, 160, -1));

        jLabel2.setBackground(new java.awt.Color(241, 241, 242));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/house3.png"))); // NOI18N
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 530, 530));

        bhklbl.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        bhklbl.setForeground(new java.awt.Color(255, 51, 51));
        bhklbl.setText("Please enter BHK value in integers");
        add(bhklbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 210, -1));

        homeNamelbl.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        homeNamelbl.setForeground(new java.awt.Color(255, 0, 0));
        homeNamelbl.setText("Please enter the name");
        add(homeNamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 220, 20));

        bathroomlbl.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        bathroomlbl.setForeground(new java.awt.Color(255, 51, 51));
        bathroomlbl.setText("Enter the bathroom in number format");
        add(bathroomlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 190, -1));

        pricelbl.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        pricelbl.setForeground(new java.awt.Color(255, 51, 51));
        pricelbl.setText("Please enter price in 0.0 format");
        add(pricelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHouseActionPerformed
        // TODO add your handling code here:

        int selectedRow = jtblHouse.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete the house", "Warning", dialogButton);

            if (dialogResult == JOptionPane.YES_OPTION) {
                Property property = (Property) jtblHouse.getValueAt(selectedRow, 0);
                propertyDirectory.removeProperty(property);
                JOptionPane.showMessageDialog(this, "Selected house is removed from the list!");
                populateTable();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a house to be deleted");
        }
    }//GEN-LAST:event_btnDeleteHouseActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jtblHouse.getModel();

        int selectedRow = jtblHouse.getSelectedRow();
        if (selectedRow >= 0) {

            String name = (String) jtblHouse.getValueAt(selectedRow, 1);
            String address = (String) jtblHouse.getValueAt(selectedRow, 2);
            String city = (String) jtblHouse.getValueAt(selectedRow, 3);
            String state = (String) jtblHouse.getValueAt(selectedRow, 4);
            String zipcode = (String) jtblHouse.getValueAt(selectedRow, 5);
            int bhk = (Integer) jtblHouse.getValueAt(selectedRow, 6);
            double bathroom = (Double) jtblHouse.getValueAt(selectedRow, 7);
            double price = (Double) jtblHouse.getValueAt(selectedRow, 8);
            String status = (String) jtblHouse.getValueAt(selectedRow, 9);
            UserAccount soldto = (UserAccount) jtblHouse.getValueAt(selectedRow, 10);

            nameTxt.setText(name);
            addressTxt.setText(address);
            pinTxt.setText(zipcode);
            stateTxt.setText(state);
            String bhkset = Integer.toString(bhk);
            bhkTxt.setText(bhkset);
            String bathroomset = Double.toString(bathroom);
            bathroomTxt.setText(bathroomset);
            String priceset = Double.toString(price);
            priceTxt.setText(priceset);
            jComboBoxStatus.getModel().setSelectedItem(status);
            if(soldto != null){
                txtSoldTo.setText(soldto.getName());
            }
            cityTxt.setText(city);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBuyersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyersActionPerformed
        // TODO add your handling code here:
        int selectedRow = jtblHouse.getSelectedRow();

        int count = jtblHouse.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {

                String name = (String) jtblHouse.getValueAt(selectedRow, 1);
                Property property = propertyDirectory.searchPropertyName(name);

                ArrayList<UserAccount> buyers = property.getRegisteredBuyer();
                try {
                    if (!buyers.isEmpty() || buyers != null) {

                        ManageBuyerJPanel mngBuyerPanel = new ManageBuyerJPanel(userProcessContainer, enterprise, useraccount, property, system);
                        userProcessContainer.add("ManageBuyerJPanel", mngBuyerPanel);
                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        layout.next(userProcessContainer);

                    } else {
                        JOptionPane.showMessageDialog(null, "Sorry,No interested buyer for this property!!");
                    }
                } catch (NullPointerException e) {
                    System.out.println("NullPointerException thrown!");
                    JOptionPane.showMessageDialog(null, "Sorry,No interested buyer for this property!!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a Row!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }

    }//GEN-LAST:event_btnBuyersActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        // TODO add your handling code here:
        String name = nameTxt.getText();
        String address = addressTxt.getText();
        String city = cityTxt.getText();
        String state = stateTxt.getText();
        String pincode = pinTxt.getText();
        double price = 0.0;
        double bathroom = 0.0;
        Boolean flag = true;

        price = Double.parseDouble((priceTxt.getText()).isEmpty() ? "0.0" : priceTxt.getText());
        int bhk = Integer.parseInt((bhkTxt.getText()).isEmpty() ? "0" : bhkTxt.getText());
        bathroom = Double.parseDouble((bathroomTxt.getText()).isEmpty() ? "0.0" : bathroomTxt.getText());

        if (name.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || pincode.isEmpty() || price == 0.0 || bathroom == 0.0) {
            JOptionPane.showMessageDialog(null, "Please enter the missing field to continue!");
            flag = false;
        }
        if (price == 0.0) {
            pricelbl.setVisible(true);
            flag = false;
        }
        if (bhk == 0) {
            bhklbl.setVisible(true);
            flag = false;
        }
        if (bathroom == 0.0) {
            bathroomlbl.setVisible(true);
            flag = false;
        }
        if (flag) {
            disableLabels();
            int selectedRow = jtblHouse.getSelectedRow();
            Property property = (Property) jtblHouse.getValueAt(selectedRow, 0);
            property.setPropertyName(nameTxt.getText());
            property.setStreet(addressTxt.getText());
            property.setCity(cityTxt.getText());
            property.setPincode(pinTxt.getText());
            property.setState(stateTxt.getText());
            int bhkget = Integer.parseInt(bhkTxt.getText());
            property.setBhk(bhkget);
            property.setBathroom(Double.parseDouble(bathroomTxt.getText()));
            property.setPrice(Double.parseDouble(priceTxt.getText()));
            String statusget = String.valueOf(jComboBoxStatus.getSelectedItem());
            property.setStatus(statusget);
            property.setSeller(useraccount);
            system.setPropertyDirectory(propertyDirectory);
            JOptionPane.showMessageDialog(null, "House details Updated!");
            nameTxt.setText("");
            addressTxt.setText("");
            pinTxt.setText("");
            stateTxt.setText("");
            bhkTxt.setText("");
            bathroomTxt.setText("");
            priceTxt.setText("");
            txtSoldTo.setText("");
            cityTxt.setText("");
            populateTable();
        }
    }//GEN-LAST:event_jbtnUpdateActionPerformed
    public void disableLabels() {
        homeNamelbl.setVisible(false);
        bhklbl.setVisible(false);
        pricelbl.setVisible(false);
        bathroomlbl.setVisible(false);
    }
    private void bathroomTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bathroomTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bathroomTxtActionPerformed

    private void bhkTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhkTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bhkTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField bathroomTxt;
    private javax.swing.JLabel bathroomlbl;
    private javax.swing.JTextField bhkTxt;
    private javax.swing.JLabel bhklbl;
    private javax.swing.JButton btnBuyers;
    private javax.swing.JButton btnDeleteHouse;
    private javax.swing.JButton btnEdit;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JLabel homeNamelbl;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTable jtblHouse;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField pinTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JLabel pricelbl;
    private javax.swing.JTextField stateTxt;
    private javax.swing.JTextField txtSoldTo;
    // End of variables declaration//GEN-END:variables
}
