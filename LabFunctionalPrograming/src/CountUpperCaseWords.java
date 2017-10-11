import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Predicate;

public class CountUpperCaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        ArrayList<String> upperCaseWords = new ArrayList<>();
        Predicate<String> isUpper = x -> Character.isUpperCase(x.charAt(0));

        for (String word : input) {
            if (isUpper.test(word)) {
                upperCaseWords.add(word);
            }
        }

        System.out.println(upperCaseWords.size());
        upperCaseWords.forEach(System.out::println);
    }
}