package homework8.part3;

import java.util.Objects;

public class Circle extends Shape {
    private double x1 = 4;
    private double x2 = 2;
    private double x3 = 4;
    private double x4 = 6;
    private double y1 = 3;
    private double y2 = 5;
    private double y3 = 7;
    private double y4 = 5;

    String color = "blue";

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public void setY4(double y4) {
        this.y4 = y4;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }

    public double getX4() {
        return x4;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public double getY3() {
        return y3;
    }

    public double getY4() {
        return y4;
    }

    @Override
    protected void paint() {
        System.out.println("paint circle: " + "color: " + color);
        System.out.println("circle coordinates: "+ "[" + getX1()+","+ getY1() + "]" + "[" + getX2()+","+ getY2() + "]" +
                "[" + getX3()+","+ getY3() + "]" + "[" + getX4()+","+ getY4() + "]");
    }

    @Override
    protected void calculateArea() {
        double area = Math.abs(Math.PI * Math.pow((getY2() - getY1()), 2));
        System.out.println("Area of circle: " + area);
    }

    @Override
    protected void calculatePerimeter(){
        double perimeter = 2 * Math.PI * Math.abs(getY2() - getY1());
        System.out.println("Perimeter of circle: " + perimeter);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", x3=" + x3 +
                ", x4=" + x4 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", y3=" + y3 +
                ", y4=" + y4 +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        super.equals(o);
        return Double.compare(x1, circle.x1) == 0
                && Double.compare(x2, circle.x2) == 0
                && Double.compare(y1, circle.y1) == 0
                && Double.compare(y2, circle.y2) == 0
                && Objects.equals(color, circle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, x2, y1, y2, color);
    }
}
