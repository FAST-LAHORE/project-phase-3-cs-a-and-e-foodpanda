/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_masters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mehbo
 */
public class test {
 
    test()
    {
    
    }
    public boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
     public boolean isValid_mobile(String s) 
    { 
        Pattern p = Pattern.compile("(03)?[0-9][0-9][0-9]{7}"); 
        Matcher m = p.matcher(s); 
        return (m.find() && m.group().equals(s)); 
    } 
  
}
