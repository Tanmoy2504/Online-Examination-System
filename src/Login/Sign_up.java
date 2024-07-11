/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Connector.Methods;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Tanmoy Mitra & Himanshi Dewangan
 */
public class Sign_up extends javax.swing.JFrame {

    FileInputStream fistream;
    File pics;

    Connection con;
    PreparedStatement psmnt = null;
    ResultSet rs;
    // Methode to resize imageIcon with the same size of a Jlabel

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    String name;
    String pass;
    String gender;
    String email;
    String city;
    String contact;
    String role;
    String type;

    public Sign_up() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bugdb", "root", "root");
        } catch (Exception ex) {

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        namet = new javax.swing.JTextField();
        emailt = new javax.swing.JTextField();
        cityt = new javax.swing.JTextField();
        contactt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gendert = new javax.swing.JComboBox<>();
        rolet = new javax.swing.JComboBox<>();
        signup = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        passtext = new javax.swing.JPasswordField();
        label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Registration | Amity Exam Portal");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, 30));

        jLabel2.setText("Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, 30));

        jLabel3.setText("Email-Id :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, 30));

        jLabel4.setText("City :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        jLabel5.setText("Contact :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        namet.setText(" ");
        namet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametActionPerformed(evt);
            }
        });
        getContentPane().add(namet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 270, 30));

        emailt.setText(" ");
        getContentPane().add(emailt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 270, 30));

        cityt.setText("    ");
        getContentPane().add(cityt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 270, 30));

        contactt.setText("     ");
        contactt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttActionPerformed(evt);
            }
        });
        getContentPane().add(contactt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 150, 30));

        jLabel6.setText("Gender :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, 30));

        jLabel7.setText("Role :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        gendert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male","Female","Other"
        }));
        gendert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendertActionPerformed(evt);
            }
        });
        getContentPane().add(gendert, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 160, 30));

        rolet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student","Administrator" }));
        rolet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roletActionPerformed(evt);
            }
        });
        getContentPane().add(rolet, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 160, 30));

        signup.setBackground(new java.awt.Color(25, 72, 128));
        signup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Register");
        signup.setBorderPainted(false);
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, 100, 40));

        jLabel8.setText("Password :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, 30));
        getContentPane().add(passtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 270, 30));

        label.setText("                   Photo");
        label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 250, 151, 160));

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 430, 151, 30));

        jButton2.setBackground(new java.awt.Color(87, 184, 70));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 90, 80, 30));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Copyright © 2022 by Tanmoy Mitra & Himanshi Dewangan");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 720, -1, 20));

        jPanel1.setBackground(new java.awt.Color(25, 72, 128));
        jPanel1.setPreferredSize(new java.awt.Dimension(1025, 42));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Amity Exam Portal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(1124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        jPanel5.setBackground(new java.awt.Color(241, 184, 32));
        jPanel5.setMaximumSize(new java.awt.Dimension(1366, 4));
        jPanel5.setMinimumSize(new java.awt.Dimension(1366, 4));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        boolean status = Methods.emailvalidation(emailt.getText().trim());
        System.out.println("" + status);
        Methods mm = new Methods();
        name = namet.getText().trim();
        pass = passtext.getText().trim();

        try {
            if (mm.checkUserPass(name, pass) != 1 && status == true) {
                email = emailt.getText().trim();
                city = cityt.getText().trim();
                contact = contactt.getText().trim();
                gender = "" + gendert.getItemAt(gendert.getSelectedIndex());
                role = "" + rolet.getItemAt(rolet.getSelectedIndex());

                try {
                    psmnt = con.prepareStatement("insert into employee(emp_name,pass,gender,email_id,emp_city,emp_contact,role,images,status,result) values(?,?,?,?,?,?,?,?,?,?)");
                    psmnt.setString(1, name);
                    psmnt.setString(2, pass);
                    psmnt.setString(3, gender);
                    psmnt.setString(4, email);
                    psmnt.setString(5, city);
                    psmnt.setString(6, contact);
                    psmnt.setString(7, role);

                    psmnt.setBinaryStream(8, (InputStream) fistream, (int) (pics.length()));

                    psmnt.setString(9, "unverified");
                    psmnt.setString(10, "0");
                    int ros = psmnt.executeUpdate();
                    if (ros > 0) {

                        JOptionPane.showMessageDialog(null, "Registeration Successfull");
                        new Login().setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Try Again");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Exeption is" + e);

                }
            } else {
                JOptionPane.showMessageDialog(null, "User Exists or Invalid Email");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Exception" + e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_signupActionPerformed

    private void roletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roletActionPerformed

    private void contacttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttActionPerformed

    private void gendertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendertActionPerformed

    private void nametActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser files = new JFileChooser();
        files.setCurrentDirectory(new File(System.getProperty("user.home")));
        //filter the files
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        files.addChoosableFileFilter(filter);
        int result = files.showSaveDialog(null);

        //if the user click on save in Jfilechooser
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = null;
            file = files.getSelectedFile();
            String filename = file.getAbsolutePath();
            pics = new File(filename);
            try {
                fistream = new FileInputStream(pics);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Sign_up.class.getName()).log(Level.SEVERE, null, ex);
            }
            label.setIcon(ResizeImage(filename));
        } //if the user click on save in Jfilechooser
        else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No File Select");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Login().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cityt;
    private javax.swing.JTextField contactt;
    private javax.swing.JTextField emailt;
    private javax.swing.JComboBox<String> gendert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label;
    private javax.swing.JTextField namet;
    private javax.swing.JPasswordField passtext;
    private javax.swing.JComboBox<String> rolet;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
