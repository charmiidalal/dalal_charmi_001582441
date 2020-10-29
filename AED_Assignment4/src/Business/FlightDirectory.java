/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vennelareddy
 */
public class FlightDirectory {

    private List<Flight> dirFlight;
    private Flight flights;
    private AirlinerDirectory airDir;

    public FlightDirectory() {
        dirFlight = new ArrayList<Flight>();
        fetchFlightSchedule();
    }

    public void fetchFlightSchedule() {
        String[][] arr = {{"Air India", "AI563", "Boston", "Washington", "11:30", "4:30", "1300.0", "Night", "3"},
        {"Air India", "AI563", "Boston", "Washington", "10:30", "4:30", "100.0", "Afternoon", "3"},
        {"Luftanza Airways", "LA321", "Las Vegas", "New York", "01:30", "4:30", "3600.0", "Morning", "4"},
        {"Jet Airways", "JA566", "Newyork", "New jersey", "01:30", "4:30", "100.0", "Night", "2"},
        {"Jet Airways", "JA566", "New Jersey", "Vermont", "01:30", "4:30", "830.0", "Afternoon", "4"},
        {"Jet Airways", "JA566", "California", "Miami", "01:30", "4:30", "3900.0", "Afternoon", "4"},
        {"Qatar Airways", "QA3454", "Huston", "Ahmedabad", "01:30", "4:30", "100.0", "Morning", "4"},
        {"AirHaid Airways", "JA264", "Boston", "Dubai", "01:30", "4:30", "470.0", "Evening", "5"},
        {"Delta Airways", "DT65", "Huston", "London", "01:30", "4:30", "9270.0", "Afternoon", "4"},
        {"AirHaid Airways", "JA264", "Philadelphia", "France", "01:30", "4:30", "9300.0", "Night", "10"},
        {"Eitihad Airways", "EA445", "Huston", "Germany", "01:30", "4:30", "1230.0", "Morning", "4"},
        {"Delta Airways", "DT65", "Philadelphia", "Greece", "01:30", "4:30", "130.0", "Morning", "1"}
        };

        for (int i = 0; i < arr.length; i++) {
            Flight temp = new Flight();

            temp.setFlightOwner(arr[i][0]);
            temp.setFlightNumber(arr[i][1]);
            temp.setFlightSource(arr[i][2]);
            temp.setFlightDestination(arr[i][3]);
            temp.setFlightDepTime(arr[i][4]);
            temp.setFlightArrTime(arr[i][5]);
            temp.setFlightPrice(Double.parseDouble(arr[i][6]));
            temp.setFlightTimePhase(arr[i][7]);
            temp.setFlightDuration((int) Double.parseDouble(arr[i][8]));
            
            // setting objects
            Seats seats = new Seats();
            temp.setFlightSeats(seats);
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String dateInString = "16-10-2019";

            try {
                Date date = formatter.parse(dateInString);
                temp.setFlightDate(date);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Please enter date in dd-MM-yyyy format");
                return;
            }
            dirFlight.add(temp);
        }

    }

    public List<Flight> getFlightDir() {
        return dirFlight;
    }

    public void setFlightDir(List<Flight> flightDir) {
        this.dirFlight = dirFlight;
    }

    public void addFlight(Flight newFlight) {
        dirFlight.add(newFlight);
    }

    public Flight getFlights() {
        return flights;
    }

    public void setFlights(Flight flights) {
        this.flights = flights;
    }

    public AirlinerDirectory getAirDir() {
        return airDir;
    }

    public void setAirDir(AirlinerDirectory airDir) {
        this.airDir = airDir;
    }

    public ArrayList<Flight> searchMaster(String destination, String prefferedTimeCombo,String source, String date) {
        ArrayList<Flight> flightDirFiltered = new ArrayList<Flight>();
        for (Flight f : dirFlight) {
            String strDate = "";
            try {
                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                strDate = dateFormat.format(f.getFlightDate());
            } catch (Exception e) {
                 e.printStackTrace();
            }
            if (f.getFlightDestination().equals(destination)  && f.getFlightTimePhase().equals(prefferedTimeCombo) && f.getFlightSource().equals(source) && strDate.equals(date)) {
                flightDirFiltered.add(f);
            }
        }
        return flightDirFiltered;
    }
}
