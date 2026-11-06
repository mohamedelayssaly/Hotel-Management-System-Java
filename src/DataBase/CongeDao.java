
package DataBase;


import java.awt.Component;
import java.sql.Connection;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class CongeDao {
    
    
    
     public static boolean insertAbs( int matricule,int duree,int solde){
     
      try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
          String sql="INSERT INTO conge (matricule ,totalsortie,solde)"
                  + "VALUES("+matricule+","+duree+","+solde+")";
          stmt.execute(sql);
         return true;
         
          
      }catch(Exception e){
          System.out.println("db error "+e);
           return false;
      }
     }   
    
    
    
     public static void addConge(int matric,String datesortie,String dateentrer,int duree){
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
         
//            Date datesortir = dateFormat.parse();
//            Date dateentre = dateFormat.parse();
          
         try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
          
          
           String sql="UPDATE conge SET totalsortie=totalsortie+"+duree+",solde=solde-"+duree+" WHERE matricule="+matric;
           String sql1="INSERT INTO  historiqueconge (matricule,datesortie,dateentre,duree)VALUES ("+matric+",'"+datesortie+"','"+dateentrer+"',"+duree+")";      
          stmt.execute(sql);
         stmt.execute(sql1); 
           
 }catch(Exception e){
          System.out.println("db error "+e);
          
      }
        
        
    }
    
    
    public static void deleteconge (int matric){
    
     try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
          
          String sql="DELETE FROM conge WHERE matricule="+matric;
         
       stmt.execute(sql);
        
         
          
      }catch(Exception e){
          System.out.println("db error "+e);
          
      }

}

     public static void insertconge (int matric){
    
     try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
          
           String sql="INSERT INTO  conge (matricule,totalsortie,solde)VALUES ("+matric+",0,0)"; 
         
       stmt.execute(sql);
        
         
          
      }catch(Exception e){
          System.out.println("db error "+e);
          
      }

     
       
}
    
  public static void soldeconge(int matric ,Date dateemb,int totalsort) throws SQLException{
        
        String datenow = LocalDate.now().toString();
      Connection con =DbConnection.getInstance().getConnection();
   Statement stmt=con.createStatement();
   
  String dateembo=dateemb.toString();
        
         DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate startDate = LocalDate.parse(dateembo, dateFormatter);
         LocalDate endDate = LocalDate.parse(datenow, dateFormatter);

                    Period period = Period.between(startDate, endDate);
                    int monthsBetween = period.getYears() * 12 + period.getMonths();
    
         
         
          String sql2="UPDATE conge SET solde=1.5*"+monthsBetween+"-"+totalsort+" WHERE matricule="+matric;
                  stmt.execute(sql2);
      
                  }
      
         
         
     }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

