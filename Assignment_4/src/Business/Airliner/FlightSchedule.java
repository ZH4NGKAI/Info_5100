/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class FlightSchedule {
    private List<Flight> flightList;

    public FlightSchedule() {
        flightList = new ArrayList<>();
    }

    public List<Flight> getList() {
        return flightList;
    }

    public void deleteFlight(Flight flight) {
        flightList.remove(flight);
    }

    public void addFlight(Flight flight) {
        this.flightList.add(flight);
    }
}
