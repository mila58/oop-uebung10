package ueb10.formen;

public class Quader extends Volumen {

	double a;
	double b;
	double h;

	public Quader(double a, double b, double h) {
		super(h);
		this.a = a;
		this.b = b;
	}

	@Override
	double grundflaeche() {
		return a*b;
	}
}
