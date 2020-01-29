/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

import com.assignment5.analytics.AnalysisHelper;
import com.assignment5.analytics.DataStore;
import com.assignment5.entities.*;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author kasai
 */
public class GateWay {
    
    DataReader productReader;
    DataReader orderReader;
    AnalysisHelper helper;
    
    public GateWay() throws IOException {
        //DataGenerator generator = DataGenerator.getInstance();
        productReader = new DataReader("./ProductCatalogue.csv");
        orderReader = new DataReader("./SalesData.csv");
        helper = new AnalysisHelper();
    }
    
    private void generateSalesman(String[] row, Order order) {
        int salesmanId = Integer.parseInt(row[4]);
        Map<Integer, SalesPerson> salesmen = DataStore.getInstance()
                .getSalesmen();
        if (!salesmen.containsKey(salesmanId)) 
            salesmen.put(salesmanId, new SalesPerson(salesmanId));
        salesmen.get(salesmanId).getOrders().add(order);
    }
    
    private void generateCustomer(String[] row, Order order) {
        int customerId = Integer.parseInt(row[5]);
        Map<Integer, Customer> customers = DataStore.getInstance()
                .getCustomers();
        if (!customers.containsKey(customerId))
            customers.put(customerId, new Customer(customerId));
        customers.get(customerId).getOrders().add(order);
    }
    
    private Order generateOrder(String[] row) {
        int orderId = Integer.parseInt(row[0]);
        int customerId = Integer.parseInt(row[5]);
        int salesmanId = Integer.parseInt(row[4]);
        Item item = new Item(Integer.parseInt(row[2]), Integer.parseInt(row[6]), 
                Integer.parseInt(row[3]));
        Order order = new Order(orderId, salesmanId, customerId, item);
        DataStore.getInstance().getOrders().put(orderId, order);
        return order;
    }
    
    private void generateProduct(String[] row) {
        int productId = Integer.parseInt(row[0]);
        Product product = new Product(productId, Integer.parseInt(row[1]), 
                Integer.parseInt(row[2]), Integer.parseInt(row[3]));
        DataStore.getInstance().getProducts().put(productId, product);
        
    }
    
    private void readData() throws IOException{
        String[] row;
        while((row = productReader.getNextRow()) != null) {
            generateProduct(row);
        }
        while((row = orderReader.getNextRow()) != null) {
            Order order = generateOrder(row);
            generateCustomer(row, order);
            generateSalesman(row, order);
        }
    }
    
    private void runAnalysis() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 2d0703f315ab60e60d4ebb555b3ba307c6e7e57a
        helper.allCustomers();
        helper.allSalesmen();
        helper.findTop3NegotiatedProducts();
        helper.findTop3BestCustomer();
        helper.findTop3BestSalsPerson();
        helper.totalRevenue();
        helper.adjustPrice();
<<<<<<< HEAD
=======
=======
//        helper.allCustomers();
//        helper.allSalesmen();
        helper.bestThreeProducts();
        helper.bestThreeCustomers();
        Map<Integer,Integer> salesmenProfit = helper.bestThreeSalesmen();
        helper.totalRevenue(salesmenProfit);
        
>>>>>>> 9ad6f5e2f1993e9e1e4bfe544c73f4cd6dcd73dc
>>>>>>> 2d0703f315ab60e60d4ebb555b3ba307c6e7e57a
    }
    
    public static void main(String args[]) throws IOException{
        
        GateWay gw = new GateWay();
        gw.readData();
        gw.runAnalysis();
        
        //Below is the sample for how you can use reader. you might wanna 
        //delete it once you understood.
        
//        DataReader orderReader = new DataReader(generator.getOrderFilePath());
//        String[] orderRow;
//        printRow(orderReader.getFileHeader());
//        while((orderRow = orderReader.getNextRow()) != null){
//            printRow(orderRow);
//        }
//        System.out.println("_____________________________________________________________");
//        DataReader productReader = new DataReader(generator.getProductCataloguePath());
//        String[] prodRow;
//        printRow(productReader.getFileHeader());
//        while((prodRow = productReader.getNextRow()) != null){
//            printRow(prodRow);
//        }
    }
    
//    public static void printRow(String[] row){
//        for (String row1 : row) {
//            System.out.print(row1 + ", ");
//        }
//        System.out.println("");
//    }
    
}
