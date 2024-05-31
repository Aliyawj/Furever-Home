/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fureverhome_project;



/**
 *
 * @author reggie
 */

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Admin_AddAnimal extends javax.swing.JFrame {

    koneksi kon = new koneksi();
    String flag;
    String path_for_insert;
    
    /**
     * Creates new form Admin_AddAnimal
     */
    public Admin_AddAnimal() {
        initComponents();
    
        kon.setConnection();
        
        setIconImage();
        
        Color myBeige = new Color(255,231,203);
        getContentPane().setBackground(myBeige);
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
        jLabel2 = new javax.swing.JLabel();
        button_addCat = new javax.swing.JButton();
        button_addDog = new javax.swing.JButton();
        go_to_homepage = new javax.swing.JButton();
        label_addAnimal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addPicture_button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        field_name = new javax.swing.JTextField();
        field_breed = new javax.swing.JTextField();
        field_age = new javax.swing.JTextField();
        field_personality = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_medicalRecord = new javax.swing.JTextArea();
        label_addPicture = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area_description = new javax.swing.JTextArea();
        button_submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Animal");
        setBackground(new java.awt.Color(255, 231, 203));

        jPanel1.setBackground(new java.awt.Color(109, 69, 33));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        jPanel1.setForeground(new java.awt.Color(255, 231, 203));

        jLabel2.setFont(new java.awt.Font("Advent Pro SemiExpanded", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 231, 203));
        jLabel2.setText("Animal to Add");

        button_addCat.setText("Cat");
        button_addCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addCatActionPerformed(evt);
            }
        });

        button_addDog.setText("Dog");
        button_addDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addDogActionPerformed(evt);
            }
        });

        go_to_homepage.setText("Homepage");
        go_to_homepage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_to_homepageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(button_addCat, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(button_addDog, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(go_to_homepage)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_addCat)
                    .addComponent(button_addDog)
                    .addComponent(jLabel2)
                    .addComponent(go_to_homepage))
                .addContainerGap())
        );

        label_addAnimal.setFont(new java.awt.Font("Advent Pro SemiExpanded", 1, 24)); // NOI18N
        label_addAnimal.setText("Add Animal");

        jLabel1.setFont(new java.awt.Font("DM Sans", 1, 14)); // NOI18N
        jLabel1.setText("Name :");

        jLabel3.setFont(new java.awt.Font("DM Sans", 1, 14)); // NOI18N
        jLabel3.setText("Breed :");

        jLabel4.setFont(new java.awt.Font("DM Sans", 1, 14)); // NOI18N
        jLabel4.setText("Age :");

        addPicture_button.setText("Add Picture");
        addPicture_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPicture_buttonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("DM Sans", 1, 14)); // NOI18N
        jLabel6.setText("Personality :");

        jLabel7.setFont(new java.awt.Font("DM Sans", 1, 14)); // NOI18N
        jLabel7.setText("Description :");

        jLabel8.setFont(new java.awt.Font("DM Sans", 1, 14)); // NOI18N
        jLabel8.setText("Medical Record :");

        field_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nameActionPerformed(evt);
            }
        });

        field_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_ageActionPerformed(evt);
            }
        });

        area_medicalRecord.setColumns(20);
        area_medicalRecord.setRows(5);
        jScrollPane1.setViewportView(area_medicalRecord);

        label_addPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_addPicture.setText("No Picture Selected");
        label_addPicture.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        label_addPicture.setMaximumSize(new java.awt.Dimension(180, 240));
        label_addPicture.setMinimumSize(new java.awt.Dimension(100, 200));
        label_addPicture.setPreferredSize(new java.awt.Dimension(180, 240));

        area_description.setColumns(20);
        area_description.setRows(5);
        jScrollPane2.setViewportView(area_description);

        button_submit.setText("Submit");
        button_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(field_personality, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(field_age, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(field_breed, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(field_name, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label_addPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(addPicture_button)
                                .addGap(92, 92, 92))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_addAnimal)
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(label_addAnimal)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_addPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addPicture_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(field_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(field_breed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(field_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(field_personality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(button_submit)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_addDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addDogActionPerformed
        // TODO add your handling code here:
        label_addAnimal.setText("Add New Dog");
        label_addPicture.setIcon(null);
        label_addPicture.setText("No Picture Selected");
        emptyFields();
        
        flag = "dog";
    }//GEN-LAST:event_button_addDogActionPerformed

    private void button_addCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addCatActionPerformed
        // TODO add your handling code here:
        label_addAnimal.setText("Add New Cat");
        label_addPicture.setIcon(null);
        label_addPicture.setText("No Picture Selected");
        emptyFields();
        
        flag = "cat";
    }//GEN-LAST:event_button_addCatActionPerformed

    private void addPicture_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPicture_buttonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooseFile = new JFileChooser();
        
        chooseFile.showOpenDialog(null);
        File photoFile = chooseFile.getSelectedFile();
        String filePath = photoFile.getAbsolutePath();
        
        try {
            
            BufferedImage bi = ImageIO.read(new File(filePath));
            Image img = bi.getScaledInstance(180, 240, Image.SCALE_SMOOTH);
            
            ImageIcon petPhoto = new ImageIcon(img);
            label_addPicture.setIcon(petPhoto);
            
            path_for_insert = filePath;
            
        } catch (IOException ex) {
            Logger.getLogger(Admin_AddAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addPicture_buttonActionPerformed

    private void field_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nameActionPerformed

    private void field_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_ageActionPerformed

    private void button_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_submitActionPerformed
        // TODO add your handling code here:
        if (flag == "cat")
        {
          String cat_name = field_name.getText();
          String cat_breed = field_breed.getText();
          String cat_age = field_age.getText();
          String cat_personality = field_personality.getText();
          String cat_desc = area_description.getText();
          String cat_medRecord = area_medicalRecord.getText();
         
          if (cat_name.equals("") || cat_breed.equals("") || cat_age.equals("") || cat_personality.equals("") || cat_desc.equals("") || cat_medRecord.equals(""))
          {
              JOptionPane.showMessageDialog(null, "Please fill out all the forms before submitting.");
          }
          
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                PreparedStatement ps = kon.con.prepareStatement("insert into tb_kucing(cat_name, cat_breed, cat_age, cat_personality, cat_description, cat_medicalRecord, cat_picture)"
                        + "VALUES (?, ?, ?, ?, ?, ?, ?)");
                
                ps.setString(1, cat_name);
                ps.setString(2, cat_breed);
                ps.setString(3, cat_age);
                ps.setString(4, cat_personality);
                ps.setString(5, cat_desc);
                ps.setString(6, cat_medRecord);
                
                InputStream is = new FileInputStream(new File(path_for_insert));
                ps.setBlob(7, is);
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "New Cat has been successfully added.");
                emptyFields();
            } 
            
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Input Error "+ex);
            } 
        }
        
        else if (flag == "dog")
        {
            String dog_name = field_name.getText();
            String dog_breed = field_breed.getText();
            String dog_age = field_age.getText();
            String dog_personality = field_personality.getText();
            String dog_desc = area_description.getText();
            String dog_medRecord = area_medicalRecord.getText();
         
            if (dog_name.equals("") || dog_breed.equals("") || dog_age.equals("") || dog_personality.equals("") || dog_desc.equals("") || dog_medRecord.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please fill out all the forms before submitting.");
            }
          
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                PreparedStatement ps = kon.con.prepareStatement("insert into tb_anjing(dog_name, dog_breed, dog_age, dog_personality, dog_description, dog_medicalRecord, dog_picture)"
                        + "VALUES (?, ?, ?, ?, ?, ?, ?)");
                
                ps.setString(1, dog_name);
                ps.setString(2, dog_breed);
                ps.setString(3, dog_age);
                ps.setString(4, dog_personality);
                ps.setString(5, dog_desc);
                ps.setString(6, dog_medRecord);
                
                InputStream is = new FileInputStream(new File(path_for_insert));
                ps.setBlob(7, is);
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "New Dog has been successfully added.");
                
                emptyFields();
            }   
            
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Input Error "+ex);
            } 
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "You haven't chosen an animal yet.");
        }
    }//GEN-LAST:event_button_submitActionPerformed

    private void go_to_homepageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_to_homepageActionPerformed
        // TODO add your handling code here:
        dispose();
        User_Homepage homepage = new User_Homepage();
        homepage.show();
    }//GEN-LAST:event_go_to_homepageActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_AddAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_AddAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_AddAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_AddAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_AddAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPicture_button;
    private javax.swing.JTextArea area_description;
    private javax.swing.JTextArea area_medicalRecord;
    private javax.swing.JButton button_addCat;
    private javax.swing.JButton button_addDog;
    private javax.swing.JButton button_submit;
    private javax.swing.JTextField field_age;
    private javax.swing.JTextField field_breed;
    private javax.swing.JTextField field_name;
    private javax.swing.JTextField field_personality;
    private javax.swing.JButton go_to_homepage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_addAnimal;
    private javax.swing.JLabel label_addPicture;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/original_icon_file.jpeg")));
    }
    
    private void emptyFields() {
        field_name.setText("");
        field_breed.setText("");
        field_age.setText("");
        field_personality.setText("");
        area_description.setText("");
        area_medicalRecord.setText("");
        label_addPicture.setIcon(null);
        label_addPicture.setText("No Picture Selected");
    }
}

