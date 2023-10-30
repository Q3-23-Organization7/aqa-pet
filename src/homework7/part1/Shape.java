package homework7.part1;

import java.util.Objects;

public class Shape {
    protected String color;

    protected void calculateArea(){
        System.out.println("calculateArea");
    }

    protected void calculatePerimeter(){
        System.out.println("calculatePerimeter");
    }

    protected void paint(){
        System.out.println("paint");
        System.out.println("color: " + color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
