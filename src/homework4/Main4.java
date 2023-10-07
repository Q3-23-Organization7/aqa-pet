package homework4;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("CheckOddEven");
        double valueone, valuetwo;
        valueone = 7;
        valuetwo = valueone % 2;
        if(valuetwo == 0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
        System.out.println("BYE");

        System.out.println("PrintMonthInWord");
        int month;
        month = 9;
        if(month == 1) {
            System.out.println("JAN");
        }
        else if(month == 2) {
            System.out.println("FEB");
        }
        else if(month == 3) {
            System.out.println("MAR");
        }
        else if(month == 4) {
            System.out.println("APR");
        }
        else if(month == 5) {
            System.out.println("MAY");
        }
        else if(month == 6) {
            System.out.println("JUNE");
        }
        else if(month == 7) {
            System.out.println("JULY");
        }
        else if(month == 8) {
            System.out.println("AUG");
        }
        else if(month == 9) {
            System.out.println("SEP");
        }
        else if(month == 10) {
            System.out.println("OCT");
        }
        else if(month == 11) {
            System.out.println("NOV");
        }
        else if(month == 12) {
            System.out.println("DEC");
        }
        else  {
            System.out.println("Not a valid month");
        }
        String whichmonth = "10";
        switch (whichmonth) {
            case "1":
                System.out.println("JAN");
                break;
            case "2":
                System.out.println("FEB");
                break;
            case "3":
                System.out.println("MAR");
                break;
            case "4":
                System.out.println("APR");
                break;
            case "5":
                System.out.println("MAY");
                break;
            case "6":
                System.out.println("JUNE");
                break;
            case "7":
                System.out.println("JULY");
                break;
            case "8":
                System.out.println("AUG");
                break;
            case "9":
                System.out.println("SEP");
                break;
            case "10":
                System.out.println("OCT");
                break;
            case "11":
                System.out.println("NOV");
                break;
            case "12":
                System.out.println("DEC");
                break;
            default:
                System.out.println("Not a valid month");
        }
        System.out.println("Absolute value");
        double bigger, smaller;
        bigger = -5.0;
        smaller = 4.0;
        if(Math.abs(bigger) > Math.abs(smaller)) {
            System.out.println(bigger + " has a larger absolute value");
        }
        else {
            System.out.println(smaller + " has a larger absolute value");
        }
        System.out.println("A triangle");
        double sideone, sidetwo, sidethree;
        sideone = 8.50;
        sidetwo = 7.50;
        sidethree = 7.55;
        if(sideone == sidetwo || sideone == sidethree || sidetwo == sidethree) {
            System.out.println("The triangle is isosceles");
        }
        else {
            System.out.println("The triangle is not isosceles");
        }
        System.out.println("Strings");
        String averageOne = "Kateryna";
        int position1 = averageOne.length()/2 - 1;
        int position2 = averageOne.length()/2 + 1;
        System.out.println(averageOne.substring(position1, position2));
    }
}

