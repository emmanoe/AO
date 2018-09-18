package fr.ubordeaux.ao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter the transaction title: ");
		String title = reader.next(); // Scans the next token of the input as an int.
		System.out.println("Enter the transaction Amount: ");
		int amount = reader.nextInt();
		//once finished
		reader.close();
		
		System.out.println("New transaction details :");
		System.out.println("Title: " +title);
		System.out.println("Amount: " +amount);
	}
}
