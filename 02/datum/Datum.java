public class Datum {
    private int den;
    private int mesiac;
    private int rok;
    
    public Datum(int den, int mesiac, int rok) {
        this.den = den;
        this.mesiac = mesiac;
        this.rok = rok;
    }
    
    public int getDen() {
        return this.den;
    }
    
    public int getMesiac() {
        return this.mesiac;
    }
    
    public int getRok() {
        return this.rok;
    }
    
    public String getDatum() {
        return this.den + ". " + this.mesiac + ". " + this.rok;
    }
}
