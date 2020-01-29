/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Airliner.Seat;

/**
 *
 * @author mac
 */
public class Ticket {
    private Customer customer;
    private Seat seat;
    public Ticket(Customer customer, Seat seat) {
        this.customer = customer;
        this.seat = seat;
    }
    
    
}
