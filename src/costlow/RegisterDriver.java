/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package costlow;

import java.sql.Statement;
import java.awt.event.ItemEvent;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterDriver extends javax.swing.JFrame {
    private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/cost low";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
   
    public RegisterDriver() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameTfield = new javax.swing.JTextField();
        userTfield = new javax.swing.JTextField();
        emailTfield = new javax.swing.JTextField();
        phoneTfield = new javax.swing.JTextField();
        signinButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        cpassLabel = new javax.swing.JLabel();
        passPfield = new javax.swing.JPasswordField();
        cpassPfield = new javax.swing.JPasswordField();
        showpassCheckBox = new javax.swing.JCheckBox();
        showpassCheckBox1 = new javax.swing.JCheckBox();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(20, 27, 45));

        nameTfield.setBackground(new java.awt.Color(20, 27, 45));
        nameTfield.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        nameTfield.setForeground(new java.awt.Color(255, 255, 255));
        nameTfield.setBorder(null);

        userTfield.setBackground(new java.awt.Color(20, 27, 45));
        userTfield.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        userTfield.setForeground(new java.awt.Color(255, 255, 255));
        userTfield.setBorder(null);

        emailTfield.setBackground(new java.awt.Color(20, 27, 45));
        emailTfield.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        emailTfield.setForeground(new java.awt.Color(255, 255, 255));
        emailTfield.setBorder(null);

        phoneTfield.setBackground(new java.awt.Color(20, 27, 45));
        phoneTfield.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        phoneTfield.setForeground(new java.awt.Color(255, 255, 255));
        phoneTfield.setBorder(null);

        signinButton.setBackground(new java.awt.Color(0, 22, 60));
        signinButton.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        signinButton.setForeground(new java.awt.Color(255, 255, 255));
        signinButton.setText("SIGN IN");
        signinButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("NAME");

        userLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(255, 255, 255));
        userLabel.setText("USERNAME");

        phoneLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        phoneLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneLabel.setText("PHONE");

        passLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("PASSWORD");

        emailLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("ADDRESS");

        cpassLabel.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        cpassLabel.setForeground(new java.awt.Color(255, 255, 255));
        cpassLabel.setText("CONFIRM PASWORD");

        passPfield.setBackground(new java.awt.Color(20, 27, 45));
        passPfield.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        passPfield.setForeground(new java.awt.Color(255, 255, 255));
        passPfield.setBorder(null);

        cpassPfield.setBackground(new java.awt.Color(20, 27, 45));
        cpassPfield.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        cpassPfield.setForeground(new java.awt.Color(255, 255, 255));
        cpassPfield.setBorder(null);

        showpassCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        showpassCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        showpassCheckBox.setText("SHOW PASSWORD");
        showpassCheckBox.setBorderPaintedFlat(true);
        showpassCheckBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showpassCheckBoxItemStateChanged(evt);
            }
        });

        showpassCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        showpassCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        showpassCheckBox1.setText("SHOW PASSWORD");
        showpassCheckBox1.setBorderPaintedFlat(true);
        showpassCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showpassCheckBox1ItemStateChanged(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 22, 60));
        backButton.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("BACK");
        backButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costlow/pics/logo100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(nameTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(userTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(emailTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(phoneTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(passPfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(showpassCheckBox1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cpassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cpassPfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(showpassCheckBox))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signinButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(nameTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(userTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(emailTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(phoneTfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(passPfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(showpassCheckBox1)
                .addGap(11, 11, 11)
                .addComponent(cpassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(cpassPfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(showpassCheckBox)
                .addGap(27, 27, 27)
                .addComponent(signinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(backButton))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     private void saveToDatabase(String name, String username, String address, String phone, String password) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO employee_account (name, username, address, phone, password) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, username);
                preparedStatement.setString(3, address);
                preparedStatement.setString(4, phone);
                preparedStatement.setString(5, password);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
      private boolean usernameExists(String username) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT * FROM employee_account WHERE username = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, username);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return true;
        }
    }
      
      
    private boolean passwordExists(String password) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT * FROM employee_account WHERE password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, password);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return true;
        }
    }
        
    
    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
       String name = nameTfield.getText();
        String username = userTfield.getText();
        String email = emailTfield.getText();
        String phone = phoneTfield.getText();
        char[] passwordChars = passPfield.getPassword();
        String password = new String(passwordChars);
        char[] confirmPasswordChars = cpassPfield.getPassword();
        String confirmPassword = new String(confirmPasswordChars);

        if (password.equals(confirmPassword) && !usernameExists(username) && !passwordExists(password) && !name.isEmpty() && !username.isEmpty()
                && !email.isEmpty() && !phone.isEmpty() && !password.isEmpty()) {
            saveToDatabase(name, username, email, phone, password);
            JOptionPane.showMessageDialog(this, "ACCOUNT CREATED SUCCESSFULLY!");
            
            nameTfield.setText("");
            userTfield.setText("");
            emailTfield.setText("");
            phoneTfield.setText("");
            passPfield.setText("");
            cpassPfield.setText("");
            
            this.setVisible(false);
            new EmployeeLogIn().setVisible(true);
           
        } else {
            JOptionPane.showMessageDialog(this, "REGISTRATION FAILED: PLEASE CHECK YOUR CREDENTIALS OR CHANGE YOUR USERNAME AND PASSWORD AS IT MAY HAVE ALREADY EXISTS!");
        }
        
                
    }//GEN-LAST:event_signinButtonActionPerformed

    private void showpassCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showpassCheckBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            
            cpassPfield.setEchoChar((char) 0); // Set echo char to 0 to show characters
        } else {
            
            cpassPfield.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassCheckBoxItemStateChanged

    private void showpassCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showpassCheckBox1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            
            passPfield.setEchoChar((char) 0); // Set echo char to 0 to show characters
        } else {
            
            passPfield.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassCheckBox1ItemStateChanged

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
          this.setVisible(false);
       new EmployeeLogIn().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDriver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cpassLabel;
    private javax.swing.JPasswordField cpassPfield;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTfield;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passPfield;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTfield;
    private javax.swing.JCheckBox showpassCheckBox;
    private javax.swing.JCheckBox showpassCheckBox1;
    private javax.swing.JButton signinButton;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTfield;
    // End of variables declaration//GEN-END:variables
}
