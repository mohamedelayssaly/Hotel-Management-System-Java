/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GestionHotel;

import DataBase.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class EditReservation extends javax.swing.JFrame {

   
    public EditReservation() {
        initComponents();
        
        
         try{
   Connection con =DbConnection.getInstance().getConnection();
   Statement stmt=con.createStatement();
   
      ResultSet res=stmt.executeQuery("select * from reservation WHERE numreservation="+Reservation.numres);
      while (res.next()){
        
            numchambre.removeAllItems();
           numchambre.addItem(res.getInt("nchambre")+"");
       
          cincli.setText(res.getString("cinclient"));
         tarif.setText( res.getFloat("tariftotal")+"");
           nbrnuit.setText(res.getInt("nbrnuit")+""); 
       dateentrer.setText(res.getDate("dateentre").toString());
       datesorti.setText(res.getDate("datesortie").toString());
       
  }
      
  }catch(SQLException ex){
         System.out.println("Db Errors "+ex);
  }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        dateChooser1 = new dateChooser.DateChooser();
        dateChooser2 = new dateChooser.DateChooser();
        panelCard1 = new Palette.PanelCard();
        numchambre = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gradientButton1 = new Palette.GradientButton();
        gradientButton2 = new Palette.GradientButton();
        panelCard2 = new Palette.PanelCard();
        capacite = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        gradientButton3 = new Palette.GradientButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nbrlit = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cincli = new Palette.TextBox();
        dateentrer = new Palette.TextBox();
        nbrnuit = new Palette.TextBox();
        tarif = new Palette.TextBox();
        datesorti = new Palette.TextBox();

        dateChooser1.setTextRefrnce(dateentrer);

        dateChooser2.setTextRefrnce(datesorti);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelCard1.setBorderRadius(30);
        panelCard1.setColor1(new java.awt.Color(255, 153, 0));
        panelCard1.setColor2(new java.awt.Color(255, 153, 51));

        numchambre.setEditable(true);
        numchambre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numchambre.setForeground(new java.awt.Color(255, 255, 255));
        numchambre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modifier Reservation");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("N°Chambre :");

        gradientButton1.setText("Annuler");
        gradientButton1.setBorderRadius(30);
        gradientButton1.setColor1(new java.awt.Color(255, 204, 153));
        gradientButton1.setColor2(new java.awt.Color(255, 102, 0));
        gradientButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gradientButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton1ActionPerformed(evt);
            }
        });

        gradientButton2.setText("Enregistrer");
        gradientButton2.setBorderRadius(30);
        gradientButton2.setColor1(new java.awt.Color(255, 204, 153));
        gradientButton2.setColor2(new java.awt.Color(255, 102, 0));
        gradientButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gradientButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton2ActionPerformed(evt);
            }
        });

        panelCard2.setColor1(new java.awt.Color(255, 102, 0));
        panelCard2.setColor2(new java.awt.Color(204, 102, 0));

        capacite.setEditable(true);
        capacite.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        capacite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Capacite");

        gradientButton3.setText("Rechercher");
        gradientButton3.setBorderRadius(30);
        gradientButton3.setColor1(new java.awt.Color(255, 204, 102));
        gradientButton3.setColor2(new java.awt.Color(255, 153, 0));
        gradientButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gradientButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Type");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("N° Lit");

        nbrlit.setEditable(true);
        nbrlit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nbrlit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        type.setEditable(true);
        type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grande", "Moyen", "Petite" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Choix de Chambre");

        javax.swing.GroupLayout panelCard2Layout = new javax.swing.GroupLayout(panelCard2);
        panelCard2.setLayout(panelCard2Layout);
        panelCard2Layout.setHorizontalGroup(
            panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCard2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panelCard2Layout.createSequentialGroup()
                            .addComponent(nbrlit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gradientButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCard2Layout.createSequentialGroup()
                            .addGroup(panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(capacite, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(52, 52, 52))
        );
        panelCard2Layout.setVerticalGroup(
            panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCard2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCard2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacite, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nbrlit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradientButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        cincli.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   CIN Client :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        cincli.setForeground(new java.awt.Color(0, 0, 0));
        cincli.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dateentrer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Date entrer :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        dateentrer.setForeground(new java.awt.Color(0, 0, 0));
        dateentrer.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nbrnuit.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Nbr Nuit :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        nbrnuit.setForeground(new java.awt.Color(0, 0, 0));
        nbrnuit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nbrnuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nbrnuitMouseEntered(evt);
            }
        });

        tarif.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Tarif  Total :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        tarif.setForeground(new java.awt.Color(0, 0, 0));
        tarif.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tarif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tarifMouseEntered(evt);
            }
        });

        datesorti.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Date sortir :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        datesorti.setForeground(new java.awt.Color(0, 0, 0));
        datesorti.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panelCard1Layout = new javax.swing.GroupLayout(panelCard1);
        panelCard1.setLayout(panelCard1Layout);
        panelCard1Layout.setHorizontalGroup(
            panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCard1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229))
                    .addGroup(panelCard1Layout.createSequentialGroup()
                        .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCard1Layout.createSequentialGroup()
                                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nbrnuit, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateentrer, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tarif, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datesorti, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(numchambre, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCard1Layout.createSequentialGroup()
                                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCard1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel2)
                                        .addGap(135, 135, 135))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCard1Layout.createSequentialGroup()
                                        .addComponent(cincli, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(panelCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(48, Short.MAX_VALUE))))
        );
        panelCard1Layout.setVerticalGroup(
            panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCard1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numchambre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(cincli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(panelCard1Layout.createSequentialGroup()
                        .addComponent(panelCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datesorti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateentrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nbrnuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gradientButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton1ActionPerformed
       this.hide();
    }//GEN-LAST:event_gradientButton1ActionPerformed

    private void gradientButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton3ActionPerformed
           numchambre.removeAllItems();
      try{
   Connection con =DbConnection.getInstance().getConnection();
   Statement stmt=con.createStatement();
   int check=0;
      ResultSet res=stmt.executeQuery("select nchambre from chambre WHERE capacite="+Integer.parseInt(capacite.getSelectedItem().toString())+" and type='"+type.getSelectedItem().toString()+"' and nbrlit="+Integer.parseInt(nbrlit.getSelectedItem().toString())+" and etat='disponible'");
      while (res.next()){
    numchambre.addItem(res.getInt("nchambre")+"");
       check++;
      }
      if(check==0){
         JOptionPane.showMessageDialog(this, "Votre choisx de chambre est indisponible"); 
      }
  }catch(SQLException ex){
         System.out.println("Db Errors "+ex);
  }
    }//GEN-LAST:event_gradientButton3ActionPerformed
public static String cinnew;
    private void gradientButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton2ActionPerformed
      if(!numchambre.getSelectedItem().equals("") && !cincli.getText().equals("") && !tarif.getText().equals("") &&
         !nbrnuit.getText().equals("")&& !dateentrer.getText().equals("") && !datesorti.getText().equals("")){
          
                    try {
               Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
          String sql="SELECT cin FROM client ";
           boolean chec=false;
              ResultSet res=  stmt.executeQuery(sql);
              while (res.next()) {
                 if(res.getString("cin").equals(cincli.getText())){
                chec=true;
                break;
                 }
                  
              }
             LocalDate date1 = LocalDate.parse(datesorti.getText());
          LocalDate date2 = LocalDate.parse(dateentrer.getText());
          
          int comparison = date1.compareTo(date2);
          long daysBetween = ChronoUnit.DAYS.between(date2, date1);
          
          if (comparison > 0) {
              if(daysBetween==Integer.parseInt(nbrnuit.getText())){
               
              
          if(chec==true){ 
            DataBase.ReservationDao.editreservation(Reservation.numres,Integer.parseInt(numchambre.getSelectedItem().toString()) ,cincli.getText(),dateentrer.getText(),datesorti.getText(), Integer.parseInt(nbrnuit.getText()),Float.parseFloat(tarif.getText()));
          JOptionPane.showMessageDialog(this, "Reservation modifier avec succes");
         Reservation.updateetat(LocalDate.now(), datesorti.getText(), Integer.parseInt(numchambre.getSelectedItem().toString()));
          EditReservation.super.dispose();
            }else{
              cinnew=cincli.getText();
              AddClientR1 a1=new AddClientR1();
              a1.setVisible(true);
                 JOptionPane.showMessageDialog(this, "le client est inconnu ? enregistrer les informations de client ");
          
          }
           }else{
                  JOptionPane.showMessageDialog(this, "Erreur nombre de nuits est incorrect");
              }
          } else if (comparison < 0) {
              JOptionPane.showMessageDialog(this, "la date de sortir doit etre superieur de date d'entrer");
          }
      } catch (SQLException ex) {
          Logger.getLogger(AddReservation.class.getName()).log(Level.SEVERE, null, ex);
      }
        }else{
            JOptionPane.showMessageDialog(this, "inserer tout les champs");
        }    
    }//GEN-LAST:event_gradientButton2ActionPerformed

    private void tarifMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tarifMouseEntered
       boolean notset=false;
        if(numchambre.getSelectedItem().equals("")){
        notset=true;
        }
        if(notset==false){
        try {
               LocalDate date1=LocalDate.parse(dateentrer.getText().toString());
               LocalDate date2=LocalDate.parse(datesorti.getText().toString());
               
                long daysBetween = ChronoUnit.DAYS.between(date1, date2); 
                
                nbrnuit.setText(daysBetween+"");
            Connection con=DbConnection.getInstance().getConnection();
            Statement stmt=con.createStatement();
            String sql="SELECT tarif From chambre WHERE nchambre="+Integer.parseInt(numchambre.getSelectedItem().toString());
        ResultSet res=stmt.executeQuery(sql);
        while(res.next()){
            
            int y=(int) daysBetween;
          int  x=y*res.getInt("tarif"); 
            tarif.setText(x+"");
        }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(AddReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    }//GEN-LAST:event_tarifMouseEntered

    private void nbrnuitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nbrnuitMouseEntered
        boolean notset=false;
        if(numchambre.getSelectedItem().equals("")){
        notset=true;
        }
        if(notset==false){
        try {
               LocalDate date1=LocalDate.parse(dateentrer.getText().toString());
               LocalDate date2=LocalDate.parse(datesorti.getText().toString());
               
                long daysBetween = ChronoUnit.DAYS.between(date1, date2); 
                
                nbrnuit.setText(daysBetween+"");
            Connection con=DbConnection.getInstance().getConnection();
            Statement stmt=con.createStatement();
            String sql="SELECT tarif From chambre WHERE nchambre="+Integer.parseInt(numchambre.getSelectedItem().toString());
        ResultSet res=stmt.executeQuery(sql);
        while(res.next()){
            
            int y=(int) daysBetween;
          int  x=y*res.getInt("tarif"); 
            tarif.setText(x+"");
        }
        
        
        } catch (SQLException ex) {
            Logger.getLogger(AddReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    }//GEN-LAST:event_nbrnuitMouseEntered

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
            java.util.logging.Logger.getLogger(EditReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> capacite;
    private Palette.TextBox cincli;
    private dateChooser.DateChooser dateChooser1;
    private dateChooser.DateChooser dateChooser2;
    private Palette.TextBox dateentrer;
    private Palette.TextBox datesorti;
    private Palette.GradientButton gradientButton1;
    private Palette.GradientButton gradientButton2;
    private Palette.GradientButton gradientButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> nbrlit;
    private Palette.TextBox nbrnuit;
    private javax.swing.JComboBox<String> numchambre;
    private Palette.PanelCard panelCard1;
    private Palette.PanelCard panelCard2;
    private Palette.TextBox tarif;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
