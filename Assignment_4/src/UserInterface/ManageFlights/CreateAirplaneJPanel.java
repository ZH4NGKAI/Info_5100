/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageFlights;

import Business.Airliner.Airliner;
import Business.Airliner.Airplane;
import Business.TravelAgency;
import UserInterface.ManageAirliners.ManageAirlinersJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author wangbaichao
 */
public class CreateAirplaneJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAirplaneJPanel
     */
    
    private JPanel CardSequenceJPane;
    private TravelAgency TA;
    private Airliner airliner;
    
    public CreateAirplaneJPanel(JPanel CardSequenceJPane, Airliner airliner, TravelAgency TA) {
        initComponents();
        this.CardSequenceJPane = CardSequenceJPane;
        this.TA = TA;
        this.airliner=airliner;
        
        
    }
    



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIATA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSeatNum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtProduce = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFuelCapacity = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Create New Airplane");

        jLabel2.setText("Airplane Code");

        jLabel3.setText("Type");

        jLabel4.setText("Seat Number");

        jLabel5.setText("Produced Year");

        jLabel6.setText("Manufacturer");

        jLabel7.setText("Fuel Capacity");

        btnCreate.setText("Create Airliners");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        backBtn.setText("<< back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtFuelCapacity)
                    .addComponent(txtManufacturer)
                    .addComponent(txtProduce)
                    .addComponent(txtSeatNum)
                    .addComponent(txtType)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIATA, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIATA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSeatNum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtProduce, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFuelCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        //check IATA Code empty
        String iatacode=txtIATA.getText();

        if (iatacode==null||iatacode.equals("")) {
            JOptionPane.showMessageDialog(null, "No blank field is allowed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //check type empty
        String type = txtType.getText();
        if (type==null||type.equals("")) {
            JOptionPane.showMessageDialog(null, "No blank field is allowed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //check seat number int and smaller than 150
            String seatNum = txtSeatNum.getText();
            try{
                Integer.parseInt(seatNum);
                
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please enter number for Seat Number");
                return;
            }
            
            if(Integer.parseInt(seatNum)>150){
                JOptionPane.showMessageDialog(null, "Please enter number <= 150");
                txtSeatNum.setText("");
            }
          
        //check produced year
        String produce=txtProduce.getText();
        try{
                Integer.parseInt(produce);
                
            }
        catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please enter number for produced year");
                return;
            }
        
        //manufacturer
        String manufacturer = txtManufacturer.getText();
        if (manufacturer==null||manufacturer.equals("")) {
            JOptionPane.showMessageDialog(null, "No blank field is allowed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //fuel capacity
        String fuelCap = txtFuelCapacity.getText();
        try{
                Integer.parseInt(fuelCap);
                
            }
        catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please enter number for fuel capacity");
                return;
            }
            
        //Create airplane
        Airplane airplane=new Airplane(iatacode);
        if (!airliner.getFleet().addAirplane(airplane)) {
            JOptionPane.showMessageDialog(null, "Airplane with same code exits.");
            return;
        }
        airplane.setType(type);
        airplane.setSeatNum(Integer.parseInt(seatNum));
        airplane.setProduced(Integer.parseInt(produce));
        airplane.setManufactuer(manufacturer);
        airplane.setFuelCapacity(Integer.parseInt(fuelCap));
        
        
        //reset txt
        txtIATA.setText("");
        txtType.setText("");
        txtSeatNum.setText("");
        txtProduce.setText("");
        txtManufacturer.setText("");
        txtFuelCapacity.setText("");
        

        JOptionPane.showMessageDialog(null, "Airplane Successfully created.");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardSequenceJPane.remove(this);
        // refreshTable
        Component[] componentArray = CardSequenceJPane.getComponents();
        for(Component comp : componentArray){
            if(comp instanceof EditFlightJPanel){
                EditFlightJPanel manageP = (EditFlightJPanel) comp;
                manageP.populate();
            }
        }

        CardLayout layout = (CardLayout) CardSequenceJPane.getLayout();
        layout.previous(CardSequenceJPane);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtFuelCapacity;
    private javax.swing.JTextField txtIATA;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtProduce;
    private javax.swing.JTextField txtSeatNum;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
