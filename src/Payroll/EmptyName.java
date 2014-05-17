package Payroll;

/*
 * To change this license header, choose License Headers in 
 * Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Exception for empty worker name field
 * @author RPM
 */
public class EmptyName extends Exception
{
    public EmptyName()
   {
      super("Name field empty.");
   }
    
}
