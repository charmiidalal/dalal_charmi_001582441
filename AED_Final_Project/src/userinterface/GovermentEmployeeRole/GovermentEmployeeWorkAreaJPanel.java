package userinterface.GovermentEmployeeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Charmi
 */
public class GovermentEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public GovermentEmployeeWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        manageAdvertise();

    }

    private void manageAdvertise() {
        ViewrequestJPanel viewrequestJPanel = new ViewrequestJPanel(userProcessContainer, enterprise, account, system);
        rightSystemAdminPanel.add("ViewrequestJPanel", viewrequestJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    private void manageProfile() {
        ManageGovProfileJPanel manageGovProfileJPanel = new ManageGovProfileJPanel(userProcessContainer, system, account);
        rightSystemAdminPanel.add("manageGovProfileJPanel", manageGovProfileJPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        manageAdvertisePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageAdvertise = new javax.swing.JLabel();
        manageSellerProfile = new javax.swing.JPanel();
        manageProfile = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        manageHousesPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(241, 241, 242));
        setPreferredSize(new java.awt.Dimension(1338, 840));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(255, 213, 90));
        systemAdminPanel.setMinimumSize(new java.awt.Dimension(1338, 840));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(255, 213, 90));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 840));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 840));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageAdvertisePanel.setBackground(new java.awt.Color(255, 213, 90));
        manageAdvertisePanel.setToolTipText("");
        manageAdvertisePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageAdvertisePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageAdvertisePanelMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 213, 90));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/best.png"))); // NOI18N
        jLabel2.setToolTipText("");

        manageAdvertise.setBackground(new java.awt.Color(255, 213, 90));
        manageAdvertise.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageAdvertise.setText("View Loan Requests");
        manageAdvertise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageAdvertise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageAdvertiseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageAdvertisePanelLayout = new javax.swing.GroupLayout(manageAdvertisePanel);
        manageAdvertisePanel.setLayout(manageAdvertisePanelLayout);
        manageAdvertisePanelLayout.setHorizontalGroup(
            manageAdvertisePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageAdvertisePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageAdvertise, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        manageAdvertisePanelLayout.setVerticalGroup(
            manageAdvertisePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageAdvertisePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageAdvertisePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageAdvertise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageAdvertisePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 50));

        manageSellerProfile.setBackground(new java.awt.Color(255, 213, 90));
        manageSellerProfile.setToolTipText("");
        manageSellerProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageSellerProfile.setPreferredSize(new java.awt.Dimension(264, 48));
        manageSellerProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageSellerProfileMousePressed(evt);
            }
        });

        manageProfile.setBackground(new java.awt.Color(255, 213, 90));
        manageProfile.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageProfile.setText("Manage Profile");
        manageProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageProfile.setPreferredSize(new java.awt.Dimension(115, 16));

        jLabel6.setBackground(new java.awt.Color(255, 213, 90));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/manager24x.png"))); // NOI18N

        javax.swing.GroupLayout manageSellerProfileLayout = new javax.swing.GroupLayout(manageSellerProfile);
        manageSellerProfile.setLayout(manageSellerProfileLayout);
        manageSellerProfileLayout.setHorizontalGroup(
            manageSellerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageSellerProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(manageProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageSellerProfileLayout.setVerticalGroup(
            manageSellerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageSellerProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageSellerProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageSellerProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 280, 40));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("GOVERMENT EMPLOYEE WORK AREA ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 320, 20));

        manageHousesPanel.setBackground(new java.awt.Color(255, 213, 90));
        manageHousesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageHousesPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageHousesPanelLayout = new javax.swing.GroupLayout(manageHousesPanel);
        manageHousesPanel.setLayout(manageHousesPanelLayout);
        manageHousesPanelLayout.setHorizontalGroup(
            manageHousesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        manageHousesPanelLayout.setVerticalGroup(
            manageHousesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel3.add(manageHousesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 280, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 280, -1));

        rightSystemAdminPanel.setBackground(new java.awt.Color(241, 241, 242));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageAdvertiseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageAdvertiseMousePressed
        manageAdvertise();
    }//GEN-LAST:event_manageAdvertiseMousePressed

    private void manageAdvertisePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageAdvertisePanelMousePressed
        // TODO add your handling code here:
        manageAdvertise();
    }//GEN-LAST:event_manageAdvertisePanelMousePressed

    private void manageSellerProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageSellerProfileMousePressed
        // TODO add your handling code here:
        manageProfile();
    }//GEN-LAST:event_manageSellerProfileMousePressed

    private void manageHousesPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageHousesPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageHousesPanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel manageAdvertise;
    private javax.swing.JPanel manageAdvertisePanel;
    private javax.swing.JPanel manageHousesPanel;
    private javax.swing.JLabel manageProfile;
    private javax.swing.JPanel manageSellerProfile;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    // End of variables declaration//GEN-END:variables

}
