package fr.ubordeaux.ao;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Account {
    private int balance;
    private String id;
    private String name;
    private Set<Transaction> transactions;

    public Account(String id, String name) {
        this.balance = 0;
        transactions = new HashSet<Transaction>();
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        //TODO_3
        this.balance += transaction.getAmount();
    }
    
    public void delTransaction(java.util.Date date, String title, int montant) {
    	for (Transaction t : this.transactions) {
    		if ( t.getDate().compareTo(date) == 0 && t.getTitle().compareTo(title) == 0 && t.getAmount() == montant) {
    			transactions.remove(t);
    		}
    	}
    }
    
    public Set<Transaction> getTransactionSince(java.util.Date date) {
        //TODO_1
    	Set<Transaction> valueSet = new HashSet<Transaction>();
    	for (Transaction t : this.transactions) {
    		if (t.getDate().compareTo(date) >= 0 ) {
    			valueSet.add(t);
    		}
    	}
    	return valueSet;
    }


    @Override
    public boolean equals(Object other) {
        if (other instanceof Account) {
            Account otherAccount = (Account) other;
            return this.id.compareTo(otherAccount.id) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    @Override
    public String toString() {
        return "Account "+this.name+" (id="+this.id+"), balance = "+this.balance;
    }
    
}
// Notion avancées : 
//	.On construit l'objet au moment ou on l'ajoute. (peut perdre des informations comme l'heure exacte de la transaction)
//  .