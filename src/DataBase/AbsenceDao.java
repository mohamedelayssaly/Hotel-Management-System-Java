/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class AbsenceDao {
   
    
    
     public static boolean insertAbs( int matricule,int abstotal){
      List<Employe> empAdd=new ArrayList<>();
      try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
          String sql="INSERT INTO absence (matricule ,absentTotal)"
                  + "VALUES("+matricule+","+abstotal+")";
          stmt.execute(sql);
         return true;
         
          
      }catch(Exception e){
          System.out.println("db error "+e);
           return false;
      }
     }
   
    public static void addAbs(int matric){
        
         try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
          
          String sql="UPDATE absence SET absentTotal=absentTotal+1 WHERE matricule="+matric;
           String sql1="INSERT INTO  historiqueabs (matricule,dateabs)VALUES ("+matric+",'"+LocalDate.now()+"')";      
          stmt.execute(sql);
         stmt.execute(sql1);
         
          
      }catch(Exception e){
          System.out.println("db error "+e);
          
      } 
        
        
    }
    
    
      public static List<Absence> listAbs() throws SQLException{
      
  List<Absence>  absence=new ArrayList<>();
 try{
   Connection con =DbConnection.getInstance().getConnection();
   Statement stmt=con.createStatement();
   
      ResultSet res=stmt.executeQuery("SELECT e.matricule ,e.nom,e.prenom , a.absentTotal FROM absence a ,employe e WHERE a.matricule=e.matricule");
      while (res.next()){
         Absence abs=new Absence();
         abs.setMatricul(res.getInt("matricule"));
         abs.setNom(res.getString("nom"));
          abs.setPrenom(res.getString("prenom"));
          abs.setTotale(res.getInt("absentTotal"));
         
          absence.add(abs);
      }
    
    
    
      }catch(Exception e){
     System.out.println("error"+e);
}
         return absence;

      }


public static void historiqueabs(int matric){

     try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
          
          String sql="select * from historiqueabs WHERE matricule="+matric;
         
        ResultSet res=stmt.executeQuery(sql);
        
         
          
      }catch(Exception e){
          System.out.println("db error "+e);
          
      }

}

public static void deletabs (int matric){
    
     try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
          
          String sql="DELETE FROM absence WHERE matricule="+matric;
         
       stmt.execute(sql);
        
         
          
      }catch(Exception e){
          System.out.println("db error "+e);
          
      }

}















}