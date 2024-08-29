package Uebungen;
import java.util.ArrayList;

public class uebung3 {
    public static void main(String[] args) {


        String[] names;
        names = new String[8];
        names[0] = "Michael";
        names[1] = "Bob";
        names[2] = "Silvia";
        names[3] = "Therese";
        names[4] = "Annie";
        names[5] = "Julia";
        names[6] = "Mike";
        names[7] = "Tobie";

        for (String name : names) {
            System.out.println(name);
        }
    }
}
