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
public class Iphone extends Telefons {

	/**
	 * Ģenerēts serialVersionUID
	 */
	private static final long serialVersionUID = 4611242580945134427L;
	//Konstruktors
	private boolean faceID, bezvaduLade;
	
	public Iphone(boolean faceID, boolean bezvaduLade,
			String modelis, double ekranaIzmers, int atmina, double cena, String krasa, boolean ringtons) {
		super(modelis, ekranaIzmers, atmina, cena, krasa, ringtons);
		this.faceID = faceID;
		this.bezvaduLade = bezvaduLade;
	}
	public void setFaceID(boolean faceID) {
		this.faceID = faceID;
	}
	public boolean getFaceID() {
		return faceID;
	}
	public void setBezvaduLade(boolean bezvaduLade) {
		this.bezvaduLade = bezvaduLade;
	}
	public boolean getBezvaduLade() {
		return bezvaduLade;
	}
	
	
}
