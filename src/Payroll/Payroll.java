package Payroll;

/**
 * Payroll class
 */

public class Payroll
{
   private String name;          // Employee name
   private int idNumber;         // ID number
   private double payRate;       // Hourly pay rate
   private double hoursWorked;   // Number of hours worked

   /**
    * Constructor
    * The expected arguments are an employee's
    * name and ID number.
     * @param n
     * @param i
     * @throws EmptyName
     * @throws InvalidIDNum
    */

   public Payroll(String n, int i) throws EmptyName, InvalidIDNum
   {
      name = n;
      idNumber = i;
      
      if(name == null)              // test for empty name
          throw new EmptyName();
      if(idNumber < 0)              // test for negative ID
          throw new InvalidIDNum(); 
   }

   /**
    * setName method
     * @param n
     * @throws EmptyName
    */

   public void setName(String n) throws EmptyName
   {
      name = n;
      if(name == null)  // test for empty name
      {
          throw new EmptyName();
      }
   }

   /**
    * setIdNumber method
     * @param i
     * @throws InvalidIDNum
    */

   public void setIdNumber(int i) throws InvalidIDNum
   {
      idNumber = i;
      if(idNumber < 0)          // test for negative ID
          throw new InvalidIDNum();
   }

   /**
    * setPayRate method
     * @param p
     * @throws InvalidHourlyPayRate
    */

   public void setPayRate(double p) throws InvalidHourlyPayRate
   {
      payRate = p;
      if(payRate < 0)       //test for negative pay rate
          throw new InvalidHourlyPayRate("rate is negative");
      if(payRate > 25)      // test for too high pay rate
          throw new InvalidHourlyPayRate("rate is too high");  
   }

   /**
    * setHoursWorked method
     * @param h
     * @throws InvalidNumHoursWorked
    */

   public void setHoursWorked(double h) throws InvalidNumHoursWorked
   {
      hoursWorked = h;
      if(hoursWorked < 0)       // test for negative hours
          throw new InvalidNumHoursWorked("hours are negative.");
      if(hoursWorked > 84)      // test for too high hours
          throw new InvalidNumHoursWorked("hours are too high."); 
   }

   /**
    * getName method
     * @return 
    */

   public String getName()
   {
      return name;
   }

   /**
    * getIdNumber method
     * @return 
    */

   public int getIdNumber()
   {
      return idNumber;
   }

   /**
    * getPayRate method
     * @return 
    */

   public double getPayRate()
   {
      return payRate;
   }

   /**
    * getHoursWorked method
     * @return 
    */

   public double getHoursWorked()
   {
      return hoursWorked;
   }

   /**
    * getGrossPay method
     * @return 
    */

   public double getGrossPay()
   {
      return hoursWorked * payRate;
   }
}
