import java.util.ArrayList;

public class Hanger {

	private int id;
	private String standort;
	private String farbe;
	private int platz;
	private int länge;
	private int breite;
	private int höhe;

	private ArrayList<Flugzeug> flugzeugListe = new ArrayList<>();

	public Hanger(int id, String standort, String farbe, int platz, int länge, int breite, int höhe, Flugzeug flugzeug) {
		this.id = id;
		this.standort = standort;
		this.farbe = farbe;
		this.platz = platz;
		this.länge = länge;
		this.breite = breite;
		this.höhe = höhe;
		this.flugzeugListe.add(flugzeug);
	}

	// Getter und Setter für die Felder (implementieren)

	public void setFlugzeugListe(Flugzeug flugzeug) {
		this.flugzeugListe.add(flugzeug);
	}

	public void voll() {
		// Implementiere die Logik, wenn der Hangar voll ist
	}

	public void leer() {
		// Implementiere die Logik, wenn der Hangar leer ist
	}

	public void plaetzeFrei() {
		// Implementiere die Logik, um verfügbare Plätze im Hangar zu überprüfen
	}
}
