package com.peterkoncz;
/**
 * This is the solution based on the description !
 */
public class Contact {
    private String name;
    private String phoneNumber;

   public Contact (String name, String phoneNumber){
       this.name = name;
       this.phoneNumber = phoneNumber;
   }

   public String getName(){
       return this.name;
   }

   public String getPhoneNumber(){
       return this.phoneNumber;
   }

   public static Contact createContact(String name, String number){
       return new Contact(name,number);
   }

}
