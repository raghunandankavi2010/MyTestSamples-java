/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Raghunandan
 */
public class NameValidation
{
   public static void main( String[] args )
   {
       System.out.println(validateFirstName("Tom"));
       System.out.println(validateLastName("Tom- Tom"));
   }
   // validate first name
   public static boolean validateFirstName( String firstName )
   {
      return firstName.matches( "[A-Z][a-zA-Z]*" );
   } // end method validateFirstName

   // validate last name
   public static boolean validateLastName( String lastName )
   {
      return lastName.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
   } // end method validateLastName
   
}
