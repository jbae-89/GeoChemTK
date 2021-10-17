package gctk.geochemtk;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeoChemTKTest {

    /**
     * These tests are not production code.
     */

    @Test
    public void testOne() {
        assertTrue(true);
    }

    @Test
    public void testTwo() {
        GeoChemTK gctk = new GeoChemTK();
        assertNotNull(gctk);
    }

    @Test
    public void testThree() {
        GeoChemTK gctk = new GeoChemTK();
        assertEquals(GeoChemTK.VERSION, "0.0.1");
    }

}