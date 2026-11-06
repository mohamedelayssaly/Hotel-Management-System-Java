
package dateChooser;

//import com.mysql.cj.x.protobuf.MysqlxPrepare;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;




public class DateChooser extends javax.swing.JPanel {

 public JTextField getTextRefernce(){
       return textRefernce;
 }  
public void addEventDateChooser(EventDateChooser event){
    events.add(event);
    
} 
    
    
   private JTextField textRefernce;
   private final String MONTH_ENGLISH[]={"January","February","March","April","May","June","July","August","Semtember","October","November","December"};
   private String dateFormat="yyyy-MM-dd";
   private int MONTH=1;
   private int YEAR=2021;
   private int DAY=1;
   private int STATUS=1;//1 is day  2 is month  3is year
   private int startYear;
   private SelectedDate selectedDate=new SelectedDate();
   private List<EventDateChooser> events;
   public DateChooser() {
        initComponents();
       execute();
    }
private void execute(){
    setForeground(new Color(204,93,93));
    events =new ArrayList<>();
    popup.add(this);
    toDay(false);
}
public void setTextRefrnce(JTextField txt){
    this.textRefernce=txt;
     this.textRefernce.setEditable(false);
      this.textRefernce.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent e) {
        
        if( textRefernce.isEnabled()){
            showPopup();
        }
        }
 });
    setText(false,0);
}
  private void setText(boolean runEvent,int act){  
   if(textRefernce!=null){
       try{
           SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd");
       Date date=df.parse(YEAR+"-"+MONTH+"-"+DAY);
       textRefernce.setText(new SimpleDateFormat(dateFormat).format(date));
       }catch(ParseException e){
           System.err.println(e);
       }
    }
if(runEvent){
    runEvent(act);
}   
  }
    
  private void runEvent(int act) {
     SelectedAction action =new SelectedAction() {
         @Override
         public int getAction() {
        return act;
         }
     };
  for(EventDateChooser event :events){
      event.dateSelected(action, selectedDate);
  }    
  } 
  private Event getEventDay(Dates dates){
      return (MouseEvent evt,int num) -> {
          dates.clearselected();
          dates.setSelected(num);
          DAY=num;
          selectedDate.setDay(DAY);
           selectedDate.setMonth(MONTH);
            selectedDate.setYear(YEAR);
            setText(true, 1);
            if(evt !=null && evt.getClickCount()==2 && SwingUtilities.isLeftMouseButton(evt)){
            popup.setVisible(false);
                
 }
      };
  }
  
  private Event getEventMonth(){
    return (MouseEvent evt,int num) -> {
        MONTH =num;
        selectedDate.setDay(DAY);
        selectedDate.setMonth(MONTH);
        selectedDate.setYear(YEAR);
        setText(true , 2);
        Dates d= new Dates();
        d.setForeground(getForeground());
        d.setEvent(getEventDay(d));
        d.showDate(MONTH, YEAR, selectedDate);
        if(slide.slideToDown(d)){
            cmdMonth.setText(MONTH_ENGLISH[MONTH-1]);
            cmdYear.setText(YEAR+"");
            STATUS=1;
        }
      };
  }
    private Event getEventYear(){
    return (MouseEvent evt,int num) -> {
        YEAR =num;
        selectedDate.setDay(DAY);
        selectedDate.setMonth(MONTH);
        selectedDate.setYear(YEAR);
        setText(true , 3);
        Months d= new Months();
       
        d.setEvent(getEventMonth());
       
        if(slide.slideToDown(d)){
            cmdMonth.setText(MONTH_ENGLISH[MONTH-1]);
            cmdYear.setText(YEAR+"");
            STATUS=2;
        }
      };
  }
  
  private void toDay(boolean runEvent){
      Dates dates=new Dates();
      dates.setForeground(getForeground());
      dates.setEvent(getEventDay(dates));
      SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
      Date date=new Date();
      String toDay=df.format(date);
            DAY=Integer.valueOf(toDay.split("-")[2]);
            MONTH=Integer.valueOf(toDay.split("-")[1]);
            YEAR=Integer.valueOf(toDay.split("-")[0]);
            selectedDate.setDay(DAY);
            selectedDate.setMonth(MONTH);
            selectedDate.setYear(YEAR);
            dates.showDate(MONTH, YEAR, selectedDate);
  slide.slideNon(dates);
  cmdMonth.setText(MONTH_ENGLISH[MONTH-1]);
  cmdYear.setText(YEAR+"");
      setText(runEvent, 0);
  }
   public void toDay(){
       toDay(true);
   }
   private void setDateNext(){
       Dates dates=new Dates();
       dates.setForeground(getForeground());
       dates.setEvent(getEventDay(dates));
       dates.showDate(MONTH, YEAR, selectedDate);
       if(slide.slideToLeft(dates)){
           cmdMonth.setText(MONTH_ENGLISH[MONTH-1]);
           cmdYear.setText(YEAR+"");
       }
   }
  
      private void setDateBack(){
       Dates dates=new Dates();
       dates.setForeground(getForeground());
       dates.setEvent(getEventDay(dates));
       dates.showDate(MONTH, YEAR, selectedDate);
       if(slide.slideToRight(dates)){
           
           cmdMonth.setText(MONTH_ENGLISH [MONTH -1]);
           cmdYear.setText(YEAR+"");
       }
   }
    private void setYearNext(){  
    Years years=new Years();
    years.setEvent(getEventYear());
    startYear=years.next(startYear);
    slide.slideToLeft(years);
   }     
   private void setYearback(){
       if(startYear>=1000){
            Years years=new Years();
    years.setEvent(getEventYear());
    startYear=years.back(startYear);
    slide.slideToLeft(years);   
       }
     
   }  
   public void showPopup(Component com,int x,int y){
     popup.show(com, x, y);
   }  
    public void showPopup(){
     popup.show(textRefernce, 0, textRefernce.getHeight());
   }  
     public void hidePopup(){
     popup.setVisible(false);
     } 
    
    
    
    
    
    
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        slide = new dateChooser.Slider();
        header = new javax.swing.JPanel();
        cmdprivious = new dateChooser.Button();
        cmdForword = new dateChooser.Button();
        YM = new javax.swing.JLayeredPane();
        cmdMonth = new dateChooser.Button();
        jLabel1 = new javax.swing.JLabel();
        cmdYear = new dateChooser.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        slide.setLayout(new javax.swing.BoxLayout(slide, javax.swing.BoxLayout.LINE_AXIS));

        header.setBackground(new java.awt.Color(204, 93, 93));

        cmdprivious.setBackground(new java.awt.Color(204, 93, 93));
        cmdprivious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dateChooser/previous.png"))); // NOI18N
        cmdprivious.setFocusable(true);
        cmdprivious.setPaintBackground(false);
        cmdprivious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdpriviousActionPerformed(evt);
            }
        });
        cmdprivious.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdpriviousKeyPressed(evt);
            }
        });

        cmdForword.setBackground(new java.awt.Color(204, 93, 93));
        cmdForword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dateChooser/forward.png"))); // NOI18N
        cmdForword.setFocusable(true);
        cmdForword.setPaintBackground(false);
        cmdForword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdForwordActionPerformed(evt);
            }
        });

        YM.setMinimumSize(new java.awt.Dimension(118, 24));
        YM.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        cmdMonth.setBackground(new java.awt.Color(204, 93, 93));
        cmdMonth.setForeground(new java.awt.Color(255, 255, 255));
        cmdMonth.setText("January");
        cmdMonth.setFocusable(true);
        cmdMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdMonth.setPaintBackground(false);
        cmdMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMonthActionPerformed(evt);
            }
        });
        YM.add(cmdMonth);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("-");
        YM.add(jLabel1);

        cmdYear.setBackground(new java.awt.Color(204, 93, 93));
        cmdYear.setForeground(new java.awt.Color(255, 255, 255));
        cmdYear.setText("2018");
        cmdYear.setFocusPainted(false);
        cmdYear.setFocusable(true);
        cmdYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdYear.setPaintBackground(false);
        cmdYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdYearActionPerformed(evt);
            }
        });
        YM.add(cmdYear);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdprivious, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YM, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdForword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(YM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdprivious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdForword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(slide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slide, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdForwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdForwordActionPerformed

              if(STATUS==1){//DATE
          if(MONTH==12){
              MONTH=1;
              YEAR++;
          }else{
              MONTH++;
          }
          setDateNext();
      }else if(STATUS==3){//YEAR
                  setYearNext();
          
      }else{
          if(YEAR>=1000){
              YEAR++;
              Months months=new Months();
              months.setEvent(getEventMonth());
              slide.slideToLeft(months);
              cmdYear.setText(YEAR+"");
          }
      }

        
        
    }//GEN-LAST:event_cmdForwordActionPerformed

    private void cmdYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdYearActionPerformed
     
            if(STATUS!=3){
            STATUS=3;
            Years years=new Years();
            years.setEvent(getEventYear());
            startYear=years.showYear(YEAR);
            slide.slideToDown(years);
        }else{
            Dates dates=new Dates();
            dates.setForeground(getForeground());
            dates.setEvent(getEventDay(dates));
            dates.showDate(MONTH, YEAR, selectedDate);
        slide.slideToDown(dates);
        STATUS=1;
        }
  
    }//GEN-LAST:event_cmdYearActionPerformed

    private void cmdpriviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdpriviousActionPerformed
   
         if(STATUS==1){//DATE
          if(MONTH==1){
              MONTH=12;
              YEAR--;
          }else{
              MONTH--;
          }
          setDateBack();
      }else if(STATUS==3){//YEAR
          setYearback();
          
      }else{
          if(YEAR>=1000){
              YEAR--;
              Months months=new Months();
              months.setEvent(getEventMonth());
              slide.slideToLeft(months);
              cmdYear.setText(YEAR+"");
          }
      }
      
    }//GEN-LAST:event_cmdpriviousActionPerformed

    private void cmdMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMonthActionPerformed
  
        if(STATUS!=2){
            
            STATUS=2;
            Months months=new Months();
            months.setEvent(getEventMonth());
            slide.slideToDown(months);
            
        }else{
             
            Dates dates=new Dates();
            dates.setForeground(getForeground());
            dates.setEvent(getEventDay(dates));
            dates.showDate(MONTH, YEAR, selectedDate);
        slide.slideToDown(dates);
        STATUS=1;
        }
        
      
        
    }//GEN-LAST:event_cmdMonthActionPerformed

    private void cmdpriviousKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdpriviousKeyPressed
     Component com;
       if(evt.getKeyCode()==KeyEvent.VK_UP) {
            com=slide.getComponent(0);
           if(com instanceof Dates){
               Dates d=(Dates) com;
               d.up();
           }
           else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
                      com=slide.getComponent(0); 
           if(com instanceof Dates){
               Dates d=(Dates) com;
               d.down();
           }
       } else if(evt.getKeyCode()==KeyEvent.VK_LEFT){
                      com=slide.getComponent(0); 
           if(com instanceof Dates){
               Dates d=(Dates) com;
               d.back();
           }
       } else if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
                      com=slide.getComponent(0); 
           if(com instanceof Dates){
               Dates d=(Dates) com;
               d.next();
           }
       }
}     
  
    
    }//GEN-LAST:event_cmdpriviousKeyPressed

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }
 
    public void setSelectDateFormat(Date date){
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
       String d=df.format(date);
       DAY=Integer.valueOf(d.split("-")[2]);
       MONTH=Integer.valueOf(d.split("-")[1]);
       YEAR=Integer.valueOf(d.split("-")[0]);
       selectedDate.setDay(DAY);
       selectedDate.setMonth(MONTH);
       selectedDate.setYear(YEAR);
       Dates dates=new Dates();
       dates.setForeground(getForeground());
       dates.setEvent(getEventDay(dates));
       dates.setSelected(DAY);
       dates.showDate(MONTH, YEAR, selectedDate);
       slide.slideNon(dates);
       cmdMonth.setText(MONTH_ENGLISH[MONTH-1]);
       cmdYear.setText(YEAR+"");
        setText(true, 0);
        STATUS=1;
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane YM;
    private dateChooser.Button cmdForword;
    private dateChooser.Button cmdMonth;
    private dateChooser.Button cmdYear;
    private dateChooser.Button cmdprivious;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu popup;
    private dateChooser.Slider slide;
    // End of variables declaration//GEN-END:variables

    public SelectedDate getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(SelectedDate selectedDate) {
        this.selectedDate = selectedDate;
        DAY=selectedDate.getDay();
        MONTH=selectedDate.getMonth();
        YEAR=selectedDate.getYear();
          Dates dates=new Dates();
       dates.setForeground(getForeground());
       dates.setEvent(getEventDay(dates));
       dates.setSelected(DAY);
       dates.showDate(MONTH, YEAR, selectedDate);
       slide.slideNon(dates);
       cmdMonth.setText(MONTH_ENGLISH[MONTH-1]);
       cmdYear.setText(YEAR+"");
        setText(true, 0);
        STATUS=1;
       
    }

    @Override
    public void setForeground(Color fg) {
        super.setForeground(fg);  
    if(header!=null){
        header.setBackground(fg);
        toDay(false);
    }
    }









}
