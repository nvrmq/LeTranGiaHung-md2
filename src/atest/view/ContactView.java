package atest.view;

import atest.model.Contact;

import java.util.List;
import java.util.Scanner;

public class ContactView {
    private final Scanner scanner = new Scanner(System.in);
    public String getInput(String prompt) {
        System.out.print(prompt);
        String input;
        while((input = scanner.nextLine()).isEmpty()){
            System.out.print("Data cannot be empty, try again" + prompt);
        }
        return input;
    }
    public void printMessage(String message) {
        System.out.println(message);
    }
    public void displayContacts(List<Contact> contacts) {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
