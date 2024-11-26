public class Tim {
    private String nazovTimu;
    private Krajina krajinaPovodu;
    
    public Tim(String nazovTimu, Krajina krajinaPovodu) {
        this.nazovTimu = nazovTimu;
        this.krajinaPovodu = krajinaPovodu;
    }
    
    public String getNazovTimu() {
        return this.nazovTimu;
    }
    
    public Krajina getKrajinaPovodu() {
        return this.krajinaPovodu;
    }
}
