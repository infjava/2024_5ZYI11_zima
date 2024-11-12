import java.util.ArrayList;

public class Osoba {
    private String meno;
    private String priezvisko;
    private ArrayList<Double> znamky;

    public Osoba(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.znamky = new ArrayList<Double>();
    }

    public String getMeno() {
        return this.meno;
    }

    public String getPriezvisko() {
        return this.priezvisko;
    }
    
    public void pridajZnamku(double znamka) {
        this.znamky.add(znamka);
    }

    public void vypis() {
        System.out.println(this.meno + " " + this.priezvisko);
    }
}
