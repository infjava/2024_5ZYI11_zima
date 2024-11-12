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
        // Doplnit!
        // Poznamka: V metóde nepouzivajte vetvenie (prikaz IF)!
        return false;
    }
        
    public int getPocetClenovSkupiny() {
        // Doplnit!
        // Na prvy pohlad sa metoda javi ako getter. Potrebujem novy atribut? Preco?  
        // Pri kazdej uprave zoznamu by sa musel aktualizovat, co nie je vhodne.
        return 0;
    }
        
    public void vypisClenovSkupiny() {
        // Doplnit!
        // Ukazat vsetky 3 cykly - foreach, while s lokalnou premennou aj for (pristup k prvkom cez get(i)
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
