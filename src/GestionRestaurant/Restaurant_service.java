/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GestionRestaurant;

import javax.swing.JComponent;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class Restaurant_service extends javax.swing.JFrame {
  private  void setForm(JComponent com){
        com.setSize(1400, 750);
        com.setLocation(0,0);
      panChange.removeAll();
      panChange.add(com);
      panChange.repaint();
      panChange.revalidate();
  } 
  private ListProduitR lstpr;
  private GestionCommande gcmd;
    private GestionRepas grepas;
    private TotalCommande tota;
    public Restaurant_service() {
        initComponents();
        gcmd=new GestionCommande();
       setForm(gcmd);  
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new Palette.Panel();
        panChange = new Palette.Panel();
        panelCard4 = new Palette.PanelCard();
        gradientButton3 = new Palette.GradientButton();
        gradientButton4 = new Palette.GradientButton();
        gradientButton5 = new Palette.GradientButton();
        gradientButton6 = new Palette.GradientButton();
        gradientButton7 = new Palette.GradientButton();
        gradientButton8 = new Palette.GradientButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout panChangeLayout = new javax.swing.GroupLayout(panChange);
        panChange.setLayout(panChangeLayout);
        panChangeLayout.setHorizontalGroup(
            panChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panChangeLayout.setVerticalGroup(
            panChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );

        panelCard4.setColor1(new java.awt.Color(255, 255, 255));
        panelCard4.setColor2(new java.awt.Color(86, 204, 242));
        panelCard4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradientButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        gradientButton3.setForeground(new java.awt.Color(153, 153, 153));
        gradientButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GestionRestaurant/command-line.png"))); // NOI18N
        gradientButton3.setText("Gestipon Commande");
        gradientButton3.setBorderRadius(0);
        gradientButton3.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton3.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton3ActionPerformed(evt);
            }
        });
        panelCard4.add(gradientButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 290, 50));

        gradientButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        gradientButton4.setForeground(new java.awt.Color(153, 153, 153));
        gradientButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GestionRestaurant/iftar.png"))); // NOI18N
        gradientButton4.setText("Gestion Repas");
        gradientButton4.setBorderRadius(0);
        gradientButton4.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton4.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton4ActionPerformed(evt);
            }
        });
        panelCard4.add(gradientButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 290, 50));

        gradientButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        gradientButton5.setForeground(new java.awt.Color(153, 153, 153));
        gradientButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proIcons/logout.png"))); // NOI18N
        gradientButton5.setText("Deconnexion");
        gradientButton5.setBorderRadius(0);
        gradientButton5.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton5.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton5ActionPerformed(evt);
            }
        });
        panelCard4.add(gradientButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 190, 50));

        gradientButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        gradientButton6.setForeground(new java.awt.Color(153, 153, 153));
        gradientButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GestionRestaurant/calculator.png"))); // NOI18N
        gradientButton6.setText("Commande Total");
        gradientButton6.setBorderRadius(0);
        gradientButton6.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton6.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton6ActionPerformed(evt);
            }
        });
        panelCard4.add(gradientButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 270, 50));

        gradientButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        gradientButton7.setForeground(new java.awt.Color(153, 153, 153));
        gradientButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GestionRestaurant/warehouse.png"))); // NOI18N
        gradientButton7.setText("Stock");
        gradientButton7.setBorderRadius(0);
        gradientButton7.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton7.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton7ActionPerformed(evt);
            }
        });
        panelCard4.add(gradientButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 210, 50));

        gradientButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        gradientButton8.setForeground(new java.awt.Color(153, 153, 153));
        gradientButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/reload.png"))); // NOI18N
        gradientButton8.setBorderRadius(0);
        gradientButton8.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton8.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton8ActionPerformed(evt);
            }
        });
        panelCard4.add(gradientButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 150, 50));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCard4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panelCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gradientButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton3ActionPerformed
gcmd=new GestionCommande();
        setForm(gcmd);
        reload=1;
    }//GEN-LAST:event_gradientButton3ActionPerformed

    private void gradientButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton4ActionPerformed
      grepas=new GestionRepas();
        setForm(grepas);
        reload=2;
    }//GEN-LAST:event_gradientButton4ActionPerformed

    private void gradientButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton5ActionPerformed
      this.hide();
    }//GEN-LAST:event_gradientButton5ActionPerformed

    private void gradientButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton6ActionPerformed
     
      tota=new TotalCommande();
        setForm(tota);
        reload=3;
        
    }//GEN-LAST:event_gradientButton6ActionPerformed

    private void gradientButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton7ActionPerformed

        lstpr=new ListProduitR();
        setForm(lstpr);
        reload=4;
        
        
        
    }//GEN-LAST:event_gradientButton7ActionPerformed
public int reload; 
    private void gradientButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton8ActionPerformed
       
        
           try {
               gcmd=new GestionCommande();
      
        
         grepas=new GestionRepas();
       
        tota=new TotalCommande();
       
          lstpr=new ListProduitR();
            
               if(reload==1){
                   
                    setForm(gcmd);
               }  
               if(reload==2){
                    setForm(grepas);
               }
               if(reload==3){
                 setForm(tota);
               }
               if(reload==4){
                  setForm(lstpr); 
               }
               
           } catch (Exception ex) {
           }

        
        
        
    }//GEN-LAST:event_gradientButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Restaurant_service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurant_service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurant_service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurant_service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant_service().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.GradientButton gradientButton3;
    private Palette.GradientButton gradientButton4;
    private Palette.GradientButton gradientButton5;
    private Palette.GradientButton gradientButton6;
    private Palette.GradientButton gradientButton7;
    private Palette.GradientButton gradientButton8;
    private Palette.Panel panChange;
    private Palette.Panel panel1;
    private Palette.PanelCard panelCard4;
    // End of variables declaration//GEN-END:variables
}
