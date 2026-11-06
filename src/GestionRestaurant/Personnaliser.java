
package GestionRestaurant;

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
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class Personnaliser extends javax.swing.JPanel {

    public static int numrow=0;
   

    public Personnaliser() {
        try {
            initComponents();
            spTable.setVerticalScrollBar(new ScrollBar());
            spTable.getVerticalScrollBar().setBackground(Color.WHITE);
            spTable.getViewport().setBackground(Color.WHITE);
            JPanel p=new JPanel();
            p.setBackground(Color.WHITE);
            spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
            DefaultTableModel  model=(DefaultTableModel) table.getModel();
            Connection con=DbConnection.getInstance().getConnection();
            Statement stmt=con.createStatement();
            String sql1="SELECT count(id) AS tot,sum(prixtotal) AS mant FROM cmdrestau ";
                  
            ResultSet res1=stmt.executeQuery(sql1);
            while(res1.next()){
                totalcmd.setText(res1.getInt("tot")+"");
                montant.setText(res1.getFloat("mant")+"");
            }
            String sql="SELECT r.id,r.nom,r.categorie,r.prix, c.qte,c.prixtotal,c.datecmd FROM cmdrestau c,repas r WHERE c.idrepas=r.id ";
                   
            ResultSet res=stmt.executeQuery(sql);
            while(res.next()){
               
                model.addRow(new Object[]{
                    res.getInt("id"),
                    res.getString("nom"),
                    res.getString("categorie"),
                    res.getInt("qte"),
                    res.getFloat("prix"),
                    res.getFloat("prixtotal"),
                    res.getDate("datecmd")
                        
                        
                });
               numrow++;  
            }
        } catch (SQLException ex) {
            Logger.getLogger(Personnaliser.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
     public  void setForm1(JComponent com){
        com.setSize(1335, 446);
        com.setLocation(0,0);
      panchange.removeAll();
      panchange.add(com);
      panchange.repaint();
      panchange.revalidate();
  } 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser3 = new dateChooser.DateChooser();
        dateChooser4 = new dateChooser.DateChooser();
        gradientPanel1 = new Palette.GradientPanel();
        jLabel2 = new javax.swing.JLabel();
        totalcmd = new javax.swing.JLabel();
        montant = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        paneserveur = new Palette.GradientPanel();
        datedebut = new Palette.TextBox();
        datefin = new Palette.TextBox();
        gradientButton1 = new Palette.GradientButton();
        panchange = new Palette.GradientPanel();
        spTable = new javax.swing.JScrollPane();
        table = new newTable.Table();

        dateChooser3.setTextRefrnce(datedebut);

        dateChooser4.setTextRefrnce(datefin);

        gradientPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Personneliser", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 48), new java.awt.Color(255, 255, 255))); // NOI18N
        gradientPanel1.setColor1(new java.awt.Color(102, 102, 255));
        gradientPanel1.setColor2(new java.awt.Color(51, 0, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Montant Total :");

        totalcmd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalcmd.setForeground(new java.awt.Color(255, 255, 255));
        totalcmd.setText("250");

        montant.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        montant.setForeground(new java.awt.Color(255, 255, 255));
        montant.setText("250");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DH");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Commandes :");

        paneserveur.setColor1(new java.awt.Color(102, 153, 255));
        paneserveur.setColor2(new java.awt.Color(0, 51, 153));

        datedebut.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Date début : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        datedebut.setForeground(new java.awt.Color(0, 0, 0));
        datedebut.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        datefin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Date fin : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        datefin.setForeground(new java.awt.Color(0, 0, 0));
        datefin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        gradientButton1.setText("Chercher");
        gradientButton1.setColor1(new java.awt.Color(0, 0, 255));
        gradientButton1.setColor2(new java.awt.Color(153, 204, 255));
        gradientButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneserveurLayout = new javax.swing.GroupLayout(paneserveur);
        paneserveur.setLayout(paneserveurLayout);
        paneserveurLayout.setHorizontalGroup(
            paneserveurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneserveurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datedebut, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datefin, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        paneserveurLayout.setVerticalGroup(
            paneserveurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneserveurLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneserveurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datedebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datefin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
            .addGroup(paneserveurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panchange.setColor1(new java.awt.Color(255, 255, 255));
        panchange.setColor2(new java.awt.Color(255, 255, 255));

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Repas", "Categorie", "Quantite", "Prix Unitaire", "Prix total", "Date"
            }
        ));
        spTable.setViewportView(table);

        javax.swing.GroupLayout panchangeLayout = new javax.swing.GroupLayout(panchange);
        panchange.setLayout(panchangeLayout);
        panchangeLayout.setHorizontalGroup(
            panchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panchangeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 1296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panchangeLayout.setVerticalGroup(
            panchangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panchangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(gradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(totalcmd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(montant, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(paneserveur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panchange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalcmd)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(montant)
                            .addComponent(jLabel5)))
                    .addComponent(paneserveur, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panchange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gradientButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton1ActionPerformed
        
        try {
            
            DefaultTableModel  model=(DefaultTableModel) table.getModel();
             
                
            Connection con=DbConnection.getInstance().getConnection();
            Statement stmt=con.createStatement();
            String sql1="SELECT count(id) AS tot,sum(prixtotal) AS mant FROM cmdrestau WHERE datecmd BETWEEN '"+datedebut.getText()+"' AND '"+datefin.getText()+"'";
                           LocalDate date1 = LocalDate.parse(datedebut.getText());
            LocalDate date2 = LocalDate.parse(datefin.getText());

            int comparison = date1.compareTo(date2);
            if(comparison<0){
                while (model.getRowCount() > 0) {
                        model.removeRow(0);
                    }
                    table.revalidate();
                    table.repaint();
            ResultSet res1=stmt.executeQuery(sql1);
            while(res1.next()){
                totalcmd.setText(res1.getInt("tot")+"");
                montant.setText(res1.getFloat("mant")+"");
            }

             String sql="SELECT r.id,r.nom,r.categorie,r.prix, c.qte,c.prixtotal,c.datecmd FROM cmdrestau c,repas r WHERE c.idrepas=r.id "
                    + "AND datecmd BETWEEN '"+datedebut.getText()+"' AND '"+datefin.getText()+"'";
                   
ResultSet res=stmt.executeQuery(sql);
while(res.next()){
  DefaultTableModel  model1=(DefaultTableModel) table.getModel();  
    model1.addRow(new Object[]{
        res.getInt("id"),
        res.getString("nom"),
        res.getString("categorie"),
        res.getInt("qte"),
        res.getFloat("prix"),
        res.getFloat("prixtotal"),
        res.getDate("datecmd")
            
            
    });
   
}
          table.revalidate();
                    table.repaint(); 
            }else if(comparison>0){
                JOptionPane.showMessageDialog(this, "la date de début doit etre inférieur de date fin ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Personnaliser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_gradientButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dateChooser.DateChooser dateChooser3;
    private dateChooser.DateChooser dateChooser4;
    private Palette.TextBox datedebut;
    private Palette.TextBox datefin;
    private Palette.GradientButton gradientButton1;
    private Palette.GradientPanel gradientPanel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel montant;
    private Palette.GradientPanel panchange;
    private Palette.GradientPanel paneserveur;
    private javax.swing.JScrollPane spTable;
    private newTable.Table table;
    private javax.swing.JLabel totalcmd;
    // End of variables declaration//GEN-END:variables
}
