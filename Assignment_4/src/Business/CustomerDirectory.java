/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mac
 */
public class CustomerDirectory {
    private List<Customer> customerList;
    static int count = 0;
    public CustomerDirectory() {
        customerList = new ArrayList<>();
        
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer addCustomer() {
        Customer cus = new Customer();
        count++;
        cus.setSerialNum(count);
        customerList.add(cus);
        return cus;
    }
}
