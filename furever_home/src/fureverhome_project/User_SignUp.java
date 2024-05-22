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

public class User_SignUp extends javax.swing.JFrame {

    // set connection
    koneksi kon = new koneksi();
    
    /**
     * Creates new form User_SignUp
     */
    public User_SignUp() {
        initComponents();
        kon.setConnection();
        
        // change window icon
        setIconImage();
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
        jTextPane1 = new javax.swing.JTextPane();
        salary_field = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        password_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        submit_button = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        fullName_field = new javax.swing.JTextField();
        age_field = new javax.swing.JTextField();
        phoneNumber_field = new javax.swing.JTextField();
        occupation_field = new javax.swing.JTextField();
        petHistory_field = new javax.swing.JTextField();
        salary_combobox = new javax.swing.JComboBox<>();
        password_passwordField = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        options_menu = new javax.swing.JMenu();
        loginOption_menuBar = new javax.swing.JMenuItem();
        exitOption_menuBar = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTextPane1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Full Name :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Fira Code SemiBold", 0, 24)); // NOI18N
        jLabel3.setText("Welcome to Furever Home!");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Age :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Phone Number :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Occupation :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Salary :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Pet History :");

        submit_button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Password :");

        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });

        fullName_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullName_fieldActionPerformed(evt);
            }
        });

        age_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age_fieldActionPerformed(evt);
            }
        });

        occupation_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupation_fieldActionPerformed(evt);
            }
        });

        salary_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak Berpenghasilan", "< 1.000.000", "1.000.000 - 2.500.000", "2.500.000 - 5.000.000", "> 5.000.000" }));
        salary_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salary_comboboxActionPerformed(evt);
            }
        });

        options_menu.setText("Options");

        loginOption_menuBar.setText("Login");
        options_menu.add(loginOption_menuBar);

        exitOption_menuBar.setText("Exit");
        options_menu.add(exitOption_menuBar);

        jMenuBar1.add(options_menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(password_passwordField)
                            .addComponent(fullName_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumber_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(occupation_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(petHistory_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salary_combobox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fullName_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(age_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phoneNumber_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(occupation_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(salary_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(petHistory_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(password_passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submit_button)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        // TODO add your handling code here:
        String username = username_field.getText();
        String fullname = fullName_field.getText();
        String occupation = occupation_field.getText();
        String petHistory = petHistory_field.getText();
        String phoneNumber = phoneNumber_field.getText();
        String password = password_passwordField.getText();
        String salary = (String) salary_combobox.getSelectedItem();
        
        if (username.equals("") || fullname.equals("") || occupation.equals("") || petHistory.equals("") || phoneNumber.equals("") || password.equals("") || salary.equals("") || age_field.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all the forms.");
        }
       
        else {
            int age = Integer.parseInt(age_field.getText());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                PreparedStatement ps = kon.con.prepareStatement("insert into tb_user(user_username, user_fullname, user_age, user_occupation, user_salary, user_petHistory, user_phoneNumber, user_password)"
                        + "values(?, ?, ?, ?, ?, ?, ?, ?)");

                ps.setString(1, username);
                ps.setString(2, fullname);
                ps.setInt(3, age);
                ps.setString(4, occupation);
                ps.setString(5, salary);
                ps.setString(6, petHistory);
                ps.setString(7, phoneNumber);
                ps.setString(8, password);

                ps.executeUpdate();

                close();
                User_Login login = new User_Login();
                login.setVisible(true);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Signup Error "+ex);
            }
        }
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    private void fullName_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullName_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullName_fieldActionPerformed

    private void age_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age_fieldActionPerformed

    private void occupation_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupation_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupation_fieldActionPerformed

    private void salary_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salary_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salary_comboboxActionPerformed

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
            java.util.logging.Logger.getLogger(User_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age_field;
    private javax.swing.JMenuItem exitOption_menuBar;
    private javax.swing.JTextField fullName_field;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenuItem loginOption_menuBar;
    private javax.swing.JTextField occupation_field;
    private javax.swing.JMenu options_menu;
    private javax.swing.JTextField password_field;
    private javax.swing.JPasswordField password_passwordField;
    private javax.swing.JTextField petHistory_field;
    private javax.swing.JTextField phoneNumber_field;
    private javax.swing.JComboBox<String> salary_combobox;
    private javax.swing.JTextField salary_field;
    private javax.swing.JButton submit_button;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables

    //change window icon
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.jpg")));
    }

    private void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
}