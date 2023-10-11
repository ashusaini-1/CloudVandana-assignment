
//1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayShuffle {
    public static void main(String[] args) {
        Integer[] originalArray = { 1, 2, 3, 4, 5, 6, 7 };
        List<Integer> list = Arrays.asList(originalArray);
        Collections.shuffle(list);
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(shuffledArray));
    }
}

// 2. Enter a Roman Number as input and convert it to an integer. (Example: IX =
// 9)

public class RomanToInteger {
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int currValue = romanCharToInt(c);

            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }

    private static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String romanNumber = "IX";
        int integerNumber = romanToInt(romanNumber);
        System.out.println(integerNumber);
    }
}

// 3. Check if the input is pangram or not. (A pangram is a sentence that
// contains all the
// alphabets from A to Z)

public class PangramChecker {
    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangramResult = isPangram(inputSentence);
        System.out.println(isPangramResult);
    }
}
