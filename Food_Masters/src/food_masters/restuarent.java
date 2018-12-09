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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mehbo
 */
public class restuarent extends User{
    protected Integer validation;
    Connection con= null;
// PreparedStatement ps=null;
     Statement ps=null;
     ResultSet rs=null;
    restuarent()
    {
      validation=0;
    }
    restuarent(String n,String e,String p,String m)
    {
       set_restuarent(n,e,p,m);
        validation=0;
    }
     public void set_restuarent(String n,String e,String m,String p)
    {
       name=n;
       email=e;
       password=p;
       mobile_no=m;
       validation=0;
    }
    @Override
    public void set_user(String n, String e, String p, String m)
    {
    
    }
    @Override
    public void updatedatabase() 
    {
       
    }
}