public class WithIfandElse {
    public static void main(String[] args) {

        int lala = 500;
        int lala2 = 100;
        int lala3 = 500;

        tukan(lala, lala2);
        Kadse(lala, lala2, lala3);

    }


    public static void tukan (int lala, int lala2 ){

        System.out.println(lala + " + " + lala2 + " = " + (lala + lala2));


    }


    public static void Kadse (int lala, int lala2, int lala3 ){

        if ( lala > lala2 && lala > lala3 ) {
            System.out.print("Die Zahl ist " + lala);

        }

        else if ( lala2 > lala && lala2 > lala3){
            System.out.print("Die Zahl ist " + lala2);
        }

        else if ( lala3 > lala && lala3 > lala2){
            System.out.print("Die Zahl ist " + lala3);
        }



    }


}

