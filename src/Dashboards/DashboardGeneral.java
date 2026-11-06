
package Dashboards;


import Dashboards.*;
//import DrawerMenu.Header;
//import DrawerMenu.drawerMenuTest;
import GestionEmployees.Employees;
import GestionHotel.Hotel;
import GestionRestaurant.AccManager;
import GestionRestaurant.Restaurant;
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
public class DashboardGeneral extends javax.swing.JFrame {

       private final DrawerController drawer;
       private MenuMan menu1;
       private AccManager accman;
       private ParametreAcc param;
    public DashboardGeneral() {
        initComponents();
        menu1=new MenuMan();
        accman=new AccManager();
        param =new ParametreAcc();

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
        .addChild(new DrawerItem("Parametres").font(new Font("Lucida Sans",Font.BOLD, 32)).icon(new ImageIcon(getClass().getResource("/proIcons//setting.png"))).build())
        .addFooter(new DrawerItem("exit").font(new Font("Lucida Sans",Font.BOLD, 32)).icon(new ImageIcon(getClass().getResource("/proIcons/logout.png"))).build())
        .event(new EventDrawer(){
            @Override
            public void selected(int i, DrawerItem di) {
            
              if(i==0){
     
                  setForm(menu1);  
              }  
               if(i==1){
               DashboardGeneral.super.dispose();
                   Hotel h1=new Hotel();
                   h1.setVisible(true);
              }  
                  if(i==2){
                  try {
                      DashboardGeneral.super.dispose();
                      Employees E1=new Employees();
                      E1.setVisible(true);
                  } catch (SQLException ex) {
                      Logger.getLogger(DashboardGeneral.class.getName()).log(Level.SEVERE, null, ex);
                  }
              } 
                      if(i==3){
     
                  DashboardGeneral.super.dispose();
                   Restaurant r1=new Restaurant();   
                   r1.setVisible(true);
              }

               if(i==4){
     
                  DashboardGeneral.super.dispose();
                      Stock s1=new Stock();
                   s1.setVisible(true);
              }
              if(i==5){
     
               
                    setForm(param);
              }
             
                if(i==6){
                    
                  DashboardGeneral.super.dispose();
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
         setForm(menu1); 
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout FormChangeLayout = new javax.swing.GroupLayout(FormChange);
        FormChange.setLayout(FormChangeLayout);
        FormChangeLayout.setHorizontalGroup(
            FormChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        FormChangeLayout.setVerticalGroup(
            FormChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        gradientPanel2.setColor1(new java.awt.Color(255, 255, 255));
        gradientPanel2.setColor2(new java.awt.Color(204, 204, 204));

        gradientButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proIcons/menu-burger.png"))); // NOI18N
        gradientButton1.setColor1(new java.awt.Color(255, 255, 255));
        gradientButton1.setColor2(new java.awt.Color(255, 255, 255));
        gradientButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1320, Short.MAX_VALUE))
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(FormChange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            java.util.logging.Logger.getLogger(DashboardGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Panel FormChange;
    private Palette.GradientButton gradientButton1;
    private Palette.GradientPanel gradientPanel2;
    private Palette.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
