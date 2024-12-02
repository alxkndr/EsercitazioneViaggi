package com.example.esercitazioneviaggi;

public class ViaggiPasti extends Viaggi {
    private boolean isPensioneCompleta;

    public ViaggiPasti(String destinazioni, int giorni, int prezzo, boolean isPensioneCompleta) {
        super(destinazioni, giorni, prezzo);
        this.isPensioneCompleta = isPensioneCompleta;
    }
    public void setIsPensioneCompleta(boolean isPensioneCompleta){
        this.isPensioneCompleta = isPensioneCompleta;
    }
    public boolean getIsPensioneCompleta(){
        return isPensioneCompleta;
    }
    public void prezzoFinale(){
        if (isPensioneCompleta){
            double prezzoModificato = getPrezzo() + (35*getGiorni());
            setPrezzo(prezzoModificato);
        }
        else {
            double prezzoModificato = getPrezzo() + (25*getGiorni());
            setPrezzo(prezzoModificato);
        }
    }
}
