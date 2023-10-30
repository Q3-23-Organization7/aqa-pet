package homework7.part1;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        Shape[] shapes = new Shape[]{circle, rectangle, triangle};
        int lengh = shapes.length;
        for (int i = 0; i < lengh; i++){
           shapes[i].paint();
           shapes[i].calculateArea();
           shapes[i].calculatePerimeter();
        }
        Shape circle1 = new Circle();
        System.out.println(circle.toString());
        System.out.println(circle.equals(circle1));
    }
}
