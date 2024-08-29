import java.util.Scanner;

public class Eisverkauf {

    public static void main(String[] args) {


        int anzahlWaffeleis = 0;
        int anzahlSpaghettieis = 0;
        int anzahlErdbeerbecher = 0;
        int anzahlAmarena = 0;
        int anzahlHeißewaffel = 0;
        int anzahlKaffee = 0;
        int input = 1;

        System.out.println("Willkommen bei der Eisdiele, was möchten Sie bestellen?");
        System.out.println("In unserem Sortiment befindet sich heute:");
        System.out.println("1. Waffleis für 1,20€");
        System.out.println("2. Spaghettieis für 8,50€");
        System.out.println("3. Erbeerbecher für 12,00€");
        System.out.println("4. Amarena 15,00€");
        System.out.println("5. Heiße Waffeln mit Vanilleeis 5,00€");
        System.out.println("6. Kaffee 2,00€");

        while (input != 0) {

            input = getNumber();
            if (input == 1) {
                anzahlWaffeleis++;
            }
            else if (input == 2) {
                anzahlSpaghettieis++;
            }
            else if (input == 3) {
                anzahlErdbeerbecher++;
            }
            else if (input == 4) {
                anzahlAmarena++;
            }
            else if (input == 5) {
                anzahlHeißewaffel++;
            }
            else if (input == 6) {
                anzahlKaffee++;
            }

            if (input > 0) {
                System.out.println("Darf es sonst noch etwas sein?");
            }
        }


        System.out.println("Sie haben wie folgt bestellt:");
        if (anzahlWaffeleis != 0) {
            System.out.println(anzahlWaffeleis + " mal Waffeleis für " + anzahlWaffeleis * 1.20 + "€");
        }

        if (anzahlSpaghettieis != 0) {
            System.out.println(anzahlSpaghettieis + " mal Spaghettieis für " + anzahlSpaghettieis * 8.50 + "€");
        }

        if (anzahlErdbeerbecher != 0) {
            System.out.println(anzahlErdbeerbecher + " mal Erdbeerbecher für " + anzahlErdbeerbecher * 12.00 + "€");
        }

        if (anzahlAmarena != 0) {
            System.out.println(anzahlAmarena + " mal Amarena für " + anzahlAmarena * 15.00 + "€");
        }

        if (anzahlHeißewaffel != 0) {
            System.out.println(anzahlHeißewaffel + " mal Heiße Waffeln mit Vanilleeis für " + anzahlHeißewaffel * 5.00 + "€");
        }

        if (anzahlKaffee != 0) {

            System.out.println(anzahlKaffee + " mal Kaffee für " + anzahlKaffee * 2.00 + "€");
        }


        System.out.println("Das macht dann zusammen:" + (anzahlWaffeleis * 1.20 + anzahlSpaghettieis * 8.50 + anzahlErdbeerbecher * 12.00 + anzahlAmarena * 15.00 + anzahlHeißewaffel * 5.00 + anzahlKaffee * 2.00)+ "€ bitte.");


    }

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }


}
