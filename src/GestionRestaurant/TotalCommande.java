/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GestionRestaurant;

//import newTable.Table;
import GestionEmployees.*;
import GestionHotel.*;
import Palette.ScrollBar;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
//import static javax.swing.text.html.HTML.Tag.P;


public class TotalCommande extends javax.swing.JPanel {

    private Aujourduit aujo;
    private Tout tout;
    private Personnaliser perso;
    
  
   
    public TotalCommande() {
        initComponents();
       aujo =new Aujourduit();
      setForm(aujo);
 
    }

    private  void setForm(JComponent com){
        com.setSize(1418, 650);
        com.setLocation(0,0);
      panChange.removeAll();
      panChange.add(com);
      panChange.repaint();
      panChange.revalidate();
      
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new Palette.Panel();
        panel2 = new Palette.Panel();
        jLabel1 = new javax.swing.JLabel();
        panChange = new Palette.GradientPanel();
        gradientButton2 = new Palette.GradientButton();
        gradientButton5 = new Palette.GradientButton();
        gradientButton6 = new Palette.GradientButton();

        panel1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.disabledBackground"));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Commandes Total");

        panChange.setColor1(new java.awt.Color(102, 102, 255));
        panChange.setColor2(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout panChangeLayout = new javax.swing.GroupLayout(panChange);
        panChange.setLayout(panChangeLayout);
        panChangeLayout.setHorizontalGroup(
            panChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panChangeLayout.setVerticalGroup(
            panChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );

        gradientButton2.setText("Aujourd'huit");
        gradientButton2.setColor1(new java.awt.Color(0, 0, 255));
        gradientButton2.setColor2(new java.awt.Color(153, 204, 255));
        gradientButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton2ActionPerformed(evt);
            }
        });

        gradientButton5.setText("Tout");
        gradientButton5.setColor1(new java.awt.Color(0, 0, 255));
        gradientButton5.setColor2(new java.awt.Color(153, 204, 255));
        gradientButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton5ActionPerformed(evt);
            }
        });

        gradientButton6.setText("Personnaliser");
        gradientButton6.setColor1(new java.awt.Color(0, 0, 255));
        gradientButton6.setColor2(new java.awt.Color(153, 204, 255));
        gradientButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradientButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradientButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addComponent(panChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradientButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gradientButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gradientButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton2ActionPerformed
   
      aujo =new Aujourduit();
      setForm(aujo);
        
        
    }//GEN-LAST:event_gradientButton2ActionPerformed

    private void gradientButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton5ActionPerformed
    
        tout=new Tout();
        setForm(tout);
        
        
        
    }//GEN-LAST:event_gradientButton5ActionPerformed

    private void gradientButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton6ActionPerformed
    
        perso=new Personnaliser();
        setForm(perso);
        
        
        
    }//GEN-LAST:event_gradientButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.GradientButton gradientButton2;
    private Palette.GradientButton gradientButton5;
    private Palette.GradientButton gradientButton6;
    private javax.swing.JLabel jLabel1;
    private Palette.GradientPanel panChange;
    private Palette.Panel panel1;
    private Palette.Panel panel2;
    // End of variables declaration//GEN-END:variables
}
