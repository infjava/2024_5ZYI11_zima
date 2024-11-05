public class Hrac {
    private Ruka ruka;
    private Manazer manazer;
    
    public Hrac() {
        this.ruka = new Ruka(100, 100);
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
    }
    
    public void posunDole() {
        this.ruka.predchadzajuca();
    }
    
    public void posunHore() {
        this.ruka.nasledujuca();
    }
    
    public int getAktualneGesto() {
        return this.ruka.getGesto();
    }
}
