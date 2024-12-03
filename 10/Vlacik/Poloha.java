public class Poloha {
    private final int x;
    private final int y;
    private final Smer smer;
    
    public Poloha(int x, int y, Smer smer) {
        this.x = x;
        this.y = y;
        this.smer = smer;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public Smer getSmer() {
        return this.smer;
    }
    
    public Poloha getPosunutaPoloha(int krok, Smer smer) {
        int noveX = this.x + krok * smer.getVektorX();
        int noveY = this.y + krok * smer.getVektorY();
        
        return new Poloha(noveX, noveY, smer);
    }
}
