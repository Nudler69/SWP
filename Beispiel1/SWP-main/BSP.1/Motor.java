public class Motor {

	private String name;
	private int gewicht;
	private int typ;
	private int ps;
	private int kubik;
	private String farbe;


	public Motor(String name, int gewicht, int kubik, String farbe, int typ, int ps) {
		this.name = name;
		this.gewicht = gewicht;
		this.kubik = kubik;
		this.farbe = farbe;
		this.typ = typ;
		this.ps = ps;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public int getTyp() {
		return typ;
	}

	public void setTyp(int typ) {
		this.typ = typ;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public int getKubik() {
		return kubik;
	}

	public void setKubik(int kubik) {
		this.kubik = kubik;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
}