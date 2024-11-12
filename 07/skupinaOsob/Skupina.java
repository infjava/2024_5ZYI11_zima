public class Skupina {
    // Tu by som chcel ZOZNAM osob (napriklad Vasu studijnu skupinu)
    // Vopred ale neviem, kolko Vas je.
        
    public Skupina() {
        // Tu by sa mal ten zoznam vytvorit. 
        // Doplnit!
    }
    
    public void pridajObjektOsoba(Osoba novaOsoba) {
        // Doplnit!
    }
    
    public void pridajNovuOsobu(String noveMeno, String novePriezvisko) {
        // Doplnit!
        // Poznamka: Vysvetlit anonymny objekt.
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
