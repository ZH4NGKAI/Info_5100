/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RestAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class RestAdminOrganization extends Organization{
    public RestAdminOrganization() {
        super(Organization.Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RestAdminRole());
        return roles;
    }
}
