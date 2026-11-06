
package DataBase;
import java.sql.*;

/**
 *
 * @author Mohamed El Ayssaly
 */
public class DbConnection {
   
   private static final String DRIVER="com.mysql.cj.jdbc.Driver"; 
   private static final String PASSWORD="";
   private static final String USER="root";
   private static final String URL="jdbc:mysql://localhost/PFE";
   
   
   private String driver;
   private  final String url;
   private  final String user;
   private  final String password;
   private  static DbConnection instanse;
   
   
   private DbConnection(String url,String user, String password,String driver){
       
       this.url=url;
       this.user=user;
       this.password=password;
       this.driver=driver;
       
 }
  public static DbConnection getInstance(){
  
  if(instanse== null){
instanse=new DbConnection(URL, USER, PASSWORD, DRIVER);
  }
  return instanse;
 
  }
    public Connection getConnection(){
        try{
          Class.forName(this.driver);
          return DriverManager.getConnection(URL,USER,PASSWORD);
            
    }catch(Exception e){
        
        System.out.println("exception in driver");
    }
       
    return null;
   
}


}
        