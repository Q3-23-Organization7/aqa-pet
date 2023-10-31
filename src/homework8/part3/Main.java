package homework8.part3;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        Shape[] shapes = {circle, rectangle, triangle};
        for (Shape model : shapes){

           model.paint();

           model.calculateArea();

           model.calculatePerimeter();

        }
        Shape circle1 = new Circle();

        System.out.println(circle.toString());

        System.out.println(circle.equals(circle1));

    }
}
