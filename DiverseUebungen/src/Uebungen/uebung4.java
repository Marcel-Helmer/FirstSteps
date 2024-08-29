package Uebungen;

public class uebung4 {
    public static void main(String[] args) {

        int[] zahlen;
        zahlen = new int[7];
        zahlen[0] = 1;
        zahlen[1] = 8;
        zahlen[2] = 12;
        zahlen[3] = 19;
        zahlen[4] = 36;
        zahlen[5] = 24;
        zahlen[6] = 21;



        for (int i = 0; i < zahlen.length; i++) {
            System.out.print("Zahl: " + zahlen[i]);
            System.out.println();
            int a = zahlen[i] + zahlen[i];
            System.out.println("A: " + a);
            int b = zahlen[i] + ((a / 2) + 3);
            System.out.println("B: " + b);
            double c = zahlen[i] + ((b * 3) / 1.5);
            System.out.println("C: " + c);

        };




    }
}
