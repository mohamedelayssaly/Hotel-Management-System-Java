/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class ChambreDao {
  
    
    
    public static void addchambre(int nchambre,String type,int capacite, int nbrlit,int tarif,String etat){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="INSERT INTO chambre (nchambre ,type,capacite,nbrlit,tarif ,etat)"
                  + "VALUES("+nchambre+",'"+type+"',"+capacite+","+nbrlit+","+tarif+",'"+etat+"')";
            
           stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
          
      }
        
        
        
    }
    
       public static void editchambre(int editnchambre,int nchambre,String type,int capacite, int nbrlit,int tarif,String etat){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="UPDATE chambre SET nchambre="+nchambre+" ,type='"+type+"',capacite="+capacite+","
                   + "nbrlit="+nbrlit+",tarif="+tarif+",etat='"+etat+"' WHERE nchambre="+editnchambre;
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}
    
     public static void deletechambre(int nchambre){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="DELETE FROM chambre WHERE nchambre="+nchambre;
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}
      
    
}
