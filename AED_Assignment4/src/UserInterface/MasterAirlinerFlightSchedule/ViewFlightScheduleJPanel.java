/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MasterAirlinerFlightSchedule;

import Business.Flight;
import Business.FlightDirectory;
import Business.Seats;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dinesh Kumar
 */
public class ViewFlightScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightScheduleJPanel
     */
    private final JPanel cardLayoutJPanel;
    private final Flight f;
    private final FlightDirectory fd;

    public ViewFlightScheduleJPanel(JPanel cardLayoutJPanel, Flight f, FlightDirectory fd) {
        initComponents();
        this.cardLayoutJPanel = cardLayoutJPanel;
        this.f = f;
        this.fd = fd;
        inputs();
    }

    private void inputs() {
        airlinerTxt.setText(f.getFlightOwner());
        flightNoTxt.setText(f.getFlightNumber());
        sourceTxt.setText(f.getFlightSource());
        destinationTxt.setText(f.getFlightDestination());
        departureTimeTxt.setText(f.getFlightDepTime());
        arrivalTimeTxt.setText(f.getFlightArrTime());
        durationTxt.setText(Integer.toString(f.getFlightDuration()));
        dateTxt.setText(f.getFlightDate().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        departureTimeTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        arrivalTimeTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        durationTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        airlinerTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        flightNoTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sourceTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        destinationTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        timeCB = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        departureTimeTxt.setBackground(new java.awt.Color(255, 204, 102));
        departureTimeTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        departureTimeTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        departureTimeTxt.setEnabled(false);

        jLabel4.setText("Source");

        arrivalTimeTxt.setBackground(new java.awt.Color(255, 204, 102));
        arrivalTimeTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        arrivalTimeTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        arrivalTimeTxt.setEnabled(false);

        jLabel5.setText("Destination");

        durationTxt.setBackground(new java.awt.Color(255, 204, 102));
        durationTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        durationTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        durationTxt.setEnabled(false);
        durationTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationTxtActionPerformed(evt);
            }
        });

        jLabel6.setText("Departure Time");

        dateTxt.setBackground(new java.awt.Color(255, 204, 102));
        dateTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        dateTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dateTxt.setEnabled(false);

        jLabel7.setText("Arrival Time");

        saveBtn.setBackground(new java.awt.Color(255, 204, 102));
        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Duration");

        jLabel9.setText("Date (dd-mm-yyyy)");

        airlinerTxt.setBackground(new java.awt.Color(255, 204, 102));
        airlinerTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        airlinerTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        airlinerTxt.setEnabled(false);
        airlinerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerTxtActionPerformed(evt);
            }
        });

        jLabel11.setText("Operated Time of Day");

        flightNoTxt.setBackground(new java.awt.Color(255, 204, 102));
        flightNoTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        flightNoTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        flightNoTxt.setEnabled(false);
        flightNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightNoTxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("                          View Flight Schedule");

        sourceTxt.setBackground(new java.awt.Color(255, 204, 102));
        sourceTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        sourceTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sourceTxt.setEnabled(false);
        sourceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Air Liner");

        destinationTxt.setBackground(new java.awt.Color(255, 204, 102));
        destinationTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        destinationTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        destinationTxt.setEnabled(false);

        jLabel3.setText("Flight Number");

        updateBtn.setBackground(new java.awt.Color(255, 204, 102));
        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 204, 102));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        timeCB.setBackground(new java.awt.Color(255, 204, 102));
        timeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time", "Morning", "Afternoon", "Evening", "Night", " " }));
        timeCB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null));
        timeCB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timeCB.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 189, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11))
                                        .addGap(204, 204, 204))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(airlinerTxt)
                            .addComponent(flightNoTxt)
                            .addComponent(sourceTxt)
                            .addComponent(destinationTxt)
                            .addComponent(departureTimeTxt)
                            .addComponent(arrivalTimeTxt)
                            .addComponent(durationTxt)
                            .addComponent(dateTxt)
                            .addComponent(timeCB, 0, 131, Short.MAX_VALUE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(airlinerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(flightNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(sourceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(destinationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(departureTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addComponent(arrivalTimeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(durationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(timeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void durationTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationTxtActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if (airlinerTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Name");
            return;
        }
        if (arrivalTimeTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter arrival Time");
            return;
        }
        if (departureTimeTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Departure Time");
            return;
        }
        if (timeCB.getSelectedItem().equals("Select Time")) {
            JOptionPane.showMessageDialog(null, "Please select a Time");
            return;
        }
        if (flightNoTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Flight Number");
            return;
        }
        if (dateTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Date");

            return;
        }
        if (durationTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Duration");
            return;
        }
        if (sourceTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Source");
            return;
        }
        if (destinationTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Destination");
            return;
        }

        try {
            Integer.parseInt(durationTxt.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid duartion");
            return;
        }

        f.setFlightOwner(airlinerTxt.getText());
        f.setFlightNumber(flightNoTxt.getText());
        f.setFlightSource(sourceTxt.getText());
        f.setFlightDestination(destinationTxt.getText());
        f.setFlightDepTime(departureTimeTxt.getText());
        f.setFlightArrTime(arrivalTimeTxt.getText());
        f.setFlightDuration((int) Double.parseDouble(durationTxt.getText()));
        Date newDate = new Date();
        f.setFlightDate(newDate);
        Seats seats = new Seats();
        f.setFlightSeats(seats);
        JOptionPane.showMessageDialog(null, "Flight Upadated Successfully");
        disabled();
        saveBtn.setEnabled(false);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void airlinerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinerTxtActionPerformed

    private void flightNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightNoTxtActionPerformed

    private void sourceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceTxtActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        airlinerTxt.setEnabled(true);
        arrivalTimeTxt.setEnabled(true);
        dateTxt.setEnabled(true);
        durationTxt.setEnabled(true);
        flightNoTxt.setEnabled(true);
        destinationTxt.setEnabled(true);
        timeCB.setEnabled(true);
        sourceTxt.setEnabled(true);
        departureTimeTxt.setEnabled(true);
        updateBtn.setEnabled(false);
    }//GEN-LAST:event_updateBtnActionPerformed
    public void disabled() {
        airlinerTxt.setEnabled(false);
        arrivalTimeTxt.setEnabled(false);
        dateTxt.setEnabled(false);
        durationTxt.setEnabled(false);
        flightNoTxt.setEnabled(false);
        destinationTxt.setEnabled(false);
        timeCB.setEnabled(false);
        sourceTxt.setEnabled(false);
        departureTimeTxt.setEnabled(false);
        updateBtn.setEnabled(true);
    }
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) cardLayoutJPanel.getLayout();

        Component[] cc = cardLayoutJPanel.getComponents();
        for (Component c : cc) {
            if (c instanceof airlinerFlightScheduleJPanel) {
                airlinerFlightScheduleJPanel mpp = (airlinerFlightScheduleJPanel) c;
                mpp.populateTable();
            }
        }

        layout.previous(cardLayoutJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerTxt;
    private javax.swing.JTextField arrivalTimeTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JTextField departureTimeTxt;
    private javax.swing.JTextField destinationTxt;
    private javax.swing.JTextField durationTxt;
    private javax.swing.JTextField flightNoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField sourceTxt;
    private javax.swing.JComboBox<String> timeCB;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
