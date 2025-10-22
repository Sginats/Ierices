package Darbs;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
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
   }
}
