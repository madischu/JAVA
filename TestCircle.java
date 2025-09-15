import java.util.Date;

abstract class GeometricObject {
    private Date dateCreated;

    public GeometricObject() {
        dateCreated = new Date();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}

class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle other = (Circle) obj;
        return Double.compare(this.radius, other.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radius);
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
            " and the radius is " + radius);
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7);
        Circle c3 = new Circle(5);

        c1.printCircle();
        c2.printCircle();
        c3.printCircle();

        System.out.println("\nComparisons:");
        System.out.println("c1.compareTo(c2): " + c1.compareTo(c2)); // -1
        System.out.println("c2.compareTo(c1): " + c2.compareTo(c1)); // 1
        System.out.println("c1.compareTo(c3): " + c1.compareTo(c3)); // 0

        System.out.println("\nEquality:");
        System.out.println("c1.equals(c2): " + c1.equals(c2)); // false
        System.out.println("c1.equals(c3): " + c1.equals(c3)); // true
    }
}
