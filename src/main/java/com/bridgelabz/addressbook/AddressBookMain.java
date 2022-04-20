package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        ContactPerson contactPerson = new ContactPerson();

        ArrayList<ContactPerson> record = new ArrayList<>();
        String name = "";
        int index = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int status = 1;
        while (flag) {
            System.out.print("1 - Add more contact \n2 - Edit Contact \n3 - Delete person Contact \n4 - Show AddressBook " +
                    "\n0 -  for exit \nEnter your Choice.....");
            status = sc.nextInt();
            switch (status) {
                case 1:
                    record.add(contactPerson.getInput());//adding the new contact in address book

                    break;
                case 2:
                    System.out.println("Enter first name that you want to edit record");
                    name = sc.next();
                    contactPerson.updatedata(name, record);//Update the record using name
                    break;
                case 3:
                    System.out.println("Enter first name that you want to Delete record");
                    name = sc.next();
                    contactPerson.deleteRecord(name, record);//Delete contact using name
                    break;
                case 4:
                    System.out.println("Side of record : " + record.size());
                    contactPerson.addressBook(record);// print all contact from the address book
                    break;
                case 0:
                    flag = false;//exit from loop
                    break;
            }
        }
    }
}
