/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editoPlacer.
 */
package Business.Airliner;

import java.util.Date;

/**
 *
 * @author mac
 */
public class Flight {
    private String IATACode;
    private String fromPlace;
    private String toPlace;
    private int takeoffTime;
    private int landingTime;
    private String duration;
    private Airplane airplane;
    private Seat seats[][];
    private int avaiSeat;
    private int year;
    private int month;
    private int day;
    private String date;
    
    public Flight(Airplane airplane) {
        seats = new Seat[25][6];
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 6; j++)
                seats[i][j] = new Seat();
        }
        avaiSeat = 150;
        this.airplane = airplane;
    }

    public int getAvaiSeat() {
        return avaiSeat;
    }

    public void setAvaiSeat(int avaiSeat) {
        this.avaiSeat = avaiSeat;
    }

    

    
    public void setSeats(Seat[][] seats) {
        this.seats = seats;
    }

    public Seat[][] getSeats() {
        return seats;
    }

    
    public String getIATACode() {
        return IATACode;
    }

    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public int getTakeoffTime() {
        return takeoffTime;
    }

    public void setTakeoffTime(int takeoffTime) {
        this.takeoffTime = takeoffTime;
    }

    public int getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(int landingTime) {
        this.landingTime = landingTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
    
    @Override
    public String toString() {
        return this.getIATACode();
    }
    
    
}
