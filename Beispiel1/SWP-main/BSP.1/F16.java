public class F16 extends Flugzeug {

	private boolean raketen;
	private String bombenart;
	private int geschwindigkeitRaketen;

	public F16(String turbine, String farbe, int gewicht, int platz, int geschwindigkeit, int größe, int id,
			   Motor motor, Passagiere passagiere, Landebahn landebahn, boolean raketen, String bombenart,
			   int geschwindigkeitRaketen) {
		super(turbine, farbe, gewicht, platz, geschwindigkeit, größe, id, motor, passagiere, landebahn);
		this.raketen = raketen;
		this.bombenart = bombenart;
		this.geschwindigkeitRaketen = geschwindigkeitRaketen;
	}

	public boolean hasRaketen() {
		return raketen;
	}

	public String getBombenart() {
		return bombenart;
	}

	public int getGeschwindigkeitRaketen() {
		return geschwindigkeitRaketen;
	}

	public void angriff() {
		// Implementiere die Logik für einen Angriff
	}

	public void verteidigen() {
		// Implementiere die Logik für die Verteidigung
	}

	public void neutral() {
		// Implementiere die Logik für den Neutralzustand
	}
}
