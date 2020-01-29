/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Employee.Employee;
import Business.Organization.CustomerOrganization;
import Business.Organization.DeliveryAdminOrganization;
import Business.Organization.DeliveryGuyOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.CustomerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class DeliveryServiceEnterprise extends Enterprise{
    private Organization customerOrganization;
    public DeliveryServiceEnterprise(String name){
        super(name,Enterprise.EnterpriseType.DeliveryService);
        customerOrganization = this.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
    }
    
    public UserAccount addCustomer(String username, String password) {
        return customerOrganization.getUserAccountDirectory().createUserAccount(username, password, new Employee(), (Role)new CustomerRole());
    }
    
    public boolean checkCustomerName(String username) {
        return customerOrganization.getUserAccountDirectory().checkIfUsernameIsUnique(username);
    }

    public Organization getCustomerOrganization() {
        return customerOrganization;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
