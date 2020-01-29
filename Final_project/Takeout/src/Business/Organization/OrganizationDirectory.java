/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Admin.getValue())){
            organization = new DeliveryAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Chef.getValue())){
            organization = new ChefOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.DeliveryGuy.getValue())){
            organization = new DeliveryGuyOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
