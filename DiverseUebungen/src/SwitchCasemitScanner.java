import java.util.Scanner;

public class SwitchCasemitScanner {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie die erste Zahl ein: ");

        int zahl1 = scanner.nextInt();

        System.out.println("Bitte geben Sie die zweite Zahl ein: ");

        int zahl2 = scanner.nextInt();

        System.out.println("Bitte geben Sie den ersten String ein");

        String string1 = scanner.next();

        System.out.println("Bitte geben Sie den zweiten String ein");

        String string2 = scanner.next();

// Auswahl der Operation
        System.out.println("\nWählen Sie eine Option aus:");
        System.out.println("1: Addition der Integer-Werte");
        System.out.println("2: Subtraktion der Integer-Werte");
        System.out.println("3: Verketten der Strings");
        System.out.println("4: Überprüfen, ob der erste String den zweiten enthält");
        System.out.println("5: Vergleichen der Strings (case-sensitive)"); // case sensitiv soll auf groß klein schreibung achten
        System.out.println("6: Vergleichen der Strings (case-insensitive)"); // case insensitive soll nicht auf groß und kleinschreibung achten

        int option = scanner.nextInt(); // Get Option from user

        switch (option) {
            case 1:
                System.out.println("Ergebnis: " + Math.addExact(zahl1, zahl2));
                break;
            case 2:
                System.out.println("Ergebnis:" + Math.subtractExact(zahl1, zahl2));
                break;
            case 3:
                System.out.println("Wie kontatienieren wir String? " + string1.concat(string2));
            case 4:
                System.out.println("Enthält String 1 -> String 2?" + string1.contains(string2));
                break;
            case 5:
                if (string1.compareTo(string2) == 0) {
                    System.out.println("String1 und String2 sind  gleich");
                } else {
                    System.out.println("String 1 und String 2 sind nicht gleich");
                }


                break;
            case 6:
                if (string1.compareToIgnoreCase(string2) == 0) {
                    System.out.println("String1 und String 2 sind gleich");
                } else {
                    System.out.println("String 1 und String 2 sind nicht gleich");
                }
                break;

            default:
                System.out.println("Ungültige Option");

        }

    }
}