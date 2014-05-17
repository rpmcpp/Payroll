package Payroll;

/*
 * To change this license header, choose License Headers in
 * Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Exception for negative or too high worker pay rate field
 * @author RPM
 */
public class InvalidHourlyPayRate extends Exception
{
    public InvalidHourlyPayRate(String str)
   {
      super("Invalid hourly pay rate, " + str);
   }
    
}
