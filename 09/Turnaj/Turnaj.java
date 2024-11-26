public class Turnaj {
    private Tim[] timy;
    private Vysledok[][] tabulka;
    private boolean uzavrety;
    
    public Turnaj(String[] timy, ZoznamTimov liga) {
        this.timy = new Tim[timy.length];
        
        for (int i = 0; i < timy.length; i++) {
            this.timy[i] = liga.getTim(timy[i]);
        }
        
        this.tabulka = new Vysledok[timy.length][timy.length];
        
        for (int domaci = 0; domaci < timy.length; domaci++) {
            for (int hostia = 0; hostia < timy.length; hostia++) {
                if (domaci == hostia) {
                    this.tabulka[domaci][hostia] = Vysledok.NEHRA_SA;
                } else {
                    this.tabulka[domaci][hostia] = Vysledok.NEDOHRANE;
                }
            }
        }
        
        this.uzavrety = false;
    }
    
    public void uzavriTurnaj() {
        this.uzavrety = true;
    }
    
    public boolean vlozVysledokDoTabulky(Vysledok vkladany, int domaci, int hostia) {
        if (this.uzavrety) {
            return false;
        }
        
        if (this.tabulka[domaci][hostia] != Vysledok.NEDOHRANE) {
            return false;
        }
        
        this.tabulka[domaci][hostia] = vkladany;
        return true;
    }
}
