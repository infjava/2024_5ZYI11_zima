
public class FormatovacCisla {
    
    private double cislo;

    /**
     * Konstruktor triedy FormatovacCisla.
     * @param cislo Cislo, ktore bude formatovane.
     */
    public FormatovacCisla(double cislo) {
        this.cislo = cislo;
    }

    /**
     * Formatuje cislo na dve desatinne miesta a vrati ho ako retazec.
     * @return Formatovane cislo na dve desatinne miesta.
     */
    public String getCisloNaDveDesatinneMiesta() {
        return String.format("%.2f", this.cislo);
    }
    
    /**
     * Formatuje cislo na dve desatinne miesta a vypise ho na konzolu.
     */
    public void vypisCisloNaDveDesatinneMiesta() {
        System.out.format("%.2f %n", this.cislo);
        // Alebo: 
        //System.out.println(this.getCisloNaDveDesatinneMiesta());
    }
    
    /**
     * Formatuje cislo na zaklade poctu desatinnych miest a vrati ho ako retazec.
     * @param pocetDesatinnychMiest Pocet desatinnych miest.
     * @return Formatovane cislo s danym poctom desatinnych miest.
     */
    public String getCislo(int pocetDesatinnychMiest) {
        // TODO Doprogramujte:
        return "";       
    }
    
    /**
     * Formatuje cislo na zaklade poctu desatinnych miest a vypise ho na konzolu.
     * @param pocetDesatinnychMiest Pocet desatinnych miest.
     */
    public void vypisCislo(int pocetDesatinnychMiest) {
        // TODO Doprogramujte:
    }
    
    /**
     * Formatuje cislo na zaklade poctu desatinnych miest a zarovnava ho doprava na dany pocet znakov.
     * @param pocetDesatinnychMiest Pocet desatinnych miest.
     * @param pocetZnakov Pocet znakov na zarovnanie doprava.
     * @return Formatovane cislo zarovnane doprava.
     */
    public String getCisloZarovnajVpravo(int pocetDesatinnychMiest, int pocetZnakov) {
        // TODO Doprogramujte:
        return "";
    }

    /**
     * Formatuje cislo na zaklade poctu desatinnych miest a zarovnava ho dolava na dany pocet znakov.
     * @param pocetDesatinnychMiest Pocet desatinnych miest.
     * @param pocetZnakov Pocet znakov na zarovnanie dolava.
     * @return Formatovane cislo zarovnane dolava.
     */
    public String getCisloZarovnajVlavo(int pocetDesatinnychMiest, int pocetZnakov) {
        // TODO Doprogramujte:
        return "";
    }
}
