/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SysAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author liumingyu
 */
public class SysAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminWorkAreaJPanel
     */
    private JPanel rightpanel;
    private EcoSystem ecoSystem;
    DefaultMutableTreeNode selectednode;
    DefaultTreeModel model;
    public SysAdminWorkAreaJPanel(JPanel rightpanel, EcoSystem ecoSystem) {
        initComponents();
        this.rightpanel = rightpanel;
        this.ecoSystem = ecoSystem;
        model = (DefaultTreeModel) JTree.getModel();
        populateTree();
    }
    public void populateTree(){
        
        ArrayList<Network> networkList=ecoSystem.getNetworkList();
        List<Enterprise> RestaurantList;
        List<Enterprise> DeliveryList;
        ArrayList<Organization> organizationList;
        
        Network network;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            networkNode=new DefaultMutableTreeNode(network.getLocation());
            networks.insert(networkNode, i);
            
            RestaurantList = network.getEnterpriseDirectory().getRestaurantList();
            DeliveryList = network.getEnterpriseDirectory().getDeliveryServiceList();
            DefaultMutableTreeNode restaurants = new DefaultMutableTreeNode("Restaurant");
            DefaultMutableTreeNode deliverys = new DefaultMutableTreeNode("Delivery Service");
            networkNode.insert(deliverys, 0);
            networkNode.insert(restaurants, 1);
            for(int j=0; j<DeliveryList.size();j++){
                enterprise=DeliveryList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
                deliverys.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                for(int k=0;k<organizationList.size();k++){
                    organization=organizationList.get(k);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
            for(int j=0; j<RestaurantList.size();j++){
                enterprise=RestaurantList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
                restaurants.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                for(int k=0;k<organizationList.size();k++){
                    organization=organizationList.get(k);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NetWorkBtn = new javax.swing.JButton();
        ManageDeliveryServiceBtn = new javax.swing.JButton();
        ManageEnterpriseManagerBtn = new javax.swing.JButton();
        ManageRestaurantBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTree = new javax.swing.JTree();
        jLabel3 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 246, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/SysAdminRole/takeout-top.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 870, 210));

        jPanel2.setBackground(new java.awt.Color(249, 246, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        NetWorkBtn.setBackground(new java.awt.Color(255, 255, 255));
        NetWorkBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        NetWorkBtn.setText("Manage NetWork");
        NetWorkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetWorkBtnActionPerformed(evt);
            }
        });

        ManageDeliveryServiceBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageDeliveryServiceBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        ManageDeliveryServiceBtn.setText("Manage Delivery Service");
        ManageDeliveryServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDeliveryServiceBtnActionPerformed(evt);
            }
        });

        ManageEnterpriseManagerBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageEnterpriseManagerBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        ManageEnterpriseManagerBtn.setText("Manage Enterprise Manager");
        ManageEnterpriseManagerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageEnterpriseManagerBtnActionPerformed(evt);
            }
        });

        ManageRestaurantBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageRestaurantBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        ManageRestaurantBtn.setText("Manage Restaurant");
        ManageRestaurantBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageRestaurantBtnActionPerformed(evt);
            }
        });

        JTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                JTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(JTree);

        jLabel3.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NetWorkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblSelectedNode))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ManageDeliveryServiceBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageEnterpriseManagerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(ManageRestaurantBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblSelectedNode))
                        .addGap(45, 45, 45)
                        .addComponent(NetWorkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ManageDeliveryServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageRestaurantBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(ManageEnterpriseManagerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 221, 870, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void NetWorkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetWorkBtnActionPerformed
        // TODO add your handling code here:
        ManageLocationJPanel mlpanel = new ManageLocationJPanel(rightpanel, ecoSystem);
        this.rightpanel.add(mlpanel);
        CardLayout layout = (CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_NetWorkBtnActionPerformed

    private void ManageDeliveryServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageDeliveryServiceBtnActionPerformed
        // TODO add your handling code here:
        ManageDeliveryServiceJPanel mdpanel = new ManageDeliveryServiceJPanel(rightpanel, ecoSystem);
        this.rightpanel.add(mdpanel);
        CardLayout layout = (CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_ManageDeliveryServiceBtnActionPerformed

    private void ManageEnterpriseManagerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageEnterpriseManagerBtnActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseManagerJPanel mempanel = new ManageEnterpriseManagerJPanel(rightpanel, ecoSystem);
        this.rightpanel.add(mempanel);
        CardLayout layout = (CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_ManageEnterpriseManagerBtnActionPerformed

    private void ManageRestaurantBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageRestaurantBtnActionPerformed
        // TODO add your handling code here:
        ManageRestaurantJPanel mrpanel = new ManageRestaurantJPanel(rightpanel, ecoSystem);
        this.rightpanel.add(mrpanel);
        CardLayout layout = (CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_ManageRestaurantBtnActionPerformed

    private void JTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_JTreeValueChanged

        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)JTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_JTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree JTree;
    private javax.swing.JButton ManageDeliveryServiceBtn;
    private javax.swing.JButton ManageEnterpriseManagerBtn;
    private javax.swing.JButton ManageRestaurantBtn;
    private javax.swing.JButton NetWorkBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
