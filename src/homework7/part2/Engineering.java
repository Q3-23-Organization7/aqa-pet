package homework7.part2;

public class Engineering extends Simple {

    public static void sinx (int firstnumber){
        double result = Math.sin(Math.PI * firstnumber / 180);
        System.out.println("sin " + firstnumber + " = " + result);
    }

    public static void cosx (int firstnumber){
        double result = Math.cos(Math.PI * firstnumber / 180);
        System.out.println("cos " + firstnumber + " = " + result);
    }
}
