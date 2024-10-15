public class Segment {
    private Obdlznik segment;
    
    public Segment(int x, int y, boolean jeZvislo) {
        this.segment = new Obdlznik();
        this.segment.zmenFarbu("red");
        this.segment.posunVodorovne(x - 60);
        this.segment.posunZvisle(y - 50);
        
        if (jeZvislo) {
            this.segment.zmenStrany(5, 50);
        } else {
            this.segment.zmenStrany(50, 5);
        }
        
        this.segment.zobraz();
    }
    
    public void zapni() {
        this.segment.zmenFarbu("yellow");
    }
    
    public void vypni() {
        this.segment.zmenFarbu("red");
    }
}
