package ueb10.formen;

public class DreiecksPrisma extends Volumen {

	double a;
	double b;
	double c;

	public DreiecksPrisma(double a, double b, double c, double h) {
	super(5);
	this.a = a;
	this.b = b;
	this.c = c;
	}


	@Override
	double grundflaeche() {
		double s = (a+b+c)/2;
		 return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
