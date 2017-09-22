import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nummerOfPlayers = Integer.parseInt(scan.nextLine());
        int winnerScore = Integer.MIN_VALUE;
        String winnerName = "";

        for (int i = 0; i < nummerOfPlayers; i++) {
            String name = scan.nextLine();
            int score = Integer.parseInt(scan.nextLine());

            for (int j = 0; j < name.length(); j++) {
                int point = name.charAt(j);
                if(point%2 == 0){
                    score += point;
                }else{
                    score -= point;
                }
            }

            if(score > winnerScore){
                winnerScore = score;
                winnerName = name;
            }
        }

        System.out.printf("The winner is %s - %d points", winnerName, winnerScore);
    }
}
