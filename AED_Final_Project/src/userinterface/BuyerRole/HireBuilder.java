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
import Business.Role.BuilderRole;
import Business.SendSMS.SendSMS;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import Business.WorkQueue.BuilderRequest;

/**
 *
 * @author Dinesh
 */
public class HireBuilder extends javax.swing.JPanel {

    /**
     * Creates new form HireBuilder
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Property property;
    private Enterprise enterprise;
    private Network network;
    private Organization organization;

    public HireBuilder(JPanel userProcess, Organization organization, Network network, Enterprise enterprise, Property property, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcess;
        this.system = system;
        this.property = property;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.network = network;
        this.organization = organization;
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);

        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getRole() instanceof BuilderRole) {
                            Object[] row = new Object[8];
                            row[0] = ua.getEmployee().getId();
                            row[1] = ua;
                            row[2] = ua.getCity();
                            row[3] = ua.getState();
                            row[4] = ua.getStatus();
                            row[5] = ua.getPhone();
                            row[6] = ua.getCharge();
                            row[7] = org.getType();
                            model.addRow(row);
                        }
                    }
                }
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

        brnHireInspector = new javax.swing.JButton();
        commentTxxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brnHireInspector.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        brnHireInspector.setForeground(new java.awt.Color(41, 50, 80));
        brnHireInspector.setText("Hire Builder");
        brnHireInspector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brnHireInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnHireInspectorActionPerformed(evt);
            }
        });
        add(brnHireInspector, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, 21));

        commentTxxt.setForeground(new java.awt.Color(41, 50, 80));
        add(commentTxxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 190, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(41, 50, 80));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/BUILDING.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 660, 440));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 50, 80));
        jLabel1.setText("Comment:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        btnBack.setForeground(new java.awt.Color(41, 50, 80));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/back.png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 30, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 50, 80));
        jLabel2.setText("BUILDERS LIST");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, 30));

        jScrollPane1.setForeground(new java.awt.Color(41, 50, 80));

        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "City", "State", "Status", "Phone", "Charge", "OrganizationName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(houseTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 790, 300));
    }// </editor-fold>//GEN-END:initComponents

    private void brnHireInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnHireInspectorActionPerformed
        int selectedRow = houseTable.getSelectedRow();
        int count = houseTable.getSelectedRowCount();

        if (count == 1) {
            if (selectedRow >= 0) {
                UserAccount serviceAcc = (UserAccount) houseTable.getValueAt(selectedRow, 1);
                String comment = commentTxxt.getText();
                if (comment.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter valid & non empty value for Comment note!");
                    return;
                } else if (!serviceAcc.getStatus().equals("Available")) {
                    JOptionPane.showMessageDialog(null, "Sorry! This Builder is already Occupied");
                    return;
                }
                for (Network n : system.getNetworkList()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                                if (serviceAcc.getUsername().equals(ua.getUsername())) {
                                    BuilderRequest builder = new BuilderRequest();
                                    builder.setRequestID();
                                    builder.setBuyer(userAccount);
                                    builder.setBuilder(serviceAcc);
                                    builder.setSeller(property.getSeller());
                                    builder.setStatus("Pending");
                                    builder.setBuyerNote(comment);
                                    builder.setProperty(property);
                                    builder.setOrgType(org.getType());
                                    e.getWorkQueue().getWorkRequestList().add(builder);
                                    JOptionPane.showMessageDialog(null, "Request Sent Successfully!");
                                    SendSMS sms = new SendSMS(serviceAcc.getPhone(), "Hello! You have one new work request! Please login to know more!");
                                    EcoSystem.sendEmailMessage(serviceAcc.getEmail(), "Hello! You have one new work request! Please login to know more!");
                                }
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");

        }

    }//GEN-LAST:event_brnHireInspectorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnHireInspector;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField commentTxxt;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
