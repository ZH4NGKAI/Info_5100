/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author mac
 */
public class Network {
    private String location;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return location;
    }
}
