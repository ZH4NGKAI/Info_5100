/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;

import com.assignment5.entities.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
<<<<<<< HEAD
=======
import java.util.Map.Entry;
>>>>>>> 2d0703f315ab60e60d4ebb555b3ba307c6e7e57a

/**
 *
 * @author mac
 */
public class AnalysisHelper {

    public void allCustomers() {
        Map<Integer, Customer> customers = DataStore.getInstance().getCustomers();
        List<Customer> customerList = new ArrayList<>(customers.values());
        Collections.sort(customerList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getCustomerId() - o2.getCustomerId();
            }
        });
        
        System.out.println("--------all customers--------");
        for (Customer c: customerList) 
            System.out.println(c);
    }

    public void allSalesmen() {
        Map<Integer, SalesPerson> salesmen = DataStore.getInstance().getSalesmen();
        List<SalesPerson> salesmanList = new ArrayList<>(salesmen.values());
        Collections.sort(salesmanList, new Comparator<SalesPerson>() {
            @Override
            public int compare(SalesPerson o1, SalesPerson o2) {
                return o1.getSalesId()- o2.getSalesId();
            }
        });
        System.out.println("\n"+"--------all salesman--------");
        for (SalesPerson s: salesmanList) 
            System.out.println(s);
    }
    
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 2d0703f315ab60e60d4ebb555b3ba307c6e7e57a
    //1) Our top 3 best negotiated products (meaning products that sell above target)
    //Sales quantity of the product sold above the target price.
    public void findTop3NegotiatedProducts(){
        Map<Integer,Order> order = DataStore.getInstance().getOrders();
        List<Order> orderList = new ArrayList<>(order.values());
        
        Map<Integer,Product> product = DataStore.getInstance().getProducts();
        List<Product> productList = new ArrayList<>(product.values());
        
        List<Item> itemList = new ArrayList<>();
        
        //add items with price >= target
        for(int i=0;i<orderList.size();i++){
            Item t = orderList.get(i).getItem();
            //System.out.println(productList.get(t.getProductId()).getTargetPrice());
            if(t.getSalesPrice()>=productList.get(t.getProductId()).getTargetPrice()){
                if(!itemList.contains(t)) itemList.add(t);
            }
        }
        
        //count product
        Map<Integer,Integer> productCount=new HashMap<>();
        for(Item t:itemList){
            int thisQuantity = t.getQuantity();
            if(productCount.containsKey(t.getProductId())){
                productCount.put(t.getProductId()
                        , productCount.get(t.getProductId())+thisQuantity);
            }else if(!productCount.containsKey(t.getProductId()))
                productCount.put(t.getProductId(), thisQuantity);
        }
        
        //sort product
        //to list
        List<Map.Entry<Integer, Integer>> list = 
                new ArrayList<Map.Entry<Integer, Integer>>(productCount.entrySet());
        
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
          public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
              return o2.getValue().compareTo(o1.getValue());
          }
      });
        
        //print
        int num=0; //to move from one  duplicate to next
        int i=0;
        int count =0;  // to count duplicate 
        System.out.println("\n");
        System.out.println("-------------3 Best best negotiated products-------------");
        while(num<3){
           int rank= num+1;
           if(list.get(i).getValue()!=list.get(i+1).getValue()){
               num++;
               count =0;
           }
               
           if(count==0){
               System.out.println("No. "+rank+" best sell product "
                   +list.get(i).getKey()
                   +" Quantity is "+list.get(i).getValue());
           }
           else if(count!=0){
               System.out.println("     "+" best sell product "
                   +list.get(i).getKey()
                   +" Quantity is "+list.get(i).getValue());
           }
               
           
           i++;
           count++;
       }
        
    }
    
    //2) Our 3 best customers (customers who buy about target price)
    //Sum of absolute value of the difference between the sale price and target price of
    //the products this customer bought.
    
    public void findTop3BestCustomer(){
        Map<Integer,Order> order=DataStore.getInstance().getOrders();      
        List<Order> orderlist=new ArrayList<>(order.values());
        
        Map<Integer,Product> product = DataStore.getInstance().getProducts();
        List<Product> productList = new ArrayList<>(product.values());
        
        Map<Integer,Integer> customerCount=new HashMap<>();
        
        //customer count
        for(Order o:orderlist){
            Item t = o.getItem();
            int Diff=Math.abs(t.getSalesPrice()
                    -productList.get(t.getProductId()).getTargetPrice())*t.getQuantity();   
            //System.out.println(t.getSalesPrice()+" "+productList.get(t.getProductId()).getTargetPrice());
            
            
            if(customerCount.containsKey(o.getCustomerId())){
                customerCount.put(o.getCustomerId()
                        , customerCount.get(o.getCustomerId())+Diff);
            }else if(!customerCount.containsKey(o.getCustomerId()))
                customerCount.put(o.getCustomerId(), Diff);
            
        
        }
        
        //sort
        //to list
        List<Map.Entry<Integer, Integer>> list = 
                new ArrayList<Map.Entry<Integer, Integer>>(customerCount.entrySet());
        
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
          public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
              return o1.getValue().compareTo(o2.getValue());
          }
      });
       
       //print
       int num=0; //to move from one  duplicate to next
       int i=0;
       int count =0;  // to count duplicate 
       System.out.println("\n");
       System.out.println("-------------3 Best Customers-------------");
       while(num<3){
           int rank= num+1;
           if(list.get(i).getValue()!=list.get(i+1).getValue()){
               num++;
               count=0;
           } 
           if(count==0){
               System.out.println("No. "+rank+" Best Customer is "+list.get(i).getKey()
                   +" Sum of Differenct is "+list.get(i).getValue());
           }
           else if(count!=0){
               System.out.println("     "+" Best Customer is "+list.get(i).getKey()
                   +" Sum of Differenct is "+list.get(i).getValue());
           }
           
           i++;
           count++;
       }
    
    }
    
    //3) Our top 3 best sales people (sell higher that target)
    //3 sales people who have the most profit
    //Profit of a product = (sale price - target price) * sale quantity
    
    public void findTop3BestSalsPerson(){
        Map<Integer,Order> order=DataStore.getInstance().getOrders();
        List<Order> orderlist=new ArrayList<>(order.values());
        
        Map<Integer,Product> product = DataStore.getInstance().getProducts();
        List<Product> productList = new ArrayList<>(product.values());
        
        Map<Integer,Integer> salesPersonCount=new HashMap();
        
        //count salesperson
        for(Order o:orderlist){
            Item t = o.getItem();
            int profit=(t.getSalesPrice()
                    -productList.get(t.getProductId()).getTargetPrice())
                    *t.getQuantity();
            if(salesPersonCount.containsKey(o.getSupplierId())){
                salesPersonCount.put(o.getSupplierId()
                        , salesPersonCount.get(o.getSupplierId())+profit);
            }else salesPersonCount.put(o.getSupplierId(), profit);
        }
        
        //sort
        //to list
        List<Map.Entry<Integer, Integer>> list = 
                new ArrayList<Map.Entry<Integer, Integer>>(salesPersonCount.entrySet());
        
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
          public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
              return o2.getValue().compareTo(o1.getValue());
          }
      });
        
        //print
        System.out.println("\n");
        System.out.println("-------------3 Best Sales Persons-------------");
        int num=0; //to move from one  duplicate to next
        int i=0;
        int count =0;  // to count duplicate 
        while(num<3){
            int rank= num+1;
            if(list.get(i).getValue()!=list.get(i+1).getValue()){
                num++;
                count = 0;
            } 
            if(count==0){
                System.out.println("No. "+rank+" Best Sales Persons "
                    +list.get(i).getKey()+" Profit is "+list.get(i).getValue());
            }
            else if(count!=0){
                System.out.println("     "+" Best Sales Persons "
                    +list.get(i).getKey()+" Profit is "+list.get(i).getValue());
            }
            
            i++;
            count++;
        }
    }
    
    //4) Our total revenue for the year that is above expected target
    //Sum of the profits made by every sales people.
    public void totalRevenue(){
        Map<Integer,Order>order=DataStore.getInstance().getOrders();
        List<Order> orderlist=new ArrayList<>(order.values());
        
        Map<Integer,Product> product = DataStore.getInstance().getProducts();
        List<Product> productList = new ArrayList<>(product.values());
        
        int profit=0;
        for(int i=0;i<orderlist.size();i++){
            Item t = orderlist.get(i).getItem();
            profit+=t.getQuantity()
                    *(t.getSalesPrice()
                    -productList.get(t.getProductId()).getTargetPrice());
        }
        System.out.println("\n");
        System.out.println("-------------Total Revenue-------------");
        System.out.println("Total Revenue is "+profit);
    }
    
    public void adjustPrice(){
        Map<Integer,Order> order=DataStore.getInstance().getOrders();
        List<Order> orderlist=new ArrayList<>(order.values());
        
        Map<Integer,Product> product = DataStore.getInstance().getProducts();
        List<Product> productList = new ArrayList<>(product.values());
        
        Map<Integer,Integer> sumPrice=new HashMap();
        Map<Integer,Integer> countPrice=new HashMap();
        Map<Integer,Double> averagePrice=new HashMap();
        Map<Integer,Double> absDiffPrice=new HashMap();
        Map<Integer,Double> diffPrice=new HashMap();
        Map<Integer,Double> errorPrice=new HashMap();
        
        
        //sum
        for(Order o:orderlist){
            Item t = o.getItem();
            int saleprice=t.getSalesPrice()*t.getQuantity();
            if(sumPrice.containsKey(t.getProductId())){
                sumPrice.put(t.getProductId()
                        , sumPrice.get(t.getProductId())+saleprice);
            }else sumPrice.put(t.getProductId(), saleprice);
        }
        
        //count
        for(Order o:orderlist){
            Item t = o.getItem();
            int countprice=t.getQuantity();
            if(countPrice.containsKey(t.getProductId())){
                countPrice.put(t.getProductId()
                        , countPrice.get(t.getProductId())+countprice);
            }else countPrice.put(t.getProductId(), countprice);
        }
        
        //average
        for(int i =0;i<sumPrice.size();i++){            
            Double averageprice = sumPrice.get(i)*1.000/countPrice.get(i)*1.000;
            averageprice=(double) Math.round(averageprice * 1000) / 1000;
            
            if(!averagePrice.containsKey(i)){
                averagePrice.put(i,averageprice);     
            }
        }

        
        //abs difference between target and average
        for(int i =0;i<averagePrice.size();i++){
            Double target = productList.get(i).getTargetPrice()*1.000;
            Double absdiffprice = Math.abs(target-averagePrice.get(i));
            absdiffprice=(double) Math.round(absdiffprice * 1000) / 1000;
            
            if(!absDiffPrice.containsKey(i)){
                absDiffPrice.put(i,absdiffprice);     
            }
        }
        
        //difference between target and average
        for(int i =0;i<averagePrice.size();i++){
            Double target = productList.get(i).getTargetPrice()*1.000;
            Double diffprice = target-averagePrice.get(i);
            diffprice=(double) Math.round(diffprice * 1000) / 1000;
            
            if(!diffPrice.containsKey(i)){
                diffPrice.put(i,diffprice);     
            }
        }
        
        
        //error
        for(int i =0;i<absDiffPrice.size();i++){
            //Double diff = productList.get(i).getTargetPrice()*1.000-averagePrice.get(i);
            Double diff = diffPrice.get(i);
            Double errorprice = diff/averagePrice.get(i);
            errorprice=(double) Math.round(errorprice * 1000) / 1000;
            
            if(!errorPrice.containsKey(i)){
                errorPrice.put(i,errorprice);     
            }
        }
        
        //sort by difference
        //to list
        List<Map.Entry<Integer, Double>> list = 
                new ArrayList<Map.Entry<Integer, Double>>(diffPrice.entrySet());
        
        list.sort(new Comparator<Map.Entry<Integer, Double>>() {
          public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
              return o2.getValue().compareTo(o1.getValue());
          }
      });
        
        
        //print
        System.out.println("\n");
        System.out.println("-------------Origin price-------------");
        
        System.out.println("price don't need to be modified: ");
        for(int i = 0; i<list.size();i++){
            int key = list.get(i).getKey();            
            String needModify= "";
            if(errorPrice.get(key) >=-0.05 && errorPrice.get(key)<=0.05){
                needModify="No";
                
                System.out.println("ProductID: "+key+"\t"                    
                    +" average price: "+averagePrice.get(key)+"\t"
                    +" target price: "+productList.get(key).getTargetPrice()+"\t"
                    +" difference: "+diffPrice.get(key)+"\t"
                    +" abs difference: "+absDiffPrice.get(key)+"\t"
                    +" error: "+errorPrice.get(key)+"\t"
                    +" error bigger than 5%?: "+needModify
                    );
            }
        }
        
        System.out.println("\n"+"price need to be modified: ");
        for(int i = 0; i<list.size();i++){
            int key = list.get(i).getKey();
            String needModify= "";
            if (errorPrice.get(key) <-0.05 || errorPrice.get(key)>0.05){
                needModify="Yes";
                System.out.println("ProductID: "+key+"\t"                    
                    +" average price: "+averagePrice.get(key)+"\t"
                    +" target price: "+productList.get(key).getTargetPrice()+"\t"
                    +" difference: "+diffPrice.get(key)+"\t"
                    +" abs difference: "+absDiffPrice.get(key)+"\t"
                    +" error: "+errorPrice.get(key)+"\t"
                    +" error bigger than 5%?: "+needModify
                    );
            }
        }
        
        System.out.println("\n"+"-------------modified price-------------");
        Map<Integer,Double> adjustTargetPrice=new HashMap();
        Map<Integer,Double> adjustAbsDiffPrice=new HashMap();
        Map<Integer,Double> adjustDiffPrice=new HashMap();
        Map<Integer,Double> adjustErrorPrice=new HashMap();
        
        //target adjustment + - 5%
        //target lower than average and <-5%: +5%
        //target higher than average and >5%: -5%
        
        for(int i = 0; i< errorPrice.size();i++){
            Double errorprice=errorPrice.get(i);
            
            int target = productList.get(i).getTargetPrice();
            
            if(errorprice<-0.05){
                if(!adjustTargetPrice.containsKey(i)){
                    adjustTargetPrice.put(i,(double) Math.round(target*1.050 * 1000) / 1000);
                }
            }
            else if(errorprice>0.05){
                if(!adjustTargetPrice.containsKey(i)){
                    adjustTargetPrice.put(i, (double) Math.round(target*0.950 * 1000) / 1000);
                }
            }
            else{
                if(!adjustTargetPrice.containsKey(i)){
                    adjustTargetPrice.put(i, (double) Math.round(target*1.000 * 1000) / 1000);
                }
            }
        }
        
        //adjust abs diff
        for(int i = 0;i<adjustTargetPrice.size();i++){
            Double adjustTarget = adjustTargetPrice.get(i);
            Double adjustDiff = Math.abs(adjustTarget - averagePrice.get(i));
            adjustDiff=(double) Math.round(adjustDiff * 1000) / 1000;
            
            if(!adjustAbsDiffPrice.containsKey(i)){
                adjustAbsDiffPrice.put(i, adjustDiff);
            }
            
        }
        
        //adjust diff
        for(int i = 0;i<adjustTargetPrice.size();i++){
            Double adjustTarget = adjustTargetPrice.get(i);
            Double adjustDiff = adjustTarget - averagePrice.get(i);
            adjustDiff=(double) Math.round(adjustDiff * 1000) / 1000;
            
            if(!adjustDiffPrice.containsKey(i)){
                adjustDiffPrice.put(i, adjustDiff);
            }
            
        }
        
        //adjust error
        for(int i = 0;i<adjustDiffPrice.size();i++){
            Double diff = adjustDiffPrice.get(i);
            Double errorprice = diff/averagePrice.get(i);
            errorprice=(double) Math.round(errorprice * 1000) / 1000;
            
            if(!adjustErrorPrice.containsKey(i)){
                adjustErrorPrice.put(i,errorprice);     
            }
            
        }
        
        
        //sort by difference
        //to list
        List<Map.Entry<Integer, Double>> adjustlist = 
                new ArrayList<Map.Entry<Integer, Double>>(adjustDiffPrice.entrySet());
        
        list.sort(new Comparator<Map.Entry<Integer, Double>>() {
          public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
              return o2.getValue().compareTo(o1.getValue());
          }
      });
        
        
        //print
        
        System.out.println("price don't need to be modified: ");
        for(int i = 0; i<adjustlist.size();i++){
            int key = adjustlist.get(i).getKey();            
            String needModify= "";
            if(adjustErrorPrice.get(key) >=-0.05 && adjustErrorPrice.get(key)<=0.05){
                needModify="No";
                
                System.out.println("ProductID: "+key+"\t"                    
                    +" average price: "+averagePrice.get(key)+"\t"
                    +" target price: "+adjustTargetPrice.get(key)+"\t"
                    +" difference: "+adjustDiffPrice.get(key)+"\t"
                    +" abs difference: "+adjustAbsDiffPrice.get(key)+"\t"
                    +" error: "+adjustErrorPrice.get(key)+"\t"
                    +" error bigger than 5%?: "+needModify
                    );
            }
        }
        
        System.out.println("\n"+"price need to be modified: ");
        for(int i = 0; i<adjustlist.size();i++){
            int key = adjustlist.get(i).getKey();
            String needModify= "";
            if (adjustErrorPrice.get(key) <-0.05 || adjustErrorPrice.get(key)>0.05){
                needModify="Yes";
                System.out.println("ProductID: "+key+"\t"                    
                    +" average price: "+averagePrice.get(key)+"\t"
                    +" target price: "+adjustTargetPrice.get(key)+"\t"
                    +" difference: "+adjustDiffPrice.get(key)+"\t"
                    +" abs difference: "+adjustAbsDiffPrice.get(key)+"\t"
                    +" error: "+adjustErrorPrice.get(key)+"\t"
                    +" error bigger than 5%?: "+needModify
                    );
            }
        }
        
        
        
        
        
    }
    
    
    
<<<<<<< HEAD
=======
=======
    public void bestThreeProducts() {
        List<Order> orders = new ArrayList<>(DataStore.getInstance()
                .getOrders().values());
        Map<Integer, Integer> productAboveTarget = new HashMap<>();
        Map<Integer, Product> products = DataStore.getInstance().getProducts();
        for (Order o: orders) {
            Item i = o.getItem();
            int productId = i.getProductId();
            int targetPrice = products.get(productId).getTargetPrice();
            if (i.getSalesPrice() > targetPrice) {
                int quantity = productAboveTarget.getOrDefault(productId, 0);
                quantity += i.getQuantity();
                productAboveTarget.put(productId, quantity);
            }
        }
        List<Entry<Integer, Integer>> productList 
                = new ArrayList<>(productAboveTarget.entrySet());
        Collections.sort(productList, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                int c = o2.getValue() - o1.getValue();
                return  c != 0? c : o1.getKey()-o2.getKey();
            }
        });
        
        System.out.println("\nOur top 3 best negotiated products: ");
        int i = 0;
        int temp = 0;
        for (Entry<Integer, Integer> entry: productList) {
            if (temp != entry.getValue()) {
                i++;
                if(i > 3)
                    break;
                temp = entry.getValue();
                System.out.println(i + ". Product " + entry.getKey() +
                    ", sale quantity above target price: " + entry.getValue());
            }
            else {
                System.out.println("   Product " + entry.getKey() +
                    ", sale quantity above target price: " + entry.getValue());
            }
                
        }
        
    }
    
    public void bestThreeCustomers() {
        Map<Integer, Integer> customerDiffCount = new HashMap<>();
        List<Customer> customers= new ArrayList<>(DataStore.getInstance()
                .getCustomers().values());
        Map<Integer, Product> products = DataStore.getInstance().getProducts();
        for (Customer c: customers) {
            int diff = 0;
            for (Order o: c.getOrders()) {
                Item item = o.getItem();
                diff += item.getQuantity() * (Math.abs(item.getSalesPrice() 
                        - products.get(item.getProductId()).getTargetPrice()));
            }
            customerDiffCount.put(c.getCustomerId(), diff);
        }
        
        List<Entry<Integer, Integer>> customerList 
                = new ArrayList<>(customerDiffCount.entrySet());
        Collections.sort(customerList, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                int c = o1.getValue() - o2.getValue();
                return  c != 0? c : o1.getKey()-o2.getKey();
            }
        });
        
        System.out.println("\nOur top 3 best customers: ");
        int i = 0;
        int temp = 0;
        for (Entry<Integer, Integer> entry: customerList) {
            if (temp != entry.getValue()) {
                i++;
                if(i > 3)
                    break;
                temp = entry.getValue();
                System.out.println(i + ". Customer " + entry.getKey() +
                    ", sum of price diff: " + entry.getValue());
            }
            else {
                System.out.println("   Customer " + entry.getKey() +
                    ", sum of price diff: " + entry.getValue());
            }     
        }
    }
    
    public Map<Integer,Integer> bestThreeSalesmen() {
        Map<Integer, Integer> salesmenProfit = new HashMap<>();
        List<SalesPerson> salesmen= new ArrayList<>(DataStore.getInstance()
                .getSalesmen().values());
        Map<Integer, Product> products = DataStore.getInstance().getProducts();
        for (SalesPerson s: salesmen) {
            int profit = 0;
            for (Order o: s.getOrders()) {
                Item item = o.getItem();
                profit += item.getQuantity() * (item.getSalesPrice() 
                        - products.get(item.getProductId()).getTargetPrice());
            }
            salesmenProfit.put(s.getSalesId(), profit);
        }
        
        List<Entry<Integer, Integer>> salesmanList 
                = new ArrayList<>(salesmenProfit.entrySet());
        Collections.sort(salesmanList, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                int c = o2.getValue() - o1.getValue();
                return  c != 0? c : o1.getKey()-o2.getKey();
            }
        });
        
        System.out.println("\nOur top 3 best salesman: ");
        int i = 0;
        int temp = 0;
        for (Entry<Integer, Integer> entry: salesmanList) {
            if (temp != entry.getValue()) {
                i++;
                if(i > 3)
                    break;
                temp = entry.getValue();
                System.out.println(i + ". Salesman " + entry.getKey() +
                    ", sum of profit: " + entry.getValue());
            }
            else {
                System.out.println("   Salesman " + entry.getKey() +
                    ", sum of profit: " + entry.getValue());
            }     
        }
        return salesmenProfit;
    }
    
    public void totalRevenue(Map<Integer, Integer> salesmenProfit) {
        int sum = 0;
        for(Integer i: salesmenProfit.values())
            sum += i;
        System.out.println("\nOur total revenue for the year "
                + "that is above expected target: " + sum);
    }
    
//    public void 
>>>>>>> 9ad6f5e2f1993e9e1e4bfe544c73f4cd6dcd73dc
>>>>>>> 2d0703f315ab60e60d4ebb555b3ba307c6e7e57a
}
