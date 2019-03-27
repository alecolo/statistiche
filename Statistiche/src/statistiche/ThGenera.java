/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistiche;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alessandro
 */
public class ThGenera extends Thread{
    private DatiCondivisi ptrDatiC;
    private String stringa = "abcdefgh ilmnopqr.stuvz";

    public ThGenera(DatiCondivisi ptrDatiC) {
        this.ptrDatiC = ptrDatiC;
    }
    
    public void run(){
        Random rnd = new Random();
        for(int i = 0; i < ptrDatiC.getNumCaratteri(); i++){
            int ran = rnd.nextInt(22)+1;
            try {
                //stampa finita
                ptrDatiC.getVisualizzazioneFinita().acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThGenera.class.getName()).log(Level.SEVERE, null, ex);
            }
            ptrDatiC.setBuffer(stringa.charAt(ran));
            
            //generazione finita
            if(stringa.charAt(ran) == ' '){
                ptrDatiC.incNumSpaziInseriti();
            }
            if(stringa.charAt(ran) == '.'){
                ptrDatiC.incNumPuntiInseriti();
            }
            ptrDatiC.getGenerazionePuntiFinita().release();
            ptrDatiC.getGenerazioneFinita().release();
        }
        System.out.println("ThGenera finito");
    }
}
