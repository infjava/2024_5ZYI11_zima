

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CirkusStringertoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CirkusStringertoTest {
    private CirkusStringerto cirkus;

    @Before
    public void setUp() {
        cirkus = new CirkusStringerto("radar");
    }

    @Test
    public void testGetRetazec() {
        assertEquals("radar", cirkus.getRetazec());
    } 
    
    @Test
    public void testSetRetazec() {
        cirkus.setRetazec("test");
        assertEquals("test", cirkus.getRetazec());
    }

    @Test
    public void testOpakujRetazec() {
        String vypis = cirkus.opakujRetazec(3);
        assertEquals("radarradarradar", vypis);
    }

    @Test
    public void testJePalindrom() {
        assertTrue(cirkus.jePalindrom());
        
        cirkus.setRetazec("ahoj");
        assertFalse(cirkus.jePalindrom());
    }

}
