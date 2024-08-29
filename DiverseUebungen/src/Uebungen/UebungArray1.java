package Uebungen;

public class UebungArray1 {
    public static void main(String[] args) {

        String[] landArray;
        landArray = new String[6];
        landArray[0] = "Deutschland";
        landArray[1] = "Polen";
        landArray[2] = "Spanien";
        landArray[3] = "Island";
        landArray[4] = "Ukraine";
        landArray[5] = "Belgien";

        String[] stadtArray;
        stadtArray = new String[6];
        stadtArray[0] = "Berlin";
        stadtArray[1] = "Warschau";
        stadtArray[2] = "Madrid";
        stadtArray[3] = "Reykjavík";
        stadtArray[4] = "Kyjiw";
        stadtArray[5] = "Brüssel";



for(int i = 0; i < landArray.length; i++){

    System.out.println(landArray[i] + "  :\t" + stadtArray[i]);




}





    }

}
