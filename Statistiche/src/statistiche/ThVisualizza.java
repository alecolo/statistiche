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
public class ThVisualizza extends Thread{
    private DatiCondivisi ptrDatiC;

    public ThVisualizza(DatiCondivisi ptrDatiC) {
        this.ptrDatiC = ptrDatiC;
    }
    public void run(){
        for(int i= 0; i < ptrDatiC.getNumCaratteri(); i++){
            try {
                //finito
                ptrDatiC.getControlloPuntiFinito().acquire();
                ptrDatiC.getControlloFinito().acquire();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThVisualizza.class.getName()).log(Level.SEVERE, null, ex);
            }
        System.out.println("buffer: " + ptrDatiC.getBuffer());
        System.out.println("punti inseriti: " + ptrDatiC.getNumPuntiInseriti());
        System.out.println("punti letti: " + ptrDatiC.getNumPuntiLetti());
        System.out.println("sapzi inseriti " + ptrDatiC.getNumSpaziInseriti());
        System.out.println("sapzi letti " + ptrDatiC.getNumSpaziLetti());
        //stampa finita
        ptrDatiC.getVisualizzazioneFinita().release();
        }
        System.out.println("visualizza finito");
    }
}
