import java.util.Scanner;
import java.util.Random;

public class soGehtRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int benwert = 0;
        Random RW = new Random();
        int Randomwert = RW.nextInt(1, 100);

        System.out.println("Geben Sie ein Wert von 1 bis 100");
        benwert = sc.nextInt();

        if (benwert < Randomwert) {
            System.out.println("Wert ist zu niedrig");
        } else if (benwert == Randomwert) {
            System.out.println("Bingo");
        } else {
            System.out.println("Wert ist zu Groß");
        }
        System.out.println("Randomwert war:  " + Randomwert);
    }
}