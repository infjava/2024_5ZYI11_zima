import java.util.ArrayList;

public class Skupina {
    private ArrayList<Osoba> osoby;
        
    public Skupina() {
        this.osoby = new ArrayList<Osoba>();
    }
    
    public void pridajObjektOsoba(Osoba novaOsoba) {
        this.osoby.add(novaOsoba);
    }
    
    public void pridajNovuOsobu(String noveMeno, String novePriezvisko) {
        this.osoby.add(new Osoba(noveMeno, novePriezvisko));
    }
    
    public boolean jeClenomSkupiny(Osoba hladanaOsoba) {
        return this.osoby.contains(hladanaOsoba);
    }
        
    public int getPocetClenovSkupiny() {
        return this.osoby.size();
    }
        
    public void vypisClenovSkupiny() {
        for (Osoba aktualna : this.osoby) {
            aktualna.vypis();
        }
    }
    
    public void vypisClenovSkupinyBezDuplicit() {
        ArrayList<Osoba> vypisaneOsoby = new ArrayList<Osoba>();
        
        for (Osoba aktualna : this.osoby) {
            if (!vypisaneOsoby.contains(aktualna)) {
                aktualna.vypis();
                vypisaneOsoby.add(aktualna);
            }
        }
    }
    
    public void odstranPodlaPoradia(int poradie) {
        this.osoby.remove(poradie);
    }
    
    public void odstranPodlaReferencie(Osoba osoba) {
        this.osoby.remove(osoba);
    }
    
    public void zrusSkupinu() {
        this.osoby.clear();
    }
}
