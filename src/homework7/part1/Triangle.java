package homework7.part1;

public class Triangle extends Shape {
    private double x1 = 0;
    private double x2 = 2;
    private double x3 = 4;
    private double x4 = 2;
    private double y1 = 0;
    private double y2 = 2;
    private double y3 = 0;
    private double y4 = 0;

    String color = "yellow";


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
        System.out.println("paint triangle: " + "color: " + color);
        System.out.println("triangle coordinates: " + "[" + getX1() + "," + getY1() + "]" + "[" + getX2() + "," + getY2() + "]" +
                "[" + getX3() + "," + getY3() + "]" + "[" + getX4() + "," + getY4() + "]");
    }

    @Override
    protected void calculateArea() {
        double area = Math.abs((getX1() - getX3()) * (getY2() - getY4())/2);
        System.out.println("Area of triangle: " + area);
    }

    @Override
    protected void calculatePerimeter(){
        double a = Math.abs(getX1() - getX3());
        double b = Math.sqrt(Math.pow(a/2, 2) + Math.pow(a/2, 2));
        double perimeter = a + 2 * b;
        System.out.println("Perimeter of triangle: " + perimeter);
    }

}
