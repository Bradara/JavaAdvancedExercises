import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class FindEvenOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        String condition = br.readLine();

        switch (condition){
            case "odd":
        }
    }
}
