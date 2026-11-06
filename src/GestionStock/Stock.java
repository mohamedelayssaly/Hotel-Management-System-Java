
package GestionStock;


import Dashboards.*;
import GestionStock.AccStock;
import GestionStock.ListProduit;
import Palette.Header_dash;
import java.awt.Color;
import java.awt.Font;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
public class Stock extends javax.swing.JFrame {

       private final DrawerController drawer;
       private AccStock accstock;
       private ListProduit prod;
    public Stock() {
        initComponents();
        
        if(Login.btnacc==false){
        acc.setVisible(false);
        }
        accstock=new AccStock();
        prod=new ListProduit();
           setBackground(new Color(0,0,0,0));
        getContentPane().setBackground(Color.WHITE);
       
        drawer=Drawer.newDrawer(this)
        .header(new Header_dash())
        //.separator(4,new  Color(173,173,173))
        .space(5)
                .background(new Color(70, 87, 87))
        .itemHeight(80)
        .backgroundTransparent(0.3f)
        .drawerWidth(350)
        .drawerBackground(new Color(255,255,255))
         .enableScroll(true)
//.itemHeight(30)        
        //  .leftDrawer(false)
         //.itemAlignLeft(false)
                //.font(new Font("Lucida Sans",Font.Bold, 24))
                .addChild(new DrawerItem("Acceuil").font(new Font("Lucida Sans",Font.BOLD, 24)).icon(new ImageIcon(getClass().getResource("/proIcons/home.png"))).build())
       .addChild(new DrawerItem("List des Produit").font(new Font("Lucida Sans",Font.BOLD, 24)).icon(new ImageIcon(getClass().getResource("/proIcons/materiel.png"))).build())
       .addFooter(new DrawerItem("Exit").font(new Font("Lucida Sans",Font.BOLD, 24)).icon(new ImageIcon(getClass().getResource("/proIcons/logout_1.png"))).build())
        .event(new EventDrawer(){
            @Override
            public void selected(int i, DrawerItem di) {
            
              if(i==0){
                 setForm(accstock);  
              }  
               if(i==1){
                setForm(prod); 
              }  
                if(i==2){
                  Stock.super.dispose();
               
                }  
                     }
            //=======change forms=====
//                public void setForm(JFrame Fr){
//      formChange.removeAll();
//      formChange.add(Fr);
//      formChange.repaint();
//      formChange.revalidate();
//      
//    }

})
.build();
         setForm(accstock); 
    }
  private  void setForm(JComponent com){
        com.setSize(1400, 700);
        com.setLocation(0,0);
      FormChange.removeAll();
      FormChange.add(com);
      FormChange.repaint();
      FormChange.revalidate();
      
    }  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new Palette.Panel();
        FormChange = new Palette.Panel();
        gradientPanel2 = new Palette.GradientPanel();
        gradientButton1 = new Palette.GradientButton();
        acc = new Palette.Button();
        gradientButton6 = new Palette.GradientButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout FormChangeLayout = new javax.swing.GroupLayout(FormChange);
        FormChange.setLayout(FormChangeLayout);
        FormChangeLayout.setHorizontalGroup(
            FormChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        FormChangeLayout.setVerticalGroup(
            FormChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );

        gradientPanel2.setColor1(new java.awt.Color(255, 255, 255));
        gradientPanel2.setColor2(new java.awt.Color(255, 255, 255));

        gradientButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proIcons/menu-burger.png"))); // NOI18N
        gradientButton1.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton1.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton1ActionPerformed(evt);
            }
        });

        acc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/home32a.png"))); // NOI18N
        acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accActionPerformed(evt);
            }
        });

        gradientButton6.setForeground(new java.awt.Color(153, 153, 153));
        gradientButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/reload.png"))); // NOI18N
        gradientButton6.setBorderRadius(50);
        gradientButton6.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton6.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradientButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(acc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gradientButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FormChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gradientButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton1ActionPerformed
             if(!drawer.isShow()){
             drawer.show();
            
        }
     else if(drawer.isShow()){
           drawer.hide();
        }
    }//GEN-LAST:event_gradientButton1ActionPerformed

    private void accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accActionPerformed
        Stock.super.dispose();
               DashboardGeneral d1=new DashboardGeneral();
       d1.setVisible(true);
    }//GEN-LAST:event_accActionPerformed

    private void gradientButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton6ActionPerformed
  prod=new ListProduit();
       
 setForm(prod);
         
       
    }//GEN-LAST:event_gradientButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Panel FormChange;
    private Palette.Button acc;
    private Palette.GradientButton gradientButton1;
    private Palette.GradientButton gradientButton6;
    private Palette.GradientPanel gradientPanel2;
    private Palette.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
