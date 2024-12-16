package com.example.esercitazioneviaggi;
import java.util.Scanner;
public class TestAgenzia {

    public static void main(String[]args){
        Viaggi[] Booking = new Viaggi[100];
        int posizionePacchetti = 0;
        int input;
        Scanner in = new Scanner(System.in);
        do {

            System.out.println("1 - Aggiunta pacchetto");
            System.out.println("2 - Visualizza pacchetto");
            System.out.println("3 - Costo medio");
            System.out.println("4 - Visualizza pacchetti (Costo minimo e Costo massimo)");
            System.out.println("0 - Esci da Booking.com ");

            input = in.nextInt();

            switch (input){
                case 1:
                    System.out.println("Inserisci la destinazione: ");
                    String destinazione = in.next();
                    System.out.println("Inserisci i giorni: ");
                    int giorni = in.nextInt();
                    System.out.println("Inserisci il prezzo: ");
                    double prezzo = in.nextDouble();
                    Viaggi pacchetto = new Viaggi(destinazione, giorni, prezzo);
                    AggiuntaPacchetto(Booking, pacchetto, posizionePacchetti);
                    posizionePacchetti++;
                    break;
                case 2:
                    VisualizzaPacchetto(Booking, posizionePacchetti);
                    System.out.println(VisualizzaPacchetto(Booking, posizionePacchetti));
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        }while(input != 0);
    }
    public static void AggiuntaPacchetto(Viaggi[] Booking, Viaggi pacchetto, int PosizionePacchetti){
        Booking[PosizionePacchetti]=pacchetto;
    }
    public static String VisualizzaPacchetto(Viaggi[] Booking, int PosizionePacchetti){
        String s = "";
        for (int i = 0; i < PosizionePacchetti; i++){
            s = "Destinazione: " + Booking[i].getDestinazioni() + "\nGiorni: " + Booking[i].getGiorni() + "\nPrezzo: " + Booking[i].getPrezzo();
        }
        return s;
    }
}
