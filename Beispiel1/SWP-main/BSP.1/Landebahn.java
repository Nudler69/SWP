public class Landebahn {

	private int länge;
	private int breite;
	private String name;
	private String standort;
	private int id;
	private String farbe;


	public Landebahn(int länge, int breite, String name, String standort, String betrieb, int id, String farbe) {
		this.länge = länge;
		this.breite = breite;
		this.name = name;
		this.standort = standort;
		this.id = id;
		this.farbe = farbe;
	}

	public int getLänge() {
		return länge;
	}

	public void setLänge(int länge) {
		this.länge = länge;
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandort() {
		return standort;
	}

	public void setStandort(String standort) {
		this.standort = standort;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}


	public void beleuchtung() {
		// TODO - implement Landebahn.beleuchtung
		throw new UnsupportedOperationException();
	}

	public void anflug() {
		// TODO - implement Landebahn.anflug
		throw new UnsupportedOperationException();
	}

	public void abflug() {
		// TODO - implement Landebahn.abflug
		throw new UnsupportedOperationException();
	}

}