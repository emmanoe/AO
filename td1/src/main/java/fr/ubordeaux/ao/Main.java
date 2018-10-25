package fr.ubordeaux.ao;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {
    private static  final int MAX = 3000;
    public static void main(String[] args) {
        ContactSet contactSet = new ContactSet();
        Town talence = new Town("Talence", 33405);
        Address address = new Address(351, "Cours de la libération", talence);

        for (int i = 0 ; i < MAX ; i++) {
            Contact newContact = new Contact("John", "Do", address);
            contactSet.addContact(newContact);
        }
        System.out.println(MAX+" contacts created !");

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un le nom de famille:");
        String fname = sc.nextLine();
        System.out.println("Veuillez entrer un le prénom:");
        String lname = sc.nextLine();

        SearchContact myResult = new SearchContact(contactSet);
        Set<Contact> found = myResult.search(fname, lname);
        System.out.println("Contact found wich match the most for : "+ fname + " " + lname + ":");
        for (Contact c: found){
            System.out.println(c.getFirstName() + " " + c.getSecondName() + " " + c.getAddress());
        }
        System.out.println("Bye");


        try {
            Thread.sleep(200000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
}