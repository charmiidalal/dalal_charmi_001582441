/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MasterAirlinerFlightSchedule;

import Business.Flight;
import Business.FlightDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Charmi Dalal
 */
public class airlinerFlightScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinerFlightScheduleJPanel
     */
    private JPanel cardLayoutJPanel;
    private FlightDirectory flightDir;
    private String airlinerName;
    public airlinerFlightScheduleJPanel(JPanel cardSequenceJPanel,FlightDirectory flightDir, String airlinerName) {
        initComponents();
        this.flightDir = flightDir;
        this.airlinerName = airlinerName;
        this.cardLayoutJPanel = cardSequenceJPanel;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)flightScheduleTbl.getModel();
        dtm.setRowCount(0);
        
        for(Flight a : flightDir.getFlightDir()){
            if(a.getFlightOwner().equals(airlinerName)){
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = a.getFlightOwner();
                row[1] = a.getFlightNumber();
                row[2] = a.getFlightSource();
                row[3] = a.getFlightDestination();
                row[4] = a.getFlightDepTime();
                row[5] = a.getFlightArrTime();
                row[6] = a.getFlightDuration();
                row[7] = a.getFlightDate();
                row[8] = a.getFlightTimePhase();
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
        flightScheduleTbl = new javax.swing.JTable();
        createScheduleBtn = new javax.swing.JButton();
        viewScheduleBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();

        flightScheduleTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Airliner", "Flight Number", "Source", "Destination", "Departure Time", "Arrival Time", "Duration", "Date", "Time of day", "Flight Period"
            }
        ));
        jScrollPane1.setViewportView(flightScheduleTbl);

        createScheduleBtn.setText("Create Schedule");
        createScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createScheduleBtnActionPerformed(evt);
            }
        });

        viewScheduleBtn.setText("View Schedule");
        viewScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewScheduleBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("              Manage Flight Schedule ");

        deleteBtn.setText("Delete Schedule");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createScheduleBtn)
                                .addGap(111, 111, 111)
                                .addComponent(viewScheduleBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createScheduleBtn)
                    .addComponent(viewScheduleBtn)
                    .addComponent(deleteBtn))
                .addContainerGap(312, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createScheduleBtnActionPerformed
        // TODO add your handling code here:
        CreateFlightScheduleJPanel panel = new CreateFlightScheduleJPanel(cardLayoutJPanel, flightDir,airlinerName);
        cardLayoutJPanel.add("CreateFlightScheduleJPanel",panel);
        CardLayout layout = (CardLayout) cardLayoutJPanel.getLayout();
        layout.next(cardLayoutJPanel);
    }//GEN-LAST:event_createScheduleBtnActionPerformed

    private void viewScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewScheduleBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = flightScheduleTbl.getSelectedRow();
        if(selectedRow > -1){
            Flight flight = flightDir.getFlightDir().get(selectedRow);
            ViewFlightScheduleJPanel panel = new ViewFlightScheduleJPanel(cardLayoutJPanel, flight,flightDir);
            cardLayoutJPanel.add("ViewFlightScheduleJPanel",panel);
            CardLayout layout = (CardLayout) cardLayoutJPanel.getLayout();
            layout.next(cardLayoutJPanel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row above");
            return;      
        }
    }//GEN-LAST:event_viewScheduleBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
         int selectedRow = flightScheduleTbl.getSelectedRow();
        if(selectedRow > -1){
            Flight f = flightDir.getFlightDir().get(selectedRow);
           int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION)
            {
                flightDir.getFlightDir().remove(f);
            }
             
                populateTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row above");
            return;      
        }
        
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createScheduleBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable flightScheduleTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewScheduleBtn;
    // End of variables declaration//GEN-END:variables
}
