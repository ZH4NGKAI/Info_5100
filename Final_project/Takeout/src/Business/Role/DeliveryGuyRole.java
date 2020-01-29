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
import Interface.DeliveryGuyRole.DeliveryGuyWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mac
 */
public class DeliveryGuyRole extends Role{

    public DeliveryGuyRole() {
        this.setRoleType(RoleType.DeliveryGuy);
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DeliveryGuyWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
    }
    
}
