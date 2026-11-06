/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import Parametre.Users;
import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDate;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class ParametreDao {
  
    
    
    
    
    
      public static void adduser(String cin ,String nom,String prenom,String password ,String droit){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="INSERT INTO user ( cin , nom, prenom, password , droit)"
                  + "VALUES('"+cin+"','"+nom+"','"+prenom+"','"+password+"','"+droit+"')";
            
           stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
          
      }
        
        
        
    }
    
       public static void edituser(String cinedit,String cin ,String nom,String prenom,String password ,String droit){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
              String sql="UPDATE user SET cin='"+cin+"' , nom='"+nom+"', prenom='"+prenom+"', password='"+password+"' , droit='"+droit+"' WHERE cin='"+cinedit+"'";
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}
    
     public static void deletuser(String cin ){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="DELETE FROM user  WHERE cin='"+cin+"'";
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}
     
    
    
    
    
         public static void addinformation(String nom,String adresse,String email,String pays,String ville,int cp,String tele){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="INSERT INTO companyinfo ( nom, adresse, email, pays, ville, cp, tele)"
                  + "VALUES('"+nom+"','"+adresse+"','"+email+"','"+pays+"' ,'"+ville+"',"+cp+",'"+tele+"')";
            
           stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
          
      } 
         }
    
        
         public static void setinformation(String nom,String adresse,String email,String pays,String ville,int cp,String tele){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="UPDATE companyinfo SET  nom='"+nom+"', adresse='"+adresse+"', email='"+email+"',"
                   + " pays='"+pays+"', ville='"+ville+"', cp="+cp+", tele='"+tele+"'";
               
            
           stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
          
      } 
         }
    
    
    
    
    
    
    
}
