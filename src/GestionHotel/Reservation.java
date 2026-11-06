/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GestionHotel;

//import newTable.Table;
import DataBase.DbConnection;
import Palette.ScrollBar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
//import static javax.swing.text.html.HTML.Tag.P;


public class Reservation extends javax.swing.JPanel {

    public static void updateetat(LocalDate x,String datesortir,int nbrch){
        try {
            Connection con =DbConnection.getInstance().getConnection();
            Statement stmt=con.createStatement();
            
            
            LocalDate date2 = LocalDate.parse(datesortir);
            int comparison = x.compareTo(date2);
            
            if(comparison>0){
                
                String sql1="UPDATE chambre set etat='disponible' WHERE nchambre="+nbrch;
                stmt.execute(sql1);
            }else if(comparison<0){
                
               String sql1="UPDATE chambre set etat='occupe' WHERE nchambre="+nbrch;
                stmt.execute(sql1);  
            }
        } catch (SQLException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
  
   
    public Reservation() {
        initComponents();
          DefaultTableModel model=(DefaultTableModel) table.getModel();
            cancel.setVisible(false);
        
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p=new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
    
         try{
   Connection con =DbConnection.getInstance().getConnection();
   Statement stmt=con.createStatement();
 
       

      ResultSet res=stmt.executeQuery("select * from reservation ");
      while (res.next()){
      
        model.addRow(new Object[]{
            res.getInt("numreservation"),
           res.getInt("nchambre"),
         res.getString("cinclient"),
          res.getDate("dateentre"),
          res.getDate("datesortie"),
            res.getInt("nbrnuit"),
          res.getInt("tariftotal"),
       });
        updateetat(LocalDate.now(),res.getDate("datesortie").toString(),res.getInt("nchambre"));
       } 
      
      
  }catch(SQLException ex){
         System.out.println("Db Errors "+ex);
  }
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new Palette.Panel();
        panel2 = new Palette.Panel();
        jLabel1 = new javax.swing.JLabel();
        gradientButton3 = new Palette.GradientButton();
        gradientButton1 = new Palette.GradientButton();
        spTable = new javax.swing.JScrollPane();
        table = new newTable.Table();
        gradientButton5 = new Palette.GradientButton();
        panelCard1 = new Palette.PanelCard();
        jLabel2 = new javax.swing.JLabel();
        search = new Palette.TextBox();
        gradientButton2 = new Palette.GradientButton();
        cancel = new Palette.GradientButton();

        panel1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.disabledBackground"));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List Reservation");

        gradientButton3.setForeground(new java.awt.Color(153, 153, 153));
        gradientButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/new24.png"))); // NOI18N
        gradientButton3.setText("Nouveau");
        gradientButton3.setBorderRadius(50);
        gradientButton3.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton3.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton3ActionPerformed(evt);
            }
        });

        gradientButton1.setForeground(new java.awt.Color(153, 153, 153));
        gradientButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/edit24.png"))); // NOI18N
        gradientButton1.setText("Modifier");
        gradientButton1.setBorderRadius(50);
        gradientButton1.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton1.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton1ActionPerformed(evt);
            }
        });

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num Reservation", "N Chambre", "CIN Client", "Date Entrer", "Date Sorti", "Nmbr Nuit", "Tarif Total"
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
                .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradientButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradientButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradientButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        panelCard1.setColor1(new java.awt.Color(47, 128, 237));
        panelCard1.setColor2(new java.awt.Color(86, 204, 242));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matricule : ");

        search.setBorder(null);
        search.setForeground(new java.awt.Color(0, 0, 0));
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        gradientButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/search.png"))); // NOI18N
        gradientButton2.setBorderRadius(50);
        gradientButton2.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton2.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton2ActionPerformed(evt);
            }
        });

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/cancel.png"))); // NOI18N
        cancel.setBorderRadius(50);
        cancel.setColor1(new java.awt.Color(204, 0, 51));
        cancel.setColor2(new java.awt.Color(204, 0, 51));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCard1Layout = new javax.swing.GroupLayout(panelCard1);
        panelCard1.setLayout(panelCard1Layout);
        panelCard1Layout.setHorizontalGroup(
            panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard1Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCard1Layout.setVerticalGroup(
            panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
       
        
        AddReservation a5=new AddReservation();
       a5.setVisible(true);
    }//GEN-LAST:event_gradientButton3ActionPerformed
public static int numres;
    private void gradientButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton1ActionPerformed
    if(selectedres==true){
        int x=table.getSelectedRow();
        numres=Integer.parseInt(table.getValueAt(x, 0).toString());
     EditReservation a6=new EditReservation();
      a6.setVisible(true);   
    }else{
        JOptionPane.showMessageDialog(this, "selecter la reservation avant de passer a l'action");
    }
      
        
        
    }//GEN-LAST:event_gradientButton1ActionPerformed
public static boolean selectedres=false;
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
    selectedres=true;
     int x=table.getSelectedRow();
        numres=Integer.parseInt(table.getValueAt(x, 0).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void gradientButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton5ActionPerformed
   
      if(selectedres==true){
        int x=table.getSelectedRow();
        numres=Integer.parseInt(table.getValueAt(x, 0).toString());
     DataBase.ReservationDao.deletereserv(numres);
      JOptionPane.showMessageDialog(this, "la reservation supprimer avec succes");
    }else{
        JOptionPane.showMessageDialog(this, "selecter la reservation avant de passer a l'action");
    }  
        
        
    }//GEN-LAST:event_gradientButton5ActionPerformed

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

           
      ResultSet res=stmt.executeQuery("select * from reservation WHERE cinclient='"+search.getText()+"'");
      while (res.next()){
      
        model.addRow(new Object[]{
            res.getInt("numreservation"),
           res.getInt("nchambre"),
         res.getString("cinclient"),
          res.getDate("dateentre"),
          res.getDate("datesortie"),
            res.getInt("nbrnuit"),
          res.getInt("tariftotal"),
       });
       }
        } catch (SQLException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_gradientButton2ActionPerformed

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

          
      ResultSet res=stmt.executeQuery("select * from reservation ");
      while (res.next()){
      
        model.addRow(new Object[]{
            res.getInt("numreservation"),
           res.getInt("nchambre"),
         res.getString("cinclient"),
          res.getDate("dateentre"),
          res.getDate("datesortie"),
            res.getInt("nbrnuit"),
          res.getInt("tariftotal"),
       });
       }
            cancel.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.GradientButton cancel;
    private Palette.GradientButton gradientButton1;
    private Palette.GradientButton gradientButton2;
    private Palette.GradientButton gradientButton3;
    private Palette.GradientButton gradientButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Palette.Panel panel1;
    private Palette.Panel panel2;
    private Palette.PanelCard panelCard1;
    private Palette.TextBox search;
    private javax.swing.JScrollPane spTable;
    private newTable.Table table;
    // End of variables declaration//GEN-END:variables
}
