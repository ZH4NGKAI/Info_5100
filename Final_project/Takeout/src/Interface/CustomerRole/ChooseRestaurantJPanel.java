/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CustomerRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.RestaurantEnterprise;
import Business.Network.Network;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mac
 */
public class ChooseRestaurantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChooseRestaurantJPanel
     */
    private JPanel userProcessContainer;
    private Network network;
    private Enterprise deliveryService;
    private UserAccount userAccount;
    
    public ChooseRestaurantJPanel(JPanel userProcessContainer, UserAccount account, Network network, Enterprise deliveryService) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.deliveryService = deliveryService;
        this.userAccount = account;   
        
        populate();
    }
    
    public void populate() {
        DefaultTableModel dtm = (DefaultTableModel)tblRestaurants.getModel();
        dtm.setRowCount(0);
        
        for (Enterprise restaurant : network.getEnterpriseDirectory().getRestaurantList()) {
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = restaurant;
            row[1] = restaurant.getAddress();
            row[2] = ((RestaurantEnterprise)restaurant).getSales();
            row[3] = restaurant.getEvaluation();
            dtm.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurants = new javax.swing.JTable();
        BackBtn = new javax.swing.JButton();

        tblRestaurants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Restaurant", "Address", "Sales", "Evaluation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRestaurants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRestaurantsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRestaurants);
        if (tblRestaurants.getColumnModel().getColumnCount() > 0) {
            tblRestaurants.getColumnModel().getColumn(0).setResizable(false);
            tblRestaurants.getColumnModel().getColumn(1).setResizable(false);
            tblRestaurants.getColumnModel().getColumn(2).setResizable(false);
            tblRestaurants.getColumnModel().getColumn(3).setResizable(false);
        }

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        BackBtn.setText("Back <<");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackBtn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        //refresh table
        for(Component comp : componentArray){
            if(comp instanceof CustomerWorkAreaJPanel){
                CustomerWorkAreaJPanel manageP = (CustomerWorkAreaJPanel) comp;
                manageP.populate();
            }
        }
        CardLayout cardlayout = (CardLayout)this.userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void tblRestaurantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRestaurantsMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
                    int selectedRow = tblRestaurants.rowAtPoint(evt.getPoint());
                    RestaurantEnterprise restaurant = (RestaurantEnterprise)tblRestaurants.getValueAt(selectedRow, 0);
                    MenuJPanel panel = new MenuJPanel(userProcessContainer, userAccount, restaurant, deliveryService);
                    userProcessContainer.add("MenuJPanel", panel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
    }//GEN-LAST:event_tblRestaurantsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestaurants;
    // End of variables declaration//GEN-END:variables
}