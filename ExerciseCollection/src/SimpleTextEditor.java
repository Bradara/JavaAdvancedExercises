import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {

    private static ArrayDeque<String> command = new ArrayDeque<>();
    private static ArrayDeque<String> deletedText = new ArrayDeque<>();
    private static StringBuilder text = new StringBuilder();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfCommand = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < numberOfCommand; i++) {
            String[] input = scan.nextLine().split(" ");
            if (input.length == 2) {
                Integer action = Integer.parseInt(input[0]);
                String oper = input[1];
                editText(action, oper);
            } else{
                undo();
            }
        }
    }

    private static void undo() {
        String lastAction = command.pop();
        if (lastAction.charAt(0) == '1') {
            int len = text.length() - lastAction.length()+1;
            text.delete(len, text.length());
        }
        if (lastAction.charAt(0) == '2') {
            text.append(deletedText.pop());
        }
    }

    private static void editText(Integer action, String oper) {
        if (action == 1) {
            text.append(oper);
            command.push(action + oper);
        }
        if (action == 2) {
            int n = Integer.parseInt(oper);
            int len = text.length() - n;
            command.push(action + "");
            deletedText.push(text.substring(text.length()-n));
            text.delete(len, text.length());
        }
        if (action == 3) {
            int n = Integer.parseInt(oper);
            System.out.println(text.charAt(n-1));
        }
    }
}
