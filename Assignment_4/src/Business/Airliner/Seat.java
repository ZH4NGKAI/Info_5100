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
public class Seat {
    private boolean available;
    private double price;

    public Seat() {
        this.available = true;
        this.price = 500.00;
    }
    
    public boolean isBooked() {
        return available;
    }

    public void setBooked(boolean available) {
        this.available = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    @Override
    public String toString() {
        if (this.available)
            return "O";
        else 
            return "X";
    }
}
