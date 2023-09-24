public class Passagiere {

	private int alter;
	private String name;
	private int id;
	private int gewicht;
	private String herkunft;
	private String sprache;

	public Passagiere(int alter, String name, int id, int gewicht, String herkunft, String sprache) {
		this.alter = alter;
		this.name = name;
		this.id = id;
		this.gewicht = gewicht;
		this.herkunft = herkunft;
		this.sprache = sprache;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public String getHerkunft() {
		return herkunft;
	}

	public void setHerkunft(String herkunft) {
		this.herkunft = herkunft;
	}

	public String getSprache() {
		return sprache;
	}

	public void setSprache(String sprache) {
		this.sprache = sprache;
	}

	public void sitzen() {
		// TODO - implement Passagiere.sitzen
		throw new UnsupportedOperationException();
	}

	public void einsteigen() {
		// TODO - implement Passagiere.einsteigen
		throw new UnsupportedOperationException();
	}

	public void aussteigen() {
		// TODO - implement Passagiere.aussteigen
		throw new UnsupportedOperationException();
	}

}