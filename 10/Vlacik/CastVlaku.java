import fri.shapesge.Obrazok;

public class CastVlaku {
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
            this.dalsiaCast.setPoloha(this.poloha.getPosunutaPoloha(-35, this.poloha.getSmer()));
        }
    }
}
