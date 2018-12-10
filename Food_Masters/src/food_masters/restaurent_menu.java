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
public class restaurent_menu {
    private String Item_name;
    private Integer price;
    private String rs_name; 
   restuarent r;
   restaurent_menu()
   {
   
   }
   restaurent_menu(String n,Integer p,String rsn)
   {
      set_menu(n,p,rsn);
   }
   public void set_menu(String n,Integer p,String rsn)
   {
      Item_name=n;
       price=p;
       rs_name=rsn;
   }
   public String get_rsname()
   {
      return rs_name; 
   }
   public String getitemname()
   {
      return Item_name;
   }
    public Integer getprice()
   {
      return price;
   }
}
