

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FormatovacCislaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FormatovacCislaTest {
    
    private FormatovacCisla formatovacCisla;

    @Before
    public void setUp() {
        formatovacCisla = new FormatovacCisla(3.14159);
    }

    @Test
    public void testGetCisloNaDveDesatinneMiesta() {
        String naformatovaneCislo = formatovacCisla.getCisloNaDveDesatinneMiesta();
        assertEquals("3,14", naformatovaneCislo);
    }

    @Test
    public void testGetCisloPocetDesatinnychMiest0() {
        String naformatovaneCislo = formatovacCisla.getCislo(0); // Test pre 0 desatinné miesta
        assertEquals("3", naformatovaneCislo);
    }
        
    @Test
    public void testGetCisloPocetDesatinnychMiest2() {
        String naformatovaneCislo = formatovacCisla.getCislo(2); // Test pre 2 desatinné miesta
        assertEquals("3,14", naformatovaneCislo);
    }
    
    @Test
    public void testGetCisloPocetDesatinnychMiest3() {
        String naformatovaneCislo = formatovacCisla.getCislo(3); // Test pre 3 desatinné miesta
        assertEquals("3,142", naformatovaneCislo);
    }
    
    @Test
    public void testGetCisloPocetDesatinnychMiest4() {
        String naformatovaneCislo = formatovacCisla.getCislo(4); // Test pre 4 desatinné miesta
        assertEquals("3,1416", naformatovaneCislo);
    }
            
    @Test
    public void testGetCisloPocetDesatinnychMiest10() {
        String naformatovaneCislo = formatovacCisla.getCislo(10); // Test pre 4 desatinné miesta
        assertEquals("3,1415900000", naformatovaneCislo);
    }
    
    @Test
    public void testGetCisloZarovnajVpravo() {
        String naformatovaneCislo = formatovacCisla.getCisloZarovnajVpravo(4, 10); // Test pre zarovnanie doprava na 10 znakov
        assertEquals("    3,1416", naformatovaneCislo);
    }

    @Test
    public void testGetCisloZarovnajVlavo() {
        String naformatovaneCislo = formatovacCisla.getCisloZarovnajVlavo(6, 10); // Test pre zarovnanie doľava na 10 znakov
        assertEquals("3,141590  ", naformatovaneCislo);
    }
}
