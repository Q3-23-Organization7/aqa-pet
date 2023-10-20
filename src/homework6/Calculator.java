package homework6;

public class Calculator {
    public static double firstnumber;
    public static double secondnumber;
    public static double result;

    public void setFirstnumber(double firstnumber) {
        Calculator.firstnumber = firstnumber;
    }

    public double getFirstnumber() {
        return firstnumber;
    }

    public void setSecondnumber(double secondnumber) {
        Calculator.secondnumber = secondnumber;
    }

    public double getSecondnumber() {
        return secondnumber;
    }

    public void setResult(double result) {
        Calculator.result = result;
    }

    public double getResult() {
        return result;
    }
    public static void summing(){
        result = firstnumber + secondnumber;
        System.out.println("summing result :" + result);
    }
    public static void subtraction(){
        result = firstnumber - secondnumber;
        System.out.println("subtraction result :" + result);
    }
    public static void multiplication(){
        result = firstnumber * secondnumber;
        System.out.println("multiplication result :" + result);
    }
    public static void division(){
        result = firstnumber / secondnumber;
        System.out.println("division result :" + result);
    }
    public static void remainderOfdivision(){
        result = firstnumber % secondnumber;
        System.out.println("remainderOfdivision result :" + result);
    }

}
