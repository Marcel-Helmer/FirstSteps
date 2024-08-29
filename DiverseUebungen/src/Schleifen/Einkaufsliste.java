package Schleifen;

public class Einkaufsliste {
    public static void main(String[] args) {
        /*
   Schreiben Sie eine einfache Einkaufsliste (5 Produkte)

   - Sie brauchen ein Array
   - Geben Sie dieses Array in einer Schleife aus
   - Entfernen Sie das Element am Index zwei aus Ihrer Liste

 */
        // **Array-Erstellung**: Ein Array für die Einkaufsliste erstellen
        String[] shoppingList = new String[5];  // Ein Array mit Platz für 5 Artikel

        // **Artikel hinzufügen**
        shoppingList[0] = "Äpfel";
        shoppingList[1] = "Bananen";
        shoppingList[2] = "Milch";
        shoppingList[3] = "Brot";
        shoppingList[4] = "Eier";

        // Artikel anzeigen
        System.out.println("Einkaufsliste:");

        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println((i + 1) + ". " + shoppingList[i]);  // Gibt jeden Artikel in der Liste aus
        }


        // Artikel entfernen - Index2 - Verschiebt die nachfolgenden Elemente nach vorne

        for (int i = 2; i < shoppingList.length - 1; i++) {
            shoppingList[i] = shoppingList[i + 1];
        }
        shoppingList[shoppingList.length - 1] = null; // setzt den letzten Index auf null (leeres Element)



        System.out.println("\nNach dem Entfernen von Artikel an Index 2:");

        // Verbleibende Artikel anzeigen
        for (int i = 0; i < shoppingList.length; i++) {
            if (shoppingList[i] != null) {
                System.out.println((i + 1) + ". " + shoppingList[i]);  // Gibt jeden verbleibenden Artikel aus
            }
        }

    }


}