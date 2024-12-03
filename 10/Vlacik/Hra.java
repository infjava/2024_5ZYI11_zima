import fri.shapesge.Manazer;

public class Hra {
    private final Manazer manazer;
    private final CastVlaku vlak;
    private Smer smer;
    private boolean zvacsi;
    
    public Hra() {
        this.smer = Smer.VLAVO;
        
        this.manazer = new Manazer();
        this.vlak = new CastVlaku(
            new Poloha(150, 150, this.smer),
            TypCastiVlaku.RUSEN
        );
        
        this.zvacsi = false;
        
        this.manazer.spravujObjekt(this);
    }
    
    public void tik() {
        this.vlak.pohniNaNovuPoziciu(this.smer);
        
        if (this.zvacsi) {
            this.vlak.pripojCast(
                new CastVlaku(
                    new Poloha(0, 0, Smer.VLAVO),
                    TypCastiVlaku.VAGON1
                )
            );
            this.zvacsi = false;
        }
    }
    
    public void posunDole() {
        this.smer = Smer.DOLE;
    }
    
    public void posunHore() {
        this.smer = Smer.HORE;
    }
    
    public void posunVlavo() {
        this.smer = Smer.VLAVO;
    }
    
    public void posunVpravo() {
        this.smer = Smer.VPRAVO;
    }
    
    public void aktivuj() {
        this.zvacsi = true;
    }
}
