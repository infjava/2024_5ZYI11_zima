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
    
    public void vypisTabulku() {
        System.out.format("%20s", "");
        for (Tim tim : this.timy) {
            System.out.format("%20s", tim.getNazovTimu());
        }
        System.out.println();
        
        for (int domaci = 0; domaci < this.timy.length; domaci++) {
            System.out.format("%20s", this.timy[domaci].getNazovTimu());
            
            for (Vysledok vysledok : this.tabulka[domaci]) {
                System.out.format("%20s", vysledok);
            }
            
            System.out.println();
        }
        
        if (this.uzavrety) {
            System.out.println("Turnaj bol uzavrety!");
            
            int[] body = new int[this.timy.length];
            
            for (int domaci = 0; domaci < this.timy.length; domaci++) {
                for (int hostia = 0; hostia < this.timy.length; hostia++) {
                    body[domaci] += this.tabulka[domaci][hostia].getBodyDomaci();
                    body[hostia] += this.tabulka[domaci][hostia].getBodyHostia();
                }
            }
            
            for (int tim = 0; tim < this.timy.length; tim++) {
                System.out.format("%20s %5d%n", this.timy[tim].getNazovTimu(), body[tim]);
            }
        }
    }
}
