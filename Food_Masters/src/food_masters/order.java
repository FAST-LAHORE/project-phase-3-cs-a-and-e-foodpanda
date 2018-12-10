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
public class order {
    restaurent_menu m;
    private String name;
    private Integer Quantity;
    order()
    {
    
    }
    order(String n,Integer q)
    {
       set_order(n,q);
    }
    public void set_order(String n,Integer q)
    {
       name=n;
       Quantity=q;
    }
    public String get_name()
    {
      return name;
    }
    public Integer get_quantity()
    {
       return Quantity;
    }
    public Integer calu(Integer p)
    {
      
       return (Quantity*p);
    }
}
