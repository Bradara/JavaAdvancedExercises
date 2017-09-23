import java.util.Scanner;

public class CollectTheCoins {

    private static String[][] board = new String[4][];
    private static int hitsInWall = 0;
    private static int coins = 0;
    private static int r = 0;
    private static int c = 0;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            String[] input = scan.nextLine().split("");
            board[i] = new String[input.length];
            board[i] = input;
        }

        String[] command = scan.nextLine().split("");
        if (board[0][0].equals("$")) {
            coins++;
        }

        for (String s : command) {
            if (s.equals(">")) {
                moveRight();
            } else if (s.equals("<")) {
                moveLeft();
            } else if (s.equals("^")) {
                moveUp();
            } else{
                moveDown();
            }
        }

        System.out.printf("Coins = %d%n", coins);
        System.out.printf("Walls = %d%n", hitsInWall);

    }

    private static void moveDown() {
        try{
            r++;
            checkForCoins();
        } catch (Exception e){
            r--;
            hitsInWall++;
        }
    }

    private static void moveUp() {
        try{
            r--;
            checkForCoins();
        } catch (Exception e){
            r++;
            hitsInWall++;
        }
    }

    private static void checkForCoins() {
        if (board[r][c].equals("$")) {
            coins++;
        }
    }

    private static void moveLeft() {
        try{
            c--;
            checkForCoins();
        } catch (Exception e){
            c++;
            hitsInWall++;
        }
    }

    private static void moveRight() {
        try{
            c++;
            if (board[r][c].equals("$")) {
                coins++;
            }
        } catch (Exception e){
            c--;
            hitsInWall++;
        }
    }
}
