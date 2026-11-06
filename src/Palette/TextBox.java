/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Palette;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class TextBox extends JTextField{
    
    
    private String label="";

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
      private int border_radius=20;

    public int getBorder_radius() {
        return border_radius;
    }

    public void setBorder_radius(int border_radius) {
        this.border_radius = border_radius;
    }
   public TextBox(){
     // setContentAreaFilled(false);
       setOpaque(false);
      setForeground(getForeground());
       setBackground(getBackground());
      setCursor(new Cursor(Cursor.HAND_CURSOR));
      setBorder(new EmptyBorder(10,20,10,20));
     //  setText(label);
     //  setLabel(TextBox.this.getText());
       setFont(new Font("Lucida Sans",Font.BOLD, 18));
       setForeground(new Color(204,204,204));

       addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e) {
            if(TextBox.this.getText().equals(label)){
                    TextBox.this.setText("");
                    TextBox.this.setForeground(Color.BLACK);
                }
           }

           @Override
           public void mouseExited(MouseEvent e) {
           if(TextBox.this.getText().equals("")){
                    TextBox.this.setText(label);
                     TextBox.this.setForeground(new Color(204,204,204));
                }}
});
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

   
    
   

