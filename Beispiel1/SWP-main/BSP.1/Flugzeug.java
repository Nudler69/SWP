import java.util.ArrayList;

public class Flugzeug {

	private String turbine;
	private String farbe;
	private int gewicht;
	private int platz;
	private int hoechstgeschwindigkeit;
	private int laenge;
	private int id;

	private ArrayList<Motor> motorListe = new ArrayList<>();
	private ArrayList<Passagiere> passagiereListe = new ArrayList<>();
	private ArrayList<Landebahn> landebahnListe = new ArrayList<>();

	public Flugzeug(String turbine, String farbe, int gewicht, int platz, int hoechstgeschwindigkeit, int laenge, int id, Motor motor, Passagiere passagiere, Landebahn landebahn) {
		this.turbine = turbine;
		this.farbe = farbe;
		this.gewicht = gewicht;
		this.platz = platz;
		this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
		this.laenge = laenge;
		this.id = id;
		this.motorListe.add(motor);
		this.passagiereListe.add(passagiere);
		this.landebahnListe.add(landebahn);
	}

	// Getter und Setter für die Felder (implementieren)

	// Getter-Methoden für motorListe, passagiereListe und landebahnListe hinzufügen

	public void setMotorListe(Motor motor) {
		this.motorListe.add(motor);
	}

	public void setPassagierListe(Passagiere passagiere) {
		this.passagiereListe.add(passagiere);
	}

	public void setLandebahnListe(Landebahn landebahn) {
		this.landebahnListe.add(landebahn);
	}

	public int getPS() {
		int ps = 0;
		/* for(Motor m: motorListe){

		}
		 */

		for(int i=0; i < motorListe.size(); i++){
			ps += motorListe.get(i).getPs();
		}

		return ps;
	}

	public void fliegen() {
		// Implementiere die Logik für das Fliegen eines Flugzeugs
	}

	public void start() {
		// Implementiere die Logik für den Start eines Flugzeugs
	}

	public void landen() {
		// Implementiere die Logik für die Landung eines Flugzeugs
	}
}
