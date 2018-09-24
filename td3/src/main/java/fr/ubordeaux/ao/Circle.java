package fr.ubordeaux.ao;

public class Circle extends Shape{
    double radius;


public Circle(double radius, int centerX, int centerY) {
	super(centerX,centerY);
	this.radius = radius;
	this.XMLelement.setname("Circle");
	
}

@Override
public double area() {
	return 3.14 * Math.pow(radius, 2);
}


@Override
public double perimeter() {
	return 2 * 3.14 * radius;
}

}