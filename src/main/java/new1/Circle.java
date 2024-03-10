package new1;

import java.util.HashSet;
import java.util.Set;
import java.util.Objects;


public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double area() {
        return Math.PI * radius * radius;
    }


    public double perimeter() {
        return 2 * Math.PI * radius;
    }



    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }


    public int hashCode() {
        return Objects.hash(radius);
    }
}
