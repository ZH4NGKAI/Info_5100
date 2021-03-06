/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.*;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
/**
 *
 * @author mac
 */
public class UberPanel extends javax.swing.JPanel {

    private CarInformationList carList;
    private JPanel rightPanel;
    /**
     * Creates new form uberPanel
     */
    public UberPanel(JPanel rightPanel, CarInformationList carList) {
        initComponents();
        this.rightPanel = rightPanel;
        this.carList = carList;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDriver = new javax.swing.JButton();
        btnPassenger = new javax.swing.JButton();

        btnDriver.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnDriver.setText("Driver");
        btnDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverActionPerformed(evt);
            }
        });

        btnPassenger.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnPassenger.setText("Passenger");
        btnPassenger.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPassenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassengerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPassenger, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(btnDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnPassenger, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriverActionPerformed
        // TODO add your handling code here:
        DriverPanel panel = new DriverPanel(rightPanel, carList);
        rightPanel.add("DriverPanel", panel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnDriverActionPerformed

    private void btnPassengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassengerActionPerformed
        // TODO add your handling code here:
        PassengerPanel panel = new PassengerPanel(rightPanel, carList);
        rightPanel.add("PassengerPanel", panel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel); 
    }//GEN-LAST:event_btnPassengerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDriver;
    private javax.swing.JButton btnPassenger;
    // End of variables declaration//GEN-END:variables
}
