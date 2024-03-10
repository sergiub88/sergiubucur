package new1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeManagerTest {
    @Test
    public void testShapeAdditionAndTotals() {
        ShapeManager manager = new ShapeManager();
        manager.addShape(new Circle(1));
        manager.addShape(new Square(1));
        assertEquals(4.141592653589793, manager.totalArea(), 0.01);
        assertEquals(10.28, manager.totalPerimeter(), 0.01);
    }
}