/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Palette;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class PanelCard extends javax.swing.JPanel {

  private Color color1=Color.decode("#6dd5ed");
     private Color color2=Color.decode("#2193b0");
      private Color color3=new Color(255,255,255,50);
    private int borderRadius=20;    

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Color getColor3() {
        return color3;
    }

    public void setColor3(Color color3) {
        this.color3 = color3;
    }

    public int getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(int borderRadius) {
        this.borderRadius = borderRadius;
    }
    public PanelCard() {
        initComponents();
        setOpaque(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

  @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2=(Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        
       GradientPaint p=new GradientPaint(0,0, getColor1(),0,getHeight(), getColor2());
        g2.setPaint(p);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), getBorderRadius(), getBorderRadius());
        g2.setColor(getColor3());
        g2.fillOval(getWidth()-(getHeight()/2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth()-(getHeight()/2)-2, getHeight()/2+20, getHeight(), getHeight());
        

        super.paintComponent(g);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
