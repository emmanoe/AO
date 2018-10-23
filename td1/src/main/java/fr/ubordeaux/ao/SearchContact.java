package fr.ubordeaux.ao;
import java.util.HashSet;
import java.util.Set;

public class SearchContact {
	
	private ContactSet contacts;
	private Set<Contact> contactCol;

	public Set<Contact> search(String fname, String lname){
		Set<Contact> myResult = new HashSet<Contact>(); 
		Contact myContact = new Contact(fname, lname, null);
		for (Contact c : contactCol) {
			if (c.equals(myContact)) 
				myResult.add(c);
		}
		return myResult;
	}
	
	
	
	public SearchContact(ContactSet contacts) {
		this.contacts = contacts;
		this.contactCol = this.contacts.getContact(0, this.contacts.size());
	}
}
