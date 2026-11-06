
package dateChooser;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;



public class Dates extends javax.swing.JPanel {

private Event event;
private int MONTH;
private int YEAR;
private int DAY;
private int m;
private int y;
private int selectDay=0;
private int startDate;
private int max_of_month;


    public Dates() {
        initComponents();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
       Date date=new Date(); 
       String toDay=df.format(date);
       DAY=Integer.valueOf(toDay.split("-")[2]);
       MONTH=Integer.valueOf(toDay.split("-")[1]);
       YEAR=Integer.valueOf(toDay.split("-")[0]);
    }
public void showDate(int month,int year,SelectedDate select){
   
    m=month;
    y=year;
    //selectedDay=0;
    
    Calendar cd=Calendar.getInstance();
    cd.set(year,month-1,1);
    int start =cd.get(Calendar.DAY_OF_WEEK);
    max_of_month=cd.getActualMaximum(Calendar.DAY_OF_MONTH);
    if(start==1){
        start+=7;
    }
    clear();
    start +=5;
    startDate =start;
    for(int i=1; i<=max_of_month;i++){
        Button cmd=(Button) getComponent(start);
        cmd.setColorSelected(getForeground());
        cmd.setText(i+"");
        if(i==DAY && month==MONTH && year==YEAR){
            cmd.setBackground(new Color(224,214,229));
        }else{
            cmd.setBackground(Color.WHITE);
        }
        if(i==select.getDay()&& month==select.getMonth() && year==select.getYear()){
         cmd.setBackground(getForeground());
         cmd.setForeground(new Color(255,255,255));
        }
        start++;
}
}
     private void clear(){
        for (int i = 7; i < getComponentCount(); i++) {
            ((JButton) getComponent(i)).setText("");
        }
    }
    public void clearselected(){
        for(int i=7;i<getComponentCount();i++){
            JButton cmd=(JButton) getComponent(i);
             if(MONTH==m && y==YEAR && !cmd.getText().equals("") && Integer.valueOf(cmd.getText())==DAY){
            cmd.setBackground(new Color(224,214,229));
             cmd.setForeground(new java.awt.Color(75,75,75));
        }else{
            cmd.setBackground( Color.WHITE);
             cmd.setForeground(new java.awt.Color(75,75,75));
        }
        }
        selectDay=0;
  }
    private void addEvent(){
        for(int i=7;i<getComponentCount();i++){
            ((Button) getComponent(i)).setEvent(event);
        }
    }
    public void setSelected(int index){
        selectDay=index;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cdmMo = new dateChooser.Button();
        cdmTu = new dateChooser.Button();
        cdmWe = new dateChooser.Button();
        cdmTh = new dateChooser.Button();
        cdmFr = new dateChooser.Button();
        cdmSa = new dateChooser.Button();
        cdmSu = new dateChooser.Button();
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
        cmd21 = new dateChooser.Button();
        cmd22 = new dateChooser.Button();
        cmd23 = new dateChooser.Button();
        cmd24 = new dateChooser.Button();
        cmd25 = new dateChooser.Button();
        cmd26 = new dateChooser.Button();
        cmd27 = new dateChooser.Button();
        cmd28 = new dateChooser.Button();
        cmd29 = new dateChooser.Button();
        cmd30 = new dateChooser.Button();
        cmd31 = new dateChooser.Button();
        cmd32 = new dateChooser.Button();
        cmd33 = new dateChooser.Button();
        cmd34 = new dateChooser.Button();
        cmd35 = new dateChooser.Button();
        cmd36 = new dateChooser.Button();
        cmd37 = new dateChooser.Button();
        cmd38 = new dateChooser.Button();
        cmd39 = new dateChooser.Button();
        cmd40 = new dateChooser.Button();
        cmd41 = new dateChooser.Button();
        cmd42 = new dateChooser.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(7, 7));

        cdmMo.setText("Mo");
        add(cdmMo);

        cdmTu.setText("Tu");
        add(cdmTu);

        cdmWe.setText("We");
        add(cdmWe);

        cdmTh.setText("Th");
        add(cdmTh);

        cdmFr.setText("Fr");
        add(cdmFr);

        cdmSa.setText("Sa");
        cdmSa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdmSaActionPerformed(evt);
            }
        });
        add(cdmSa);

        cdmSu.setForeground(new java.awt.Color(255, 1, 1));
        cdmSu.setText("Su");
        add(cdmSu);

        cmd1.setName("day"); // NOI18N
        add(cmd1);

        cmd2.setName("day"); // NOI18N
        add(cmd2);

        cmd3.setText("1");
        cmd3.setName("day"); // NOI18N
        add(cmd3);

        cmd4.setText("2");
        cmd4.setName("day"); // NOI18N
        add(cmd4);

        cmd5.setText("3");
        cmd5.setName("day"); // NOI18N
        add(cmd5);

        cmd6.setText("4");
        cmd6.setName("day"); // NOI18N
        add(cmd6);

        cmd7.setText("5");
        cmd7.setName("day"); // NOI18N
        add(cmd7);

        cmd8.setText("6");
        cmd8.setName("day"); // NOI18N
        add(cmd8);

        cmd9.setText("7");
        cmd9.setName("day"); // NOI18N
        add(cmd9);

        cmd10.setText("8");
        cmd10.setName("day"); // NOI18N
        cmd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd10ActionPerformed(evt);
            }
        });
        add(cmd10);

        cmd11.setText("9");
        cmd11.setName("day"); // NOI18N
        add(cmd11);

        cmd12.setText("10");
        cmd12.setName("day"); // NOI18N
        add(cmd12);

        cmd13.setText("11");
        cmd13.setName("day"); // NOI18N
        add(cmd13);

        cmd14.setText("12");
        cmd14.setName("day"); // NOI18N
        cmd14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd14ActionPerformed(evt);
            }
        });
        add(cmd14);

        cmd15.setText("13");
        cmd15.setName("day"); // NOI18N
        add(cmd15);

        cmd16.setText("14");
        cmd16.setName("day"); // NOI18N
        add(cmd16);

        cmd17.setText("15");
        cmd17.setName("day"); // NOI18N
        add(cmd17);

        cmd18.setText("16");
        cmd18.setName("day"); // NOI18N
        add(cmd18);

        cmd19.setText("17");
        cmd19.setName("day"); // NOI18N
        add(cmd19);

        cmd20.setText("18");
        cmd20.setName("day"); // NOI18N
        add(cmd20);

        cmd21.setText("19");
        cmd21.setName("day"); // NOI18N
        add(cmd21);

        cmd22.setText("20");
        cmd22.setName("day"); // NOI18N
        add(cmd22);

        cmd23.setText("21");
        cmd23.setName("day"); // NOI18N
        add(cmd23);

        cmd24.setText("22");
        cmd24.setName("day"); // NOI18N
        cmd24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd24ActionPerformed(evt);
            }
        });
        add(cmd24);

        cmd25.setText("23");
        cmd25.setName("day"); // NOI18N
        cmd25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd25ActionPerformed(evt);
            }
        });
        add(cmd25);

        cmd26.setText("24");
        cmd26.setName("day"); // NOI18N
        add(cmd26);

        cmd27.setText("25");
        cmd27.setName("day"); // NOI18N
        add(cmd27);

        cmd28.setText("26");
        cmd28.setName("day"); // NOI18N
        add(cmd28);

        cmd29.setText("27");
        cmd29.setName("day"); // NOI18N
        add(cmd29);

        cmd30.setText("28");
        cmd30.setName("day"); // NOI18N
        add(cmd30);

        cmd31.setText("29");
        cmd31.setName("day"); // NOI18N
        add(cmd31);

        cmd32.setText("30");
        cmd32.setName("day"); // NOI18N
        add(cmd32);

        cmd33.setText("31");
        cmd33.setName("day"); // NOI18N
        add(cmd33);

        cmd34.setName("day"); // NOI18N
        cmd34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd34ActionPerformed(evt);
            }
        });
        add(cmd34);

        cmd35.setName("day"); // NOI18N
        cmd35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd35ActionPerformed(evt);
            }
        });
        add(cmd35);

        cmd36.setName("day"); // NOI18N
        add(cmd36);

        cmd37.setName("day"); // NOI18N
        add(cmd37);

        cmd38.setName("day"); // NOI18N
        add(cmd38);

        cmd39.setName("day"); // NOI18N
        add(cmd39);

        cmd40.setName("day"); // NOI18N
        add(cmd40);

        cmd41.setName("day"); // NOI18N
        add(cmd41);

        cmd42.setName("day"); // NOI18N
        add(cmd42);
    }// </editor-fold>//GEN-END:initComponents

    private void cdmSaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdmSaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdmSaActionPerformed

    private void cmd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd10ActionPerformed

    private void cmd14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd14ActionPerformed

    private void cmd24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd24ActionPerformed

    private void cmd25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd25ActionPerformed

    private void cmd34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd34ActionPerformed

    private void cmd35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd35ActionPerformed

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
        addEvent();
    }
 

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dateChooser.Button cdmFr;
    private dateChooser.Button cdmMo;
    private dateChooser.Button cdmSa;
    private dateChooser.Button cdmSu;
    private dateChooser.Button cdmTh;
    private dateChooser.Button cdmTu;
    private dateChooser.Button cdmWe;
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
    private dateChooser.Button cmd21;
    private dateChooser.Button cmd22;
    private dateChooser.Button cmd23;
    private dateChooser.Button cmd24;
    private dateChooser.Button cmd25;
    private dateChooser.Button cmd26;
    private dateChooser.Button cmd27;
    private dateChooser.Button cmd28;
    private dateChooser.Button cmd29;
    private dateChooser.Button cmd3;
    private dateChooser.Button cmd30;
    private dateChooser.Button cmd31;
    private dateChooser.Button cmd32;
    private dateChooser.Button cmd33;
    private dateChooser.Button cmd34;
    private dateChooser.Button cmd35;
    private dateChooser.Button cmd36;
    private dateChooser.Button cmd37;
    private dateChooser.Button cmd38;
    private dateChooser.Button cmd39;
    private dateChooser.Button cmd4;
    private dateChooser.Button cmd40;
    private dateChooser.Button cmd41;
    private dateChooser.Button cmd42;
    private dateChooser.Button cmd5;
    private dateChooser.Button cmd6;
    private dateChooser.Button cmd7;
    private dateChooser.Button cmd8;
    private dateChooser.Button cmd9;
    // End of variables declaration//GEN-END:variables


     public void next(){
if(selectDay==max_of_month){
selectDay=0;
        }
        JButton cmd=(JButton) getComponent(startDate -1 + selectDay +1);
     String n =cmd.getText();
        if(!n.equals("") && Integer.valueOf(n) <=max_of_month){
selectDay++;
        event.execute(null,selectDay);
        cmd.setBackground(new Color(206,110,245));
        
}
}
 public void back(){
if(selectDay<=1){
startDate=max_of_month+1;
}
      JButton cmd=(JButton) getComponent(startDate -1 + selectDay -1);
     String n =cmd.getText();
        if(!n.equals("") && cmd.getName() !=null){
selectDay--;
        event.execute(null,selectDay);
        cmd.setBackground(new Color(206,110,245));
        
}
}


public void up(){
JButton cmd=(JButton) getComponent(startDate-1 + selectDay-7);
  String n=cmd.getText();
        if(!n.equals("") && cmd.getName() !=null){
selectDay-=7;
        event.execute(null,selectDay);
        cmd.setBackground(new Color(206,110,245));
}
}

public void down(){
        if(getComponents().length>startDate-1+selectDay+7){
JButton cmd=(JButton) getComponent(startDate-1 + selectDay+7);
  String n=cmd.getText();
        if(!n.equals("") && cmd.getName() !=null){
selectDay+=7;
        event.execute(null,selectDay);
        cmd.setBackground(new Color(206,110,245));
}
}
}
}