/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author mac
 */
public abstract class Role {
    private RoleType roleType; 
    public enum RoleType{
        DeliveryAdmin("Delivery Admin"),
        Customer("Customer"),
        Chef("Chef"),
        DeliveryGuy("Delivery Guy");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Network network,
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    public RoleType getRoleType() {
          return roleType;   
    }
    
    public void setRoleType(RoleType roleType){
        this.roleType=roleType;
    }
}
