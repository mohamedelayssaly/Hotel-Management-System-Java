/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class ProductDao {
   
    
    
    
    
    
      public static void addproduct(int ref,String discription,int qte,float prix,String type){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="INSERT INTO product (ref ,discription,qte,prix,type,showing)"
                  + "VALUES("+ref+",'"+discription+"',"+qte+","+prix+",'"+type+"',1)";
            
           stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
          
      }
        
        
        
    }
    
       public static void editproduct(int editref,int ref,String discription,int qte,float prix,String type){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
              String sql="UPDATE product SET ref="+ref+" ,discription='"+discription+"',qte="+qte+",prix="+prix+" ,type='"+type+"' WHERE ref="+editref;
            
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}
    
     public static void deleteprod(int ref ){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="UPDATE product SET showing=0 WHERE ref="+ref;
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}
     
    
    
    
    
         public static void addhistorique(int refprod,LocalDate date,int qte,String  action){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="INSERT INTO prodhesto (refprod ,qte,date,action)"
                  + "VALUES("+refprod+","+qte+",'"+date+"','"+action+"')";
            
           stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
          
      } 
         }
    
    
    
    
    
    
    
    
}
