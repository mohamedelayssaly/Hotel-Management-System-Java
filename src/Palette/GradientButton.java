
package Palette;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class GradientButton extends JButton{

    public int getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(int borderRadius) {
        this.borderRadius = borderRadius;
    }

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
   
    
    private int borderRadius=20;
    private Color color1=Color.decode("#009f7");
    private Color color2=Color.decode("#f11712");
    
    
   public GradientButton(){
       setContentAreaFilled(false);
       setForeground(Color.WHITE);
       setCursor(new Cursor(Cursor.HAND_CURSOR));
       setBorder(new EmptyBorder(10,20,10,20));
   } 

    @Override
    protected void paintComponent(Graphics g) {
        int width=getWidth();
        int height=getHeight();
        BufferedImage img=new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
 Graphics2D g2=img.createGraphics();
       g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON );
        GradientPaint gra=new GradientPaint(0,0, getColor1(),width,0, getColor2());
       g2.setPaint(gra);
        g2.fillRoundRect(0,0,width, height, getBorderRadius(), getBorderRadius());
        g2.dispose();
        g.drawImage(img, 0, 0, null);
        super.paintComponent(g);
    }
   
   
   
   
   
}
