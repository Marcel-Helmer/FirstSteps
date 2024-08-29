import java.util.Scanner;

public class ArrayTelefonBuch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Abfrage der Dimensionen des Arrays
        System.out.print("Anzahl Zeilen: ");
        int zeilen = scanner.nextInt();
        System.out.print("Anzahl Spalten: ");
        int spalten = scanner.nextInt();
        scanner.nextLine();

        // Initialisierung Array
        String[][] array = new String[zeilen][spalten];

        // Füllen
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                System.out.print("Geben Sie das Element für Zeile " + i + ", Spalte " + j + " ein: ");
                array[i][j] = scanner.nextLine();
            }
        }

        // Ausgabe des gefüllten 2D-Arrays
        System.out.println("Das Array:");
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}