import java.util.HashMap;
import java.util.Scanner;

public class MagicExchangableWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        String word1 = input[0];
        String word2 = input[1];
        HashMap<Character, Character> letters = new HashMap<>();
        int maxLen = Math.max(word1.length(), word2.length());
        int minLen = Math.min(word1.length(), word2.length());
        boolean isExchangable = true;

        for (int i = 0; i < minLen; i++) {
            Character key = word1.charAt(i);
            Character val = word2.charAt(i);

            if (!letters.containsKey(key) && !letters.containsValue(val)) {
                letters.put(key, val);
            }
            if (letters.containsKey(key) && val != letters.get(key)) {
                isExchangable = false;
            }
            if (letters.containsValue(val) && val != letters.get(key)) {
                isExchangable = false;
            }
        }

        String word = word1.length() > word2.length() ? word1 : word2;

        for (int i = minLen; i < maxLen; i++) {
            Character key = word.charAt(i);
            if (!letters.containsKey(key) && !letters.containsValue(key)) {
                isExchangable = false;
            }
        }

        System.out.println(isExchangable);

    }
}
