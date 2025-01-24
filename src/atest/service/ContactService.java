package atest.service;

import atest.model.Contact;
import atest.uitilities.FileExecutor;
import atest.view.ContactView;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactService {
    private List<Contact> contacts;

    public ContactService() {
        contacts = new ArrayList<>();
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void saveContactsToFile() {
        FileExecutor.writeContactsToFile(contacts);
    }
}
