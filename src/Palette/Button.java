
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

/**
 *
 * @author Mohamed El Ayssaly
 */
public class Button extends JButton{
     private int border_radius=20;

    public int getBorder_radius() {
        return border_radius;
    }

    public void setBorder_radius(int border_radius) {
        this.border_radius = border_radius;
    }
   public Button(){
      setContentAreaFilled(false);
      setForeground(new Color(0,0,0));
      setCursor(new Cursor(Cursor.HAND_CURSOR));
      setBorder(new EmptyBorder(10,20,10,20));
       setBackground(new Color(255,255,255));
      
  }  
    

    @Override
    protected void paintComponent(Graphics g) {
     int width=getWidth();
     int height=getHeight();
        BufferedImage img =new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2= img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
     //create gradient paint
//     GradientPaint gra=new GradientPaint(0,0,color1,width,0,color2);
//     g2.setPaint(gra);
       g2.fillRoundRect(0, 0, width, height, getBorder_radius(), getBorder_radius());
       g2.dispose();
       g.drawImage(img, 0, 0, null);
        
        super.paintComponent(g); 
        
    }
      
}
