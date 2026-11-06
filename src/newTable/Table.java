
package newTable;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Table extends JTable{
   
    
    public Table(){
       
        setShowHorizontalLines(true);
        setGridColor(new Color(230,230,230));
         setFont(new Font("sansserif",1,20));
         
        setRowHeight(40);
          getTableHeader().setReorderingAllowed(false);
          getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object o, boolean bln, boolean bln1, int i, int i1) {
           TableHeader header =new TableHeader(o+"");
         // if(i1==4){
             //  header.setHorizontalAlignment(JLabel.CENTER);
            //}
            return header;
            }
 });
        
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object o, boolean selected, boolean bln1, int i, int i1) {
             Component com=super.getTableCellRendererComponent(table, o, selected, bln1, i, i1);
               
            //if(i1==4){
                com.setBackground(Color.WHITE);
                setBorder(noFocusBorder);
                if(selected){
                  com.setForeground(new Color(255,153,153));
                }else{
                     com.setForeground(new Color(102,102,102));  
                }
           
//            }else{
//                    StatusType type = (StatusType) o;
//                    CellStatus cell = new CellStatus(type);
//                    return cell;
//            }
 
           //  }
                return com;
            
            }
        });
        
    }
    
    public void addRow(Object[] row){
        DefaultTableModel model=(DefaultTableModel) getModel();
        model.addRow(row);
    }

    
    
}
        
