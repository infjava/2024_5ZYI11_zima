
/**
 * Write a description of class CirkusStringerto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CirkusStringerto {
    private String retazec;

    public CirkusStringerto(String retazec) {
        this.retazec = retazec;
    }
    
    public String getRetazec() {
        return this.retazec;
    }   

    public void setRetazec(String novyRetazec) {
        this.retazec = novyRetazec;
    }
    
    public String opakujRetazec(int pocet) {
        StringBuilder vysledok = new StringBuilder();
        
        for (int i = 0; i < pocet; i++) {
            vysledok.append(this.retazec);
        }
        
        return vysledok.toString();
    }
    
    public boolean jePalindrom() {
        return true;
    }
    
    public void posuvaj(int pocetKrokov) {
        
    }       
       
}
