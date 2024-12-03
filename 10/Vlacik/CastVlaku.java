import fri.shapesge.Obrazok;

public class CastVlaku {
    private static final int VELKOST_BUNKY = 35;
    
    private Poloha poloha;
    private final Obrazok obrazok;
    private CastVlaku dalsiaCast;
    
    public CastVlaku(Poloha poloha, TypCastiVlaku typ) {
        this.poloha = poloha;
        this.obrazok = new Obrazok(typ.getObrazok(), poloha.getX(), poloha.getY());
        this.obrazok.zmenUhol(poloha.getSmer().getUhol());
        this.obrazok.zobraz();
        this.dalsiaCast = null;
    }
    
    public Poloha getPoloha() {
        return this.poloha;
    }
    
    private void setPoloha(Poloha poloha) {
        this.poloha = poloha;
        
        this.obrazok.zmenPolohu(poloha.getX(), poloha.getY());
        this.obrazok.zmenUhol(poloha.getSmer().getUhol());
    }
    
    public void pripojCast(CastVlaku novaDalsiaCast) {
        if (this.dalsiaCast != null) {
            this.dalsiaCast.pripojCast(novaDalsiaCast);
        } else {
            this.dalsiaCast = novaDalsiaCast;
            this.dalsiaCast.setPoloha(this.poloha.getPosunutaPoloha(-CastVlaku.VELKOST_BUNKY, this.poloha.getSmer()));
        }
    }
    
    public void pohniNaNovuPoziciu(Smer smer) {
        this.pohniNaNovuPoziciu(this.poloha.getPosunutaPoloha(CastVlaku.VELKOST_BUNKY, smer));
    }
    
    private void pohniNaNovuPoziciu(Poloha poloha) {
        if (this.dalsiaCast != null) {
            this.dalsiaCast.pohniNaNovuPoziciu(this.poloha);
        }
        
        this.setPoloha(poloha);
    }
}
