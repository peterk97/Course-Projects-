package com.peterkoncz;

public class Main {

    public static void main(String[] args) {
	// write your code here
      MobilePhone mobilePhone = new MobilePhone("Peter Phone");

      Contact marci = new Contact("Marci","8362");
      mobilePhone.addNewContact(marci);
      Contact mark = new Contact("Mark","3245");
      mobilePhone.addNewContact(mark);
      Contact steph = new Contact("Steph","82632647");
      mobilePhone.addNewContact(steph);
      Contact steve = new Contact("Steve","23345436");
      mobilePhone.addNewContact(steve);

      Contact steve1 = new Contact("Steve", "234234");
      mobilePhone.addNewContact(steve1);

      mobilePhone.printContacts();

      mobilePhone.removeContact(marci);

      mobilePhone.printContacts();

      mobilePhone.updateContact(mark,new Contact("Marko", "232453245"));

      mobilePhone.printContacts();

    }
}
