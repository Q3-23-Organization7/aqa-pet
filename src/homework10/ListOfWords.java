package homework10;

import java.util.*;

public class ListOfWords {

    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>();
        wordsList.add("writer");
        wordsList.add("cat");
        wordsList.add("actor");
        wordsList.add("cat");
        wordsList.add("doctor");
        wordsList.add("actor");
        wordsList.add("world");
        wordsList.add("dog");
        wordsList.add("cat");

        HashMap<String, Integer> wordsMap = createMap(wordsList);

        frequencyCount(wordsList, wordsMap);

        printUniqueWords(wordsMap);

        printFrequency(wordsMap);
    }

    public static HashMap<String, Integer> createMap(List<String> wordsList) {
        return new HashMap<>();
    }

    public static void frequencyCount(List<String> wordsList, HashMap<String, Integer> wordsMap) {
        for (String word : wordsList) {
            if (wordsMap.containsKey(word)) {
                int frequency = wordsMap.get(word);
                wordsMap.put(word, frequency + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
    }

    public static void printUniqueWords(HashMap<String, Integer> wordsMap) {
        System.out.println("UniqueWords:");
        for (String word : wordsMap.keySet()) {
            int frequency = wordsMap.get(word);
            if (frequency == 1) {
                System.out.println(word);
            }
        }
    }

    public static void printFrequency(HashMap<String, Integer> wordsMap) {
        System.out.println("Frequency: " + wordsMap);
    }

}
