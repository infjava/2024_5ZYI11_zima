public class Ruka {
    private Obrazok obrazokRuky;
    
    public Ruka(int x, int y) {
        this.obrazokRuky = new Obrazok("pics/rock.png");
        this.obrazokRuky.zmenPolohu(x, y);
        this.obrazokRuky.zobraz();
    }
    
    public void setGesto(int cislo) {
        
    }
    
    public void predchadzajuca() {
        
    }
    
    public void nasledujuca() {
        
    }
}
