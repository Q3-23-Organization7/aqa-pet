package homework6;

import homework6.Calculator;
public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.setFirstnumber(5);
        calculator.setSecondnumber(2);
        Calculator.summing();
        Calculator.subtraction();
        Calculator.multiplication();
        Calculator.division();
        Calculator.remainderOfdivision();
    }
}
