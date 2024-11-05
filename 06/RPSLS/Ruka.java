public class Ruka {
    private Obrazok obrazokRuky;
    private int aktualneGesto;
    
    public Ruka(int x, int y) {
        this.obrazokRuky = new Obrazok("pics/rock.png");
        this.obrazokRuky.zmenPolohu(x, y);
        this.obrazokRuky.zobraz();
        
        this.aktualneGesto = 0;
    }
    
    public int getGesto() {
        return this.aktualneGesto;
    }
    
    public void setGesto(int cislo) {
        switch (cislo) {
            case 0:
                this.obrazokRuky.zmenObrazok("pics/rock.png");
                break;
            case 1:
                this.obrazokRuky.zmenObrazok("pics/paper.png");
                break;
            case 2:
                this.obrazokRuky.zmenObrazok("pics/scissors.png");
                break;
            case 3:
                this.obrazokRuky.zmenObrazok("pics/spock.png");
                break;
            case 4:
                this.obrazokRuky.zmenObrazok("pics/lizard.png");
                break;
        }
        
        this.aktualneGesto = cislo;
    }
    
    public void predchadzajuca() {
        this.setGesto((this.aktualneGesto + 4) % 5);
    }
    
    public void nasledujuca() {
        this.setGesto((this.aktualneGesto + 1) % 5);
    }
}
