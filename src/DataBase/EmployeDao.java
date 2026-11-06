/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;
import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Mohamed El Ayssaly
 */
public class EmployeDao {
   
    
  public static List<Employe> getAllEmployes() throws SQLException{
      
  List<Employe>  employes=new ArrayList<>();
  try{
   Connection con =DbConnection.getInstance().getConnection();
   Statement stmt=con.createStatement();
   
      ResultSet res=stmt.executeQuery("select * from employe");
      while (res.next()){
         Employe emp=new Employe();
         emp.setMatricul(res.getInt("matricule"));
         emp.setNom(res.getString("nom"));
          emp.setPrenom(res.getString("prenom"));
          emp.setCin(res.getString("cin"));
          emp.setPoste(res.getString("poste"));
          emp.setDat_emb(res.getString("dateembauche"));
          emp.setNmbr_heur(res.getString("nbr_heure"));
          emp.setSaliare(res.getInt("salaire"));
          emp.setTele(res.getString("tele"));
          employes.add(emp);
      }
      
  }catch(SQLException ex){
         System.out.println("Db Errors "+ex);
  }
  
    return employes;  
  } 
    public static List<Employe> getEmploye(int matric) throws SQLException{
      
  List<Employe>  employes=new ArrayList<>();
  try{
   Connection con =DbConnection.getInstance().getConnection();
   Statement stmt=con.createStatement();
   
      ResultSet res=stmt.executeQuery("select * from employe WHERE matricule="+matric);
      while (res.next()){
         Employe emp=new Employe();
         emp.setMatricul(res.getInt("matricule"));
         emp.setNom(res.getString("nom"));
          emp.setPrenom(res.getString("prenom"));
          emp.setCin(res.getString("cin"));
          emp.setPoste(res.getString("poste"));
          emp.setDat_emb(res.getString("dateembauche"));
          emp.setNmbr_heur(res.getString("nbr_heure"));
          emp.setSaliare(res.getInt("salaire"));
          emp.setTele(res.getString("tele"));
          employes.add(emp);
      }
      
  }catch(SQLException ex){
         System.out.println("Db Errors "+ex);
  }
  
    return employes;  
  } 
  
  public static boolean insertEmp( int matricule,String nom,String prenom,String cin,
          String poste,String dateembauche,int nbr_heure,int salaire,int tele){
      List<Employe> empAdd=new ArrayList<>();
      try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
            String datenow = LocalDate.now().toString();   
         DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate startDate = LocalDate.parse(dateembauche, dateFormatter);
         LocalDate endDate = LocalDate.parse(datenow, dateFormatter);
 Period period = Period.between(startDate, endDate);
                    int monthsBetween = period.getYears() * 12 + period.getMonths();
                    System.out.println("nimbre des mois est :"+monthsBetween);
                      String sql="INSERT INTO employe (matricule ,nom,prenom,cin,poste ,dateembauche,nbr_heure,salaire ,tele,see)"
                  + "VALUES("+matricule+",'"+nom+"','"+prenom+"','"+cin+"','"+poste+"','"+dateembauche+"',"+nbr_heure+","+salaire+","+tele+",1)";
             String sql1="INSERT INTO  absence (matricule,absentTotal)VALUES ("+matricule+",0)";  
             String sql2="INSERT INTO  conge (matricule,totalsortie,solde)VALUES ("+matricule+",0,0)";      
           stmt.execute(sql);          
           stmt.execute(sql1);
           stmt.execute(sql2);
           
         return true;
         
          
      }catch(Exception e){
          System.out.println("db error "+e);
           return false;
      }
     }
  
  
  
    public static void deleteEmp(int matr){
        
      List<Employe> deletemp=new ArrayList<>();
        
       try{
         Connection con=DbConnection.getInstance().getConnection();
         Statement stmt=con.createStatement();
         String sql="UPDATE  employe set see=0 WHERE matricule="+matr;
//          String sql1="UPDATE  conge set show=0 WHERE matricule="+matr;
//           String sql2="UPDATE  absence set show=0 WHERE matricule="+matr;
//             stmt.execute(sql1);
//             stmt.execute(sql2);
          stmt.execute(sql);

       } catch(Exception e){
           
        System.out.println("db error "+e);   
           
       }
    }
    
    
      public static void updateEmp( int metrget ,int matricule,String nom,String prenom,String cin,
          String poste,String dateembauche,int nbr_heure,int salaire,int tele){
      List<Employe> empAdd=new ArrayList<>();
      try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
          String sql="UPDATE employe SET matricule="+matricule+" ,nom='"+nom+"',prenom='"+prenom+"',cin='"+cin+"',poste='"+poste+"' ,"
                  + "dateembauche='"+dateembauche+"',nbr_heure="+nbr_heure+",salaire="+salaire+" ,tele="+tele+" WHERE matricule="+metrget;
                  
          stmt.execute(sql);
        
         
          
      }catch(Exception e){
          System.out.println("db error "+e);
          
      }
     }
    
    
    
}
