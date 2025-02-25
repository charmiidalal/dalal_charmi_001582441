

package userinterface.PropertyManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Property.Property;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import userinterface.BuyerRole.viewJobsJPanel;

/**
 *
 * @author  Dinesh
 */
public class PropertyManagerWorkAreaJPanel extends javax.swing.JPanel {
    
   JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Network network;
    UserAccount account;
    Organization organization;
    Property property;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public PropertyManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = business;
        this.network = network;
        this.enterprise = enterprise;
        this.organization = organization;
        this.property=property;
        manageJobs();

    }

    private void manageJobs() {
        ViewJobsJPanel viewJobsJPanel = new ViewJobsJPanel(userRight,organization,network, enterprise,account, system);
        userRight.add("viewJobsJPanel",viewJobsJPanel);
        CardLayout layout = (CardLayout) userRight.getLayout();
        layout.next(userRight);
    }
    
    private void manageBuyers() {
        viewJobsJPanel managecleanerJPanel = new viewJobsJPanel(userRight, account, enterprise, system, network, organization);
        userRight.add("manageInspectorProfileJPanel", managecleanerJPanel);
        CardLayout layout = (CardLayout) userRight.getLayout();
        layout.next(userRight);
    }
    
    private void manageProfile() {
        
        ManageProfileJPanel manageInspectorProfileJPanel = new ManageProfileJPanel(userRight, enterprise, account, system);
        userRight.add("manageInspectorProfileJPanel", manageInspectorProfileJPanel);
        CardLayout layout = (CardLayout) userRight.getLayout();
        layout.next(userRight);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        userLeft = new javax.swing.JPanel();
        manageProfilePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageProfile = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        manageJobsPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        manageJobs = new javax.swing.JLabel();
        manageOrganization = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userRight = new javax.swing.JPanel();

        setBackground(new java.awt.Color(215, 81, 81));
        setMinimumSize(new java.awt.Dimension(1338, 840));
        setPreferredSize(new java.awt.Dimension(1338, 840));
        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(241, 241, 242));

        userLeft.setBackground(new java.awt.Color(255, 213, 90));
        userLeft.setPreferredSize(new java.awt.Dimension(280, 148));
        userLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageProfilePanel.setBackground(new java.awt.Color(255, 213, 90));
        manageProfilePanel.setToolTipText("");
        manageProfilePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageProfilePanelMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 213, 90));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/management.png"))); // NOI18N
        jLabel2.setToolTipText("");

        manageProfile.setBackground(new java.awt.Color(255, 213, 90));
        manageProfile.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageProfile.setText("Manage Profile");
        manageProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageProfile.setPreferredSize(new java.awt.Dimension(115, 16));
        manageProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageProfileMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageProfilePanelLayout = new javax.swing.GroupLayout(manageProfilePanel);
        manageProfilePanel.setLayout(manageProfilePanelLayout);
        manageProfilePanelLayout.setHorizontalGroup(
            manageProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageProfilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        manageProfilePanelLayout.setVerticalGroup(
            manageProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageProfilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(manageProfilePanelLayout.createSequentialGroup()
                .addComponent(manageProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        userLeft.add(manageProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 280, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        userLeft.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 280, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("PROPERTY MANAGER MANAGEMENT");
        userLeft.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        userLeft.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 210, 20));

        manageJobsPanel.setBackground(new java.awt.Color(255, 213, 90));
        manageJobsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageJobsPanelMousePressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(215, 81, 81));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/request.png"))); // NOI18N

        manageJobs.setBackground(new java.awt.Color(255, 213, 90));
        manageJobs.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageJobs.setText("Manage Jobs");
        manageJobs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageJobs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageJobsMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageJobsPanelLayout = new javax.swing.GroupLayout(manageJobsPanel);
        manageJobsPanel.setLayout(manageJobsPanelLayout);
        manageJobsPanelLayout.setHorizontalGroup(
            manageJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageJobsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageJobsPanelLayout.setVerticalGroup(
            manageJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageJobsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageJobsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userLeft.add(manageJobsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 280, 50));

        manageOrganization.setBackground(new java.awt.Color(255, 213, 90));
        manageOrganization.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageOrganization.setText("View Job Status");
        manageOrganization.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageOrganization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationMousePressed(evt);
            }
        });
        userLeft.add(manageOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 220, 30));

        jLabel4.setBackground(new java.awt.Color(255, 213, 90));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_new/request.png"))); // NOI18N
        userLeft.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        userRight.setBackground(new java.awt.Color(241, 241, 242));
        userRight.setMinimumSize(new java.awt.Dimension(1058, 840));
        userRight.setPreferredSize(new java.awt.Dimension(1058, 840));
        userRight.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(userLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userRight, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, Short.MAX_VALUE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(userLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageJobsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageJobsMousePressed
       manageJobs();
    }//GEN-LAST:event_manageJobsMousePressed

    private void manageProfilePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProfilePanelMousePressed
        // TODO add your handling code here:
      manageProfile();
    }//GEN-LAST:event_manageProfilePanelMousePressed

    private void manageJobsPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageJobsPanelMousePressed
        // TODO add your handling code here:
       manageJobs();
    }//GEN-LAST:event_manageJobsPanelMousePressed

    private void manageProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProfileMousePressed
        // TODO add your handling code here:
        manageProfile();
    }//GEN-LAST:event_manageProfileMousePressed

    private void manageOrganizationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMousePressed
        manageBuyers();
    }//GEN-LAST:event_manageOrganizationMousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel manageJobs;
    private javax.swing.JPanel manageJobsPanel;
    private javax.swing.JLabel manageOrganization;
    private javax.swing.JLabel manageProfile;
    private javax.swing.JPanel manageProfilePanel;
    private javax.swing.JPanel systemAdminPanel;
    private javax.swing.JPanel userLeft;
    private javax.swing.JPanel userRight;
    // End of variables declaration//GEN-END:variables
    
}
