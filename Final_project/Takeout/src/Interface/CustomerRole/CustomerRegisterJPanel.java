/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CustomerRole;

import Business.Network.Network;
import Business.EcoSystem;
import Business.EmailOperation.EmailSection;
import Business.Enterprise.DeliveryServiceEnterprise;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liumingyu
 */
public class CustomerRegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerRegisterJPanel
     */
    private JPanel registerpanel;
    private EcoSystem ecoSystem;
    private EmailSection emailOP;
    private int verifyCount = 0;       
    public CustomerRegisterJPanel(JPanel registerpanel, EcoSystem ecoSystem) {
        initComponents();
        this.registerpanel = registerpanel;
        this.ecoSystem = ecoSystem;
        populate();
    }
    
    public void populate()
    {
        int rowCount = deliveryServiceTbl.getRowCount();
        jScrollPane1.getViewport().setBackground(new Color(249,246,246));
        DefaultTableModel dtm = (DefaultTableModel)deliveryServiceTbl.getModel();
        for(int i = rowCount - 1; i >= 0; i--)
        {
            dtm.removeRow(i);
        }
        
        for(Network network : this.ecoSystem.getNetworkList())
        {
            for(Enterprise deliveryService : network.getEnterpriseDirectory().getDeliveryServiceList())
            {
                Object row[] = new Object[dtm.getColumnCount()];
                row[0] = deliveryService;
                row[1] = ((DeliveryServiceEnterprise)deliveryService).getCustomerOrganization().getUserAccountDirectory().getUserAccountList().size();
                row[2] = deliveryService.getEvaluation();
                dtm.addRow(row);
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CustomerNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RegisterBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        deliveryServiceTbl = new javax.swing.JTable();
        PasswordTxt = new javax.swing.JPasswordField();
        Re_PasswordTxt = new javax.swing.JPasswordField();
        EmailTxt = new javax.swing.JTextField();
        verifyTxt = new javax.swing.JTextField();
        VerifyBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(881, 614));

        jPanel1.setBackground(new java.awt.Color(249, 246, 246));

        jLabel4.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel4.setText("Customer Register ");

        jLabel2.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel2.setText("UserName：");

        jLabel3.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel3.setText("      Password：");

        jLabel7.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel7.setText("     Re_Password：");

        RegisterBtn.setBackground(new java.awt.Color(255, 255, 255));
        RegisterBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        RegisterBtn.setText("Register");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        BackBtn.setText("Back <<");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        deliveryServiceTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Delivery Service Name", "User Number", "User Evaluation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deliveryServiceTbl);
        if (deliveryServiceTbl.getColumnModel().getColumnCount() > 0) {
            deliveryServiceTbl.getColumnModel().getColumn(0).setResizable(false);
            deliveryServiceTbl.getColumnModel().getColumn(1).setResizable(false);
            deliveryServiceTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        VerifyBtn.setBackground(new java.awt.Color(255, 255, 255));
        VerifyBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        VerifyBtn.setText("Send Verify Code:");
        VerifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel8.setText("Verify Code:");

        jLabel9.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel9.setText("     Email：");

        jLabel5.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel5.setText("Address：");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(CustomerNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Re_PasswordTxt)
                                                    .addComponent(PasswordTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                                    .addComponent(EmailTxt, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(VerifyBtn)
                                                    .addComponent(verifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(RegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BackBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Re_PasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VerifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verifyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegisterBtn)
                .addGap(35, 35, 35))
        );

        jPanel2.setBackground(new java.awt.Color(249, 246, 246));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/CustomerRole/WechatIMG11.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        this.registerpanel.remove(this);
        CardLayout cardlayout = (CardLayout)this.registerpanel.getLayout();
        cardlayout.previous(registerpanel);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        // TODO add your handling code here:
        // Get user name
        String userName = CustomerNameTxt.getText();
        // Get Password
        char[] passwordCharArray = PasswordTxt.getPassword();
        char[] repasswordCharArray = Re_PasswordTxt.getPassword();
        String repassword = String.valueOf(repasswordCharArray);
        String password = String.valueOf(passwordCharArray);
        String verifyCode = verifyTxt.getText();
        String email = EmailTxt.getText();
        String address = txtAddress.getText();
        int selectedRow = deliveryServiceTbl.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select any row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(userName.isEmpty() || password.isEmpty() || repassword.isEmpty() || address.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please input username or password!");
            return;
        }
        if(email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input your email!");
            return;
        }
        if(emailOP == null) {
            JOptionPane.showMessageDialog(null, "Please send confirm code to your email!");
            return;
        }
        if(verifyCode.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the confirm code!");
            return;
        }
        DeliveryServiceEnterprise deliveryService = (DeliveryServiceEnterprise)deliveryServiceTbl.getValueAt(selectedRow, 0);
        
        
        if(!ecoSystem.checkIfUserIsUnique(userName)){
            JOptionPane.showMessageDialog(null, "User name has existed!");
            return;
        }
        
        if(!repassword.equals(password))
        {
            JOptionPane.showMessageDialog(null, "Password and Re_Password are not same, Please Check!");
            return;
        }
        if(verifyCount > 2){
                JOptionPane.showMessageDialog(null, "Wrong verify code input over 3 times, please resend confirm email");
                return;
        }
        if(!verifyCode.equals(emailOP.getConfirmCode())){
            verifyCount++;
            JOptionPane.showMessageDialog(null, "Verify code is not correct!");
            if(verifyCount > 2){
                JOptionPane.showMessageDialog(null, "Wrong verify code input over 3 times, please resend confirm email");
                VerifyBtn.setEnabled(true);
            }
            verifyTxt.setText("");
            return;
        }
        UserAccount customerAccount = deliveryService.addCustomer(userName, password);
        customerAccount.setEmail(email);
        customerAccount.setAddress(address);
        JOptionPane.showMessageDialog(null, "Register Customer Successfully!");
        populate();
        CustomerNameTxt.setText("");
        PasswordTxt.setText("");
        Re_PasswordTxt.setText("");
        verifyTxt.setText("");
        EmailTxt.setText("");
        txtAddress.setText("");
        verifyCount = 0;
        
    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void VerifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifyBtnActionPerformed
        // TODO add your handling code here:
        this.emailOP = new  EmailSection();
        String emailaddress = this.EmailTxt.getText();
        if(emailaddress.equals("")){
            JOptionPane.showMessageDialog(null, "Email addres is empty, please input!");
            return;
        }

        try {
            emailOP.sendEmail(emailaddress);
        } catch (GeneralSecurityException ex) {
            Logger.getLogger(CustomerRegisterJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(CustomerRegisterJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Email sending fails!");
            return;
        }
        JOptionPane.showMessageDialog(null, "Email has been sent successfully!");
        this.VerifyBtn.setEnabled(false);
        verifyCount = 0;
    }//GEN-LAST:event_VerifyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField CustomerNameTxt;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JPasswordField PasswordTxt;
    private javax.swing.JPasswordField Re_PasswordTxt;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JButton VerifyBtn;
    private javax.swing.JTable deliveryServiceTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField verifyTxt;
    // End of variables declaration//GEN-END:variables
}