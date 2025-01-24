package atest.main;

import atest.controller.ContactController;
import atest.model.Contact;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactController controller = new ContactController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("----- CONTACTS -----");
                System.out.println("Enter number to choose:");
                System.out.println("1. Display all contacts");
                System.out.println("2. Add a new contact");
                System.out.println("3. Update an existing contact");
                System.out.println("4. Delete an existing contact");
                System.out.println("5. Find an existing contact");
                System.out.println("6. Read from files");
                System.out.println("7. Write to files");
                System.out.println("8. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        controller.displayContacts();
                        break;
                    case 2:
                        System.out.print("Enter phone number ");
                        String phone = scanner.nextLine();
                        System.out.print("Enter group ");
                        String group = scanner.nextLine();
                        System.out.print("Enter name:");
                        String name = scanner.nextLine();
                        System.out.print("Enter gender: ");
                        String gender = scanner.nextLine();
                        System.out.print("Enter address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter birthday: ");
                        String birthDate = scanner.nextLine();
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();

                        Contact contact = new Contact(phone, group, name, gender, address, birthDate, email);
                        controller.addContact(contact);
                        break;
                    case 3:
                        System.out.print("Enter phone number to update: ");
                        String phoneUpdate = scanner.nextLine().trim();
                        List<Contact> contacts = controller.searchContacts(phoneUpdate);
                        if (contacts.isEmpty()) {
                            System.out.println("No contacts with phone number" + phoneUpdate);
                        } else {
                            Contact contactToUpdate = contacts.get(0);
                            System.out.println("Contact information: " + contactToUpdate);

                            System.out.print("New group: ");
                            String newGroup = scanner.nextLine();
                            System.out.print("New name: ");
                            String newName = scanner.nextLine();
                            System.out.print("New gender: ");
                            String newGender = scanner.nextLine();
                            System.out.print("New address: ");
                            String newAddress = scanner.nextLine();
                            System.out.print("New birthday: ");
                            String newBirthDate = scanner.nextLine();
                            System.out.print("New email: ");
                            String newEmail = scanner.nextLine();

                            Contact updatedContact = new Contact(phoneUpdate, newGroup, newName, newGender, newAddress, newBirthDate, newEmail);
                            controller.updateContact(phoneUpdate, updatedContact);
                        }
                        break;
                    case 4:
                        System.out.print("Enter phone number to delete: ");
                        String phoneDelete = scanner.nextLine();
                        controller.deleteContact(phoneDelete);
                        break;
                    case 5:
                        System.out.print("Enter search information: ");
                        String searchTerm = scanner.nextLine();
                        List<Contact> searchResults = controller.searchContacts(searchTerm);
                        if (searchResults.isEmpty()) {
                            System.out.println("Not found");
                        } else {
                            controller.displayContacts(searchResults);
                        }
                        break;
                    case 6:
                        controller.readContactsFromFile();
                        break;
                    case 7:
                        controller.saveContactsToFile();
                        break;
                    case 8:
                        System.out.println("Exit program");
                        return;
                    default:
                        System.out.println("Choose an option");
                }
            } catch (Exception e) {
                System.out.println("Errors occurred " + e.getMessage());
            }
        }
    }
}
