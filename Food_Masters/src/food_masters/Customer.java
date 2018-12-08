/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_masters;

import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mehbo
 */
public class Customer extends User{
    protected Integer rol_id;
    Customer()
    {  
       rol_id=5;
    }
    Customer(String n,String e,String p,String m)
    {
       set_user(n,e,p,m);
       rol_id=5;
    }
    public void set_user(String n,String e,String p,String m)
    {
       name=n;
       email=e;
       password=p;
       mobile_no=m;
    }
    public boolean updatedatabase()
    {
         
      return true;
    }
}
