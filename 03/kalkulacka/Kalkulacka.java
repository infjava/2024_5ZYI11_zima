public class Kalkulacka {
    private double medzivysledok;
    
    public Kalkulacka() {
        this.medzivysledok = 0;
    }
    
    public void zadaj(double cislo) {
        this.medzivysledok = cislo;
    }
    
    public void pricitaj(double cislo) {
        //this.medzivysledok = this.medzivysledok + cislo;
        this.medzivysledok += cislo;
    }
    
    public void odcitaj(double cislo) {
        this.medzivysledok -= cislo;
    }
    
    public void vynasob(double cislo) {
        this.medzivysledok *= cislo;
    }
    
    public void vydel(double cislo) {
        if (cislo == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            this.medzivysledok /= cislo;
        }
    }
    
    public void druhaMocnina() {
        this.medzivysledok *= this.medzivysledok;
    }
    
    public void mocnina(int n) {
        double vysledok = 1;
        
        if (n < 0) {
            for (int i = 0; i < -n; i++) {
                vysledok /= this.medzivysledok;
            }
        } else {
            for (int i = 0; i < n; i++) {
                vysledok *= this.medzivysledok;
            }
        }
        
        this.medzivysledok = vysledok;
    }
    
    public void druhaOdmocnina() {
        double vysledok = this.medzivysledok;
        double kontrolnyVysledok;
        
        // int i = 0;
        do {
            kontrolnyVysledok = vysledok;
            vysledok = (vysledok + this.medzivysledok / vysledok) / 2;
            // i++;
        } while ((kontrolnyVysledok - vysledok) >= 0.0001);
        
        // System.out.println(i);
        this.medzivysledok = vysledok;
    }
    
    public double getVysledok() {
        return this.medzivysledok;
    }
}
