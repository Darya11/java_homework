package Task_19;

import java.util.HashMap;
import java.util.Map;

public class stringText {
    private String str;

    public stringText(String str) {
        this.str = str;
    }

    public void mostFrequentLetter() {
        str = str.toLowerCase();
        Map<Character, Integer> string = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!string.containsKey(c)) {
                    string.put(c, 1);
                } else {
                    string.put(c, string.get(c) + 1);
                }
            }
        }
        System.out.print("Usage frequency of letters: ");
        System.out.println(string.toString());
    }

    public void findLetterTense() {
        str = str.toLowerCase();
        String[] a = str.split("\\.");
        char[] vow = {'a', 'e', 'i', 'o', 'u', 'y'};
        char[] cons = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
        int tenses = 0;
        int vowel = 0;
        int consonant = 0;
        for (String tense : a
                ) {
            for (char c : tense.toCharArray()) {
                if (contains(vow, c)) {
                    vowel++;
                }
                if (contains(cons, c)) {
                    consonant++;
                }
            }
            System.out.println("Tense number [" + ++tenses + "] has next number of vowels: " + vowel + " and consonants: " + consonant);
            vowel = 0;
            consonant = 0;

        }
    }

    private boolean contains(char[] array, char value) {
        for (char i : array)
            if (value == i)
                return true;
        return false;
    }

    public void countPunctuation() {
        Map<Character, Integer> string = new HashMap<>();
        for (char symbol : str.toCharArray()) {
            if (!Character.isLetter(symbol) & (!(symbol == ' '))) {
                if (!string.containsKey(symbol)) {
                    string.put(symbol, 1);
                } else {
                    string.put(symbol, string.get(symbol) + 1);
                }
            }
        }
        System.out.print("Punctuation usage: ");
        System.out.println(string.toString());
    }

    public String[] findLength() {
        str = str.replace(",", "");
        String[] a = str.split(" ");
        String maxWord = "";
        String minWord = "";
        int min = 100;
        int max = 0;
        int length;
        for (String word : a
                ) {
            length = word.length();
            if (length > max) {
                max = length;
                maxWord = word;
            }
            if (length < min) {
                min = length;
                minWord = word;
            }
        }
        System.out.print("Max word with length " + max + " and min word with length " + min + " are: ");
        return maxMin(maxWord, minWord);
    }

    private String[] maxMin(String max, String min) {
        String[] words = new String[]{max, min};
        for (String word : words
                ) {
            System.out.print(" [" + word + "] ");
        }
        return words;
    }

    public void countWord(String word) {
        str = str.toLowerCase();
        clearAllSymbols();
        String[] a = str.split(" ");
        int count = 0;
        for (String textWord : a
                ) {
            if (textWord.equals(word)) {
                count++;
            }
        }

        System.out.println("Word: \"" + word + "\" is used in text " + count + " times");
    }

    private void clearAllSymbols() {
        str = str.replaceAll("[^a-zA-Zа-яА-Я]", " ");
    }

    public void replaceChar(int indexReplacement) {
        clearAllSymbols();
        String[] array = str.split(" ");
        char[] changedArray = new char[]{};
        for (String word : array
                ) {
            for (int i = 0; i <= changedArray.length; i++) {
                if (indexReplacement > word.length()) {
                   changedArray= word.toCharArray();

                }
                if (indexReplacement < word.length()) {
                    changedArray = word.toCharArray();
                    changedArray[indexReplacement] = 'D';
                }
            }
            System.out.println(changedArray);
        }
    }

}




