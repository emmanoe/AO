package fr.ubordeaux.ao;
import java.util.HashSet;
import java.util.Set;

public class SearchContact {
	
	private ContactSet contacts;
	private Set<Contact> contactCol;

	public SearchContact(ContactSet contacts) {
		this.contacts = contacts;
		this.contactCol = this.contacts.getContact(0, this.contacts.size());
	}

	public Set<Contact> search(String fname, String lname){
		System.out.println("Searching for the contact: "+ fname + " " + lname + "..." );
		Set<Contact> myResult = new HashSet<Contact>(); 
		Contact myContact = new Contact(fname, lname, null);
		for (Contact c : contactCol) {
			if (c.equals(myContact)){ 
				System.out.println(c.getFirstName());
				myResult.add(c);
			}
		}
		return myResult;
	}
}
