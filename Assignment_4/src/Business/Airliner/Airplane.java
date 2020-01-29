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
public class Airplane implements Comparable<Airplane>{
    private String airplaneCode;//like HU7576
    private String Type; //like Boeing-747
    private int seatNum;
    private String manufactuer;//like Boeing
    private int produced;// produced year
    private long fuelCapacity;//how much gallons of fuel can it carry

    public Airplane(String IATACode) {
        this.airplaneCode = IATACode;
    }

    
    public String getAirplaneCode() {
        return airplaneCode;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getManufactuer() {
        return manufactuer;
    }

    public void setManufactuer(String manufactuer) {
        this.manufactuer = manufactuer;
    }

    public int getProduced() {
        return produced;
    }

    public void setProduced(int produced) {
        this.produced = produced;
    }

    public long getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(long fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    
    @Override
    public int compareTo(Airplane o) {
        return o.getAirplaneCode().compareTo(this.getAirplaneCode());
    }

    void setAirplaneCode(String airplaneCode) {
        this.airplaneCode =  airplaneCode;//To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return this.getAirplaneCode();
    }
}
