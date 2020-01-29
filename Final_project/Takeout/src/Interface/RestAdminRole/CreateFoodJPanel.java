/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.RestAdminRole;

import Business.Enterprise.RestaurantEnterprise;
import Business.Food.Food;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author wangbaichao
 */
public class CreateFoodJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateFoodJPanel
     */
    private RestaurantEnterprise enterprise;
    private JPanel userProcessContainer;
    private String imagePath;
    private Icon defaultIcon;
    
    public CreateFoodJPanel(JPanel userProcessContainer,RestaurantEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.imagePath="";
        this.defaultIcon = imageLabel.getIcon();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        uploadBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(249, 246, 246));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel4.setText("Create Food");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Price");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/RestAdminRole/food.png"))); // NOI18N

        backJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        uploadBtn.setText("Upload Picture");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(imageLabel)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(uploadBtn)
                        .addGap(128, 128, 128))))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageLabel)
                        .addGap(18, 18, 18)
                        .addComponent(uploadBtn)))
                .addGap(100, 100, 100)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        
        Component[] componentArray = userProcessContainer.getComponents();
        //refresh table 
        for(Component comp : componentArray){
            if(comp instanceof ManageMenuJPanel){
                ManageMenuJPanel manageP = (ManageMenuJPanel) comp;
                manageP.populateTable();
            }
        }
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        //check name
        String name = txtName.getText();
        if (name==null||name.equals("")) {
            JOptionPane.showMessageDialog(null, "No blank field is allowed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //check if unique name
        for(Food food : enterprise.getFoodDirectory().getFoodList()){
            if(food.getName().equals(name)){
                JOptionPane.showMessageDialog(null, "this food name already exists.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        //check price
        String price = txtPrice.getText();
        if (price==null||price.equals("")) {
            JOptionPane.showMessageDialog(null, "No blank field is allowed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try{
                Float.parseFloat(price);
                
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Please enter a float number for price");
                return;
        }
        //check image
        String imgPath = this.imagePath;
        if(imgPath == null || imgPath.equals("")){
            JOptionPane.showMessageDialog(null, "please choose a image.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //create food
        
//        food.setName(name);
//        food.setPrice(Float.parseFloat(price));
//        
        Food food = new Food(name,Float.parseFloat(price));
        food.setImgPath(imagePath);
        
        enterprise.getFoodDirectory().getFoodList().add(food);
        
        //set text empty
        txtName.setText("");
        txtPrice.setText("");
        imageLabel.setIcon(defaultIcon);
        
        JOptionPane.showMessageDialog(null, "the food created successfully");
        
        
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        // Open File Chooser
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        switch (result) {
            case JFileChooser.APPROVE_OPTION:
            File imgFile = chooser.getSelectedFile();
            String imgPath = imgFile.getAbsolutePath();
            //Read the image as bufferedimage
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(imgPath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            //Resize the BufferedImage
            //System.out.println(imageLabel.getWidth());
            //System.out.println(imageLabel.getHeight());
            Image dimg = img.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(),
                Image.SCALE_SMOOTH);
            
            //Display  picture in smooth size
            imageLabel.setIcon(new javax.swing.ImageIcon(dimg));
            //food.setImage(dimg);
            this.imagePath = imgPath;
            JOptionPane.showMessageDialog(null,"Upload Food Image Successfully!");
            
            break;
            case JFileChooser.CANCEL_OPTION:
            break;
            case JFileChooser.ERROR_OPTION:
            break;

        }
        
    }//GEN-LAST:event_uploadBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JButton uploadBtn;
    // End of variables declaration//GEN-END:variables
}