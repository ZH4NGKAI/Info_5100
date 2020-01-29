/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mac
 */
public class Customer {
    private String fromPlace;
    private String toPlace;
    private String Name;
    private Ticket ticket;
    private int serialNum;
    private String travelDate;
    private int travelYear;
    private int travelMonth;
    private int travelDay;
    private String preferedTime;
    
    
    public Customer() {
        
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getTravelYear() {
        return travelYear;
    }

    public void setTravelYear(int travelYear) {
        this.travelYear = travelYear;
    }

    public int getTravelMonth() {
        return travelMonth;
    }

    public void setTravelMonth(int travelMonth) {
        this.travelMonth = travelMonth;
    }

    public int getTravelDay() {
        return travelDay;
    }

    public void setTravelDay(int travelDay) {
        this.travelDay = travelDay;
    }

    
    
    
    public String getPreferedTime() {
        return preferedTime;
    }

    public void setPreferedTime(String preferedTime) {
        this.preferedTime = preferedTime;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }
    
    
    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
}
