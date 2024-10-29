

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KalkulackaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KalkulackaTest {
    private Kalkulacka kalkulacka;
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        this.kalkulacka = new Kalkulacka();
    }
    
    @Test
    public void spocitaj5a3() {
        kalkulacka.zadajCislo(5);
        kalkulacka.pripocitaj(3);
        Assert.assertEquals(8, kalkulacka.getVysledok(), 0.000001);
    }
    
    @Test
    public void spocitaj5a0() {
        kalkulacka.zadajCislo(5);
        kalkulacka.pripocitaj(0);
        Assert.assertEquals(5, kalkulacka.getVysledok(), 0.000001);
    }

    @Test
    public void spocitaj5aMinus3() {
        kalkulacka.zadajCislo(5);
        kalkulacka.pripocitaj(-3);
        Assert.assertEquals(2, kalkulacka.getVysledok(), 0.00001);
    }
}

