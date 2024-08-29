package Uebungen;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class AktuelleZeit {
    public static void main(String[] args) {


LocalDate today = LocalDate.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String date = formatter.format(today);

        System.out.println("Das Datum ist: " + today);
        System.out.println("Das Datum ist: " + date);
        System.out.println("Das Datum ist: " + formatter);








    }
}
