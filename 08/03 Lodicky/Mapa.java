import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Mapa {
    private Stvorcek[][] stvorceky;
    
    public Mapa(String nazovMapy) throws IOException {
        Scanner mapa = new Scanner(new File(nazovMapy + ".txt"));
        
        int sirka = mapa.nextInt();
        int vyska = mapa.nextInt();
        int pocetLodiciek = mapa.nextInt();
        
        this.stvorceky = new Stvorcek[vyska][sirka];
        
        Lodka[] lodky = new Lodka[pocetLodiciek];
        for (int i = 0; i < pocetLodiciek; i++) {
            lodky[i] = new Lodka();
        }
        
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                this.stvorceky[y][x] = new Stvorcek(x, y);
                
                int policko = mapa.nextInt();
                
                if (policko > 0) {
                    Lodka lodka = lodky[policko - 1];
                    this.stvorceky[y][x].polozLodku(lodka);
                }
            }
        }
        
        mapa.close();
    }
}
