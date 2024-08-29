public class Weihnachten {
    public static void main(String[] args) {

        boolean Pony = true;
        boolean PS4 = true;
        boolean Cyber = true;
        boolean Nintendo = true;
        boolean AC = true;
        boolean Playstation = true;
        boolean GTA5 = true;
        boolean Ncontroller = true;
        boolean Pmemory = true;
        boolean weißAdidasSchuhe = true;
        boolean grünNikeSchuhe = true;

// Prüfen ob entweder 1 UND 2 wahr sind, oder 3 wahr ist
        if (Pony) {
            System.out.println("Marie kriegt das Pony");
        } else {
            System.out.println("Marie kriegt nicht das Pony");
        }


        if (PS4 && Cyber) {
            System.out.println("Kevin kriegt die PS4 und Cyberpunk");
        } else {
            System.out.println("Kevin kriegt nicht die PS4 und Cyperpunk");
        }

        if (((Nintendo && AC && Ncontroller) || (Playstation && GTA5 && Pmemory)) && (weißAdidasSchuhe && grünNikeSchuhe)) {
            System.out.println("Soeren kriegt entweder die Nintendo oder die Playstation inkl zubehör");
        } else {
            System.out.println("Soeren kriegt nichts der halunke");
        }


        boolean Tennis = true;
        boolean Fernrohr = true;
        boolean Jeans = true;
        boolean Taschenrechner = true;
        boolean Puppenherd = true;
        boolean Dackel = true;
        boolean Baukasten = true;
        boolean Babypuppe = true;

        if ((Tennis && !Fernrohr) || (Jeans && !Taschenrechner) || (Puppenherd && Tennis && Dackel) ||
                (!Taschenrechner && Puppenherd && Baukasten) || (!Baukasten && Babypuppe && Jeans) ||
                (Babypuppe && !Baukasten) || ((Tennis || Taschenrechner) && ((Fernrohr && Dackel) || (!Fernrohr && !Dackel))) ||
                (Taschenrechner && (!Jeans && Dackel && !Baukasten)) || (!Puppenherd && Babypuppe)) {
            System.out.println("Sie kriegt irgendetwas glaube ich");
        }


    }
}