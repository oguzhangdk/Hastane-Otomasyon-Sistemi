/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KOD;

/**
 *
 * @author oguzh
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbBaglanti extends KontrolClass{
    
   static String calısılanDizin= System.getProperty("user.dir");

   
    static String url ="jdbc:sqlite:DatabaseFolder/hastane.db" ;
    static Connection conn = null;

    
    public static boolean baglan(){
    try{
        if(calısılanDizin.endsWith("dist")){
            url="jdbc:sqlite:../DatabaseFolder/hastane.db";
        }
       
        conn = (Connection) DriverManager.getConnection(url);
        System.out.println("Veritabanına bağlandınız!");
        return true;
    }
    catch(SQLException e){
        e.printStackTrace();

        return false;
    }
    
    }
    
     
     
     public static ResultSet listele(String sorgu){
         
         Statement st;
         ResultSet rs;
         
         try{
         st= conn.createStatement();
         rs= st.executeQuery(sorgu);
         return rs;
         }
         
         catch(SQLException e){
             e.printStackTrace();
             return null;
         }
         
     }
     
  
     
     public static void kaydet(String sorgu){
         Statement st;
         try {
             st=conn.createStatement();
             st.executeUpdate(sorgu);
             System.out.println("Veritabanına kayıt edildi!");
         } catch (SQLException e) {
             e.printStackTrace();
             
         }
         
                 
                 
     }
          
     //OVERLOAD
     public static void kaydet(String sorgu,String sorgu2,String sorgu3){
         Statement st;
         Statement st2;
         Statement st3;
         try {
             st=conn.createStatement();
             
             st.executeUpdate(sorgu);
             System.out.println("Veritabanına kayıt edildi!");
         } catch (SQLException e) {
             e.printStackTrace();
             
         }
          try {
             st2=conn.createStatement();
             
             st2.executeUpdate(sorgu2);
             System.out.println("Veritabanına kayıt edildi!");
         } catch (SQLException e) {
             e.printStackTrace();
             
         }
          
           try {
             st3=conn.createStatement();
             
             st3.executeUpdate(sorgu3);
             System.out.println("Veritabanına kayıt edildi!");
         } catch (SQLException e) {
             e.printStackTrace();
             
         }
         
                 
                 
     }
     

     
     public static void update(String sorgu){
         Statement st;
         try{
             st=conn.createStatement();
             st.executeUpdate(sorgu);
             System.out.println("Veritabanına update edildi!");
         }
         catch(SQLException e){
         e.printStackTrace();
         }
         
     }
     
     public static void sil(String sorgu){
         Statement st;
         try{
             st=conn.createStatement();
             st.executeUpdate(sorgu);
             System.out.println("Veritabanından silindi!");
         }
         catch(SQLException e){
             e.printStackTrace();
         }
     }
     
   
     public void programHaber(){
            System.out.println("Database Bağlantısı Kontrol Edildi.");
}
    
}