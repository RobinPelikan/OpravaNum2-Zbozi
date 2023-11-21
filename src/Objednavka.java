import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Objednavka {

    private List<Zbozi> seznamZbozi;

    public Objednavka(List<Zbozi> seznamZbozi) {
        this.seznamZbozi = new ArrayList<>();
    }

    public void pridejZbozi(Zbozi zbozi) {
        seznamZbozi.add(zbozi);
    }

    public void odsrtanZbozi(Zbozi zbozi) {
        seznamZbozi.remove(zbozi);
    }

    public BigDecimal celkovaCena() {
        BigDecimal vysledek = BigDecimal.ZERO; //nebo valueOf(0);

        for (Zbozi z : seznamZbozi) {
            vysledek = vysledek.add(z.getCena());
        }
        return vysledek;
    }

    public List<String> nazvyZboziSnizenaDph(){
        List<String> vysledek = new ArrayList<>();
        for(Zbozi zbozi : seznamZbozi) {
            if (zbozi.isMaSnizenouDph()) {
                vysledek.add(zbozi.getPopis());
            }
        }
        return vysledek;
    }
}

