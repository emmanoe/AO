package fr.ubordeaux.ao;

public class Transaction {
    private java.util.Date date;
    private String title;
    private int amount;

    public Transaction(String title, int amount) {
        //Affecter la date à aujourd'hui
        this.title = title;
        this.date = new java.util.Date();
        if (amount == 0) throw new IllegalArgumentException("Amount transaction must be greater than 0$" );
        else
        	this.amount = amount;
    }

    public java.util.Date getDate() {
        return new java.util.Date(this.date.getTime());
    }

    public String getTitle() {
        return new String(this.title);
    } 

    public int getAmount() {
        return this.amount;
    }
}