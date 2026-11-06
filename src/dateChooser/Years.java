 
package dateChooser;

import javax.swing.JButton;


public class Years extends javax.swing.JPanel {

   private Event event;
   private int startYear;
    public Years() {
        initComponents();
    }
public int showYear(int year){
 year=calculateYear(year);
 for(int i=0;i<getComponentCount();i++){
    JButton cmd=(JButton) getComponent(i);
    cmd.setText(year+"");
    year++;
}
 return startYear;
}
  private int calculateYear(int year){
      year-=year % 10;
      startYear=year;
      return year;
  }  
  private void addEvent(){
      for(int i=0;i< getComponentCount();i++){
          ((Button) getComponent(i)).setEvent(event);
      }
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmd1 = new dateChooser.Button();
        cmd2 = new dateChooser.Button();
        cmd3 = new dateChooser.Button();
        cmd4 = new dateChooser.Button();
        cmd5 = new dateChooser.Button();
        cmd6 = new dateChooser.Button();
        cmd7 = new dateChooser.Button();
        cmd8 = new dateChooser.Button();
        cmd9 = new dateChooser.Button();
        cmd10 = new dateChooser.Button();
        cmd11 = new dateChooser.Button();
        cmd12 = new dateChooser.Button();
        cmd13 = new dateChooser.Button();
        cmd14 = new dateChooser.Button();
        cmd15 = new dateChooser.Button();
        cmd16 = new dateChooser.Button();
        cmd17 = new dateChooser.Button();
        cmd18 = new dateChooser.Button();
        cmd19 = new dateChooser.Button();
        cmd20 = new dateChooser.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(5, 4));

        cmd1.setText("2010");
        cmd1.setName("year"); // NOI18N
        cmd1.setOpaque(true);
        add(cmd1);

        cmd2.setText("2011");
        cmd2.setName("year"); // NOI18N
        cmd2.setOpaque(true);
        add(cmd2);

        cmd3.setText("2012");
        cmd3.setName("year"); // NOI18N
        cmd3.setOpaque(true);
        add(cmd3);

        cmd4.setText("2013");
        cmd4.setName("year"); // NOI18N
        cmd4.setOpaque(true);
        cmd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd4ActionPerformed(evt);
            }
        });
        add(cmd4);

        cmd5.setText("2014");
        cmd5.setName("year"); // NOI18N
        cmd5.setOpaque(true);
        add(cmd5);

        cmd6.setText("2015");
        cmd6.setName("year"); // NOI18N
        cmd6.setOpaque(true);
        add(cmd6);

        cmd7.setText("2016");
        cmd7.setName("year"); // NOI18N
        cmd7.setOpaque(true);
        add(cmd7);

        cmd8.setText("2017");
        cmd8.setName("year"); // NOI18N
        cmd8.setOpaque(true);
        add(cmd8);

        cmd9.setText("2018");
        cmd9.setName("year"); // NOI18N
        cmd9.setOpaque(true);
        add(cmd9);

        cmd10.setText("2019");
        cmd10.setName("year"); // NOI18N
        cmd10.setOpaque(true);
        add(cmd10);

        cmd11.setText("2020");
        cmd11.setName("year"); // NOI18N
        cmd11.setOpaque(true);
        add(cmd11);

        cmd12.setText("2021");
        cmd12.setName("year"); // NOI18N
        cmd12.setOpaque(true);
        add(cmd12);

        cmd13.setText("2022");
        cmd13.setName("year"); // NOI18N
        cmd13.setOpaque(true);
        add(cmd13);

        cmd14.setText("2023");
        cmd14.setName("year"); // NOI18N
        cmd14.setOpaque(true);
        add(cmd14);

        cmd15.setText("2024");
        cmd15.setName("year"); // NOI18N
        cmd15.setOpaque(true);
        add(cmd15);

        cmd16.setText("2025");
        cmd16.setName("year"); // NOI18N
        cmd16.setOpaque(true);
        cmd16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd16ActionPerformed(evt);
            }
        });
        add(cmd16);

        cmd17.setText("2026");
        cmd17.setName("year"); // NOI18N
        cmd17.setOpaque(true);
        cmd17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd17ActionPerformed(evt);
            }
        });
        add(cmd17);

        cmd18.setText("2027");
        cmd18.setName("year"); // NOI18N
        cmd18.setOpaque(true);
        add(cmd18);

        cmd19.setText("2028");
        cmd19.setName("year"); // NOI18N
        cmd19.setOpaque(true);
        add(cmd19);

        cmd20.setText("2029");
        cmd20.setName("year"); // NOI18N
        cmd20.setOpaque(true);
        cmd20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd20ActionPerformed(evt);
            }
        });
        add(cmd20);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd4ActionPerformed

    private void cmd17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd17ActionPerformed

    private void cmd20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd20ActionPerformed

    private void cmd16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd16ActionPerformed

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
        addEvent();
    }
     public int next(int year){     
        showYear(year+20);
        return startYear;
    }
    
    public int back(int year){     
        showYear(year-20);
        return startYear;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dateChooser.Button cmd1;
    private dateChooser.Button cmd10;
    private dateChooser.Button cmd11;
    private dateChooser.Button cmd12;
    private dateChooser.Button cmd13;
    private dateChooser.Button cmd14;
    private dateChooser.Button cmd15;
    private dateChooser.Button cmd16;
    private dateChooser.Button cmd17;
    private dateChooser.Button cmd18;
    private dateChooser.Button cmd19;
    private dateChooser.Button cmd2;
    private dateChooser.Button cmd20;
    private dateChooser.Button cmd3;
    private dateChooser.Button cmd4;
    private dateChooser.Button cmd5;
    private dateChooser.Button cmd6;
    private dateChooser.Button cmd7;
    private dateChooser.Button cmd8;
    private dateChooser.Button cmd9;
    // End of variables declaration//GEN-END:variables
}
