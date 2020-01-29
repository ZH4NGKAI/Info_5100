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
//Restaurant send delivery request to delivery service company
public class DeliveryWorkRequest extends WorkRequest{
    private OrderWorkRequest orderWorkRequest;
    
    public DeliveryWorkRequest(OrderWorkRequest orderWorkRequest){
        this.orderWorkRequest=orderWorkRequest;
    }

    public OrderWorkRequest getOrderWorkRequest() {
        return orderWorkRequest;
    }
}
