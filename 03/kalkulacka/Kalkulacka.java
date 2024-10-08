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
    
    public double getVysledok() {
        return this.medzivysledok;
    }
}
