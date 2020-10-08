/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Car;
import Business.CarCatalog;
import java.awt.CardLayout;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import static javafx.scene.input.KeyCode.T;
/**
 *
 * @author manushpatel
 */
public class UserJFrame extends javax.swing.JFrame {
    /* Initialize Car Catalog object variable */
    private final CarCatalog carCatalog;
    private final CarCatalog resultCatalog;
    /**
     * Creates new form UserJPanel1
     */

    UserJFrame() throws IOException, ParseException {
        initComponents();
        /* Initialize object of Car Catalog */
        this.carCatalog = new CarCatalog();
        this.resultCatalog = new CarCatalog();
        this.resultCatalog.setCarList(new ArrayList<Car>());
        /* Show when last catalog was updated */
        carCatalog.getLastUpdated();
        lblLastUpdated.setText("Last Fleet Updated On: "+ carCatalog.getLastUpdated());
    }
    /* This function shows filtered data by users */
    void showTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
        /* CHeck if any specific matches are found */
        if(resultCatalog.getCarList().size() == 0){
            JOptionPane.showMessageDialog(null, "No such cars found!");
            dtm.setRowCount(0);
        }else{
            dtm.setRowCount(0);
            for(Car car:resultCatalog.getCarList())
            {
                Object[] row = new Object[10];
                row[0] = car;
                row[1] = car.isIsAvailable();
                row[2] = car.getTimeAvailable();
                row[3] = car.isIsExpired();
                row[4] = car.getManufacturerName();
                row[5] = car.getManufactureYear();
                row[6] = car.getSeatCapacity();
                row[7] = car.getSerialNo();
                row[8] = car.getModelNo();
                row[9] = car.getCity();
                dtm.addRow(row);
            }
        }
    }
    /* Check if user has added value in serach box before searching */
    Boolean checkNullTextbox(){
        Boolean flag = true;
        if(globalSearchBox.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please add value in the searchbox first!");
            flag = false;
        }
        return flag;
    }
    
    /* Check if user has added value in serach box before searching */
    Boolean checkSeatTextbox(){
        Boolean flag = true;
        if(globalSearchBox.getText().trim().equals(null)){
            JOptionPane.showMessageDialog(null, "Please add both min and max value for seats!");
            flag = false;
        }
        return flag;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        topJPanel = new javax.swing.JPanel();
        listCarByManufacture = new javax.swing.JButton();
        listByManufactureYear = new javax.swing.JButton();
        btnFindCarBySeat = new javax.swing.JButton();
        listCarByCity = new javax.swing.JButton();
        btnListCarByModelNo = new javax.swing.JButton();
        btnListCarBySerialNo = new javax.swing.JButton();
        globalSearchBox = new javax.swing.JTextField();
        txtMaxSeat = new javax.swing.JTextField();
        txtMinSeat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        menuContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        btnFindUnavailableCar = new javax.swing.JButton();
        btnFindCar = new javax.swing.JButton();
        btnFindAvailableCar = new javax.swing.JButton();
        btnListExpiredCars = new javax.swing.JButton();
        lblLastUpdated = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topJPanel.setBackground(new java.awt.Color(51, 51, 51));
        topJPanel.setPreferredSize(new java.awt.Dimension(1074, 500));

        listCarByManufacture.setText("List Car by Manufacturers");
        listCarByManufacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCarByManufactureActionPerformed(evt);
            }
        });

        listByManufactureYear.setText("List Car Manufactured by Year");
        listByManufactureYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listByManufactureYearActionPerformed(evt);
            }
        });

        btnFindCarBySeat.setText("List Car by Seats");
        btnFindCarBySeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindCarBySeatActionPerformed(evt);
            }
        });

        listCarByCity.setText("List Car by City");
        listCarByCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCarByCityActionPerformed(evt);
            }
        });

        btnListCarByModelNo.setText("List Car by Model No");
        btnListCarByModelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListCarByModelNoActionPerformed(evt);
            }
        });

        btnListCarBySerialNo.setText("List Car by Serial No");
        btnListCarBySerialNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListCarBySerialNoActionPerformed(evt);
            }
        });

        globalSearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                globalSearchBoxActionPerformed(evt);
            }
        });

        txtMaxSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxSeatActionPerformed(evt);
            }
        });

        txtMinSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinSeatActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seat Availability:");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topJPanelLayout = new javax.swing.GroupLayout(topJPanel);
        topJPanel.setLayout(topJPanelLayout);
        topJPanelLayout.setHorizontalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addGroup(topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(topJPanelLayout.createSequentialGroup()
                                .addComponent(listCarByCity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnListCarByModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listByManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(txtMinSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txtMaxSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(topJPanelLayout.createSequentialGroup()
                                .addComponent(btnListCarBySerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(listCarByManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFindCarBySeat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(topJPanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(globalSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        topJPanelLayout.setVerticalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topJPanelLayout.createSequentialGroup()
                        .addGroup(topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(jLabel1)
                            .addComponent(globalSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listCarByCity)
                            .addComponent(btnListCarByModelNo)
                            .addComponent(listByManufactureYear)))
                    .addGroup(topJPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMinSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaxSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnListCarBySerialNo)
                        .addComponent(listCarByManufacture))
                    .addComponent(btnFindCarBySeat))
                .addGap(36, 36, 36))
        );

        SplitPane.setLeftComponent(topJPanel);

        menuContainer.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(menuContainer);

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Name", "Is Available", "Available Time", "Is Expired", "Mf Name", "MF Year", "Seat Available", "Serial No", "Model No", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCars);

        btnFindUnavailableCar.setBackground(new java.awt.Color(51, 51, 51));
        btnFindUnavailableCar.setForeground(new java.awt.Color(255, 255, 255));
        btnFindUnavailableCar.setText("Find Unavailable Cars");
        btnFindUnavailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindUnavailableCarActionPerformed(evt);
            }
        });

        btnFindCar.setBackground(new java.awt.Color(51, 51, 51));
        btnFindCar.setForeground(new java.awt.Color(255, 255, 255));
        btnFindCar.setText("Find First Available Car");
        btnFindCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindCarActionPerformed(evt);
            }
        });

        btnFindAvailableCar.setBackground(new java.awt.Color(51, 51, 51));
        btnFindAvailableCar.setForeground(new java.awt.Color(255, 255, 255));
        btnFindAvailableCar.setText("Find Available Cars");
        btnFindAvailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAvailableCarActionPerformed(evt);
            }
        });

        btnListExpiredCars.setBackground(new java.awt.Color(51, 51, 51));
        btnListExpiredCars.setForeground(new java.awt.Color(255, 255, 255));
        btnListExpiredCars.setText("List Expired Certificate Cars");
        btnListExpiredCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListExpiredCarsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFindCar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnFindAvailableCar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFindUnavailableCar)
                                .addGap(46, 46, 46)
                                .addComponent(btnListExpiredCars, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLastUpdated)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindCar)
                    .addComponent(btnFindAvailableCar)
                    .addComponent(btnListExpiredCars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFindUnavailableCar))
                .addGap(18, 18, 18)
                .addComponent(lblLastUpdated)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListExpiredCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListExpiredCarsActionPerformed
        // TODO add your handling code here:
        /* This method finds the car whose licenses are expired */
        this.resultCatalog.setCarList(new ArrayList<Car>());
        for(Car car:carCatalog.getCarList())
        {
            if(car.isIsExpired())
            {
                this.resultCatalog.addCar(car);
            } 
        }
        showTable();
    }//GEN-LAST:event_btnListExpiredCarsActionPerformed
 
    private void btnFindCarBySeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindCarBySeatActionPerformed
        // TODO add your handling code here:
        /* This method finds the car with the min and max seats */
        if(checkSeatTextbox()){
            this.resultCatalog.setCarList(new ArrayList<Car>());
            int minSeat = Integer.parseInt(txtMinSeat.getText());
            int maxSeat = Integer.parseInt(txtMaxSeat.getText());
            for(Car car:carCatalog.getCarList())
            {
                if(minSeat < car.getSeatCapacity() && maxSeat > car.getSeatCapacity())
                {
                    this.resultCatalog.addCar(car);
                } 
            }
            showTable();
        }
    }//GEN-LAST:event_btnFindCarBySeatActionPerformed

    private void globalSearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_globalSearchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_globalSearchBoxActionPerformed

    private void btnListCarByModelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListCarByModelNoActionPerformed
        // TODO add your handling code here:
        /*List cars by model no provided in serachbox */
        if(checkNullTextbox()){
            this.resultCatalog.setCarList(new ArrayList<Car>());
            String modelNo = globalSearchBox.getText();
            for(Car car:carCatalog.getCarList())
            {
                if(car.getModelNo().equals(modelNo))
                {
                    this.resultCatalog.addCar(car);
                } 
            }
            showTable();
        }
    }//GEN-LAST:event_btnListCarByModelNoActionPerformed

    private void listByManufactureYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listByManufactureYearActionPerformed
        // TODO add your handling code here:
        /* List cars by manufacture years mentioned in serach box */
        if(checkNullTextbox()){
            this.resultCatalog.setCarList(new ArrayList<Car>());
            int listByManufactureYear = Integer.parseInt(globalSearchBox.getText());
            for(Car car:carCatalog.getCarList())
            {
                if(car.getManufactureYear() == listByManufactureYear)
                {
                    this.resultCatalog.addCar(car);
                } 
            }
            showTable();
        }
    }//GEN-LAST:event_listByManufactureYearActionPerformed

    private void listCarByCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCarByCityActionPerformed
        // TODO add your handling code here:
        /* List cars by the cities */
        if(checkNullTextbox()){
            this.resultCatalog.setCarList(new ArrayList<Car>());
            String cityName = globalSearchBox.getText();
            for(Car car:carCatalog.getCarList())
            {
                if(car.getCity().equals(cityName))
                {
                    this.resultCatalog.addCar(car);
                } 
            }
            showTable();
        }
    }//GEN-LAST:event_listCarByCityActionPerformed

    private void listCarByManufactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCarByManufactureActionPerformed
        // TODO add your handling code here:
        /* List car by the manufacturer's name */
        if(checkNullTextbox()){
            this.resultCatalog.setCarList(new ArrayList<Car>());
            String manufactureName = globalSearchBox.getText();
            for(Car car:carCatalog.getCarList())
            {
                if(car.getManufacturerName().equals(manufactureName))
                {
                    this.resultCatalog.addCar(car);
                } 
            }
            showTable();
        }
    }//GEN-LAST:event_listCarByManufactureActionPerformed

    private void btnListCarBySerialNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListCarBySerialNoActionPerformed
        // TODO add your handling code here:
        /* Lists car by the serial no */
        if(checkNullTextbox()){
            this.resultCatalog.setCarList(new ArrayList<Car>());
            String serialNo = globalSearchBox.getText();
            for(Car car:carCatalog.getCarList())
            {
                if(car.getSerialNo().equals(serialNo))
                {
                    this.resultCatalog.addCar(car);
                } 
            }
            showTable();
        }
    }//GEN-LAST:event_btnListCarBySerialNoActionPerformed

    private void btnFindAvailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAvailableCarActionPerformed
        // TODO add your handling code here:
        /* This method finds car which are available right now */
        this.resultCatalog.setCarList(new ArrayList<Car>());
        for(Car car:carCatalog.getCarList())
        {
            if(car.isIsAvailable())
            {
                this.resultCatalog.addCar(car);
            } 
        }
        showTable();
    }//GEN-LAST:event_btnFindAvailableCarActionPerformed

    private void btnFindUnavailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindUnavailableCarActionPerformed
        // TODO add your handling code here:
        /* This method finds car which are not available yet */
        this.resultCatalog.setCarList(new ArrayList<Car>());
        for(Car car:carCatalog.getCarList())
        {
            if(!car.isIsAvailable())
            {
                this.resultCatalog.addCar(car);
            } 
        }
        showTable();
    }//GEN-LAST:event_btnFindUnavailableCarActionPerformed

    private void txtMaxSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxSeatActionPerformed

    private void txtMinSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinSeatActionPerformed
    static class DateItem {
        String datetime;

        DateItem(String date) {
            this.datetime = date;
        }
    }
    
    static class SortByDate implements Comparator<DateItem> {
        @Override
        public int compare(DateItem a, DateItem b) {
            return a.datetime.compareTo(b.datetime);
        }
    }
    
    private void btnFindCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindCarActionPerformed
        // TODO add your handling code here:
        /* Find car which is available in nearest time */
        Date date = new Date() ;
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm") ;
        this.resultCatalog.setCarList(new ArrayList<>());
        List<Date> dates = new ArrayList<>();
        for(Car car:carCatalog.getCarList())
        { 
            try {
                if(!dateFormat.parse(dateFormat.format(date)).after(dateFormat.parse(car.getTimeAvailable())) &&
                   car.isIsAvailable())
                {
                    this.resultCatalog.addCar(car);
                    dates.add(dateFormat.parse(car.getTimeAvailable()));
                }
                
            } catch (ParseException ex) {
                Logger.getLogger(UserJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /* SOrt the dates array and get the car which is first available */
        Collections.sort(resultCatalog.getCarList(), new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                // compare two instance of `Score` and return `int` as result.
                return o1.getTimeAvailable().compareTo(o2.getTimeAvailable());
            }
        });
        Car firstAvailable = resultCatalog.getCarList().get(0);
        ArrayList<Car> nl = new ArrayList<Car>();
        nl.add(firstAvailable);
        resultCatalog.setCarList(nl);
        showTable();
    }//GEN-LAST:event_btnFindCarActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            /* Onclick of Admin section, Open User related options */
            new MainJframe().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(MainJframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(MainJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();//to close the current jframe
    }//GEN-LAST:event_btnBackActionPerformed
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainJframe().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainJframe.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(UserJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFindAvailableCar;
    private javax.swing.JButton btnFindCar;
    private javax.swing.JButton btnFindCarBySeat;
    private javax.swing.JButton btnFindUnavailableCar;
    private javax.swing.JButton btnListCarByModelNo;
    private javax.swing.JButton btnListCarBySerialNo;
    private javax.swing.JButton btnListExpiredCars;
    private javax.swing.JTextField globalSearchBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLastUpdated;
    private javax.swing.JButton listByManufactureYear;
    private javax.swing.JButton listCarByCity;
    private javax.swing.JButton listCarByManufacture;
    private javax.swing.JPanel menuContainer;
    private javax.swing.JTable tblCars;
    private javax.swing.JPanel topJPanel;
    private javax.swing.JTextField txtMaxSeat;
    private javax.swing.JTextField txtMinSeat;
    // End of variables declaration//GEN-END:variables
}
