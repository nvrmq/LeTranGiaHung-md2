package atest.controller;

import atest.model.Contact;
import atest.service.ContactService;
import atest.uitilities.FileExecutor;
import atest.view.ContactView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactController {
    private ContactService contactService;
    private ContactView contactView;

    public ContactController() {
        this.contactService = new ContactService();
        this.contactView = new ContactView();
    }

    public void displayContacts() {
        List<Contact> contacts = FileExecutor.readContactsFromFile();

        if (contacts.isEmpty()) {
            contactView.printMessage("No contacts found");
        } else {
            contactView.displayContacts(contacts);
        }
    }

    public void addContact(Contact contact) {
        List<Contact> contacts = FileExecutor.readContactsFromFile();
        contacts.add(contact);
        FileExecutor.writeContactsToFile(contacts);
        contactView.printMessage("Contact added successfully!");
    }

    public void updateContact(String phoneNumber, Contact updatedContact) {
        List<Contact> contacts = FileExecutor.readContactsFromFile();
        boolean contactFound = false;

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                contacts.set(i, updatedContact);
                contactFound = true;
                break;
            }
        }

        if (contactFound) {
            FileExecutor.writeContactsToFile(contacts);
            System.out.println("Updated contact successfully!");
        } else {
            System.out.println("No contacts found with" + phoneNumber);
        }
    }

    public void deleteContact(String phoneNumber) {
        List<Contact> contacts = FileExecutor.readContactsFromFile();
        boolean contactFound = false;

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
                contacts.remove(i);
                contactFound = true;
                break;
            }
        }

        if (contactFound) {
            FileExecutor.writeContactsToFile(contacts);
            System.out.println("Deleted contact successfully!");
        } else {
            System.out.println("No contact found with: " + phoneNumber);
        }
    }

    public List<Contact> searchContacts(String searchTerm) {
        List<Contact> contacts = FileExecutor.readContactsFromFile();
        List<Contact> result = new ArrayList<>();
        searchTerm = searchTerm.trim().toLowerCase();

        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().toLowerCase().contains(searchTerm) ||
                    contact.getFullname().toLowerCase().contains(searchTerm)) {
                result.add(contact);
            }
        }
        return result;
    }


    public void readContactsFromFile() {
        System.out.print("Are you sure you want to read contacts from file?(Y/N) ");
        Scanner scanner = new Scanner(System.in);
        String confirm = scanner.nextLine().trim().toUpperCase();

        if (confirm.equals("Y")) {
            List<Contact> contacts = FileExecutor.readContactsFromFile();
            contactService.setContacts(contacts);
            contactView.printMessage("Contact read successfully!");
        } else {
            contactView.printMessage("Cancelled");
        }
    }


    public void saveContactsToFile() {
        System.out.print("Are you sure to write contacts to file?(Y/N) ");
        Scanner scanner = new Scanner(System.in);
        String confirm = scanner.nextLine().trim().toUpperCase();

        if (confirm.equals("Y")) {
            List<Contact> contacts = contactService.getAllContacts();
            FileExecutor.writeContactsToFile(contacts);
            contactView.printMessage("Successfully saved contacts to file!");
        } else {
            contactView.printMessage("Cancelled");
        }
    }


    public void displayContacts(List<Contact> contacts) {
        if (contacts.isEmpty()) {
            contactView.printMessage("No contacts found");
        } else {
            contactView.displayContacts(contacts);
        }
    }
}
