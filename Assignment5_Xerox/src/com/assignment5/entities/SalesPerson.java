/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kasai
 */
public class SalesPerson {
    private int salesId;
    private List<Order> orders;
    
    
    public SalesPerson(int salesId) {
        this.salesId = salesId;
        orders = new ArrayList<>();
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    
    @Override
    public String toString() {
        return "Salesman{" + "salesId = " + salesId  + 
                ", no. of orders = " + orders.size() + '}';
    }
}
