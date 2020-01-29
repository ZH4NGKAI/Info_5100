/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class EnterpriseDirectory {
    private List<Enterprise> enterpriseList;
    private List<Enterprise> deliveryServiceList;
    private List<Enterprise> restaurantList;

    public List<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<>();
        deliveryServiceList = new ArrayList<>();
        restaurantList = new ArrayList<>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Restaurant){
            enterprise = new RestaurantEnterprise(name);
            enterpriseList.add(enterprise);
//            RestaurantEnterprise restaurant = (RestaurantEnterprise)enterprise;
            restaurantList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.DeliveryService){
            enterprise = new DeliveryServiceEnterprise(name);
            enterpriseList.add(enterprise);
//            DeliveryServiceEnterprise deliveryService = (DeliveryServiceEnterprise)enterprise;
            deliveryServiceList.add(enterprise);
        }
        return enterprise;
    }
    public boolean checkEnterpriseName(String name) {
        for (Enterprise ep: enterpriseList) {
            if (ep.getName().equals(name))
                return false;
        }
        return true;
    }
    
    public List<Enterprise> getDeliveryServiceList() {
        return deliveryServiceList;
    }
    
    public List<Enterprise> getRestaurantList() {
        return restaurantList;
    }
}
