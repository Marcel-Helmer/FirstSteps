public class ThreeDArray {
        public static void main(String[] args) {
            int habitats = 3;
            int animals = 4;

            int[][] animalsCounts ={
                    {10 , 5, 2, 3},
                    {5, 2, 1, 9},
                    {11, 4, 4, 3},

            };
            displayAnimalCounts(animalsCounts);

        }
        private static void displayAnimalCounts(int[][] animalsCounts){
            System.out.println("Anzahl der Tiere in jedem Lebensraum: ");
            for(int i = 0; i<animalsCounts.length; i++){
                System.out.println("Lebensraum: " + (i+1) + ": ");
                for(int j = 0; j<animalsCounts[i].length; j++){
                    System.out.println(animalsCounts[i][j] + "");
                }
                System.out.println();
            }
        }
    }


