public class Schleife {
    public static void main(String[] args) {


/*

        int[] numbers = {7, 7, 7, 8, 8};
        int result = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                result *= numbers[i];
            }

        }
        System.out.println(result);

    }
}
*/




        int[] numbers = {11, 15, 19, 25, 31, 35, 41};

        int result = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {

                result -= numbers[i]; // das - sorgt dafür, dass jedes mal wenn das IF triggert, es subtrahiert wird

            }

        }

        if (result < 0) {

            System.out.println("Die Zahl ist negativ");

        } else {

            System.out.println("Differenz: " + result);

        }

    }

}

