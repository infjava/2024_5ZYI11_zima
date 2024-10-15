public class DvojcifernyDisplej {
    private Displej desiatky;
    private Displej jednotky;
    
    public DvojcifernyDisplej(int x, int y) {
        this.desiatky = new Displej(x, y);
        this.jednotky = new Displej(x + 65, y);
    }
    
    public void zmenCislo(int cislo) {
        int hodnotaDesiatok = cislo / 10;
        int hodnotaJednotiek = cislo % 10;
        
        this.desiatky.zmenCislicu(hodnotaDesiatok);
        this.jednotky.zmenCislicu(hodnotaJednotiek);
    }
}
