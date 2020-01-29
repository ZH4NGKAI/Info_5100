/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Food.FoodDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class RestaurantEnterprise extends Enterprise{
    private FoodDirectory foodDirectory;
    private int sales;
    public RestaurantEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Restaurant);
        this.foodDirectory = new FoodDirectory();
        sales = 0;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public FoodDirectory getFoodDirectory() {
        return foodDirectory;
    }

    public int getSales() {
        return sales;
    }

    public void addSales() {
        this.sales += 1;
    }
}
