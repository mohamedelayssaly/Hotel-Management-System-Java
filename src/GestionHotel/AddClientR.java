/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GestionHotel;

import javax.swing.JOptionPane;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class AddClientR extends javax.swing.JFrame {

    /**
     * Creates new form AddChambre
     */
    public AddClientR() {
        initComponents();
        
        cin.setText(AddReservation.newcli);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelCard1 = new Palette.PanelCard();
        cin = new Palette.TextBox();
        nom = new Palette.TextBox();
        prenom = new Palette.TextBox();
        jLabel1 = new javax.swing.JLabel();
        gradientButton1 = new Palette.GradientButton();
        gradientButton2 = new Palette.GradientButton();
        adresse = new Palette.TextBox();
        email = new Palette.TextBox();
        tele = new Palette.TextBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelCard1.setBorderRadius(30);
        panelCard1.setColor1(new java.awt.Color(255, 153, 0));
        panelCard1.setColor2(new java.awt.Color(255, 153, 51));

        cin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   CIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        cin.setForeground(new java.awt.Color(0, 0, 0));
        cin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nom.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Nom ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        nom.setForeground(new java.awt.Color(0, 0, 0));
        nom.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        prenom.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Prenom", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204)))); // NOI18N
        prenom.setForeground(new java.awt.Color(51, 51, 51));
        prenom.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nouveau Client");

        gradientButton1.setText("Annuler");
        gradientButton1.setBorderRadius(30);
        gradientButton1.setColor1(new java.awt.Color(255, 204, 153));
        gradientButton1.setColor2(new java.awt.Color(255, 153, 0));
        gradientButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gradientButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton1ActionPerformed(evt);
            }
        });

        gradientButton2.setText("Cree");
        gradientButton2.setBorderRadius(30);
        gradientButton2.setColor1(new java.awt.Color(255, 153, 0));
        gradientButton2.setColor2(new java.awt.Color(255, 204, 153));
        gradientButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gradientButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton2ActionPerformed(evt);
            }
        });

        adresse.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Adresse", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        adresse.setForeground(new java.awt.Color(0, 0, 0));
        adresse.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        email.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        tele.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Telephone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        tele.setForeground(new java.awt.Color(0, 0, 0));
        tele.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panelCard1Layout = new javax.swing.GroupLayout(panelCard1);
        panelCard1.setLayout(panelCard1Layout);
        panelCard1Layout.setHorizontalGroup(
            panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCard1Layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(panelCard1Layout.createSequentialGroup()
                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCard1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCard1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCard1Layout.createSequentialGroup()
                                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(prenom, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCard1Layout.setVerticalGroup(
            panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCard1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradientButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gradientButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton1ActionPerformed
       this.hide();
    }//GEN-LAST:event_gradientButton1ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void gradientButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton2ActionPerformed
       
        if(!cin.getText().equals("") && !prenom.getText().equals("") && !nom.getText().equals("") &&
        !tele.getText().equals("") && !email.getText().equals("") && !adresse.getText().equals("")){
          
            
            DataBase.ClientDao.addclient(cin.getText(), prenom.getText(), nom.getText(),Integer.parseInt(tele.getText()), email.getText(), adresse.getText());
          JOptionPane.showMessageDialog(this, "Client ajouter avec succes");
          
          AddClientR.super.dispose();
         
        }else{
            JOptionPane.showMessageDialog(this, "inserer tout les champs");
        }
        
        
        
        
        
    }//GEN-LAST:event_gradientButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddClientR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClientR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClientR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClientR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddClientR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.TextBox adresse;
    private javax.swing.ButtonGroup buttonGroup1;
    private Palette.TextBox cin;
    private Palette.TextBox email;
    private Palette.GradientButton gradientButton1;
    private Palette.GradientButton gradientButton2;
    private javax.swing.JLabel jLabel1;
    private Palette.TextBox nom;
    private Palette.PanelCard panelCard1;
    private Palette.TextBox prenom;
    private Palette.TextBox tele;
    // End of variables declaration//GEN-END:variables
}
