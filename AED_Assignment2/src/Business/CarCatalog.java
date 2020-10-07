/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
/* Import File & Buffer Reader, Date libraries */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
/**
 *
 * @author manushpatel
 */
public class CarCatalog {
    /* Initialize Car List Array List */
    private ArrayList<Car> carList;
    private Date lastUpdated;
    /* Intialize key values of auto generated array */
    private static final int CAR_NAME = 0;
    private static final int IS_AVAILABLE = 1;
    private static final int TIME_AVAILABLE = 2;
    private static final int MANUFACTURER_NAME = 3;
    private static final int MANUFACTURER_YEAR = 4;
    private static final int SEAT_CAPACITY = 5;
    private static final int SERIAL_NO = 6;
    private static final int MODEL_NO = 7;
    private static final int CITY = 8;
    private static final int IS_EXPIRED = 9;
    
    /* Create constructor and assign array list memory */
    public CarCatalog() throws IOException {
        /* Initialize array list for car catalog */
        this.carList = new ArrayList<Car>();
        /* Read car details from config file and store it in an array */
        Properties prop=new Properties();
        FileInputStream ip= new FileInputStream("config.properties");
        prop.load(ip);
        /* Loop throgh the array size */
        for(int i=1;i<=20;i+=1)
        {
            String[] carDetails = prop.getProperty("car"+i).split(",");
            Car tempCar = new Car();
            tempCar.setCarName(carDetails[CAR_NAME]);
            tempCar.setIsAvailable(Boolean.parseBoolean(carDetails[IS_AVAILABLE]));
            tempCar.setTimeAvailable(carDetails[TIME_AVAILABLE]);
            tempCar.setManufacturerName(carDetails[MANUFACTURER_NAME]);
            tempCar.setManufactureYear(Integer.parseInt(carDetails[MANUFACTURER_YEAR]));
            tempCar.setSeatCapacity(Integer.parseInt(carDetails[SEAT_CAPACITY]));
            tempCar.setSerialNo(carDetails[SERIAL_NO]);
            tempCar.setModelNo(carDetails[MODEL_NO]);
            tempCar.setCity(carDetails[CITY]);
            tempCar.setIsExpired(Boolean.parseBoolean(carDetails[IS_EXPIRED]));
            
            this.carList.add(tempCar);
        }
        setLastUpdated(new Date());
    }
    
    /* Get & Set Car List */
    public ArrayList<Car> getCarList() {
        return carList;
    }
    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    /* Get & Set last car updated date */
    public Date getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    /* Add new car in to array */
    public Boolean addCar(Car car){
        // make sure duplicate serialId is prevented
        for(Car c : this.carList)
        {
            if(c.equals(car))
            {
                return false;
            }
        }
        carList.add(car);
        setLastUpdated(new Date());
        return true;  
    }
    
    /* Delete car details from an array */
    public void deleteCar(Car car){
        carList.remove(car);
        //setLastUpdated(new Date());
    }
    
    /* Search Car details through model number in array */
    public Car searchAccount(String modelNo){
        for(Car car: carList)
        {
            if(car.getModelNo().equals(modelNo))
            {
                return car;
            }
        }
        return null;
    }
    
}
