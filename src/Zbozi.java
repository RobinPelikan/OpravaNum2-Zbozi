import java.math.BigDecimal;

public class Zbozi {
    private String popis;
    private BigDecimal cena;
    private int pocetKusu;

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public int getPocetKusu() {
        return pocetKusu;
    }

    public void setPocetKusu(int pocetKusu) {
        this.pocetKusu = pocetKusu;
    }

    public boolean isMaSnizenouDph() {
        return maSnizenouDph;
    }

    public void setMaSnizenouDph(boolean maSnizenouDph) {
        this.maSnizenouDph = maSnizenouDph;
    }

    private boolean maSnizenouDph = false;

    public Zbozi(String popis, BigDecimal cena, int pocetKusu) {
        this.popis = popis;
        this.cena = cena;
        this.pocetKusu = pocetKusu;
    }







}