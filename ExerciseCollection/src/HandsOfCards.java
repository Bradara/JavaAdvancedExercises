import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HandsOfCards {
    private static ArrayList<String> powerOfCards = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7",
                                            "8", "9", "10", "J", "Q", "K", "A"));
    private static ArrayList<String> typeOfCards = new ArrayList<>(Arrays.asList("0", "C", "D", "H", "S"));

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        LinkedHashMap<String, TreeSet<String>> playersPoints = new LinkedHashMap<>();

        while (!"JOKER".equals(input)) {
            String name = input.split(": ")[0];
            String[] cardsArr = input.split(": ")[1].split(", ");
            TreeSet<String> cards = new TreeSet<>();
            Collections.addAll(cards, cardsArr);

            if (playersPoints.containsKey(name)) {
                cards.addAll(playersPoints.get(name));
                playersPoints.put(name, cards);
            } else{
                playersPoints.put(name, cards);
            }

            input = bf.readLine();
        }


        playersPoints.forEach((k,v) -> System.out.printf("%s: %d%n", k, calcPoints(v)));
    }

    private static Integer calcPoints(TreeSet<String> cards) {
        int point = 0;
        for (String card : cards) {
            int len = card.length();
            int power = powerOfCards.indexOf(card.substring(0, len-1));
            int type = typeOfCards.indexOf(card.substring(len-1));
            point += power * type;
        }

        return point;
    }
}
