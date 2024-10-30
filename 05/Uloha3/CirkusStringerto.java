
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
        return this.retazec.repeat(pocet);
    }
    
    public boolean jePalindrom() {
        for (int i = 0; i < this.retazec.length(); i++) {
            int iOdKonca = this.retazec.length() - 1 - i;
            char znakOdZaciatku = Character.toLowerCase(this.retazec.charAt(i));
            char znakOdKonca = Character.toLowerCase(this.retazec.charAt(iOdKonca));
            
            if (znakOdZaciatku != znakOdKonca) {
                return false;
            }
        }
        
        return true;
    }
    
    public void posuvaj(int pocetKrokov) {
        for (int i = 0; i < pocetKrokov; i++) {
            System.out.format("|%" + (i + this.retazec.length()) + "s|%n", this.retazec);
        }
    }       
       
}
