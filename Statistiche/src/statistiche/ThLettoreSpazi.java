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
public class ThLettoreSpazi extends Thread{
    private DatiCondivisi ptrDatiC;

    public ThLettoreSpazi(DatiCondivisi ptrDatiC) {
        this.ptrDatiC = ptrDatiC;
    }
    public void run(){
        for(int i = 0; i < ptrDatiC.getNumCaratteri();i++){
            try {
                //generazione finita
                ptrDatiC.getGenerazioneFinita().acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThLettorePunti.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(ptrDatiC.getBuffer() == ' '){
                ptrDatiC.incNumSpaziLetti();
            }
            //finito
            ptrDatiC.getControlloFinito().release();
            
        }
        System.out.println("Lettore spazi finito");
    }
}
