package com.java.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException {


        Map<String, Integer> words = new HashMap<String, Integer>();

        // Provide File Name

        getWords("/Users/harinathbandi/Desktop/Sample.rtf", words);
        int max = getMaxOccurrence(words);
        for (Entry<String, Integer> word : words.entrySet()) {
            if (word.getValue() == max) {
                System.out.println(word);
            }
        }

    }

    // Reading the words from the file and mapping key value pair
    static void getWords(String fileName, Map<String, Integer> words) throws FileNotFoundException {
        Scanner file = new Scanner(new File(fileName));

// Reading the file till EOF

        while (file.hasNext()) {

            String word = file.next();
            Integer count = words.get(word);
            if (count != null) {
                count++;
            } else
                count = 1;
            words.put(word, count);
        }
        file.close();
    }
// To get the MaxOccurrence of words

    static int getMaxOccurrence(Map<String, Integer> words) {

        int max = 1;

        for (Entry<String, Integer> word : words.entrySet()) {

            if (word.getValue() > max) {
                max = word.getValue();
            }
        }

        return max;
    }
}
