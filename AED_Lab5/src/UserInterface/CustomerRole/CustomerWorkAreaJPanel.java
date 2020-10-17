/*
 * ProductManagerWorkAreaJPanel.java
 *
 * Created on October 3, 2008, 8:06 AM
 */
package UserInterface.CustomerRole;

import Business.MasterOrderCatalog;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author Rushabh
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private MasterOrderCatalog masterOrdercatalog;

    /** Creates new form ProductManagerWorkAreaJPanel */
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, SupplierDirectory supplierDirectory, MasterOrderCatalog masterOrdercatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        this.masterOrdercatalog = masterOrdercatalog;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        browseProductCatalog = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("My Work Area (Customer Role)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        browseProductCatalog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        browseProductCatalog.setText("Browse Product Catalog >>");
        browseProductCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseProductCatalogActionPerformed(evt);
            }
        });
        add(browseProductCatalog, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Vijaya", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/CustomerRole/bestbuy.gif"))); // NOI18N
        jLabel2.setText("Welcome To Please Buy !");
        jLabel2.setIconTextGap(7);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void browseProductCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseProductCatalogActionPerformed
        // TODO add your handling code here:
        BrowseProducts bp = new BrowseProducts(userProcessContainer, supplierDirectory, masterOrdercatalog);
        userProcessContainer.add("BrowseProductsJPanel", bp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);  
    }//GEN-LAST:event_browseProductCatalogActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseProductCatalog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
