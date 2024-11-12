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
    
    public void vypisHodnotiaciList() {
        if (this.znamky.isEmpty()) {
            System.out.format("Student %s %s nema zadane ziadne znamky.%n", this.meno, this.priezvisko);
            return;
        }
        
        System.out.format("Znamky studenta %s %s:%n", this.meno, this.priezvisko);
        
        double najlepsiaZnamka = 4;
        double najhorsiaZnamka = 1;
        double sucetZnamok = 0;
        
        for (double znamka : this.znamky) {
            System.out.println(znamka);
            
            if (znamka < najlepsiaZnamka) {
                najlepsiaZnamka = znamka;
            }
            
            if (znamka > najhorsiaZnamka) {
                najhorsiaZnamka = znamka;
            }
            
            sucetZnamok += znamka;
        }
        
        System.out.format("Najlepsia znamka: %.1f%n", najlepsiaZnamka);
        System.out.format("Najhorsia znamka: %.1f%n", najhorsiaZnamka);
        System.out.format("Priemerna znamka: %.1f%n", sucetZnamok / this.znamky.size());
        System.out.format("Pocet znamok: %d%n", this.znamky.size());
    }

    public void vypis() {
        System.out.println(this.meno + " " + this.priezvisko);
    }
}
