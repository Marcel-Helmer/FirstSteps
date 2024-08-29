package Uebungen;

import java.util.Scanner;
public class MonicaProblem {
    public static void main(String[] args) {
        //Lese eine Note ein und gib eine Bewertung basierend
        // auf der Note aus (z.B. „Gut“, „Befriedigend“).


        System.out.println("Geben sie eine Note ein: von 1 bis 10");


        int Note = new Scanner(System.in).nextInt();

        switch (Note) {
            case 3:
                System.out.println("Note schlecht");
                break;
            case 4:
                System.out.println("Note mittelmass");
                break;
            case 7:
                System.out.println("Note gut");
                break;
            default:
                System.out.println("keine gültige Note");
        }
    }
}