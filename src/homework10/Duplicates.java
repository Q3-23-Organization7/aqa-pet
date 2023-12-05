package homework10;

import java.util.*;

public class Duplicates {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        makeList(numbers);

        print(numbers);

        Set<Integer> uniqueNumbers = createUniqueList(numbers);

        print(uniqueNumbers);

        numberOfDeletions(numbers, uniqueNumbers);

    }

    public static void makeList(List<Integer> numbers) {

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(41) - 20;
            numbers.add(randomNumber);
        }

    }

    public static void print(Collection<Integer> numbers) {
        System.out.println(numbers);
    }

    public static Set<Integer> createUniqueList(List<Integer> numbers) {
        return new HashSet<>(numbers);
    }


    public static void numberOfDeletions(List<Integer> numbers, Set<Integer> uniqueNumbers) {
        int deletedCount = numbers.size() - uniqueNumbers.size();
        System.out.println("Deleted numbers: " + deletedCount);
    }

}