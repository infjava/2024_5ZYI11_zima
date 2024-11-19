public class Vektor {
    private double[] vektor;
    
    public Vektor(double[] vektor) {
        this.vektor = vektor;
    }
    
    public double skalarnySucin(Vektor vektorB) {
        if (this.vektor.length != vektorB.getDlzka()) {
            System.out.println("Vektory musia byt rovnako dlhe");
            return Double.NaN;
        }
        
        double vysledok = 0;
        
        for (int index = 0; index < this.vektor.length; index++) {
            double sucin = this.vektor[index] * vektorB.getPrvok(index);
            vysledok += sucin;
        }
        
        return vysledok;
    }
    
    public double getPrvok(int index) {
        return this.vektor[index];
    }
    
    public int getDlzka() {
        return this.vektor.length;
    }
    
    public void vypisVektor() {
        // osetrit ciarku na konci
        System.out.print("(");
        for (double zlozka : this.vektor) {
            System.out.format("%.2f,", zlozka);
        }
        System.out.println(")");
    }
}
