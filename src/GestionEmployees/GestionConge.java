/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GestionEmployees;

//import newTable.Table;
import static DataBase.CongeDao.soldeconge;
import DataBase.DbConnection;

import GestionHotel.*;
import Palette.ScrollBar;
import java.awt.Color;
import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import raven.glasspanepopup.GlassPanePopup;
//import static javax.swing.text.html.HTML.Tag.P;


public class GestionConge extends javax.swing.JPanel {

    
  
   
    public GestionConge() throws SQLException {
        initComponents();
        
     cancel.setVisible(false);
        
               
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p=new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    
        DefaultTableModel model=(DefaultTableModel) table.getModel();
    
         try{
     Connection con =DbConnection.getInstance().getConnection();
   Statement stmt=con.createStatement();        
        
      ResultSet res=stmt.executeQuery("SELECT e.matricule ,e.nom,e.prenom,e.dateembauche ,e.see,c.totalsortie,c.solde FROM conge c,employe e WHERE c.matricule=e.matricule  AND  e.see=1");
      while (res.next()){
     soldeconge(res.getInt("matricule"),res.getDate("dateembauche"),res.getInt("totalsortie"));
     
         model.addRow(new Object[]{
             res.getInt("matricule"),
             res.getString("nom"),
             res.getString("prenom"),
             res.getInt("totalsortie"),
                 res.getInt("solde")
             
         });
    
      }
 }catch(Exception e){
     System.out.println("error"+e);
}
     
    
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new Palette.Panel();
        panel2 = new Palette.Panel();
        jLabel1 = new javax.swing.JLabel();
        gradientButton3 = new Palette.GradientButton();
        gradientButton4 = new Palette.GradientButton();
        spTable = new javax.swing.JScrollPane();
        table = new newTable.Table();
        gradientButton5 = new Palette.GradientButton();
        panelCard3 = new Palette.PanelCard();
        cancel = new Palette.GradientButton();
        gradientButton2 = new Palette.GradientButton();
        search = new Palette.TextBox();
        jLabel2 = new javax.swing.JLabel();

        panel1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.disabledBackground"));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion Conge");

        gradientButton3.setForeground(new java.awt.Color(153, 153, 153));
        gradientButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/new24.png"))); // NOI18N
        gradientButton3.setText("Nouveau Demande");
        gradientButton3.setBorderRadius(50);
        gradientButton3.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton3.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton3ActionPerformed(evt);
            }
        });

        gradientButton4.setForeground(new java.awt.Color(153, 153, 153));
        gradientButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/view24.png"))); // NOI18N
        gradientButton4.setText("Historique");
        gradientButton4.setBorderRadius(50);
        gradientButton4.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton4.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton4ActionPerformed(evt);
            }
        });

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricule", "Nom", "Prenom", "Total jours sortie", "Solde rester"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        spTable.setViewportView(table);

        gradientButton5.setForeground(new java.awt.Color(153, 153, 153));
        gradientButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/delet24.png"))); // NOI18N
        gradientButton5.setText("Supprimer");
        gradientButton5.setBorderRadius(50);
        gradientButton5.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton5.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gradientButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradientButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradientButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradientButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradientButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradientButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        panelCard3.setColor1(new java.awt.Color(47, 128, 237));
        panelCard3.setColor2(new java.awt.Color(86, 204, 242));

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/cancel.png"))); // NOI18N
        cancel.setBorderRadius(50);
        cancel.setColor1(new java.awt.Color(204, 0, 51));
        cancel.setColor2(new java.awt.Color(204, 0, 51));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        gradientButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/search.png"))); // NOI18N
        gradientButton2.setBorderRadius(50);
        gradientButton2.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton2.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton2ActionPerformed(evt);
            }
        });

        search.setBorder(null);
        search.setForeground(new java.awt.Color(0, 0, 0));
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matricule : ");

        javax.swing.GroupLayout panelCard3Layout = new javax.swing.GroupLayout(panelCard3);
        panelCard3.setLayout(panelCard3Layout);
        panelCard3Layout.setHorizontalGroup(
            panelCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard3Layout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCard3Layout.setVerticalGroup(
            panelCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCard3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCard3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gradientButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton3ActionPerformed
      
        if(selectedcng==true){
            
            
       Sorticonge b=new Sorticonge();
       b.setVisible(true);  
        //GlassPanePopup.showPopup(new Sorticonge());
        }else{
            JOptionPane.showMessageDialog(this, "selecter un employe anant passe a l'action");
        }
        
        
     
    }//GEN-LAST:event_gradientButton3ActionPerformed

    private void gradientButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton4ActionPerformed
     if(selectedcng==true){
            
          HistoriqueConge  f1=new HistoriqueConge();
   f1.setVisible(true);   
              GlassPanePopup.showPopup(new HistoriqueConge());
        }else{
            JOptionPane.showMessageDialog(this, "selecter un employee");
        }
       
    }//GEN-LAST:event_gradientButton4ActionPerformed

    public static String fullnom;
    public static int matricdemande;
    public static int histomatric;
    public static boolean selectedcng=false;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       selectedcng=true;
       
       
         int x=table.getSelectedRow();
       String y=table.getValueAt(x, 0).toString();
        matricdemande=Integer.parseInt(y);
        fullnom=table.getValueAt(x, 1).toString()+" "+table.getValueAt(x, 2).toString();
       histomatric=Integer.parseInt(y);
        
        
        
        
        
        
    }//GEN-LAST:event_tableMouseClicked

    private void gradientButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton5ActionPerformed
        if(selectedcng==true){
            
                  int x=table.getSelectedRow();
       String y=table.getValueAt(x, 0).toString();
      int  delmatric=Integer.parseInt(y);
   DataBase.CongeDao.deleteconge(delmatric);
       JOptionPane.showMessageDialog(this, " employe supprimer avec succe");
     
   } else{
         JOptionPane.showMessageDialog(this, "selecter un employe avant la supprission");
     
   }  
            
       
    }//GEN-LAST:event_gradientButton5ActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       
        try {
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            while(model.getRowCount()>0){
                model.removeRow(0);
            }
            table.repaint();;
            table.revalidate();
            search.setText("");

            Connection con=DbConnection.getInstance().getConnection();
            Statement stmt=con.createStatement();

            ResultSet res=stmt.executeQuery("SELECT e.matricule ,e.nom,e.prenom,e.dateembauche ,e.see,c.totalsortie,c.solde FROM conge c,employe e"
                    + " WHERE c.matricule=e.matricule  AND  e.see=1 ");
     
            while(res.next()){
                model.addRow(new Object[]{
                     res.getInt("matricule"),
             res.getString("nom"),
             res.getString("prenom"),
             res.getInt("totalsortie"),
                 res.getInt("solde")

                });
            }
            cancel.setVisible(false);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(GestionConge.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_cancelActionPerformed

    private void gradientButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton2ActionPerformed

        try {
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            while(model.getRowCount()>0){
                model.removeRow(0);
            }
            table.repaint();;
            table.revalidate();
            cancel.setVisible(true);

            Connection con=DbConnection.getInstance().getConnection();
            Statement stmt=con.createStatement();

           ResultSet res=stmt.executeQuery("SELECT e.matricule ,e.nom,e.prenom,e.dateembauche ,e.see,c.totalsortie,c.solde FROM conge c,employe e"
                    + " WHERE c.matricule=e.matricule  AND  e.see=1 AND e.matricule="+Integer.parseInt(search.getText()));
            while(res.next()){
                model.addRow(new Object[]{
                       res.getInt("matricule"),
             res.getString("nom"),
             res.getString("prenom"),
             res.getInt("totalsortie"),
                 res.getInt("solde")

                });
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(GestionConge.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_gradientButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.GradientButton cancel;
    private Palette.GradientButton gradientButton2;
    private Palette.GradientButton gradientButton3;
    private Palette.GradientButton gradientButton4;
    private Palette.GradientButton gradientButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Palette.Panel panel1;
    private Palette.Panel panel2;
    private Palette.PanelCard panelCard3;
    private Palette.TextBox search;
    private javax.swing.JScrollPane spTable;
    private newTable.Table table;
    // End of variables declaration//GEN-END:variables
}
