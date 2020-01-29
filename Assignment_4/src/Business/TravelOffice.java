/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author mac
 */
public class TravelOffice implements Comparable<TravelOffice>{
    private CustomerDirectory customerDirectory;
    private String location;
    private String password;
    private String name;
//    private MasterTravelSchedule mts;
    
    
    public TravelOffice(String name, String password) {
        this.name = name;
        this.password = password;
        customerDirectory = new CustomerDirectory();
    }

//    public MasterTravelSchedule getMts() {
//        return mts;
//    }
//
//    public void setMts(MasterTravelSchedule mts) {
//        this.mts = mts;
//    }
//    
    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public String getLocation() {
        return location;
    }
    
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }

    @Override
    public int compareTo(TravelOffice o) {
        return o.getName().compareTo(this.getName());
    }
    
    @Override
    public String toString() {
        return getName();
    }
}
