/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;

import com.assignment5.entities.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mac
 */
public class DataStore {
    private static DataStore dataStore;
    
    private Map<Integer, Customer> customers;
    private Map<Integer, SalesPerson> salesmen;
    private Map<Integer, Product> products;
    private Map<Integer, Order> orders;
    
    private DataStore() {
        this.customers = new HashMap<>();
        this.salesmen = new HashMap<>();
        this.products = new HashMap<>();
        this.orders = new HashMap<>();
    }
    
    public static DataStore getInstance() {
        if (dataStore == null)
            dataStore = new DataStore();
        return dataStore;
    }

    public static DataStore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataStore dataStore) {
        DataStore.dataStore = dataStore;
    }

    public Map<Integer, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    public Map<Integer, SalesPerson> getSalesmen() {
        return salesmen;
    }

    public void setSalesmen(Map<Integer, SalesPerson> salesmen) {
        this.salesmen = salesmen;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }
    
    
}
