package homework6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testCmToMm() {
        assertEquals(100.0, Main.convert(10, "cm", "mm"), 0.001, "10 cm ar trebui să fie 100 mm");
    }

    @Test
    void testMToMm() {
        assertEquals(1000.0, Main.convert(1, "m", "mm"), 0.001, "1 m ar trebui să fie 1000 mm");
    }

    @Test
    void testKmToM() {
        assertEquals(1000.0, Main.convert(1, "km", "m"), 0.001, "1 km ar trebui să fie 1000 m");
    }

    @Test
    void testMmToKm() {
        assertEquals(0.001, Main.convert(1000, "mm", "km"), 0.001, "1000 mm ar trebui să fie 0.001 km");
    }

    @Test
    void testDmToCm() {
        assertEquals(10.0, Main.convert(1, "dm", "cm"), 0.001, "1 dm ar trebui să fie 10 cm");
    }

    @Test
    void testNegativeValue() {
        assertEquals(-1000.0, Main.convert(-1, "m", "mm"), 0.001, "-1 m ar trebui să fie -1000 mm");
    }

    @Test
    void testInvalidUnitConversion() {
        assertEquals(0.0, Main.convert(1, "x", "y"), 0.001, "Conversie cu unități necunoscute ar trebui să returneze 0");
    }

    @Test
    void testConversionWithZero() {
        assertEquals(0.0, Main.convert(0, "m", "mm"), 0.001, "0 m ar trebui să fie 0 mm");
    }
}