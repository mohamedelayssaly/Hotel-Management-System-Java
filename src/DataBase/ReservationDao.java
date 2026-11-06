
package DataBase;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class ReservationDao {
        public static void addreservation(int nchambre,String cinclient,String dateentre,String datesortie,int nbrnuit,float tariftotal){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="INSERT INTO reservation (nchambre,cinclient,dateentre,datesortie,nbrnuit,tariftotal)"
                  + "VALUES("+nchambre+",'"+cinclient+"','"+dateentre+"','"+datesortie+"',"+nbrnuit+","+tariftotal+")";
            
           stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
          
      }
        
        
        
    }
    
       public static void editreservation(int editnumreservation,int nchambre,String cinclient,String dateentre,String datesortie,int nbrnuit,float tariftotal){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
          String sql="UPDATE reservation   SET nchambre="+nchambre+","
                  + "cinclient='"+cinclient+"',dateentre='"+dateentre+"',datesortie='"+datesortie+"',"
                  + "nbrnuit="+nbrnuit+",tariftotal="+tariftotal+" WHERE numreservation="+editnumreservation;
                  
            
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}
    
     public static void deletereserv(int  numreservation){
        
        
          try{
          Connection con=DbConnection.getInstance().getConnection();
          Statement stmt=con.createStatement();
           String sql="DELETE FROM reservation WHERE numreservation="+numreservation;
               stmt.execute(sql);          
  }catch(Exception e){
          System.out.println("db error "+e);
     }
}


}