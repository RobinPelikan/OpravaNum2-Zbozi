import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Zbozi zbozi = new Zbozi("šrouby",BigDecimal.valueOf(69), 3);
        Zbozi zbozi1 = new Zbozi("šrouby",BigDecimal.valueOf(69), 3);

        Objednavka objednavka = new Objednavka();
        objednavka.pridejZbozi(zbozi);
        objednavka.pridejZbozi(zbozi1);

        System.out.println(objednavka.getCelkovaCena());
        Lsit<String> nazvyZbozi = objednavka.nazvyZboziSnizenaDph();
        System.out.println("nazvy :" );
        for (String nazev : nazvyZbozi) {
            System.out.println(nazev);
        }
    }
}