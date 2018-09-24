package fr.ubordeaux.ao;

public abstract class Shape {
	private int x;
	private int y;
	private Element XMLelement;
	
	abstract double area();
	abstract double perimeter();
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
		this.XMLelement = new Element("Forme");
	}
}