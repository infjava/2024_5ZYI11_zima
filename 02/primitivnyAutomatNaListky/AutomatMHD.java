
/**
 * Trieda modeluje primitivny automat na predaj
 * cestovnych listkov MHD.
 * Model predpoklada, ze kupujuci vlozi presnu
 * ciastku podla ceny listka.
 * Cena listka je urcena parametrom konstruktora.
 */

public class AutomatMHD {
    private int cenaListka;
    // suma vlozenych minci pred tlacou listka
    private int vlozenaCiastka;
    // celkova suma penazi za vsetky listky
    private int trzba;

    /**
     * Konstruktor vytvori automat, ktory bude
     * tlacit cestovne listky pevnej ceny.
     * Cena je urcena parametrom pcenaListka.
     * Pozor - cena listka musi byt kladne cele
     * cislo a tato podmienka sa nekontroluje.
     */
    public AutomatMHD(int cenaListka) {
        this.cenaListka = cenaListka;
        this.vlozenaCiastka = 0;
        this.trzba = 0;
    }

    /**
     * Vrati hodnotu ceny listka
     */
    public int getCenaListka() {
        return this.cenaListka;
    }
    
    /**
     * Vrati doteraz vlozenu ciastku
     */
    public int getVlozenaCiastka() {
        return this.vlozenaCiastka;
    }
    
    /**
     * Prijme mincu danej hodnoty od kupujuceho
     */
    public void vlozMincu(int hodnotaMince) {
        this.vlozenaCiastka = this.vlozenaCiastka + hodnotaMince;
    }
    
    /**
     * Vytlaci cestovny listok,
     * pripocita vlozenu ciastku k trzbe a
     * vynuluje vlozenu ciastku
     */
    public void tlacListok() {
        // tlac listka do okna konzoly
        System.out.println("*************************");
        System.out.println("* Skolska linka FRI");
        System.out.println("* Cestovny listok");
        System.out.print("* cena ");
        System.out.print(this.cenaListka);
        System.out.println(" centov");
        System.out.println("*************************");
        System.out.println();
        
        // pripocitaj vlozenu ciastku k trzbe
        this.trzba = this.trzba + this.vlozenaCiastka;
        // nuluj vlozenu ciastku
        this.vlozenaCiastka = 0;
    }
}
