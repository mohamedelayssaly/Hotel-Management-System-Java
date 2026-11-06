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
public class ClientDao {
        
    public static void addclient(String cin,String prenom,String nom,int tele,String email,String adresse){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="INSERT INTO client (cin ,nom,prenom,email ,adresse,tele )"
                  + "VALUES('"+cin+"','"+nom+"','"+prenom+"','"+email+"','"+adresse+"',"+tele+")";
            
           stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
          
      }
        
        
        
    }
    
       public static void editclient(String editcin,String cin,String prenom,String nom,int tele,String email,String adresse){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="UPDATE client SET cin='"+cin+"' ,nom='"+nom+"',prenom='"+prenom+"',email='"+email+"',"
                   +"adresse='"+adresse+"' ,tele="+tele+" WHERE cin='"+editcin+"'";
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}
    
     public static void deleteclient(String cin){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="DELETE FROM client WHERE cin='"+cin+"'";
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}
}
