/**
 * Jednoducha kalkulacka umoznujuca zakladne operacie.
 */
public class Kalkulacka {    
    private double vysledok;

    /**
     * Vytvori jednoduchu kalkulacku. 
     */
    public Kalkulacka() {
        this.vysledok = 0;
    }

    /**
     * Nastavi aktualny vysledok na zadane cislo.
     * 
     * @param noveCislo Nove cislo na nastavenie.
     */
    public void zadajCislo(double noveCislo) {
        this.vysledok = noveCislo;
    }

    /**
     * Vrati aktualny vysledok kalkulacky.
     * 
     * @return Aktualny vysledok.
     */
    public double getVysledok() {
        return this.vysledok;
    }

    /**
     * Vynuluje aktualny vysledok.
     */
    public void vymaz() {
        this.vysledok = 0;
    }

    /**
     * Pripocita zadane cislo k aktualnemu vysledku.
     * 
     * @param cislo Cislo na pripocitanie.
     */
    public void pripocitaj(double cislo) {
        this.vysledok += cislo;
    }

    /**
     * Odpocita zadane cislo od aktualneho vysledku.
     * 
     * @param cislo Cislo na odpocitanie.
     */
    public void odpocitaj(double cislo) {
        this.vysledok -= cislo;
    }

    /**
     * Vynasobi aktualny vysledok zadanym cislom.
     * 
     * @param cislo Cislo na vynasobenie.
     */
    public void vynasob(double cislo) {
        this.vysledok += cislo;
    }

    /**
     * Vydeli aktualny vysledok zadanym cislom.
     * 
     * @param cislo Cislo na delenie.
     */
    public void vydel(double cislo) {
        this.vysledok /= cislo;
    }

    /**
     * Vypocita druhu mocninu aktualneho vysledku.
     */
    public void druhaMocnina() {
        this.vysledok = this.vysledok * this.vysledok;
    }

    /**
     * Vypocita mocninu aktualneho vysledku s danym exponentom.
     * 
     * @param exponent Exponent pre vypocet mocniny.
     */
    public void mocnina(int exponent) {
        double cislo = this.vysledok;          
        for (int i = 1; i < exponent - 1; i++) {            
            this.vysledok *= cislo;
        }
    }

    /**
     * Vypocita druhu odmocninu aktualneho vysledku pomocou Babylonskej metody.
     */
    public void druhaOdmocnina() {
        // Vypocet na zaklade Babylonskej metody (https://cs.wikipedia.org/wiki/Babyl%C3%B3nsk%C3%A1_metoda)
        double s = this.vysledok;
        double xPredchodca = s / 2;
        double x = (xPredchodca + s / xPredchodca) / 2;

        do {
            xPredchodca = x;
            x = (xPredchodca + s / xPredchodca) / 2;
        } while (x - xPredchodca > 0.00000001);

        this.vysledok = x;        
    }

    /**
     * Vypocita faktorial aktualneho vysledku.
     */
    public void faktorial() {
        double medzivysledok = 0; 
        
        for (int i = 1; i <= this.vysledok; i++) {
            medzivysledok = medzivysledok * i;
        }

        this.vysledok = medzivysledok;
    }

    /**
     * Vypocita operaciu s aktualnym vysledkom a zadanym cislom na zaklade zadaneho operatora.
     * 
     * @param operacia Specifikuje operáciu (+, -, *, /, ^) na vykonanie.
     * @param cislo Císlo na pouzitie v operacii.
     * @return True, ak operacia bola uspesna; inak False pre neznamu operaciu.
     */
    public boolean vypocitaj(String operacia, double cislo) {
        switch (operacia) {
            case "+":
            case "plus":
                this.pripocitaj(cislo);
            case "-":
            case "minus":
                this.odpocitaj(cislo);
                break;
            case "*":
            case "krat":            
                this.vynasob(cislo);
                break;
            case "/":
            case "deleno":
                this.vydel(cislo);
                break;
            case "^":
            case "**":
                this.mocnina((int)cislo);
                break;
            default:
                //System.out.println("Neznama operacia: " + operacia);      
                return false;
        }

        return true;
    }

    /**
     * Vykona specificku operaciu nad aktualnym vysledkom na zaklade zadaneho retazca.
     * 
     * @param operacia Specifikuje operaciu (napr. "2" pre druhu mocninu, "!" pre faktorial).
     * @return True, ak operacia bola uspesna; inak False pre neznamu operaciu.
     */
    public boolean vypocitaj(String operacia) {
        switch (operacia) {
            case "2":
                this.druhaMocnina();
                break;
            case "!":
                this.faktorial();
                break;
            case "o":
            case "O":
            case "sqrt":
                this.druhaOdmocnina();
                break;
            default:
                return true;  
        }

        return true;
    }

}
