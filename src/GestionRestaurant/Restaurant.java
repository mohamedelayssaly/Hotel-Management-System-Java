
package GestionRestaurant;

import Dashboards.*;
import GestionEmployees.Employees;
import GestionHotel.Hotel;
import GestionStock.Stock;
import Menu_principale.MenuMan;
import Parametre.ParametreAcc;
import Palette.Header_dash;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
public class Restaurant extends javax.swing.JFrame {

       private final DrawerController drawer;
       private AccManager menu2;
       private GestionCommande commande;
         private MenuMan menu1;
      // private AccManager accman;
       private ParametreAcc param;
    public Restaurant() {
        initComponents();
        if(Login.btnacc==false){
        acc.setVisible(false);
        }
           menu1=new MenuMan();
     //   accman=new AccManager();
        param =new ParametreAcc();
        menu2=new AccManager();
        commande=new GestionCommande();
        
           setBackground(new Color(0,0,0,0));
        getContentPane().setBackground(Color.WHITE);
       
        drawer=Drawer.newDrawer(this)
        .header(new Header_dash())
        //.separator(4,new  Color(173,173,173))
        .space(5)
                .background(new Color(70, 87, 87))
        .itemHeight(70)
        .backgroundTransparent(0.3f)
        .drawerWidth(300)
        .drawerBackground(new Color(255,255,255))
         .enableScroll(true)
//.itemHeight(30)        
        //  .leftDrawer(false)
         //.itemAlignLeft(false)
                //.font(new Font("Lucida Sans",Font.Bold, 24))
                .addChild(new DrawerItem("Acceuil").font(new Font("Lucida Sans",Font.BOLD, 32)).icon(new ImageIcon(getClass().getResource("/proIcons/house-chimney.png"))).build())
       .addChild(new DrawerItem("Hotel").font(new Font("Lucida Sans",Font.BOLD, 32)).icon(new ImageIcon(getClass().getResource("/proIcons/hotel.png"))).build())
        .addChild(new DrawerItem("Employee").font(new Font("Lucida Sans",Font.BOLD, 32)).icon(new ImageIcon(getClass().getResource("/proIcons/employee.png"))).build())
        .addChild(new DrawerItem("Restaurant").font(new Font("Lucida Sans",Font.BOLD, 32)).icon(new ImageIcon(getClass().getResource("/proIcons/restaurant.png"))).build())
        .addChild(new DrawerItem("Stock").font(new Font("Lucida Sans",Font.BOLD, 32)).icon(new ImageIcon(getClass().getResource("/proIcons/warehouse.png"))).build())
        .addChild(new DrawerItem("utilisateur").font(new Font("Lucida Sans",Font.BOLD, 32)).icon(new ImageIcon(getClass().getResource("/proIcons//team.png"))).build())
        .addFooter(new DrawerItem("exit").font(new Font("Lucida Sans",Font.BOLD, 32)).icon(new ImageIcon(getClass().getResource("/proIcons/logout.png"))).build())
     .event(new EventDrawer(){
            @Override
            public void selected(int i, DrawerItem di) {
            
              if(i==0){
     
                  setForm(menu2);  
              }  
               if(i==1){
               Restaurant.super.dispose();
                   Hotel h1=new Hotel();
                   h1.setVisible(true);
              }  
                  if(i==2){
                  try {
                      Restaurant.super.dispose();
                      Employees E1=new Employees();
                      E1.setVisible(true);
                  } catch (SQLException ex) {
                      Logger.getLogger(DashboardGeneral.class.getName()).log(Level.SEVERE, null, ex);
                  }
              } 
                      if(i==3){
     
                  Restaurant.super.dispose();
                   Restaurant r1=new Restaurant();   
                   r1.setVisible(true);
              }

               if(i==4){
     
                  Restaurant.super.dispose();
                      Stock s1=new Stock();
                   s1.setVisible(true);
              }
              if(i==5){
     
               
                    setForm(param);
              }
             
                if(i==6){
                    
                  Restaurant.super.dispose();
               Login l2=new Login();
               l2.setVisible(true);
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
         setForm(menu2); 
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
        button2 = new Palette.Button();

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
            .addGap(0, 686, Short.MAX_VALUE)
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

        acc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proIcons/home32.png"))); // NOI18N
        acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
            .addComponent(acc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        button2.setBackground(new java.awt.Color(204, 255, 51));
        button2.setForeground(new java.awt.Color(153, 153, 153));
        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/action_icons/exit.png"))); // NOI18N
        button2.setText("Mode Serveur");
        button2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        button2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
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
       Restaurant.super.dispose();
               DashboardGeneral d1=new DashboardGeneral();
       d1.setVisible(true);
    }//GEN-LAST:event_accActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
Restaurant.super.dispose();
Restaurant_service c=new Restaurant_service();
c.setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed

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
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Restaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Panel FormChange;
    private Palette.Button acc;
    private Palette.Button button2;
    private Palette.GradientButton gradientButton1;
    private Palette.GradientPanel gradientPanel2;
    private Palette.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
