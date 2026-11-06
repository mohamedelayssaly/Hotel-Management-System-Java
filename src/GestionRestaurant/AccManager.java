/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GestionRestaurant;

import DataBase.DbConnection;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class AccManager extends javax.swing.JPanel {

   public static int choix=0;
     public static String datedebut1;
          public static String datefin1;
    public AccManager() {
       try {
           initComponents();
           
           
           Connection con=DbConnection.getInstance().getConnection();
           Statement stmt=con.createStatement();
           String sql1="SELECT count(id) AS tot,sum(prixtotal) AS mant FROM cmdrestau ";
           
           ResultSet res1=stmt.executeQuery(sql1);
           while(res1.next()){
               totalcmd.setText(res1.getInt("tot")+"");
               montant.setText(res1.getFloat("mant")+"");
           }
       } catch (SQLException ex) {
           Logger.getLogger(AccManager.class.getName()).log(Level.SEVERE, null, ex);
       }

       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        dateChooser2 = new dateChooser.DateChooser();
        dateChooser3 = new dateChooser.DateChooser();
        panel1 = new Palette.Panel();
        gradientPanel1 = new Palette.GradientPanel();
        panelCard2 = new Palette.PanelCard();
        montant = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panelCard1 = new Palette.PanelCard();
        jLabel2 = new javax.swing.JLabel();
        datefin = new Palette.TextBox();
        datedebut = new Palette.TextBox();
        gradientButton1 = new Palette.GradientButton();
        panelCard4 = new Palette.PanelCard();
        totalcmd = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        gradientButton2 = new Palette.GradientButton();
        gradientButton3 = new Palette.GradientButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Commandes");

        dateChooser2.setTextRefrnce(datedebut);

        dateChooser3.setTextRefrnce(datefin);

        gradientPanel1.setColor1(new java.awt.Color(255, 253, 228));
        gradientPanel1.setColor2(new java.awt.Color(255, 255, 255));

        panelCard2.setColor1(new java.awt.Color(255, 153, 0));
        panelCard2.setColor2(new java.awt.Color(255, 153, 0));

        montant.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        montant.setForeground(new java.awt.Color(255, 255, 255));
        montant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        montant.setText("100");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Montant");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 153, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proIcons/montant.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Total:");

        javax.swing.GroupLayout panelCard2Layout = new javax.swing.GroupLayout(panelCard2);
        panelCard2.setLayout(panelCard2Layout);
        panelCard2Layout.setHorizontalGroup(
            panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard2Layout.createSequentialGroup()
                .addGroup(panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCard2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCard2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(montant, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelCard2Layout.setVerticalGroup(
            panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard2Layout.createSequentialGroup()
                .addGroup(panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCard2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCard2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(panelCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(montant, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        panelCard1.setColor1(new java.awt.Color(255, 153, 0));
        panelCard1.setColor2(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Personnalisé");

        datefin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Date Fin", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(204, 204, 204))); // NOI18N
        datefin.setForeground(new java.awt.Color(0, 0, 0));
        datefin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        datefin.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N

        datedebut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Date Debut", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(204, 204, 204))); // NOI18N
        datedebut.setForeground(new java.awt.Color(0, 0, 0));
        datedebut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        datedebut.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N

        gradientButton1.setText("Valider");
        gradientButton1.setColor1(new java.awt.Color(0, 102, 0));
        gradientButton1.setColor2(new java.awt.Color(0, 102, 0));
        gradientButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        gradientButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCard1Layout = new javax.swing.GroupLayout(panelCard1);
        panelCard1.setLayout(panelCard1Layout);
        panelCard1Layout.setHorizontalGroup(
            panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard1Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCard1Layout.createSequentialGroup()
                        .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(datedebut, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datefin, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCard1Layout.createSequentialGroup()
                        .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCard1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        panelCard1Layout.setVerticalGroup(
            panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(datedebut, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(datefin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        panelCard4.setColor1(new java.awt.Color(0, 102, 204));
        panelCard4.setColor2(new java.awt.Color(0, 153, 255));

        totalcmd.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        totalcmd.setForeground(new java.awt.Color(255, 255, 255));
        totalcmd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalcmd.setText("100");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 153, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proIcons/commande.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Commandes");

        javax.swing.GroupLayout panelCard4Layout = new javax.swing.GroupLayout(panelCard4);
        panelCard4.setLayout(panelCard4Layout);
        panelCard4Layout.setHorizontalGroup(
            panelCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCard4Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalcmd, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCard4Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCard4Layout.setVerticalGroup(
            panelCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalcmd, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        gradientButton2.setText("Details");
        gradientButton2.setColor1(new java.awt.Color(0, 102, 0));
        gradientButton2.setColor2(new java.awt.Color(0, 102, 0));
        gradientButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gradientButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton2ActionPerformed(evt);
            }
        });

        gradientButton3.setText("Aujourd'huit");
        gradientButton3.setColor1(new java.awt.Color(0, 102, 0));
        gradientButton3.setColor2(new java.awt.Color(0, 102, 0));
        gradientButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gradientButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton3ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(51, 51, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proIcons/house-chimney.png"))); // NOI18N
        jLabel9.setText("Acceuil");

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCard4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gradientButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(635, 635, 635))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel1Layout.createSequentialGroup()
                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gradientButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(panelCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gradientButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton3ActionPerformed
      
        try{
            choix=1;      
           Connection con=DbConnection.getInstance().getConnection();
           Statement stmt=con.createStatement();
           String sql1="SELECT count(id) AS tot,sum(prixtotal) AS mant FROM cmdrestau WHERE datecmd='"+LocalDate.now()+"'";
           
           ResultSet res1=stmt.executeQuery(sql1);
           while(res1.next()){
               totalcmd.setText(res1.getInt("tot")+"");
               montant.setText(res1.getFloat("mant")+"");
           }
       } catch (SQLException ex) {
           Logger.getLogger(AccManager.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
        
    }//GEN-LAST:event_gradientButton3ActionPerformed

    private void gradientButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton1ActionPerformed
      
        
        
         try{
            choix=2;      
           Connection con=DbConnection.getInstance().getConnection();
           Statement stmt=con.createStatement();
           String sql1="SELECT count(id) AS tot,sum(prixtotal) AS mant FROM cmdrestau WHERE datecmd BETWEEN '"+datedebut.getText()+"' AND '"+datefin.getText()+"'";
                  LocalDate date1 = LocalDate.parse(datedebut.getText());
            LocalDate date2 = LocalDate.parse(datefin.getText());

            int comparison = date1.compareTo(date2);
            if(comparison<0){
           ResultSet res1=stmt.executeQuery(sql1);
           while(res1.next()){
               totalcmd.setText(res1.getInt("tot")+"");
               montant.setText(res1.getFloat("mant")+"");
           }
            }else if(comparison>0){
                JOptionPane.showMessageDialog(this, "la date de début doit etre inférieur de date fin ");
            }
       } catch (SQLException ex) {
           Logger.getLogger(AccManager.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }//GEN-LAST:event_gradientButton1ActionPerformed

    private void gradientButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton2ActionPerformed
       
        datedebut1=datedebut.getText();
        datefin1=datefin.getText();
        Details d1=new Details();
        d1.setVisible(true);
        
    }//GEN-LAST:event_gradientButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dateChooser.DateChooser dateChooser2;
    private dateChooser.DateChooser dateChooser3;
    private Palette.TextBox datedebut;
    private Palette.TextBox datefin;
    private Palette.GradientButton gradientButton1;
    private Palette.GradientButton gradientButton2;
    private Palette.GradientButton gradientButton3;
    private Palette.GradientPanel gradientPanel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel montant;
    private Palette.Panel panel1;
    private Palette.PanelCard panelCard1;
    private Palette.PanelCard panelCard2;
    private Palette.PanelCard panelCard4;
    private javax.swing.JLabel totalcmd;
    // End of variables declaration//GEN-END:variables
}
