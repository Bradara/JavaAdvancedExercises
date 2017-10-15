import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] names = br.readLine().split("\\s+");
        String[] letters = br.readLine().toLowerCase().split("\\s+");
        Predicate<String> beginWith = s-> Character.toString(s.toLowerCase().charAt(0)).equals(letters[0])||
                Character.toString(s.toLowerCase().charAt(0)).equals(letters[1]);
//        List<String> filtered = Arrays.stream(names).filter(beginWith)
//                .sorted(Comparator.comparing(String::length).reversed()).limit(1).collect(Collectors.toList());
        Optional<String> result = Arrays.stream(names).filter(beginWith)
                .sorted(Comparator.comparing(String::length).reversed()).limit(1).findFirst();
//
//        if (filtered.size()>0) {
//            System.out.println(filtered.get(0));
//        }else{
//            System.out.println("No match");
//        }

        if (!result.isPresent()) {
            System.out.println("No match");
        } else{
            System.out.println(result.get());
        }
    }
}
