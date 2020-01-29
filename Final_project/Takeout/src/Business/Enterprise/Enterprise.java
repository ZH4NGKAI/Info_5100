/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author mac
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private float evaluation;
    private int evaluated_num;
    private String address;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public String getEvaluation() {
        return String.format("%.1f", this.evaluation);
    }
    public void setEvaluation(int evaluation) {
        this.evaluation = (this.evaluation*evaluated_num + evaluation)/(++evaluated_num);
    }
    
    public enum EnterpriseType{
        Restaurant("Restaurant"),
        DeliveryService("DeliveryService");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        evaluation = 0;
        evaluated_num = 0;
    }
}
