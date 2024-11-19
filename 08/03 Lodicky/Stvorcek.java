import fri.shapesge.Stvorec;

public class Stvorcek {
    private boolean trafena;
    private boolean lodka;
    private Stvorec stvorec;
    
    public Stvorcek(int x, int y) {
        this.trafena = false;
        this.lodka = false;
        
        this.stvorec = new Stvorec(x * 30, y * 30);
        this.stvorec.zmenStranu(30);
        this.stvorec.zmenFarbu("blue");
        this.stvorec.zobraz();
    }
}
