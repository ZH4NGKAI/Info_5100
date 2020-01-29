/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author mac
 */
//restaurant admin send cook request to one of their chef
public class CookWorkRequest extends WorkRequest{
    private OrderWorkRequest orderWorkRequest;
    
    public CookWorkRequest(OrderWorkRequest orderWorkRequest){
        this.orderWorkRequest=orderWorkRequest;
    }

    public OrderWorkRequest getOrderWorkRequest() {
        return orderWorkRequest;
    }
    
    
    
}
