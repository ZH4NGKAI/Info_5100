/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.CustomerDirectory;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User implements Comparable<Customer>{
    
    private Date date;
    
    public Customer(String password, String userName) {
        super(password, userName, "CUSTOMER");
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public String getDate() {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        return ft.format(date);
    }
    
    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     *
     * @param password
     * @return
     */
    @Override
    public boolean verify(String password){
        return password.equals(getPassword());
    }

    @Override
    public int compareTo(Customer o) {
        return o.getUserName().compareTo(this.getUserName());
    }
    
}
