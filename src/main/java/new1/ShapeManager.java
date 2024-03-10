package new1;

import java.util.HashSet;
import java.util.Set;

public class ShapeManager {
    private final Set<Shape> shapes = new HashSet<>();

    public void addShape(Shape shape) {
        if (!shapes.add(shape)) {
            System.out.println("Shape already exists and was not added.");
        }
    }

    public double totalArea() {
        return shapes.stream().mapToDouble(Shape::area).sum();
    }

    public double totalPerimeter() {
        return shapes.stream().mapToDouble(Shape::perimeter).sum();
    }
}
