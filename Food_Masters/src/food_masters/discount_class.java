/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_masters;

import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author S.Saqib
 */
public class discount_class {
   int percent;
   int threshold;
   int order_limit;
Connection con= null;
PreparedStatement pat=null;
  Statement ps=null;
    ResultSet rs=null;
    
    public discount_class() {
   
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/foodmasters", "saqib", "saqib");
         } catch (SQLException ex) 
         {
           // JOptionPane.showMessageDialog(rootPane, "DB connection failed", "Connection failed ", HEIGHT);
             System.out.println("Database Connection failed ! ");
          }
    }
   
   
    public boolean add_discount(int i1, int i2, int i3)
    {
        percent=i1;
        threshold=i2;
        order_limit=i3;
        
              try{            
              ps = con.createStatement();
              ps.executeUpdate("Insert into saqib.discounts(percent,threshold,order_count) values ("+i1+","+i2+","+i3+")");
              return true;
          } catch (SQLException ex) {
                    return false;
            }    
    
    }
    
    public ResultSet get_discounts()
    {
        try{
             String sq="select * from saqib.discounts";
        pat=con.prepareStatement(sq);
        rs=pat.executeQuery();
        return rs;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    
   public void clear_discounts()
   {
     
               try{
             String sq="delete from saqib.discounts";
    ps=con.createStatement();
        ps.executeUpdate(sq);
       
        }
        catch(SQLException e)
        {
           
        }
   }
    
  
   
}
