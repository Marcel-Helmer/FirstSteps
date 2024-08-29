public class rechnungMitReturn {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = subtraction(a, b) - addition(a, b);
        int result1 = division(a, b) - addition(a, b);
        System.out.println("Resultat: " + result);


        System.out.println(result);
    }


    //Methode

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int division(int x, int y) {
        return x / y;
    }



}