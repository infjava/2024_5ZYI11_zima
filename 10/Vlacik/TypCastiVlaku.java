import fri.shapesge.DataObrazku;

public enum TypCastiVlaku {
    RUSEN("vlak"),
    VAGON1("vagon01"),
    VAGON2("vagon02"),
    VAGON3("vagon03");
    
    private DataObrazku obrazok;
    
    TypCastiVlaku(String nazovObrazka) {
        this.obrazok = new DataObrazku(String.format("pics/%s.png", nazovObrazka));
    }
    
    public DataObrazku getObrazok() {
        return this.obrazok;
    }
}
