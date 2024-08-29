import java.util.Scanner;

public class Zinsenzins {

    public static void main(String[] args) {

        // Schreiben sie ein Programm , welches 3 Eingaben annimmt
        // Die Erste eingabe ist ein Betrag
        // Die Zweite eingabe ist eine Anzahl von Jahren
        // Die Dritte eingabe ist der Zinssatz

        // Schreiben sie nun eine Funktion, welche des Gesamtbetrag nach
        // der Anzahl von Jahren berechnet und zurückgibt

        // Geben sie den Betrag aus.

        float betrag = 0;
        int jahre = 0;
        float zinssatz = 0;

        System.out.println("Betrag eingeben :");
        betrag = getFloat();
        System.out.println("Über wieviele Jahre anlegen :");
        jahre = getInteger();
        System.out.println("Wie hoch ist der Zinssatz :");
        zinssatz = getFloat();

        betrag = calcZinsen(betrag, jahre, zinssatz);

        System.out.println("Gesamtbetrag nach " + jahre + " Jahren : " + betrag + " €");

    }

    public static float calcZinsen(float betrag,int jahre,float zinssatz) {

        for(int i = 1; i <= jahre; i++) {
            betrag = betrag + (betrag * (zinssatz / 100));
            System.out.println("Nach " + i + " Jahr(en) :" + betrag + " €");
        }
        return betrag;

    }


    public static float getFloat(){
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }

    public static int getInteger(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}