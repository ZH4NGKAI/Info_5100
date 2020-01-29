/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tusiyu
 */
public class CarInformationList {
    
    private static CarInformationList carLists;
    public List<Car> carList;
    public Date date;
    
    private CarInformationList(){
        
        carList = new ArrayList<>();
        
        Car car1 = new Car(true, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true);
        Car car2 = new Car(true, "BMW", 2019, 1, 4, 2, "X1", "New York", true);
        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true);
        Car car4 = new Car(true, "GM", 2018, 1, 4, 4, "G1", "New York", true);
        Car car5 = new Car(true, "Toyota", 2017, 1, 4, 5, "T2", "Chicago", false);
        Car car6 = new Car(true, "GM", 2017, 1, 4, 6, "G2", "Chicago", true);
        Car car7 = new Car(true, "Ferrari", 2016, 1, 4, 7, "V8", "Seattle", true);
        Car car8 = new Car(true, "BMW", 2016, 1, 4, 8, "X2", "Seattle", true);
        Car car9 = new Car(true, "Toyota", 2019, 1, 4, 9, "T3", "Austin", true);
        Car car10 = new Car(true, "GM", 2019, 1, 4, 10, "G3", "Austin", false);
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        date = new Date();
    }
    

    public static CarInformationList  getCarList() {
        carLists = new CarInformationList();
        return carLists;
    }
    
    public Car addCar() {
        Car car = new Car();
        carList.add(car);
        date = new Date();
        return car;
    }
    
}
