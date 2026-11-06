/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GestionRestaurant;

//import newTable.Table;
import DataBase.DbConnection;
import Palette.ScrollBar;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
//import static javax.swing.text.html.HTML.Tag.P;

public class GestionCommande extends javax.swing.JPanel {

    DefaultListModel listModel = new DefaultListModel();

    public GestionCommande() {
        try {
            initComponents();
            messg.setVisible(false);

            spTable.setVerticalScrollBar(new ScrollBar());
            spTable.getVerticalScrollBar().setBackground(Color.WHITE);
            spTable.getViewport().setBackground(Color.WHITE);
            JPanel p = new JPanel();
            p.setBackground(Color.WHITE);
            spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

//            ==================tablecmd=====================
            spTable1.setVerticalScrollBar(new ScrollBar());
            spTable1.getVerticalScrollBar().setBackground(Color.WHITE);
            spTable1.getViewport().setBackground(Color.WHITE);
            JPanel p2 = new JPanel();
            p2.setBackground(Color.WHITE);
            spTable1.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p2);

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Connection con = DbConnection.getInstance().getConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM repas WHERE showing=1";
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    res.getInt("id"),
                    res.getString("nom"),
                    res.getString("categorie"),
                    res.getFloat("prix")

                });

            }
            Statement stmt1 = con.createStatement();

            String sql1 = "SELECT * FROM companyinfo WHERE id=1";
            ResultSet res1 = stmt1.executeQuery(sql1);
            while (res1.next()) {

                nom.setText("Nom: " + res1.getString("nom"));
                ville.setText("      Adresse: " + res1.getString("adresse") + ",   " + res1.getString("ville"));
                email.setText("Email: " + res1.getString("email") + "                       Tele :" + res1.getString("tele"));
                //res.getFloat("prix");

            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionCommande.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new Palette.Panel();
        panel2 = new Palette.Panel();
        jLabel1 = new javax.swing.JLabel();
        gradientPanel1 = new Palette.GradientPanel();
        spTable = new javax.swing.JScrollPane();
        table = new newTable.Table();
        catego = new javax.swing.JComboBox<>();
        gradientPanel2 = new Palette.GradientPanel();
        spTable1 = new javax.swing.JScrollPane();
        tablecmd = new newTable.Table();
        qte = new Palette.TextBox();
        idrepas = new Palette.TextBox();
        gradientButton2 = new Palette.GradientButton();
        gradientButton8 = new Palette.GradientButton();
        gradientButton9 = new Palette.GradientButton();
        messg = new javax.swing.JLabel();
        gradientPanel3 = new Palette.GradientPanel();
        facturePane = new Palette.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listfacture = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        ttc = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        ville = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        gradientButton3 = new Palette.GradientButton();
        gradientButton4 = new Palette.GradientButton();

        panel1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.disabledBackground"));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion Commande");

        gradientPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Menu", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        gradientPanel1.setColor1(new java.awt.Color(102, 102, 255));
        gradientPanel1.setColor2(new java.awt.Color(51, 0, 153));

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Categorie", "Prix"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        spTable.setViewportView(table);

        catego.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        catego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tout", "Pizza", "Sandwich", "Coffe", "Glassier" }));
        catego.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Categorie ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(153, 153, 153))); // NOI18N
        catego.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(catego, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(gradientPanel1Layout.createSequentialGroup()
                        .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(catego, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        gradientPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Commande", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        gradientPanel2.setColor1(new java.awt.Color(153, 255, 153));
        gradientPanel2.setColor2(new java.awt.Color(0, 153, 0));

        spTable1.setBorder(null);

        tablecmd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Repas", "Quantite", "Prix", "Prix total"
            }
        ));
        spTable1.setViewportView(tablecmd);

        qte.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Quantite: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        qte.setForeground(new java.awt.Color(0, 0, 0));
        qte.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        idrepas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(), "   Id Repas : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        idrepas.setForeground(new java.awt.Color(0, 0, 0));
        idrepas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        gradientButton2.setText("Annuler");
        gradientButton2.setColor1(new java.awt.Color(153, 255, 153));
        gradientButton2.setColor2(new java.awt.Color(0, 204, 51));
        gradientButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton2ActionPerformed(evt);
            }
        });

        gradientButton8.setText("Ajouter");
        gradientButton8.setColor1(new java.awt.Color(153, 255, 153));
        gradientButton8.setColor2(new java.awt.Color(0, 204, 51));
        gradientButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton8ActionPerformed(evt);
            }
        });

        gradientButton9.setText("Gerer la Facture");
        gradientButton9.setColor1(new java.awt.Color(0, 204, 51));
        gradientButton9.setColor2(new java.awt.Color(153, 255, 153));
        gradientButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton9ActionPerformed(evt);
            }
        });

        messg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        messg.setForeground(new java.awt.Color(255, 255, 255));
        messg.setText("Commande ajouter avec succès");

        javax.swing.GroupLayout gradientPanel2Layout = new javax.swing.GroupLayout(gradientPanel2);
        gradientPanel2.setLayout(gradientPanel2Layout);
        gradientPanel2Layout.setHorizontalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(gradientPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(qte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gradientButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(idrepas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(gradientButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(gradientPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(messg, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradientPanel2Layout.setVerticalGroup(
            gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(idrepas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(qte, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradientButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messg)
                .addGap(7, 7, 7)
                .addComponent(spTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradientButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradientButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        gradientPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Facture", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        gradientPanel3.setColor1(new java.awt.Color(204, 204, 204));
        gradientPanel3.setColor2(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("========= Facture =========");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bienvenue");
        jLabel3.setOpaque(true);

        listfacture.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        listfacture.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        listfacture.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listfacture.setAutoscrolls(false);
        jScrollPane1.setViewportView(listfacture);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Total TTC: ");

        ttc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ttc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ttc.setText("00.0");
        ttc.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DH");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("--  Repas   ---------------   Qte   ------------   Prix   ----------  Total  ---");

        nom.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        nom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nom.setText("namehot");

        ville.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ville.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ville.setText("namehot");

        email.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("Bienvenue");

        javax.swing.GroupLayout facturePaneLayout = new javax.swing.GroupLayout(facturePane);
        facturePane.setLayout(facturePaneLayout);
        facturePaneLayout.setHorizontalGroup(
            facturePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facturePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(facturePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(facturePaneLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ttc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(facturePaneLayout.createSequentialGroup()
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ville, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(facturePaneLayout.createSequentialGroup()
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        facturePaneLayout.setVerticalGroup(
            facturePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facturePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(facturePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ville, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom))
                .addGap(14, 14, 14)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(facturePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gradientButton3.setText("Effacer");
        gradientButton3.setToolTipText("");
        gradientButton3.setColor1(new java.awt.Color(102, 102, 102));
        gradientButton3.setColor2(new java.awt.Color(102, 102, 102));
        gradientButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton3ActionPerformed(evt);
            }
        });

        gradientButton4.setText("Imprimer");
        gradientButton4.setColor1(new java.awt.Color(102, 102, 102));
        gradientButton4.setColor2(new java.awt.Color(102, 102, 102));
        gradientButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradientButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradientButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gradientPanel3Layout = new javax.swing.GroupLayout(gradientPanel3);
        gradientPanel3.setLayout(gradientPanel3Layout);
        gradientPanel3Layout.setHorizontalGroup(
            gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel3Layout.createSequentialGroup()
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(gradientButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(gradientButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gradientPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(facturePane, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        gradientPanel3Layout.setVerticalGroup(
            gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(facturePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(gradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradientButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradientButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        int x = table.getSelectedRow();
        int y = Integer.parseInt(table.getValueAt(x, 0).toString());
        idrepas.setText(y + "");


    }//GEN-LAST:event_tableMouseClicked
    public static int nbrcmd = 0;
    private void gradientButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton8ActionPerformed

        try {
            if (!idrepas.getText().equals("") && !qte.getText().equals("")) {
                boolean exi = false;
                DefaultTableModel model1 = (DefaultTableModel) tablecmd.getModel();
                Connection con = DbConnection.getInstance().getConnection();
                Statement stmt = con.createStatement();
                String sql1 = "SELECT id FROM repas ";
                ResultSet res1 = stmt.executeQuery(sql1);
                while (res1.next()) {
                    if (res1.getInt("id") == Integer.parseInt(idrepas.getText())) {
                        exi = true;
                    }
                }
                if (exi == true) {
                    int qnte = Integer.parseInt(qte.getText());
                    String sql = "SELECT * FROM repas WHERE id=" + Integer.parseInt(idrepas.getText());
                    ResultSet res = stmt.executeQuery(sql);
                    while (res.next()) {
                        model1.addRow(new Object[]{
                            res.getInt("id"),
                            res.getString("nom"),
                            qnte,
                            res.getFloat("prix"),
                            res.getFloat("prix") * qnte

                        });

                    }
                    nbrcmd++;
                    idrepas.setText("");
                    qte.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, " Aucun repas portant ce ID");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Inserer tout les champs");
            }

        } catch (SQLException ex) {
            Logger.getLogger(GestionCommande.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_gradientButton8ActionPerformed

    private void gradientButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton2ActionPerformed

        DefaultTableModel model1 = (DefaultTableModel) tablecmd.getModel();
        while (model1.getRowCount() > 0) {
            model1.removeRow(0);
        }
        tablecmd.repaint();
        tablecmd.revalidate();


    }//GEN-LAST:event_gradientButton2ActionPerformed
    public float s = 0;
    private void gradientButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton9ActionPerformed

        try {
            listfacture.setModel(listModel);
            listModel.removeAllElements();
            s = 0;
            ttc.setText("00.0");
            DefaultTableModel model1 = (DefaultTableModel) tablecmd.getModel();
            int nbrcmd1 = model1.getColumnCount();
//            if(nbrcmd1==0){

            Connection con = DbConnection.getInstance().getConnection();
            Statement stmt = con.createStatement();
            //int i=0;
            // while(i<nbrcmd){
            for (int i = 0; i < nbrcmd; i++) {
                DataBase.CmdrestoDao.addcmd(Integer.parseInt(tablecmd.getValueAt(i, 0).toString()),
                        Integer.parseInt(tablecmd.getValueAt(i, 2).toString()),
                        Float.parseFloat(tablecmd.getValueAt(i, 4).toString()), LocalDate.now());
                listModel.addElement("    " + tablecmd.getValueAt(i, 1).toString().trim() + "                   " + tablecmd.getValueAt(i, 2).toString().trim() + "                        " + tablecmd.getValueAt(i, 3).toString().trim() + "                         " + tablecmd.getValueAt(i, 4).toString().trim() + "");

                listModel.addElement("==========================================".trim());
//          listfacture.repaint();
//          listfacture.revalidate();
                s = s + Float.parseFloat(tablecmd.getValueAt(i, 4).toString());
//i++;
            }

            Timer timer = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    messg.setVisible(false);
                }
            });
            timer.start();
            messg.setVisible(true);
            ttc.setText(s + "");
            while (model1.getRowCount() > 0) {
                model1.removeRow(0);
            }
            tablecmd.repaint();
            tablecmd.revalidate();
            s = 0;
//            }else{
//              JOptionPane.showMessageDialog(this, "pas des commandes pour gérer la facture");
//            }

        } catch (SQLException ex) {
            Logger.getLogger(GestionCommande.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_gradientButton9ActionPerformed

    private void categoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoItemStateChanged

        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            table.repaint();
            table.revalidate();
            Connection con = DbConnection.getInstance().getConnection();
            Statement stmt = con.createStatement();
            String sql;
            if (catego.getSelectedItem().equals("Tout")) {
                sql = "SELECT * FROM repas WHERE showing=1 ";
            } else {

                sql = "SELECT * FROM repas WHERE showing=1 AND categorie='" + catego.getSelectedItem() + "'";
            }
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                table.addRow(new Object[]{
                    res.getInt("id"),
                    res.getString("nom"),
                    res.getString("categorie"),
                    res.getFloat("prix")

                });

            }
        } catch (SQLException ex) {
            Logger.getLogger(GestionCommande.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_categoItemStateChanged

    private void gradientButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton4ActionPerformed

        printfacture(facturePane);
        listfacture.setModel(listModel);
        listModel.removeAllElements();
        s = 0;
        ttc.setText(s + "");

    }//GEN-LAST:event_gradientButton4ActionPerformed

    private void gradientButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradientButton3ActionPerformed
        listfacture.setModel(listModel);
        listModel.removeAllElements();
        s = 0;
        ttc.setText(s + "");
    }//GEN-LAST:event_gradientButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> catego;
    private javax.swing.JLabel email;
    private Palette.Panel facturePane;
    private Palette.GradientButton gradientButton2;
    private Palette.GradientButton gradientButton3;
    private Palette.GradientButton gradientButton4;
    private Palette.GradientButton gradientButton8;
    private Palette.GradientButton gradientButton9;
    private Palette.GradientPanel gradientPanel1;
    private Palette.GradientPanel gradientPanel2;
    private Palette.GradientPanel gradientPanel3;
    private Palette.TextBox idrepas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listfacture;
    private javax.swing.JLabel messg;
    private javax.swing.JLabel nom;
    private Palette.Panel panel1;
    private Palette.Panel panel2;
    private Palette.TextBox qte;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JScrollPane spTable1;
    private newTable.Table table;
    private newTable.Table tablecmd;
    private javax.swing.JLabel ttc;
    private javax.swing.JLabel ville;
    // End of variables declaration//GEN-END:variables

    public void printfacture(JPanel panel) {

        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("print facture");
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D gra = (Graphics2D) graphics;
                gra.translate(pageFormat.getImageableX() * 2, pageFormat.getImageableY() * 2);
                gra.scale(0.5, 0.5);
                panel.paint(gra);
                return Printable.PAGE_EXISTS;
            }

        });

        boolean returningResult = printerJob.printDialog();

        if (returningResult) {
            try {
                printerJob.print();
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(this, "print Error " + e.getMessage());
            }
        }

    }

}
