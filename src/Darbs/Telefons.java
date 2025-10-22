package Darbs;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

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
	private boolean ringtons;
	//Konstruktors
	public Telefons(String modelis, double ekranaIzmers, int atmina, double cena, String krasa, boolean ringtons) {
		this.modelis = modelis;
		this.ekranaIzmers = ekranaIzmers;
		this.atmina = atmina;
		this.cena = cena;
		this.krasa = krasa;
		this.ringtons = ringtons;
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
	public boolean getRingtons() {
		return ringtons;
	}
	public void setRingtons(boolean ringtons) {
		this.ringtons = ringtons;
	}
    public void ring() throws MalformedURLException, 
	UnsupportedAudioFileException, IOException, 
	LineUnavailableException{
		if(ringtons) {
			File f = new File(".//zvans//"+"zvans.wav");
			AudioInputStream ais = AudioSystem.getAudioInputStream(f.toURI().toURL());
			Clip c = AudioSystem.getClip();
			c.open(ais);
			c.start();
		}else {
			JOptionPane.showMessageDialog(null, "Nav uzstādīts ringtons!", 
					"Paziņojums", JOptionPane.ERROR_MESSAGE);
		}
	}
	public String izvadit() {
		return "Modelis: "+getModelis()+
				"\nEkrāna izmērs: "+getEkranaIzmers()+" collas"+
				"\nAtmiņa: "+getAtmina()+" GB"+
				"\nCena: "+getCena()+" EUR"+
				"\nKrāsa: "+getKrasa()+
				"\nRingtons: "+((ringtons)? "Ir": "Nav");
		}
}