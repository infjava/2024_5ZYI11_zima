import fri.shapesge.Manazer;
import java.io.IOException;

public class Ovladanie {
    private Mapa mapa;
    private Manazer manazer;
    
    public Ovladanie(String nazovMapy) throws IOException {
        this.mapa = new Mapa(nazovMapy);
        this.manazer = new Manazer();
        this.manazer.spravujObjekt(this);
    }
    
    public void vyberSuradnice(int x, int y) {
        if (this.mapa.jePolicko(x / 30, y / 30)) {
            this.mapa.zasiahni(x / 30, y / 30);
        }
    }
}
