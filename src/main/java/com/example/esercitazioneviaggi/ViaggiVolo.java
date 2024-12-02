package com.example.esercitazioneviaggi;

public class ViaggiVolo extends Viaggi{
    private boolean isAndataRitorno;

    public ViaggiVolo(String destinazioni, int giorni, int prezzo, boolean isAndataRitorno) {
        super(destinazioni, giorni, prezzo);
        this.isAndataRitorno = isAndataRitorno;
    }
    public void setIsAndataRitorno(boolean isAndataRitorno){
        this.isAndataRitorno = isAndataRitorno;
    }
    public boolean getIsAndataRitorno(){
        return isAndataRitorno;
    }
    public void prezzoFinale(){
        if (isAndataRitorno){
            double prezzoModificato = getPrezzo() + (getPrezzo()/100)*85;
            setPrezzo(prezzoModificato);
        }
        else {
            double prezzoModificato = getPrezzo() + (getPrezzo()/100)*50;
            setPrezzo(prezzoModificato);
        }
    }
}