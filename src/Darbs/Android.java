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
public class Android extends Telefons {
	//Konstruktors
	private boolean googleKonts, NFC, FingerID;
	public Android(boolean googleKonts, boolean NFC, boolean FingerID,
			String modelis, double ekranaIzmers, int atmina, double cena, String krasa, boolean ringtons) {
		super(modelis, ekranaIzmers, atmina, cena, krasa, ringtons);
		this.googleKonts = googleKonts;
		this.NFC = NFC;
		this.FingerID = FingerID;
	}
	public void setNFC(boolean NFC) {
		this.NFC = NFC;
	}
	public boolean getNFC() {
		return NFC;
	}
	public void setFingerID(boolean FingerID) {
		this.FingerID = FingerID;
	}
	public boolean getFingerID() {
		return FingerID;
	}
	public void setGoogleKonts(boolean googleKonts) {
		this.googleKonts = googleKonts;
	}
	public boolean getGoogleKonts() {
		return googleKonts;
	}
	public static String andrIzvadit( ) {
		return "googleKonts: "+", NFC: "+", FingerID: ";
	}
}
