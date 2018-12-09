/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_masters;

/**
 *
 * @author mehbo
 */
public abstract class User {
    protected String name ;
    protected String email ;
    protected String password;
    protected String mobile_no;
    User()
    {
       name=null;
       email=null;
       password=null;
       mobile_no=null;
    }
     public abstract void set_user(String n,String e,String p,String m);
     public abstract void updatedatabase();
}
