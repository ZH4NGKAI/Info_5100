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
import Interface.ChefRole.ChefWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mac
 */
public class ChefRole extends Role{

    public ChefRole() {
        this.setRoleType(RoleType.Chef);
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ChefWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
    }
}
