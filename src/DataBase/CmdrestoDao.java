/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDate;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class CmdrestoDao {
 
    
      public static void addcmd(int idrepas,int qte,float prixtotal,LocalDate datecmd){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="INSERT INTO cmdrestau (idrepas,qte,prixtotal,datecmd)"
                  + "VALUES("+idrepas+","+qte+","+prixtotal+",'"+datecmd+"')";
            
           stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
          
      }
        
        
        
    }
    
       public static void editcmd(int idedit,int id ,int idrepas,int qte,float prixtotal,LocalDate datecmd){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
              String sql="UPDATE cmdrestau SET id="+id+" ,idrepas="+idrepas+",qte="+qte+",prixtotal="+prixtotal+",datecmd='"+datecmd+"' WHERE id="+idedit;
            
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}
    
     public static void deletecmd(int id ){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="DELETE FROM cmdrestau WHERE id="+id;
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}
     
    
    
}
