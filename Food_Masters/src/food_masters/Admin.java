/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_masters;

import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author S.Saqib
 */
public class Admin {
Connection con= null;
// PreparedStatement ps=null;
Statement ps=null;
ResultSet rs=null;
    
   private static Admin instance = new Admin();

   //make the constructor private 
   private Admin(){
    try {
     con=DriverManager.getConnection("jdbc:derby://localhost:1527/foodmasters", "saqib", "saqib");
      } catch (SQLException ex) {
      System.out.println("Connection not established!");
      }
    try{            
     ps = con.createStatement();
     ps.executeUpdate("Insert into saqib.users(name,email,password2,role_id,mobile) values ('saqib','syedsaqib313@gmail.com','major',1,'03225782821')");
     System.out.println("Admin added");      
    }                                        
    catch(SQLException e){
        System.out.println("Query failed!");
    }
   
   }

   //Get the only object available
   public static Admin getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}
