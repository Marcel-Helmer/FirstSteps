package Uebungen;
import java.util.Scanner;

public class uebungLernplan {
    public static void main(String[] args) {

     /*   int i = 0;


        if (i % 2 != 0){
            System.out.println("Die Zahl ist Ungerade = " + i);
        } else if (i == 0) {
            System.out.println("Die Zahl ist Null = " + i);
        } else {
            System.out.println("Die Zahl ist Grade = " + i);
        }
*/

/*
        int[] note;
        note = new int[7];
        note[0] = 4;
        note[1] = 2;
        note[2] = 1;
        note[3] = 4;
        note[4] = 2;
        note[5] = 3;
        note[6] = 5;

        System.out.println("Welchen Schüler möchten Sie die Note wissen?");

int scanNote = new Scanner(System.in).nextInt();

        if (note[scanNote] == 1) {
            System.out.println("Sehr gut");
        }
        else if (note[scanNote] == 2) {
            System.out.println("Gut");
        }
        else if (note[scanNote] == 3) {
            System.out.println("Befriedigend");
        }
        else if (note[scanNote] == 4) {
            System.out.println("Ausreichend");
        }
        else if (note[scanNote] == 5) {
            System.out.println("Mangelhaft");
        }
        else if (note[scanNote] == 6) {
            System.out.println("Ungenügend");
        }

*/

        System.out.println("Gib die Temperatur in °C an");
        double Celsius = new Scanner(System.in).nextDouble();


        System.out.println("In Celsius haben wir " + Celsius + "°C");
        System.out.println("In Fahrenheit haben wir " + (Celsius * 1.8 +32 + "°F"));

    }
}
