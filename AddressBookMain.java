package com.bridgelabz.assignmentsrfp259.day09.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program: ");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int flag = 1;

        while (flag == 1) {
            System.out.println("Select a choice : \n1. Add \n2. Edit  \n3. Delete \n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    if (addressBook.contactsArrayList.isEmpty()) {
                        System.out.println(" Address book is empty ");
                        break;
                    }
                    addressBook.editContact();
                    break;
                case 3:
                    if (addressBook.contactsArrayList.isEmpty()) {
                        System.out.println(" Address book is empty ");
                        break;
                    }
                    addressBook.deleteContact();
                case 4:
                    flag = 0;
                    break;

                default:
                    System.out.println(" Enter a valid choice");
                    break;
            }
        }
        System.out.println(addressBook.contactsArrayList);
    }
}
