package ueb10.formen;

public class Zylinder extends Volumen {

	double r;
	double b;

	public Zylinder(double r, double b) {
	super(b);
	this.r = r;
	}

	@Override
	double grundflaeche() {
		return r*r*Math.PI;
	}
}
