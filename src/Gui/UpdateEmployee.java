/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author aamir
 */
public class UpdateEmployee extends javax.swing.JFrame {

    /**
     * Creates new form UpdateCustomers
     */
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs,rs1;
    PreparedStatement pst,pst1;    
    String id;
    byte[] image =null, image1 =null;
    File file,file1;
   JFileChooser jfc,jfc1;
   String imagepath,imagepath1;
    public UpdateEmployee() {
        initComponents();
        conn = ConnectDB.dbConnector();
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
        updatePanelEmployee = new javax.swing.JLayeredPane();
        update_btn_employee = new javax.swing.JButton();
        withdraw_btn_func2 = new javax.swing.JButton();
        search_btn_update_emp = new javax.swing.JButton();
        id_update = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        fname_update = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lname_update = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        dob_update = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        nation_update = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        mobile_update = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        gender_update = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        job_update = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        email_update = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        add_update = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        pin_update = new javax.swing.JTextField();
        idimage = new javax.swing.JLabel();
        browse_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(3, 64, 238), 2));

        updatePanelEmployee.setBackground(new java.awt.Color(208, 40, 203));
        updatePanelEmployee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 15, 219)));

        update_btn_employee.setBackground(new java.awt.Color(0, 6, 255));
        update_btn_employee.setForeground(new java.awt.Color(254, 254, 254));
        update_btn_employee.setText("Update");
        update_btn_employee.setOpaque(true);
        update_btn_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btn_employeeActionPerformed(evt);
            }
        });

        withdraw_btn_func2.setBackground(new java.awt.Color(0, 6, 255));
        withdraw_btn_func2.setForeground(new java.awt.Color(254, 254, 254));
        withdraw_btn_func2.setText("Delete");
        withdraw_btn_func2.setOpaque(true);
        withdraw_btn_func2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraw_btn_func2ActionPerformed(evt);
            }
        });

        search_btn_update_emp.setBackground(new java.awt.Color(0, 6, 255));
        search_btn_update_emp.setForeground(new java.awt.Color(254, 254, 254));
        search_btn_update_emp.setText("Search");
        search_btn_update_emp.setOpaque(true);
        search_btn_update_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btn_update_empActionPerformed(evt);
            }
        });

        id_update.setForeground(new java.awt.Color(27, 27, 27));

        jLabel44.setForeground(new java.awt.Color(27, 27, 27));
        jLabel44.setText("ID");

        fname_update.setForeground(new java.awt.Color(27, 27, 27));

        jLabel50.setForeground(new java.awt.Color(27, 27, 27));
        jLabel50.setText("Fname");

        jLabel51.setForeground(new java.awt.Color(27, 27, 27));
        jLabel51.setText("Lname");

        lname_update.setForeground(new java.awt.Color(27, 27, 27));

        jLabel52.setForeground(new java.awt.Color(27, 27, 27));
        jLabel52.setText("DOB");

        dob_update.setForeground(new java.awt.Color(27, 27, 27));

        jLabel53.setForeground(new java.awt.Color(27, 27, 27));
        jLabel53.setText("Nationality");

        nation_update.setForeground(new java.awt.Color(27, 27, 27));

        jLabel54.setForeground(new java.awt.Color(27, 27, 27));
        jLabel54.setText("Mobile");

        mobile_update.setForeground(new java.awt.Color(27, 27, 27));

        jLabel55.setForeground(new java.awt.Color(27, 27, 27));
        jLabel55.setText("Gender");

        gender_update.setForeground(new java.awt.Color(27, 27, 27));

        jLabel56.setForeground(new java.awt.Color(27, 27, 27));
        jLabel56.setText("Job Description");

        job_update.setForeground(new java.awt.Color(27, 27, 27));

        jLabel57.setForeground(new java.awt.Color(27, 27, 27));
        jLabel57.setText("email");

        email_update.setForeground(new java.awt.Color(27, 27, 27));

        jLabel58.setForeground(new java.awt.Color(27, 27, 27));
        jLabel58.setText("Address");

        add_update.setForeground(new java.awt.Color(27, 27, 27));

        jLabel59.setForeground(new java.awt.Color(27, 27, 27));
        jLabel59.setText("Pin");

        pin_update.setForeground(new java.awt.Color(27, 27, 27));

        idimage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(2, 5, 253), 3, true));

        browse_btn.setBackground(new java.awt.Color(0, 6, 255));
        browse_btn.setForeground(new java.awt.Color(254, 254, 254));
        browse_btn.setText("Browse");
        browse_btn.setOpaque(true);
        browse_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_btnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu Thin", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 5, 122));
        jLabel2.setText("Upadate Employee");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_filled_cancel_32px.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        updatePanelEmployee.setLayer(update_btn_employee, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(withdraw_btn_func2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(search_btn_update_emp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(id_update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(jLabel44, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(fname_update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(jLabel50, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(jLabel51, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(lname_update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(jLabel52, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(dob_update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(jLabel53, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(nation_update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(jLabel54, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(mobile_update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(jLabel55, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(gender_update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(jLabel56, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(job_update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(jLabel57, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(email_update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(jLabel58, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(add_update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(jLabel59, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(pin_update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(idimage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(browse_btn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        updatePanelEmployee.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout updatePanelEmployeeLayout = new javax.swing.GroupLayout(updatePanelEmployee);
        updatePanelEmployee.setLayout(updatePanelEmployeeLayout);
        updatePanelEmployeeLayout.setHorizontalGroup(
            updatePanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatePanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                        .addGroup(updatePanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                .addComponent(id_update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search_btn_update_emp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                .addGap(132, 132, 132))
                            .addComponent(fname_update)
                            .addComponent(lname_update)
                            .addComponent(mobile_update)
                            .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(109, 109, 109))
                            .addComponent(nation_update)
                            .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(105, 105, 105))
                            .addComponent(dob_update)
                            .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(146, 146, 146))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelEmployeeLayout.createSequentialGroup()
                                .addGroup(updatePanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                        .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(33, 33, 33)))
                                .addGap(132, 132, 132))
                            .addComponent(gender_update)
                            .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(114, 114, 114)))
                        .addGap(18, 18, 18)
                        .addGroup(updatePanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(browse_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(updatePanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idimage, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                        .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                        .addGap(158, 158, 158))
                                    .addComponent(email_update)
                                    .addComponent(job_update)
                                    .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                        .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(139, 139, 139))
                                    .addComponent(add_update)
                                    .addComponent(pin_update, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                        .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(150, 150, 150))
                                    .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                        .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(86, 86, 86)))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelEmployeeLayout.createSequentialGroup()
                        .addComponent(update_btn_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(110, 110, 110)
                        .addComponent(withdraw_btn_func2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(91, 91, 91))))
            .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );
        updatePanelEmployeeLayout.setVerticalGroup(
            updatePanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelEmployeeLayout.createSequentialGroup()
                .addGroup(updatePanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(jLabel7))
                .addGap(50, 50, 50)
                .addGroup(updatePanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updatePanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(id_update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))
                            .addComponent(search_btn_update_emp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fname_update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updatePanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelEmployeeLayout.createSequentialGroup()
                        .addGroup(updatePanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(updatePanelEmployeeLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(browse_btn))
                        .addGap(18, 18, 18)
                        .addComponent(lname_update, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(dob_update, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nation_update, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(mobile_update, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gender_update, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelEmployeeLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(job_update, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(email_update, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(add_update, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pin_update, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(updatePanelEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdraw_btn_func2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_btn_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(updatePanelEmployee)
                    .addGap(0, 0, 0)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(updatePanelEmployee)
                    .addGap(1, 1, 1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void update_btn_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btn_employeeActionPerformed
        //update employee `emp_Number`=?,
        String sql ="UPDATE `Employee` SET `fname`=?,`lname`=?,`DOB`=?,`Nationality`=?,`Mobile`=?,`Gender`=?,`Job_Description`=?,`email`=?,`Address`=?,`Pin`=?,`image`=? WHERE emp_Number=?";
        try {
            InputStream is = new FileInputStream(new File(imagepath));
            pst = conn.prepareStatement(sql);
            pst.setString(1, fname_update.getText());
            pst.setString(2, lname_update.getText());
            pst.setString(3, dob_update.getText());
            pst.setString(4, nation_update.getText());
            pst.setString(5, mobile_update.getText());
            pst.setString(6, gender_update.getText());
            pst.setString(7, job_update.getText());
            pst.setString(8, email_update.getText());
            pst.setString(9, add_update.getText());
            pst.setString(10, pin_update.getText());
            pst.setBlob(11, is);
            pst.setString(12, id_update.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Updated");
            fname_update.setText("");
            lname_update.setText("");
            dob_update.setText("");
            nation_update.setText("");
            mobile_update.setText("");
            gender_update.setText("");
            job_update.setText("");
            email_update.setText("");
            add_update.setText("");
            pin_update.setText("");
            //idimage.remove(0);
        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NullPointerException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_btn_employeeActionPerformed

    private void withdraw_btn_func2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdraw_btn_func2ActionPerformed
        //delete employee
        String sql= "DELETE FROM `Employee` WHERE emp_Number = ?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, id_update.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"One record Deleted");
            id_update.setText("");
            fname_update.setText("");
            lname_update.setText("");
            job_update.setText("");
            mobile_update.setText("");
            dob_update.setText("");
            add_update.setText("");
            nation_update.setText("");
            email_update.setText("");
            idimage.setIcon(null);
            pin_update.setText("");
            gender_update.setText("");
        }catch(Exception e){

        }
    }//GEN-LAST:event_withdraw_btn_func2ActionPerformed

    private void search_btn_update_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btn_update_empActionPerformed
        //update_search
        //search the id and set details on the form
        String sql = "select * from Employee where emp_Number =?";
        String getuserid = id_update.getText();
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, getuserid);
            rs = pst.executeQuery();

            if(rs.next()){
                fname_update.setText(rs.getString("fname"));
                lname_update.setText(rs.getString("lname"));
                job_update.setText(rs.getString("Job_Description"));
                dob_update.setText(rs.getString("DOB"));
                nation_update.setText(rs.getString("Nationality"));
                mobile_update.setText(rs.getString("Mobile"));
                email_update.setText(rs.getString("email"));
                add_update.setText(rs.getString("Address"));
                gender_update.setText(rs.getString("Gender"));
                pin_update.setText(rs.getString("Pin"));

                //set icon img
                image = rs.getBytes("image");
                Image img = Toolkit.getDefaultToolkit().createImage(image);
                Image imagedResized=img.getScaledInstance(idimage.getWidth(),idimage.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon imageIcon=new ImageIcon(imagedResized);
                idimage.setIcon(imageIcon);
                rs.close();
                pst.close();

            }
            else{
                JDialog dialog = new JDialog();
                dialog.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(dialog, "please enter your correct account number",null,JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_search_btn_update_empActionPerformed

    private void browse_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_btnActionPerformed
        //browse btn
        //select image
        jfc=new JFileChooser();
        if(jfc.showOpenDialog(idimage)==JFileChooser.APPROVE_OPTION){

            Toolkit toolkit=Toolkit.getDefaultToolkit();
            Image image=toolkit.getImage(jfc.getSelectedFile().getAbsolutePath());
            Image imagedResized=image.getScaledInstance(idimage.getWidth(),idimage.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon imageIcon=new ImageIcon(imagedResized);

            idimage.setIcon(imageIcon);
            //lblnmfile.setText(jfc.getSelectedFile().getName());

            file=new File(jfc.getSelectedFile().getPath());
            String path = jfc.getSelectedFile().getAbsolutePath();

            //String path=new File(".").getCanonicalPath();
            //FileUtils.copyFileToDirectory(file, new File(path+"/image"));
            imagepath = path;
            //System.out.println(s);
        }
    }//GEN-LAST:event_browse_btnActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_update;
    private javax.swing.JButton browse_btn;
    private javax.swing.JTextField dob_update;
    private javax.swing.JTextField email_update;
    private javax.swing.JTextField fname_update;
    private javax.swing.JTextField gender_update;
    private javax.swing.JTextField id_update;
    private javax.swing.JLabel idimage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField job_update;
    private javax.swing.JTextField lname_update;
    private javax.swing.JTextField mobile_update;
    private javax.swing.JTextField nation_update;
    private javax.swing.JTextField pin_update;
    private javax.swing.JButton search_btn_update_emp;
    private javax.swing.JLayeredPane updatePanelEmployee;
    private javax.swing.JButton update_btn_employee;
    private javax.swing.JButton withdraw_btn_func2;
    // End of variables declaration//GEN-END:variables
}