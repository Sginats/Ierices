package Darbs;

/*/
 *1.Izstrādāt objektorientētu programmu, kura tās galvenajā klasē ar JOptionPane
 *  dialoglogiem nodrošina izvēles izdarīšanas funkcionalitāti veicamajām darbībām.Tiek nodrošināta ievaddatu validācija (3p)
 *2.Programmas galvenajā klasē ir iespējams izveidot jaunus klašu objektus (uzglabāt kādā no datu struktūrām),
 *   apskatīt jau izveidotos objektus, dzēst objektus, izsaukt raksturojošās metodes (5p)
 *3. Atbilstoši programmas klasēm, definēti vairāki to raksturojoši atribūti un metodes (3p)
 *4. Programma demonstrē iekapsulēšanas un Java Bean klases pamatprincipus (3p)
 *5. Programmā jēgpilni nodrošināta Virsklases un Apakšklaes struktūra (4p)
 *6. Visa projekta izstrādes procesa gaita ir jēgpilni versionēta ar Git, projekts izvietots GitHub,
 *kur tas papildināts ar aprakstošu README failu (3p)
 *7. Veikta izstrādātā projekta demonstrēšana, orientējas projektā un spēj atbildēt uz uzdotajiem jautājumiem (4p)
 *8. Izstrāde pabeigta noteiktajā termiņā, programma ir funkcionāli pilnīga (2p)
 */
public class Telefons {
	//Atribūti
	private String modelis;
	
	private String krasa;
	private double ekranaIzmers;
	private int atmina;
	private double cString, cena;
	//Konstruktors
	public Telefons(String modelis, double ekranaIzmers, int atmina, double cena, String krasa) {
		this.modelis = modelis;
		this.ekranaIzmers = ekranaIzmers;
		this.atmina = atmina;
		this.cena = cena;
		this.krasa = krasa;
	}
	//Metodes
	public String getModelis() {
		return modelis;
	}

	public void setModelis(String modelis) {
		this.modelis = modelis;
	}

	public double getEkranaIzmers() {
		return ekranaIzmers;
	}

	public void setEkranaIzmers(double ekranaIzmers) {
		this.ekranaIzmers = ekranaIzmers;
	}

	public int getAtmina() {
		return atmina;
	}

	public void setAtmina(int atmina) {
		this.atmina = atmina;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	public String getKrasa() {
		return krasa;
	}
	public String setKrasa() {
		return krasa;
	}
	public String izvadit() {
		return "Telefona modelis: "+modelis+
				"\nEkrāna izmērs: "+ekranaIzmers+" collas"+
				"\nAtmiņa: "+atmina+" GB"+
				"\nCena: "+cena+" EUR"+
				"\nKrāsa: "+krasa;
	}
}