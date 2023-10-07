package myfirstPck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Kyiv");
        float celsius, kelvin, fahrenheit;
        celsius = 50.0f;
        fahrenheit = (9.0f * celsius + 5.0f * 32.0f) / 5.0f;
        kelvin = celsius + 273.16f;
        System.out.println(celsius + " degrees Celsius: "
                + fahrenheit + " Fahrenheit, "
                + kelvin + " Kelvin");
        float leg1, leg2, areaTriangle;
        leg1 = 5.0f;
        leg2 = 3.0f;
        areaTriangle = (leg1 * leg2) / 2.0f;
        System.out.println("Area of a Triangle: " + areaTriangle + " square meters");
    }
}