/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GestionRestaurant;

//import newTable.Table;
import DataBase.DbConnection;

import Palette.ScrollBar;
import java.sql.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
//import static javax.swing.text.html.HTML.Tag.P;


public class GestionRepas extends javax.swing.JPanel {

    
  
   
    public GestionRepas() {
        try {
            initComponents();
            
            
            spTable.setVerticalScrollBar(new ScrollBar());
            spTable.getVerticalScrollBar().setBackground(Color.WHITE);
            spTable.getViewport().setBackground(Color.WHITE);
            JPanel p=new JPanel();
            p.setBackground(Color.WHITE);
            spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
              DefaultTableModel model =(DefaultTableModel) table.getModel();
            Connection con=DbConnection.getInstance().getConnection();
            Statement stmt=con.createStatement();
            
            String sql="SELECT * FROM repas WHERE showing=1";
            ResultSet res=stmt.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{
                res.getInt("id"),
                    res.getString("nom"),
                    res.getString("categorie"),
                    res.getFloat("prix")
                
                });
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionRepas.class.getName()).log(Level.SEVERE, null, ex);
        }
    
     
     
    
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new Palette.Panel();
        panel2 = new Palette.Panel();
        jLabel1 = new javax.swing.JLabel();
        gradientPanel1 = new Palette.GradientPanel();
        gradientButton1 = new Palette.GradientButton();
        gradientButton3 = new Palette.GradientButton();
        gradientButton4 = new Palette.GradientButton();
        gradientPanel2 = new Palette.GradientPanel();
        spTable = new javax.swing.JScrollPane();
        table = new newTable.Table();
        catego = new javax.swing.JComboBox<>();

        panel1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.disabledBackground"));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion Repas");

        gradientPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Menu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 48), new java.awt.Color(255, 255, 255))); // NOI18N
        gradientPanel1.setColor1(new java.awt.Color(102, 102, 255));
        gradientPanel1.setColor2(new java.awt.Color(51, 0, 153));

        gradientButton1.setText("Modifier ");
        gradientButton1.setActionCommand("");
        gradientButton1.setColor1(new java.awt.Color(0, 0, 255));
        gradientButton1.setColor2(new java.awt.Color(153, 204, 255));
        gradientButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        gradientButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton1ActionPerformed(evt);
            }
        });

        gradientButton3.setText("Supprimer");
        gradientButton3.setColor1(new java.awt.Color(0, 0, 255));
        gradientButton3.setColor2(new java.awt.Color(153, 204, 255));
        gradientButton3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        gradientButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton3ActionPerformed(evt);
            }
        });

        gradientButton4.setText("Nouveau Repas");
        gradientButton4.setActionCommand("");
        gradientButton4.setColor1(new java.awt.Color(0, 0, 255));
        gradientButton4.setColor2(new java.awt.Color(153, 204, 255));
        gradientButton4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        gradientButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton4ActionPerformed(evt);
            }
        });

        gradientPanel2.setColor1(new java.awt.Color(255, 255, 255));
        gradientPanel2.setColor2(new java.awt.Color(255, 255, 255));

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ref", "Nom", "Categorie", "Prix"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        catego.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        catego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tout", "Pizza", "Sandwich", "Coffe", "Glassier" }));
        catego.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Categorie ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(153, 153, 153))); // NOI18N
        catego.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(gradientButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gradientButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                            .addComponent(gradientButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(catego, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 231, Short.MAX_VALUE))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(gradientButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gradientButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(catego, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gradientButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton1ActionPerformed
       
       if(selectrepas==true){
              int x=table.getSelectedRow();
      editid=Integer.parseInt(table.getValueAt(x, 0).toString());
        ModifierRepas m2=new ModifierRepas();
          m2.setVisible(true);
       }else{
            JOptionPane.showMessageDialog(this, "selecter un repas avant de passer à l'action"); 
       }
    }//GEN-LAST:event_gradientButton1ActionPerformed

    private void gradientButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton3ActionPerformed
 if(selectrepas==true){
              int x=table.getSelectedRow();
      editid=Integer.parseInt(table.getValueAt(x, 0).toString());
       DataBase.RepasDao.deleterepas(editid);
       JOptionPane.showMessageDialog(this, "repas supprimer avec succès "); 
       }else{
            JOptionPane.showMessageDialog(this, "selecter un repas avant de passer à l'action"); 
       }

    }//GEN-LAST:event_gradientButton3ActionPerformed

    private void gradientButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton4ActionPerformed
     
        AjouterRepas a2=new AjouterRepas();
        a2.setVisible(true);
        
        
    }//GEN-LAST:event_gradientButton4ActionPerformed
public static int editid;
public boolean selectrepas=false;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
     
        
        
        int x=table.getSelectedRow();
      editid=Integer.parseInt(table.getValueAt(x, 0).toString());
        
        selectrepas=true;
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_tableMouseClicked

    private void categoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoItemStateChanged

        try {
            DefaultTableModel model =(DefaultTableModel) table.getModel();
            while(model.getRowCount()>0){
                model.removeRow(0);
            }
            table.repaint();
            table.revalidate();
            Connection con=DbConnection.getInstance().getConnection();
            Statement stmt=con.createStatement();
            String sql;
            if(catego.getSelectedItem().equals("Tout")){
                sql="SELECT * FROM repas WHERE showing=1 ";
            }else{

                sql="SELECT * FROM repas WHERE showing=1 AND categorie='"+catego.getSelectedItem()+"'";
            }
            ResultSet res=stmt.executeQuery(sql);
            while(res.next()){
                table.addRow(new Object[]{
                    res.getInt("id"),
                    res.getString("nom"),
                    res.getString("categorie"),
                    res.getFloat("prix")

                });

            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionCommande.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_categoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> catego;
    private Palette.GradientButton gradientButton1;
    private Palette.GradientButton gradientButton3;
    private Palette.GradientButton gradientButton4;
    private Palette.GradientPanel gradientPanel1;
    private Palette.GradientPanel gradientPanel2;
    private javax.swing.JLabel jLabel1;
    private Palette.Panel panel1;
    private Palette.Panel panel2;
    private javax.swing.JScrollPane spTable;
    private newTable.Table table;
    // End of variables declaration//GEN-END:variables
}
