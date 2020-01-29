/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageFlights;

import Business.Airliner.Airliner;
import Business.Airliner.Airplane;
import Business.Airliner.Flight;
import Business.TravelAgency;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mac
 */
public class EditFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditFlightJPanel
     */
    private JPanel CardSequenceJPane;
    private Airliner airliner;
    private TravelAgency TA;
    
    
    public EditFlightJPanel(JPanel CardSequenceJPane, Airliner airliner, TravelAgency TA) {
        initComponents();
        this.CardSequenceJPane = CardSequenceJPane;
        this.airliner=airliner;
        this.TA = TA;
        
        populate();
        addItemToComboBox();
    }
    
    public void populate(){
        DefaultTableModel dtmFleet = (DefaultTableModel)tblAirlinerFleet.getModel();
        dtmFleet.setRowCount(0);
        for(Airplane a : airliner.getFleet().getList()) {
            Object[] row = new Object[dtmFleet.getColumnCount()];
            row[0]=a;
            row[1]=a.getType();
            row[2]=a.getSeatNum();
            row[3]=a.getFuelCapacity();
            dtmFleet.addRow(row);
        }
        
        DefaultTableModel dtmFlight = (DefaultTableModel)tblAirlinerFlight.getModel();
        dtmFlight.setRowCount(0);
        for(Flight a : airliner.getFlightSchedule().getList()) {
            Object[] row = new Object[dtmFlight.getColumnCount()];
            row[0]=a;
            row[1]=a.getFromPlace();
            row[2]=a.getToPlace();
            row[3]=a.getDate();
            row[4]=a.getTakeoffTime();
            dtmFlight.addRow(row);
        }
    }
    
    public void addItemToComboBox() {
//        ArrayList<String> allAirportNames = new ArrayList<>();
//            for(Flight flight: airliner.getFlightSchedule().getList()) {
//                allAirportNames.add(flight.getFromPlace());
//                allAirportNames.add(flight.getToPlace());
//            }
//        //remove duplicates
//        HashSet<String> hs = new HashSet<>();
//        hs.addAll(allAirportNames);
//        allAirportNames.clear();
//        allAirportNames.addAll(hs);
//        
//        for (String airportName: allAirportNames) {
//            depCBox.addItem(airportName);
//            arrCBox.addItem(airportName);
//        }
        depCBox.removeAllItems();
        Set<String> fromSet = new HashSet();
        for (Flight flight: airliner.getFlightSchedule().getList()) {
            fromSet.add(flight.getFromPlace());
        }
        depCBox.setModel(new DefaultComboBoxModel(fromSet.toArray()));
        depCBox.setSelectedIndex(-1);
        
        depCBox.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    arrCBox.removeAllItems();
                    Set<String> toSet = new HashSet();
                    for (Flight flight: airliner.getFlightSchedule().getList()) {
                        if (flight.getFromPlace().equals(depCBox.getSelectedItem()))
                            toSet.add(flight.getToPlace());
                    }     
                    arrCBox.setModel(new DefaultComboBoxModel(toSet.toArray()));
                    arrCBox.setSelectedIndex(-1);
		}
	});
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        arrCBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirlinerFleet = new javax.swing.JTable();
        btnSearchFlight = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAirlinerFlight = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        depCBox = new javax.swing.JComboBox<>();
        btnCreateFlight = new javax.swing.JButton();
        btnViewFlight = new javax.swing.JButton();
        btnDeleteFlight = new javax.swing.JButton();
        btnCreateAirplane = new javax.swing.JButton();
        btnViewAirplance = new javax.swing.JButton();
        txtIATA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnSearchAirplane = new javax.swing.JButton();

        jLabel3.setText("from");

        jLabel5.setText("to");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Edit AirLiner Fleet and Flight");

        arrCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        tblAirlinerFleet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airplane Code", "Type", "Seat Number", "Fuel Capacity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAirlinerFleet);

        btnSearchFlight.setText("Search Flight");
        btnSearchFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchFlightActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Fleet");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Flight");

        tblAirlinerFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IATA Code", "from place", "landing place", "date", "takeoff time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAirlinerFlight);

        btnBack.setText("<< back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        depCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        depCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depCBoxActionPerformed(evt);
            }
        });

        btnCreateFlight.setText("Create Flight");
        btnCreateFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateFlightActionPerformed(evt);
            }
        });

        btnViewFlight.setText("View Flight");
        btnViewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFlightActionPerformed(evt);
            }
        });

        btnDeleteFlight.setText("Delete Flight");
        btnDeleteFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFlightActionPerformed(evt);
            }
        });

        btnCreateAirplane.setText("Create Airplane");
        btnCreateAirplane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAirplaneActionPerformed(evt);
            }
        });

        btnViewAirplance.setText("View Airplane");
        btnViewAirplance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAirplanceActionPerformed(evt);
            }
        });

        txtIATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIATAActionPerformed(evt);
            }
        });

        jLabel6.setText("Airplane Code");

        btnSearchAirplane.setText("Search Airplane");
        btnSearchAirplane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAirplaneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearchAirplane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnCreateAirplane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnViewAirplance, javax.swing.GroupLayout.PREFERRED_SIZE, 128, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel6))
                            .addComponent(txtIATA)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreateFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(arrCBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(depCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIATA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchAirplane)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCreateAirplane)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnViewAirplance)
                            .addGap(80, 80, 80))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(depCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(arrCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSearchFlight)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCreateFlight)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnViewFlight)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDeleteFlight)))
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchFlightActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tblAirlinerFlight.getModel();
        dtm.setRowCount(0);
        

        for(Flight flight: this.airliner.getFlightSchedule().getList()) {
            if(flight.getFromPlace().equals(depCBox.getSelectedItem()) &&
                    flight.getToPlace().equals(arrCBox.getSelectedItem())) {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0]=flight;
                    row[1]=flight.getFromPlace();
                    row[2]=flight.getToPlace();
                    row[3]=flight.getDate();
                    row[4]=flight.getTakeoffTime();
                    dtm.addRow(row);
                }
            }
        if(dtm.getRowCount() == 0)
        JOptionPane.showMessageDialog(null, "No Flight found.");
    }//GEN-LAST:event_btnSearchFlightActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequenceJPane.remove(this);
        // refreshTable
        Component[] componentArray = CardSequenceJPane.getComponents();
        
        for(Component comp : componentArray){
            if(comp instanceof ManageFlightsJPanel){
                ManageFlightsJPanel manageP = (ManageFlightsJPanel) comp;
                manageP.populate();
            }
        }

        CardLayout layout = (CardLayout) CardSequenceJPane.getLayout();
        layout.previous(CardSequenceJPane);
    }//GEN-LAST:event_btnBackActionPerformed

    private void depCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depCBoxActionPerformed

    private void btnDeleteFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFlightActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblAirlinerFlight.getSelectedRow();
        if(selectedrow >= 0) {
            Flight f = (Flight)tblAirlinerFlight.getValueAt(selectedrow, 0);
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure to delete?",
                    null,JOptionPane.YES_NO_OPTION);
            if(reply == 0) {
                airliner.getFlightSchedule().deleteFlight(f);
            }else
            return;
            populate();
            JOptionPane.showMessageDialog(null, "Flight has been deleted!");

        } else {
            JOptionPane.showMessageDialog(null, "Please select any row!");
        }
    }//GEN-LAST:event_btnDeleteFlightActionPerformed

    private void btnSearchAirplaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAirplaneActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tblAirlinerFleet.getModel();
        dtm.setRowCount(0);

        for(Airplane a : airliner.getFleet().getList()) {
            if(txtIATA.getText().equals(a.getAirplaneCode())){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=a;
            row[1]=a.getType();
            row[2]=a.getSeatNum();
            row[3]=a.getFuelCapacity();
            dtm.addRow(row);
            }  
        }
        if(dtm.getRowCount() == 0) 
            JOptionPane.showMessageDialog(null, "No Airplanes found.");
        txtIATA.setText("");
    }//GEN-LAST:event_btnSearchAirplaneActionPerformed

    private void btnCreateAirplaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAirplaneActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)CardSequenceJPane.getLayout();
        CardSequenceJPane.add("CreateAirplaneJPanel", 
                new CreateAirplaneJPanel(CardSequenceJPane,airliner, TA));
        layout.next(CardSequenceJPane);
        
    }//GEN-LAST:event_btnCreateAirplaneActionPerformed

    private void btnCreateFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateFlightActionPerformed
        // TODO add your handling code here:
        if (airliner.getFleet().getList().size() <= 0) {
            JOptionPane.showMessageDialog(null, "This airliner has no airplane.");
            return;
        }
        CardLayout layout = (CardLayout)CardSequenceJPane.getLayout();
        CardSequenceJPane.add("CreateFlightJPanel", 
                new CreateFlightJPanel(CardSequenceJPane,airliner, TA));
        layout.next(CardSequenceJPane);
    }//GEN-LAST:event_btnCreateFlightActionPerformed

    private void btnViewAirplanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAirplanceActionPerformed
        // TODO add your handling code here:
    
        int selectedRow = tblAirlinerFleet.getSelectedRow();

        if(selectedRow>=0){
            Airplane a = (Airplane)tblAirlinerFleet.getValueAt(selectedRow, 0);
            CardLayout layout = (CardLayout)CardSequenceJPane.getLayout();
            CardSequenceJPane.add("UpdateAirplaneJPanel", 
                new UpdateAirplaneJPanel(CardSequenceJPane,airliner, a,TA));
            layout.next(CardSequenceJPane);

        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnViewAirplanceActionPerformed

    private void btnViewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFlightActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAirlinerFlight.getSelectedRow();

        if(selectedRow>=0){
            Flight f = (Flight)tblAirlinerFlight.getValueAt(selectedRow, 0);
            CardLayout layout = (CardLayout)CardSequenceJPane.getLayout();
            CardSequenceJPane.add("UpdateFlightJPanel", 
                new UpdateFlightJPanel(CardSequenceJPane,airliner, f,TA));
            layout.next(CardSequenceJPane);

        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnViewFlightActionPerformed

    private void txtIATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIATAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIATAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> arrCBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateAirplane;
    private javax.swing.JButton btnCreateFlight;
    private javax.swing.JButton btnDeleteFlight;
    private javax.swing.JButton btnSearchAirplane;
    private javax.swing.JButton btnSearchFlight;
    private javax.swing.JButton btnViewAirplance;
    private javax.swing.JButton btnViewFlight;
    private javax.swing.JComboBox<String> depCBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAirlinerFleet;
    private javax.swing.JTable tblAirlinerFlight;
    private javax.swing.JTextField txtIATA;
    // End of variables declaration//GEN-END:variables
}