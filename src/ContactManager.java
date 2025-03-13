import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;
    private int nextId;

    public ContactManager() {
        this.contacts = new ArrayList<>();
        this.nextId = 1;
    }

    public void addContact(String name, String phone) {
        contacts.add(new Contact(nextId++, name, phone));
    }

    public void removeContact(int id) {
        contacts.removeIf(contact -> contact.getId() == id);
    }

    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}
