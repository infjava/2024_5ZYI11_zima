public enum Smer {
    HORE,
    DOLE,
    VPRAVO,
    VLAVO;
    
    public int getVektorX() {
        switch (this) {
            case HORE:
                return 0;
            case DOLE:
                return 0;
            case VPRAVO:
                return 1;
            case VLAVO:
                return -1;
            default:
                return -100;
        }
    }
}
