/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistiche;

import java.util.concurrent.Semaphore;

/**
 *
 * @author alessandro
 */
public class DatiCondivisi {
    
    private int numCaratteri;
    private Semaphore generazionePuntiFinita;

    public Semaphore getGenerazionePuntiFinita() {
        return generazionePuntiFinita;
    }

    public void setGenerazionePuntiFinita(Semaphore generazionePuntiFinita) {
        this.generazionePuntiFinita = generazionePuntiFinita;
    }
    private Semaphore controlloPuntiFinito;

    public Semaphore getControlloPuntiFinito() {
        return controlloPuntiFinito;
    }

    public void setControlloPuntiFinito(Semaphore controlloPuntiFinito) {
        this.controlloPuntiFinito = controlloPuntiFinito;
    }
    private Semaphore visualizzazioneFinita;//1

    public Semaphore getVisualizzazioneFinita() {
        return visualizzazioneFinita;
    }

    public void setVisualizzazioneFinita(Semaphore visualizzazioneFinita) {
        this.visualizzazioneFinita = visualizzazioneFinita;
    }

    public Semaphore getGenerazioneFinita() {
        return generazioneFinita;
    }

    public void setGenerazioneFinita(Semaphore generazioneFinita) {
        this.generazioneFinita = generazioneFinita;
    }

    public Semaphore getControlloFinito() {
        return controlloFinito;
    }

    public void setControlloFinito(Semaphore controlloFinito) {
        this.controlloFinito = controlloFinito;
    }
    private Semaphore generazioneFinita;//0
    private Semaphore controlloFinito;//0

    public int getNumCaratteri() {
        return numCaratteri;
    }

    public void setNumCaratteri(int numCaratteri) {
        this.numCaratteri = numCaratteri;
    }

    public int getNumPuntiInseriti() {
        return numPuntiInseriti;
    }

    public void incNumPuntiInseriti() {
        this.numPuntiInseriti++;
    }

    public int getNumSpaziInseriti() {
        return numSpaziInseriti;
    }

    public void incNumSpaziInseriti() {
        this.numSpaziInseriti++;
    }

    public int getNumSpaziLetti() {
        return numSpaziLetti;
    }

    public void incNumSpaziLetti() {
        numSpaziLetti++;
    }

    public int getNumPuntiLetti() {
        return numPuntiLetti;
    }

    public void incNumPuntiLetti() {
        this.numPuntiLetti++;
    }

    public synchronized char getBuffer() {
        return buffer;
    }

    public synchronized void setBuffer(char buffer) {
        this.buffer = buffer;
    }

    public DatiCondivisi(int numCaratteri) {
        this.numCaratteri = numCaratteri;
        visualizzazioneFinita = new Semaphore(1);
        generazioneFinita = new Semaphore(0);
        controlloFinito = new Semaphore(0);
        controlloPuntiFinito = new Semaphore(0);
        generazionePuntiFinita = new Semaphore(0);
        
    }
    private int numPuntiInseriti;
    private int numSpaziInseriti;
    private int numSpaziLetti;
    private int numPuntiLetti;
    private char buffer;
    
    
}
