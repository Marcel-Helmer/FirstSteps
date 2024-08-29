package Schleifen;

public class DurchschnittMitSchleife {
    public static void main(String[] args) {
    /*

    Erstellen Sie ein Programm, das Noten für eine Klasse von 5 Schülern verarbeitet
    und auf Basis der Noten folgende Ausgaben erzeugt:

    1. Durchschnittliche Note: X
    2. Schlechteste Note: X

    3. Je nach durchschnitt
        A: Die Klasse hat Supernoten! (Note >= 2)
        B: Die Klasse hat durchschnittliche Noten. (Note 3 & 4)
        C: Der Notenspiegel wird nicht offengelegt.

     */
        int[] Note = new int[5];

        Note[0] = 4;
        Note[1] = 4;
        Note[2] = 3;
        Note[3] = 1;
        Note[4] = 1;


        int sum = 0;

        for (int i = 0; i < Note.length; i++) {

            sum += Note[i];


        }

        double durchschnitt = (double) sum / (double) Note.length;


        System.out.println(durchschnitt);

        int hoechstnote = Note[0];
        for (int i = 1; i < Note.length; i++) {
            if (Note[i] > hoechstnote) {
                hoechstnote = Note[i];

            }

        }
        System.out.println("Schlechteste " + hoechstnote);


        if (durchschnitt <=2){
            System.out.println("Super noten");
        }else if (durchschnitt <=4){
            System.out.println("geht so");
        }else{
            System.out.println("sagen wir nicht");
        }


    }
}