/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class RepasDao {
   
    
     public static void addrepas(int id,String nom,String categorie,float prix){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="INSERT INTO repas (id ,nom,categorie,prix,showing)"
                  + "VALUES("+id+",'"+nom+"','"+categorie+"',"+prix+",1)";
            
           stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
          
      }
        
        
        
    }
    
       public static void editrepas(int idedit,int id,String nom,String categorie,float prix){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
              String sql="UPDATE repas SET id="+id+" ,nom='"+nom+"',categorie='"+categorie+"',prix="+prix+" WHERE id="+idedit;
            
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}
    
     public static void deleterepas(int id ){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="UPDATE repas SET showing=0 WHERE id="+id;
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}
    
    
    
    
    
    
}
