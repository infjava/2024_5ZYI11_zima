import fri.shapesge.Stvorec;

public class Stvorcek {
    private boolean trafena;
    private Lodka lodka;
    private Stvorec stvorec;
    
    public Stvorcek(int x, int y) {
        this.trafena = false;
        this.lodka = null;
        
        this.stvorec = new Stvorec(x * 30, y * 30);
        this.stvorec.zmenStranu(29);
        this.stvorec.zmenFarbu("blue");
        this.stvorec.zobraz();
    }
    
    public void zasiahni() {
        this.trafena = true;
        if (this.lodka == null) {
            this.stvorec.zmenFarbu("#B2BEB5");
        } else {
            this.stvorec.zmenFarbu("red");
            
            this.lodka.skontrolujZnicenie();
        }
    }
    
    public void znic() {
        this.stvorec.zmenFarbu("black");
    }
    
    public boolean jeTrafeny() {
        return this.trafena;
    }
    
    public void polozLodku(Lodka lodka) {
        this.lodka = lodka;
        this.lodka.priradStvorcek(this);
    }
}
