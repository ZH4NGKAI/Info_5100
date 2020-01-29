/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mac
 */
public abstract class WorkRequest {
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    static private DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    public WorkRequest(){
        requestDate = new Date();
        
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestDate() {
        return format.format(requestDate);
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getResolveDate() {
        return format.format(resolveDate);
    }

    public void setResolveDate() {
        this.resolveDate = new Date();
    }
    
    @Override
    public String toString() {
        return this.getRequestDate();
    }
}
