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
        this.segmentG = new Segment(5, 55, false);
    }
    
    public void zmenCislicu(int cislica) {
        switch (cislica) {
            case 0:
                this.segmentA.zapni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.zapni();
                this.segmentE.zapni();
                this.segmentF.zapni();
                this.segmentG.vypni();
                break;
            case 1:
                this.segmentA.vypni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.vypni();
                this.segmentE.vypni();
                this.segmentF.vypni();
                this.segmentG.vypni();
                break;
            case 2:
                this.segmentA.zapni();
                this.segmentB.zapni();
                this.segmentC.vypni();
                this.segmentD.zapni();
                this.segmentE.zapni();
                this.segmentF.vypni();
                this.segmentG.zapni();
                break;
            case 3:
                this.segmentA.zapni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.zapni();
                this.segmentE.vypni();
                this.segmentF.vypni();
                this.segmentG.zapni();
                break;
            case 4:
                this.segmentA.vypni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.vypni();
                this.segmentE.vypni();
                this.segmentF.zapni();
                this.segmentG.zapni();
                break;
            case 5:
                this.segmentA.zapni();
                this.segmentB.vypni();
                this.segmentC.zapni();
                this.segmentD.zapni();
                this.segmentE.vypni();
                this.segmentF.zapni();
                this.segmentG.zapni();
                break;
            case 6:
                this.segmentA.zapni();
                this.segmentB.vypni();
                this.segmentC.zapni();
                this.segmentD.zapni();
                this.segmentE.zapni();
                this.segmentF.zapni();
                this.segmentG.zapni();
                break;
            case 7:
                this.segmentA.zapni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.vypni();
                this.segmentE.vypni();
                this.segmentF.vypni();
                this.segmentG.vypni();
                break;
            case 8:
                this.segmentA.zapni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.zapni();
                this.segmentE.zapni();
                this.segmentF.zapni();
                this.segmentG.zapni();
                break;
            case 9:
                this.segmentA.zapni();
                this.segmentB.zapni();
                this.segmentC.zapni();
                this.segmentD.zapni();
                this.segmentE.vypni();
                this.segmentF.zapni();
                this.segmentG.zapni();
                break;
        }
    }
}
