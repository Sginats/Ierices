package Darbs;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
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
public class Ierice {
   public static void main(String[] args){
       String izvele;
       int izvelesID;
       String [] darbibas = {"Izveidot telefonu",
       "Apskatīt telefonus","Dzēst telefonu","Izsaukt metodes"};
        String[] veidi = {"Android", "Iphone"};
		String[] atbilde = {"Jā", "Nē"};
        ArrayList<Object> telefoni = new ArrayList<>();

        izvele = (String)JOptionPane.showInputDialog(null, 
                            "Darbību Izvēle", "Izvēle", JOptionPane.QUESTION_MESSAGE,
                            null, darbibas, darbibas[0]);
        izvelesID = Arrays.asList(darbibas).indexOf(izvele);

        switch(izvelesID){
            case 0: 
                String modelis = (String) JOptionPane.showInputDialog(null, "Izvēlies modeli",
						"Izvēlne", JOptionPane.QUESTION_MESSAGE, null
						,veidi, veidi[0]);

                if (modelis == null)break;
                izvelesID = Arrays.asList(veidi).indexOf(izvele);
				
	            double ekranaIzmers = Metodes.skaitlaParbaude("Kāds būs ekrāna izmērs?", 4.3, 10.2, "6.9");
                double atmina = Metodes.skaitlaParbaude("Cik liela būs telefonam atmiņa?", 32, 1024, "128");
	            double cena = Metodes.skaitlaParbaude("Cik maksās", 10, 10000, "630");
                String krasa = Metodes.virknesParbaude("Kādā krāsā", "balts");
                izvele = (String)JOptionPane.showInputDialog(null, "Vai būs google konts", "Izveide",
                        JOptionPane.INFORMATION_MESSAGE, null, atbilde, atbilde[0]);
                boolean ring;
                if(izvele == "Jā")
                    ring = true;
                else 
                    ring = false;
                switch(izvelesID){
                    case 0:
                        izvele = (String)JOptionPane.showInputDialog(null, "Vai būs google konts", "Izveide",
                        JOptionPane.INFORMATION_MESSAGE, null, atbilde, atbilde[0]);
                        boolean googleK;
                        if(izvele == "Jā")
                            googleK = true;
                        else 
                            googleK = false;

                        izvele = (String)JOptionPane.showInputDialog(null, "Vai būs NFC", "Izveide",
                        JOptionPane.INFORMATION_MESSAGE, null, atbilde, atbilde[0]);
                        boolean NFC;
                        if(izvele == "Jā")
                            NFC = true;
                        else 
                            NFC = false;
                            izvele = (String)JOptionPane.showInputDialog(null, "Vai būs fingerID", "Izveide",
                        JOptionPane.INFORMATION_MESSAGE, null, atbilde, atbilde[0]);
                        boolean FID;
                        if(izvele == "Jā")
                            FID = true;
                        else 
                            FID = false;

                        telefoni.add(new Android(googleK, NFC, FID, 
                                    modelis, ekranaIzmers,(int)atmina ,cena, krasa, ring));
					    JOptionPane.showMessageDialog(null, "Veiksmīgi izveidots telefons",
							"Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 1:
                        izvele = (String)JOptionPane.showInputDialog(null, "Vai būs faceID?", "Izveide",
                            JOptionPane.INFORMATION_MESSAGE, null, atbilde, atbilde[0]);
                        boolean faceID ;
                        if(izvele == "Jā")
                            faceID  = true;
                        else 
                            faceID  = false;
                        izvele = (String)JOptionPane.showInputDialog(null, "Vai būs iespēja lādēt bez vada?", "Izveide",
                            JOptionPane.INFORMATION_MESSAGE, null, atbilde, atbilde[0]);
                        boolean BezV ;
                        if(izvele == "Jā")
                            BezV  = true;
                        else 
                            BezV  = false;
                            telefoni.add(new Iphone(faceID, BezV,
                                    modelis, ekranaIzmers,(int)atmina ,cena, krasa, ring));
					    JOptionPane.showMessageDialog(null, "Veiksmīgi izveidots telefons",
							"Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                break;
            case 1:
                if(telefoni.size() > 0) { 
					String str = "Telefonu skaits: "+telefoni.size()+
							"\n_________________________________\n";
					for(int i=0; i<telefoni.size(); i++) {
						str += ((Telefons)telefoni.get(i)).izvadit()+
							"\n_________________________________\n";
					}
					
					JTextArea ta = new JTextArea (str, 10, 40);
					ta.setEditable(false);
					JScrollPane sp = new JScrollPane(ta);
					sp.setVerticalScrollBarPolicy(
							ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
					JOptionPane.showMessageDialog(ta, sp, "Atzīmes",
							JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Nav ievadīts neviens telefons",
							"Kļūda", JOptionPane.ERROR_MESSAGE);
					break;
				}
                break;
            case 2:
                if(telefoni.size() > 0) { 
                        int ritID = Metodes.telefonaIzvele(telefoni);
                        
                        telefoni.remove(ritID);
                        JOptionPane.showMessageDialog(null, "Veiksmīgi izdzēsts telefons",
                                "Paziņojums", JOptionPane.INFORMATION_MESSAGE);
                    }else {
                        JOptionPane.showMessageDialog(null, "Nav ievadīts neviens telefons",
                                "Kļūda", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                break;
            case 3:
            	if(telefoni.size() > 0) { 
					int telID = Metodes.telefonaIzvele(telefoni);
					
					JOptionPane.showMessageDialog(null, 
							((Telefons)telefoni.get(telID)).izvadit(),
							"Telefona informācija", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "Nav ievadīts neviens telefons",
							"Kļūda", JOptionPane.ERROR_MESSAGE);
					break;
				}
				break;
        }

   }
}
