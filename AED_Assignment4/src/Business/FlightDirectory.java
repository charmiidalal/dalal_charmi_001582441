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
import java.util.Calendar;
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
        dirFlight = new ArrayList<>();
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
            Flight flight = new Flight();

            flight.setFlightOwner(arr[i][0]);
            flight.setFlightNumber(arr[i][1]);
            flight.setFlightSource(arr[i][2]);
            flight.setFlightDestination(arr[i][3]);
            flight.setFlightDepTime(arr[i][4]);
            flight.setFlightArrTime(arr[i][5]);
            flight.setFlightPrice(Double.parseDouble(arr[i][6]));
            flight.setFlightTimePhase(arr[i][7]);
            flight.setFlightDuration((int) Double.parseDouble(arr[i][8]));
            
            // setting objects
            Seats seats = new Seats();
            flight.setFlightSeats(seats);
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String dateInString = "31-10-2020";
            try {
                Date date = formatter.parse(dateInString);
                flight.setFlightDate(date);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Please enter date in dd-MM-yyyy format");
                return;
            }
            dirFlight.add(flight);
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
        ArrayList<Flight> flightDirFiltered = new ArrayList<>();
        dirFlight.forEach((f) -> {
            String strDate = "";
            try {
                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                strDate = dateFormat.format(f.getFlightDate());
            } catch (Exception e) {
            }
            if (f.getFlightDestination().equalsIgnoreCase(destination)  && f.getFlightTimePhase().equals(prefferedTimeCombo) && f.getFlightSource().equalsIgnoreCase(source) && strDate.equals(date)) {
                flightDirFiltered.add(f);
            }
        });
        return flightDirFiltered;
    }
}
