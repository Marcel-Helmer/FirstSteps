package Schleifen;

public class KopfFußschleifen {

    public static void main(String[] args) {
/* Aufgabenstellung:

Kopfgesteuerte Schleife
Fußgesteuerte Schleife

Array + Ausgabe

SwichCaseBeispiel/ IfElse Beispiel */


        int[] FF14 = new int[6];
        FF14[0] = 6;
        FF14[1] = 9;
        FF14[2] = 16;
        FF14[3] = 12;
        FF14[4] = 11;
        FF14[5] = 5;

        int much = FF14[0];

        for (int i = 0; i < FF14.length; i++) {
            if (FF14[i] > much) {
                much = FF14[i];
            }
        }
        if (much == FF14[0]) {
            System.out.println("BLM BEST");
        } else if (much == FF14[1]) {
            System.out.println("RPR BEST");
        } else if (much == FF14[2]) {
            System.out.println("BRD BEST");
        } else if (much == FF14[3]) {
            System.out.println("RDM BEST");
        } else if (much == FF14[4]) {
            System.out.println("AST BEST");
        } else if (much == FF14[5]) {
            System.out.println("PLD BEST");
        }


        int a = 0;

        do {

            System.out.println(FF14[a] + "% Spielen Klasse " + a);


        } while (a++ <= FF14.length);


        String MMO = "WoW";

        switch (MMO) {
            case "FF14":
                System.out.println("Ist ein beliebte spiel");
                break;
            case "WoW":
                System.out.println("Heruntergekommen durch Activision Blizzard");
                break;
            case "Elder Scrolls Online":
                System.out.println("Gibt es das noch?");
                break;
            default:
                System.out.println("kenn ich nicht lol");
                break;


        }


    }

}