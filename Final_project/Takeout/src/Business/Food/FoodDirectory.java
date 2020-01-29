/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Food;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class FoodDirectory {
    private List<Food> foodList;

    public FoodDirectory() {
        foodList = new ArrayList<>();
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public Food createFood(String name, float price) {
        Food food = new Food(name, price);
        foodList.add(food);
        return food;
    }
    
    public void purchaseFood(Food food) {
        foodList.add(food);
        food.addSales();
    }
    
    public void cancelOrderFood(Food food) {
        foodList.remove(food);
        food.delSales();
    }
}
