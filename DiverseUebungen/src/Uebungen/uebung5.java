package Uebungen;
import java.util.Scanner;

public class uebung5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (; ; ) {
            String TextFeld = scanner.nextLine();

            if (TextFeld.equals("Wie heißt du?")) {
                System.out.println("Mein name lautet Minnie");
            } else if (TextFeld.equals("Wo lebst du?")) {
                System.out.println("Ich lebe in Düren");
            } else if (TextFeld.equals("ciao") || TextFeld.equals("ok")) {
                break;
            } else {
                System.out.println("Fehlehafte Eingabe");

            }
        }
    }
}