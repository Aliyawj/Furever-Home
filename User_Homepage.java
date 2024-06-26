/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fureverhome_project;

/**
 *
 * @author reggie
 */

import java.awt.*;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class User_Homepage extends javax.swing.JFrame {
    
    koneksi kon = new koneksi();
    WrapLayout wrap_layout = new WrapLayout();
    String flag = "cat";
    
    /**
     * Creates new form User_Homepage
     */
    public User_Homepage() {
        initComponents();
        
        kon.setConnection();
        
        Color myBeige = new Color(255,231,203);
        getContentPane().setBackground(myBeige);
        
        this.main_panel.setBackground(myBeige);
       
        this.main_panel.setLayout(new WrapLayout(FlowLayout.LEADING, 0, 100));
        this.main_panel.revalidate();
        displayAll(flag);
        
        this.pack();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        scrollPane = new javax.swing.JScrollPane(this.main_panel);
        main_panel = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Advent Pro SemiExpanded", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adopt Our Cats!");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setAlignmentY(5.0F);
        jLabel1.setPreferredSize(new java.awt.Dimension(220, 40));
        jScrollPane1.setViewportView(jLabel1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(10, 10));
        getContentPane().setLayout(new java.awt.GridLayout());

        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new java.awt.Dimension(50, 50));

        main_panel.setName(""); // NOI18N
        main_panel.setRequestFocusEnabled(false);
        scrollPane.setViewportView(main_panel);

        getContentPane().add(scrollPane);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(User_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel main_panel;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables

    private void addDataPanel(String name, String breed, ImageIcon image)
    {
        Animal_Data_Panel animal = new Animal_Data_Panel();
        animal.setName(name);
        animal.setBreed(breed);
        animal.setPicture(image);
        
        this.main_panel.add(animal);
    }
    
    private void displayAll(String flag)
    {
        if (flag == "cat") 
        {
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                             
                String select_rows = "select cat_name, cat_breed, cat_picture from tb_kucing";
                Statement st = kon.con.createStatement();                
                ResultSet rs = st.executeQuery(select_rows);
                
                String name;
                String breed;
                String picture;
                
                // untuk menentukan koordinat x dan y saat menambahkan panel ke frame
                while (rs.next())
                {                    
                    name = rs.getString(1);
                    breed = rs.getString(2);
                    
                    byte[] img = rs.getBytes(3);
                    ImageIcon image = new ImageIcon(img);
                    Image selected_picture = image.getImage();
                    Image scaled_image = selected_picture.getScaledInstance(180, 240, Image.SCALE_SMOOTH);
                    
                    ImageIcon final_image = new ImageIcon(scaled_image);
                    
                    addDataPanel(name, breed, final_image);
                }
            }
            
            catch (Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Display Error "+ex);
            }
        }
    }
}
