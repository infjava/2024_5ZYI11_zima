public class Displej {
    private Obdlznik pozadie;
    private Segment segmentA;
    private Segment segmentB;
    private Segment segmentC;
    private Segment segmentD;
    private Segment segmentE;
    private Segment segmentF;
    private Segment segmentG;
    
    public Displej() {
        this.pozadie = new Obdlznik();
        this.pozadie.posunVodorovne(-60);
        this.pozadie.posunZvisle(-50);
        this.pozadie.zmenFarbu("black");
        this.pozadie.zmenStrany(60, 115);
        this.pozadie.zobraz();
        
        this.segmentA = new Segment(5, 0, false);
        this.segmentB = new Segment(55, 5, true);
        this.segmentC = new Segment(55, 60, true);
        this.segmentD = new Segment(5, 110, false);
        this.segmentE = new Segment(0, 60, true);
        this.segmentF = new Segment(0, 5, true);
        this.segmentD = new Segment(5, 55, false);
    }
    
    public void zmenCislicu(int cislica) {
        
    }
}
