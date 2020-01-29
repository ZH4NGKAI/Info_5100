/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Food;

import java.awt.Image;


/**
 *
 * @author mac
 */
public class Food {
    private String name;
    private float price;
    private float evaluate;
    private int sales;
    private int evaluated_num;
    private String imgPath;

    public Food(String name, float price) {
        this.name = name;
        this.price = price;       
        sales = 0;
        evaluated_num = 0;
        evaluate = 0;
        imgPath = "";
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getEvaluate() {
        return String.format("%.1f",this.evaluate);
    }

    public void setEvaluate(int evaluate) {
        this.evaluate = (this.evaluate*evaluated_num + evaluate)/(++evaluated_num); 
    }

    public int getSales() {
        return sales;
    }

    public void addSales() {
        sales++;
    }
    
    public void delSales() {
        sales--;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
