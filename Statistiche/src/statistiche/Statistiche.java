/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistiche;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alessandro
 */
public class Statistiche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
            DatiCondivisi dati = new DatiCondivisi(1000);
            ThGenera thGenera = new ThGenera(dati);//
            ThLettorePunti thLettorePunti = new ThLettorePunti(dati);
            ThLettoreSpazi thLettoreSpazi = new ThLettoreSpazi(dati);
            ThVisualizza thVisualizza = new ThVisualizza(dati);
            thGenera.start();
            thLettorePunti.start();
            thLettoreSpazi.start();
            thVisualizza.start();
            System.out.println("maain finito");
        
    }
    
}
