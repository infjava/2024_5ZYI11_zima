import java.util.ArrayList;

public class Lodka {
    private ArrayList<Stvorcek> stvorcekyLodky;
    
    public Lodka() {
        this.stvorcekyLodky = new ArrayList<Stvorcek>();
    }
    
    public void priradStvorcek(Stvorcek stvorcek) {
        this.stvorcekyLodky.add(stvorcek);
    }
    
    public void skontrolujZnicenie() {
        for (Stvorcek stvorcek : this.stvorcekyLodky) {
            if (!stvorcek.jeTrafeny()) {
                return;
            }
        }
        
        for (Stvorcek stvorcek : this.stvorcekyLodky) {
            stvorcek.znic();
        }
    }
}
