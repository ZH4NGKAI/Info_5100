/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

/**
 *
 * @author mac
 */
public class Airliner implements Comparable<Airliner>{
    private String name;
    private Fleet fleet;
    private FlightSchedule flightSchedule;

    public Airliner(String name) {
        this.name = name;
        fleet = new Fleet();
        flightSchedule = new FlightSchedule();
    }

    public Fleet getFleet() {
        return fleet;
    }

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }
    
    public void addAirplane(Airplane airplane) {
        fleet.addAirplane(airplane);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Airliner o) {
        return o.getName().compareTo(this.getName());
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
    
    public void deleteFlight(Flight flight) {
        this.getFlightSchedule().deleteFlight(flight);
        
    }
            
    public void addFlight(Flight flight) {
        this.getFlightSchedule().addFlight(flight);
    }
}
