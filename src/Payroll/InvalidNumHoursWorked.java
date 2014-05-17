package Payroll;

/*
 * To change this license header, choose License Headers in 
 * Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Exception for negative or too high worker hours worked field
 * @author RPM
 */
public class InvalidNumHoursWorked extends Exception
{
    public InvalidNumHoursWorked(String str)
   {
      super("Invalid number of hours worked, " + str);
   }
    
}
