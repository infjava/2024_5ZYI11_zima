public enum Vysledok {
    VYHRA(3, 0),
    PREHRA(0, 3),
    REMIZA(1, 1),
    NEHRA_SA(0, 0),
    NEDOHRANE(0, 0);
    
    private int bodyDomaci;
    private int bodyHostia;
    
    Vysledok(int bodyDomaci, int bodyHostia) {
        this.bodyDomaci = bodyDomaci;
        this.bodyHostia = bodyHostia;
    }
    
    public int getBodyDomaci() {
        return this.bodyDomaci;
    }
    
    public int getBodyHostia() {
        return this.bodyHostia;
    }
}
