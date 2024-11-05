import java.util.Random;

public class Pocitac {
    private Ruka ruka;
    private Manazer manazer;
    private Random nahodneCisla;
    
    public Pocitac() {
        this.ruka = new Ruka(200, 100);
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
        this.nahodneCisla = new Random();
    }
    
    public void tik() {
        int gesto = this.nahodneCisla.nextInt(5);
        this.ruka.setGesto(gesto);
    }
    
    public int getAktualneGesto() {
        return this.ruka.getGesto();
    }
}
