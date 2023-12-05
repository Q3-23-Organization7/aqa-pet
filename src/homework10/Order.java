package homework10;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Order {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);

        print(numbers);

        int x = 3;

        printX(x);

        swapCollection(numbers, x);

        print(numbers);

    }

    public static void print(List<Integer> numbers) {
        System.out.println(numbers);
    }

    public static void swapCollection(List<Integer> numbers, int x) {
        for (int i = 0, j = numbers.size() - 1; i < j; i++, j--) {
            while (numbers.get(i) < x) {
                i++;
            }

            while (numbers.get(j) >= x) {
                j--;
            }

            if (i < j) {
                Collections.swap(numbers, i, j);
            }
        }
    }

    public static void printX(int x) {
        System.out.println("collection relatively " + x + ":");
    }

}



