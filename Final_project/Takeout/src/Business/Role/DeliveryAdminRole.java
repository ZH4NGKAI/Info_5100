/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.DeliveryServiceEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.DeliveryAdminRole.DeliveryAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mac
 */
public class DeliveryAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DeliveryAdminWorkAreaJPanel(userProcessContainer, account, (DeliveryServiceEnterprise)enterprise, business);
    }
    
}
