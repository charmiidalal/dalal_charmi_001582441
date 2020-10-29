/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.AirlinerDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Charmi Dalal
 */
public class CreateAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewAirlinerJPanel
     */
    private JPanel cardLayoutJPanel;
    private AirlinerDirectory airlinerDir;
    CreateAirlinerJPanel(JPanel cardSequenceJPanel, AirlinerDirectory airlinerDir) {
         initComponents();
         this.airlinerDir = airlinerDir;
         this.cardLayoutJPanel = cardSequenceJPanel;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void clearAllFields(){
        nameTxtField.setText("");
        codeTxtField.setText("");
        originCountryTxtField.setText("");
        noOfFlightsTxtField.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airlinerNameLbl = new javax.swing.JLabel();
        airlinerCodeLbl = new javax.swing.JLabel();
        countriesOperatedLbll = new javax.swing.JLabel();
        originCountryLbl = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        codeTxtField = new javax.swing.JTextField();
        originCountryTxtField = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        fleetLbl = new javax.swing.JLabel();
        noOfFlightsTxtField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        createAirlinerLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        airlinerNameLbl.setText("Airliner Name:");

        airlinerCodeLbl.setText("Airliner No:");

        originCountryLbl.setText("From Country:");

        createBtn.setBackground(new java.awt.Color(204, 204, 204));
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        fleetLbl.setText("Fleet  Count:");

        backBtn.setBackground(new java.awt.Color(204, 204, 204));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        createAirlinerLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        createAirlinerLbl.setText("Create Airliner");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(createAirlinerLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(countriesOperatedLbll)
                        .addGap(629, 728, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(originCountryLbl)
                                .addGap(104, 104, 104)
                                .addComponent(originCountryTxtField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(airlinerNameLbl)
                                    .addComponent(airlinerCodeLbl)
                                    .addComponent(fleetLbl))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noOfFlightsTxtField)
                                    .addComponent(nameTxtField)
                                    .addComponent(codeTxtField))))
                        .addGap(198, 198, 198))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createBtn)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(createAirlinerLbl)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlinerNameLbl)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(airlinerCodeLbl)
                    .addComponent(codeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fleetLbl)
                    .addComponent(noOfFlightsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countriesOperatedLbll)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(originCountryLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(originCountryTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backBtn)
                            .addComponent(createBtn))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        if("".equals(nameTxtField.getText())){
            nameTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            airlinerNameLbl.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Name");
            return;
        }
        else{
            nameTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            airlinerNameLbl.setForeground(Color.BLACK);
        }
        if("".equals(codeTxtField.getText())){
            codeTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            airlinerCodeLbl.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Code");
            return;
        }
        else{
            codeTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            airlinerCodeLbl.setForeground(Color.BLACK);
        }
        
        if("".equals(originCountryTxtField.getText())){
            originCountryTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            originCountryLbl.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Origin Country");
            return;
        }
        else{
            originCountryTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            originCountryLbl.setForeground(Color.BLACK);
        }
        try{
            Integer.parseInt(noOfFlightsTxtField.getText());
            noOfFlightsTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            fleetLbl.setForeground(Color.BLACK);
        }
        catch(Exception e){
            noOfFlightsTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            originCountryLbl.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter number for Fleet");
            return;
        }
        
        Airliner newAirliner = new Airliner();
        newAirliner.setAirlineName(nameTxtField.getText());
        newAirliner.setAirlineCode(codeTxtField.getText());
        newAirliner.setAirlineCount((int)Double.parseDouble(noOfFlightsTxtField.getText()));
        newAirliner.setFromCountry(originCountryTxtField.getText());
        airlinerDir.addAirliner(newAirliner);
        JOptionPane.showMessageDialog(null, "Airliner Created Successfully");
        clearAllFields();
    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) cardLayoutJPanel.getLayout();
        
        Component[] components = cardLayoutJPanel.getComponents();
        for(Component component: components){
            if(component instanceof AirlinerCatalogue){
                AirlinerCatalogue mpp = (AirlinerCatalogue) component;
                mpp.populateTable();
            }
        }
        
        layout.previous(cardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airlinerCodeLbl;
    private javax.swing.JLabel airlinerNameLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField codeTxtField;
    private javax.swing.JLabel countriesOperatedLbll;
    private javax.swing.JLabel createAirlinerLbl;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel fleetLbl;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField noOfFlightsTxtField;
    private javax.swing.JLabel originCountryLbl;
    private javax.swing.JTextField originCountryTxtField;
    // End of variables declaration//GEN-END:variables
}
