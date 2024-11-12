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
        for (Osoba aktualna : this.osoby) {
            if (aktualna.getMeno().equals(hladanaOsoba.getMeno())
                    && aktualna.getPriezvisko().equals(hladanaOsoba.getPriezvisko())) {
                return true;
            }
        }
        
        return false;
    }
        
    public int getPocetClenovSkupiny() {
        return this.osoby.size();
    }
        
    public void vypisClenovSkupiny() {
        for (Osoba aktualna : this.osoby) {
            aktualna.vypis();
        }
    }
    
    public void odstranPodlaPoradia(int poradie) {
        // Doplnit!
    }
    
    public void odstranPodlaReferencie(Osoba osoba) {
        // Doplnit!
    }
    
    public void zrusSkupinu() {
        // Doplnit!
        // Ktory cyklus pouzijete? Foreach? While? Treba vobec cyklus?
    }
}
