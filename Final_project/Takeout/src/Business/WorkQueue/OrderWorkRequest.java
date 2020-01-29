/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Food.FoodDirectory;
import Business.Enterprise.DeliveryServiceEnterprise;
import Business.Enterprise.RestaurantEnterprise;
import java.util.Random;

/**
 *
 * @author mac
 */
//Customer send order to restaurant
public class OrderWorkRequest extends WorkRequest{
    private FoodDirectory foodDirectory;
    private DeliveryServiceEnterprise deliveryService;
    private RestaurantEnterprise restaurant;
    private int foodEvalutaion;
    private int deliveryEvaluation;
    private float total;
    private int orderId;
    
    public OrderWorkRequest(DeliveryServiceEnterprise deliveryService, RestaurantEnterprise restaurant) {
        this.deliveryService = deliveryService;
        this.restaurant = restaurant;
        this.foodDirectory = new FoodDirectory();
        this.setStatus("Restaurant Get The Order");
        this.orderId = setOrderId();
    }

    private int setOrderId() {
        StringBuilder str=new StringBuilder();
        Random random=new Random();

        for(int i=0;i<4;i++){
            str.append(random.nextInt(10));
        }
        return Integer.parseInt(str.toString());
    }
    
    public int getOrderId() {
        return orderId;
    }

    
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    
    public FoodDirectory getFoodDirectory() {
        return foodDirectory;
    }

    public void setFoodDirectory(FoodDirectory foodDirectory) {
        this.foodDirectory = foodDirectory;
    }

    public DeliveryServiceEnterprise getDeliveryService() {
        return deliveryService;
    }

    public void setDeliveryService(DeliveryServiceEnterprise deliveryService) {
        this.deliveryService = deliveryService;
    }

    public RestaurantEnterprise getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantEnterprise restaurant) {
        this.restaurant = restaurant;
    }

    public int getFoodEvalutaion() {
        return foodEvalutaion;
    }

    public void setFoodEvalutaion(int foodEvalutaion) {
        this.foodEvalutaion = foodEvalutaion;
    }

    public int getDeliveryEvaluation() {
        return deliveryEvaluation;
    }

    public void setDeliveryEvaluation(int deliveryEvaluation) {
        this.deliveryEvaluation = deliveryEvaluation;
    }
    
}
