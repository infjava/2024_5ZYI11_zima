

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
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        
    }
    
    @Test
    public void spocitaj5a3() {
        Kalkulacka kalkulacka = new Kalkulacka();
        kalkulacka.zadajCislo(5);
        kalkulacka.pripocitaj(3);
        Assert.assertEquals(8, kalkulacka.getVysledok(), 0.000001);
    }
    
    @Test
    public void spocitaj5a0() {
        Kalkulacka kalkulacka = new Kalkulacka();
        kalkulacka.zadajCislo(5);
        kalkulacka.pripocitaj(0);
        Assert.assertEquals(5, kalkulacka.getVysledok(), 0.000001);
    }

    @Test
    public void spocitaj5aMinus3() {
        Kalkulacka kalkulac1 = new Kalkulacka();
        kalkulac1.zadajCislo(5);
        kalkulac1.pripocitaj(-3);
        Assert.assertEquals(2, kalkulac1.getVysledok(), 0.00001);
    }
}

