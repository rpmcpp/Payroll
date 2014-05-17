package Payroll;



/**
 * PayrollDemo program
 */

public class PayrollDemoStartUp
{
   public static void main(String[] args) throws EmptyName, InvalidIDNum
   {
      Payroll worker;      // Reference variable
      
      // Create a Payroll object with an empty string for the name.
      try 
      {
           worker = new Payroll(null, 123);
      } 
      catch (EmptyName ex) 
      {
           System.out.println(ex.getMessage());
      } 
      catch (InvalidIDNum ex) 
      {
           System.out.println(ex.getMessage());
      }
       
      // Create a Payroll object with an invalid ID number.
      try 
      {
           worker = new Payroll("John Doe", -123);
      } 
      catch (EmptyName ex) 
      { 
           System.out.println(ex.getMessage());
      } 
      catch (InvalidIDNum ex) 
      {
           System.out.println(ex.getMessage());
      }
      
      // create valid worker
      worker = new Payroll("John Doe", 123);    
      // Try to set an invalid hourly pay rate.
      try 
      {
           worker.setPayRate(30.00);
      } 
      catch (InvalidHourlyPayRate ex) 
      {
           System.out.println(ex.getMessage());
      }
      
      
      // Try to set an invalid number of hours worked.
      try 
      {
           worker.setHoursWorked(90.00);
      } 
      catch (InvalidNumHoursWorked ex) 
      {
           System.out.println(ex.getMessage());
      }
	  
	  
	  
	  
	  
  }
}
