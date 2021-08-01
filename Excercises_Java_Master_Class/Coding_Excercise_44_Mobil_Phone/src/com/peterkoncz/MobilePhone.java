package com.peterkoncz;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the solution based on the description !
 */
public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) < 0){
            return myContacts.add(contact);
        }
        System.out.println("Contact is already present!");
        return false;
    }

    public boolean updateContact(Contact oldC, Contact newC){
       if (findContact(oldC.getName()) >= 0){
           myContacts.remove(oldC);
           return myContacts.add(newC);
       }
        return false;
    }

    public boolean removeContact(Contact contact){
     if (findContact(contact) >= 0){
         return myContacts.remove(contact);
     }
        return false;
    }

    private int findContact(Contact contact){
        if (contact != null){
                if (myContacts.contains(contact)){
                    return myContacts.indexOf(contact);
                }
            }
        return -1;
    }

    private int findContact(String contactName){
        for (Contact c : myContacts){
            if (c.getName().equals(contactName)){
                return myContacts.indexOf(c);
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName){
        for (Contact c : myContacts){
            if (c.getName().equals(contactName)){
                return c;
            }
        }

        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
       for (int i = 0; i < myContacts.size();i++){
           System.out.println((i+1) + ". " +  myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
       }
    }



}
