/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GestionEmployees;

//import newTable.Table;
import DataBase.Absence;
import DataBase.DbConnection;
import GestionHotel.*;
import Palette.ScrollBar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import raven.glasspanepopup.GlassPanePopup;
//import static javax.swing.text.html.HTML.Tag.P;


public class GestionAbsence extends javax.swing.JPanel {

    public static int absmatric;
    public static List<DataBase.Absence> absence =new ArrayList<>();
   
    public GestionAbsence() throws SQLException {
        initComponents();
        // GlassPanePopup.install();
        cancel.setVisible(false);
        
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p=new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
     try{
           DefaultTableModel model=(DefaultTableModel) table.getModel();
   Connection con =DbConnection.getInstance().getConnection();
   Statement stmt=con.createStatement();
   
      ResultSet res=stmt.executeQuery("SELECT e.matricule ,e.nom,e.prenom ,e.see, a.absentTotal FROM absence a ,employe e "
              + "WHERE a.matricule=e.matricule AND  e.see=1");
      while (res.next()){
         
         model.addRow(new Object[]{
             res.getInt("matricule"),
             res.getString("nom"),
             res.getString("prenom"),
             res.getInt("absentTotal")
             
         });

      }
 }catch(Exception e){
     System.out.println("error"+e);
}
     
//   absence=DataBase.AbsenceDao.listAbs();
//   DefaultTableModel model=(DefaultTableModel) table.getModel();
//     absence.forEach(ab->{ 
//     model.addRow(new Object[]{
//       ab.getMatricul(),
//         ab.getNom(),
//         ab.getPrenom(),
//         ab.getTotale()
//});
// });
     
    
    
    }
public static boolean selectabs=false;
  
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
        panelCard4 = new Palette.PanelCard();
        cancel = new Palette.GradientButton();
        gradientButton2 = new Palette.GradientButton();
        search = new Palette.TextBox();
        jLabel2 = new javax.swing.JLabel();

        panel1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.disabledBackground"));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion Absence");

        gradientButton3.setForeground(new java.awt.Color(153, 153, 153));
        gradientButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/absent24.png"))); // NOI18N
        gradientButton3.setText("Absent Aujourd'huit");
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
                "Matricul", "Nom", "Prenom", "Total Absence"
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
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gradientButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradientButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradientButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gradientButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gradientButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gradientButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        panelCard4.setColor1(new java.awt.Color(47, 128, 237));
        panelCard4.setColor2(new java.awt.Color(86, 204, 242));

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

        javax.swing.GroupLayout panelCard4Layout = new javax.swing.GroupLayout(panelCard4);
        panelCard4.setLayout(panelCard4Layout);
        panelCard4Layout.setHorizontalGroup(
            panelCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard4Layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCard4Layout.setVerticalGroup(
            panelCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCard4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCard4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void gradientButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton3ActionPerformed

   if(selectabs==true){
       int x=table.getSelectedRow();
       String y=table.getValueAt(x, 0).toString();
       int matricabs=Integer.parseInt(y);
       DataBase.AbsenceDao.addAbs(matricabs);
       JOptionPane.showMessageDialog(this, "l'employe est enregistrer absent aujourd'huit");
   } else{
         JOptionPane.showMessageDialog(this, "selecter un employe avant de l'action");
     
   }    
        
        
    }//GEN-LAST:event_gradientButton3ActionPerformed
public static int histmatric;
    private void gradientButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton4ActionPerformed
   if(selectabs==true){
       int x=table.getSelectedRow();
       String y=table.getValueAt(x, 0).toString();
        histmatric=Integer.parseInt(y);
//               HistoriqueAbsence f1=new HistoriqueAbsence();
//   f1.setVisible(true);
   GlassPanePopup.showPopup(new HistoriqueAbsence());
   } else{
         JOptionPane.showMessageDialog(this, "selecter un employe avant de l'action");
     
   }   
      

    }//GEN-LAST:event_gradientButton4ActionPerformed

    private void gradientButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton5ActionPerformed
 if(selectabs==true){
       int x=table.getSelectedRow();
       String y=table.getValueAt(x, 0).toString();
      int  delmatric=Integer.parseInt(y);
   DataBase.AbsenceDao.deletabs(delmatric);
       JOptionPane.showMessageDialog(this, " employe supprimer avec succe");
     
   } else{
         JOptionPane.showMessageDialog(this, "selecter un employe avant la supprission");
     
   }       
    }//GEN-LAST:event_gradientButton5ActionPerformed
public static String  nom;
public static int totabs;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       
        selectabs=true;
         int x=table.getSelectedRow();
       String y=table.getValueAt(x, 0).toString();
        histmatric=Integer.parseInt(y);
        nom=table.getValueAt(x, 1).toString()+" "+table.getValueAt(x, 2).toString();
        totabs=Integer.parseInt(table.getValueAt(x, 3).toString());
    }//GEN-LAST:event_tableMouseClicked

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
 ResultSet res=stmt.executeQuery("SELECT e.matricule ,e.nom,e.prenom ,e.see, a.absentTotal FROM absence a ,employe e "
                     + "WHERE a.matricule=e.matricule AND  e.see=1");
          
            while(res.next()){
                model.addRow(new Object[]{
                
             res.getInt("matricule"),
             res.getString("nom"),
             res.getString("prenom"),
             res.getInt("absentTotal")

                });
            }
            cancel.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(GestionAbsence.class.getName()).log(Level.SEVERE, null, ex);
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

            
      ResultSet res=stmt.executeQuery("SELECT e.matricule ,e.nom,e.prenom ,e.see, a.absentTotal FROM absence a ,employe e "
                   + "WHERE a.matricule=e.matricule AND  e.see=1 AND e.matricule="+Integer.parseInt(search.getText())+"");
     
            while(res.next()){
                model.addRow(new Object[]{
               res.getInt("matricule"),
             res.getString("nom"),
             res.getString("prenom"),
             res.getInt("absentTotal")

                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionAbsence.class.getName()).log(Level.SEVERE, null, ex);
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
    private Palette.PanelCard panelCard4;
    private Palette.TextBox search;
    private javax.swing.JScrollPane spTable;
    private newTable.Table table;
    // End of variables declaration//GEN-END:variables
}
