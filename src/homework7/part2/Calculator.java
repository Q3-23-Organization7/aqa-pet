package homework7.part2;

public class Calculator {
    public static void main(String[] args) {
        Simple simple = new Simple();
        simple.summing(3,7);
        Engineering engineering = new Engineering();
        engineering.division(4,2);
        engineering.sinx(30);
        engineering.cosx(60);
        Programmed programmed = new Programmed();
        programmed.multiplication(0,5);
        programmed.squaresum(2,1, 2);
        programmed.quadraticequation(2,-4,2);
    }
}
