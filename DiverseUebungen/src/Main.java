public class Main {
    public static void main(String[] args) {

        // 2D Array
        String[][] pokemon ={
                // Erstes Unterarray Typ Wasser 0
                {"Schiggy","Morlord"},
                // Zweites Unterarray Typ Feuer 1
                {"Ponita","Glumanda"},
                // Drittes Unterarray Typ Pflanze 2
                {"Bisasam", "Knofensa"}
        };

        // Hier durchlaufen wir die Zeilen
        for(int i = 0; i<pokemon.length; i++){
            // Ausgabe des Typs nach Spalte
            if (i == 0){
                System.out.println("Typ: Wasser");
            }else if(i == 1){
                System.out.println("Typ: Feuer");
            }else if(i == 2){
                System.out.println("Typ: Pflanze");
            }
            // Iteration innerhalb eines Typs also der einzelnen Arrays
            // Hier durchlaufen wir die Spalten
            for (int j = 0; j < pokemon[i].length; j++){
                System.out.println(pokemon[i][j] + "\t");
            }
            System.out.println();
        }

    }
}




















