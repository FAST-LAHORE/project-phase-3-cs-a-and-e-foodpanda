/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_masters;


/**
 *
 * @author M-IMRAN
 */
public class Staff {

    private int staffId;
    private String firstName;
    private String lastName;
    private String Desgination;
    private String CNICNumber;
    private String staffAddress;
    private String mobileNumber;
    private int staffAge;
    private double staffSalarly;
    private String dateofjoining;
    
    public Staff(int Id,String fName,String lName,String sDesgination,String CNICnumber,String sAddress,String mobilenum,int sAge,
            double sSalarly,String DateofJoining)
    {
        staffId=Id;
        firstName=fName;
        lastName=lName;
        Desgination=sDesgination;
        CNICNumber=CNICnumber;
        staffAddress=sAddress;
        mobileNumber=mobilenum;
        staffAge=sAge;
        staffSalarly=sSalarly;
        dateofjoining=DateofJoining;
        
    }
    
    public String getDateofJoining()
    {
        return dateofjoining;
    }
    public double getStaffSalarly()
    {
        return staffSalarly;
    }
    public int getStaffAge()
    {
        return staffAge;
    }
    public String getMobileNumber()
    {
        return mobileNumber;
    }
    public String getStaffAddress()
    {
        return staffAddress;
    }
    public String getCNICNumber()
    {
        return CNICNumber;
    }
    public String getStaffDesgination()
    {
        return Desgination;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getStaffId()
    {
        return staffId;
        
    }
    public String getFirstName()
    {
        return firstName;
        
    }
    
    

    
}
