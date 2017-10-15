import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AppliedArithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToLong(Long::parseLong).toArray();
        String input = br.readLine();
        while (!"end".equals(input)) {
            switch (input){
                case "add": arr =  Arrays.stream(arr).map(n -> n + 1).toArray(); break;
                case "multiply":arr =  Arrays.stream(arr).map(n -> n*2).toArray(); break;
                case "subtract":arr =  Arrays.stream(arr).map(n -> n-1).toArray(); break;
                case "print": Arrays.stream(arr).forEach(n -> System.out.print(n + " ")); break;
            }

            input = br.readLine();
        }

    }
}
