package Payroll;

/*
 * To change this license header, choose License Headers in 
 * Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Exception for negative worker ID number field
 * @author RPM
 */
public class InvalidIDNum extends Exception
{

    /**
     *
     */
    public InvalidIDNum()
   {
      super("Invalid negative ID number.");
   }
    
}
