package com.example.esercitazioneviaggi;

public class Viaggi {
    private String destinazioni;
    private int giorni;
    private double prezzo;

    public Viaggi(String destinazioni, int giorni, double prezzo){
        this.destinazioni= destinazioni;
        this.giorni= giorni;
        this.prezzo = prezzo;
    }

    public void setDestinazioni(String destinazioni){
        this.destinazioni = destinazioni;
    }
    public void setGiorni(int giorni){
        this.giorni = giorni;
    }
    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    public String getDestinazioni(){
        return destinazioni;
    }
    public int getGiorni(){
        return giorni;
    }
    public double getPrezzo(){
        return prezzo;
    }
}