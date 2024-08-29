package Schleifen;

public class SwitchCase {
    public static void main(String[] args) {


        String sport = "Tennis";

        switch (sport) {
            case "Tennis":
                System.out.println("Tennis");
                break;
            case "Reiten":
                System.out.println("Reiten");
                break;
            case "Golf":
                System.out.println("Golf");
                break;
            default:
                System.out.println("Sonstige");
                break;


        }
    }
}