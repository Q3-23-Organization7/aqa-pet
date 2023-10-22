package homework7.part2;

public class Programmed extends Simple {

    public static void squaresum(double firstnumber, double secondnumber, double pownumber) {
        double result = Math.pow(firstnumber + secondnumber, pownumber);
        System.out.println("squaresum: " + result);
    }

    public static void quadraticequation(double a, double b, double c) {
        System.out.println("equation: " + a + "* x^2 + (" + b + ") * x + (" + c + ") = " + 0);
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("roots of equation: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("equation has only one root: x = " + x);
        }
        else {
            System.out.println("equation has no real roots");
        }
    }
}
