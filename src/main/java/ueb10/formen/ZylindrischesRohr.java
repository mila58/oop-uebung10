package ueb10.formen;

public class ZylindrischesRohr extends Volumen{
	double r1; //äußerer Kreis
	double r2; //innerer Kreis

	public ZylindrischesRohr(double r1, double r2, double h) {
	super(h);
	}

	@Override
	double grundflaeche() {
		double außererKreis = r1*r1*Math.PI;
		double innererKreis = r2*r2*Math.PI;
		return außererKreis-innererKreis;
	}
}
