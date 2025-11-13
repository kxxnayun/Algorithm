import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> myStack = new Stack<String>();

        int N = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < N; i++) {
            String text = scan.nextLine();
            String[] words = text.split(" ");

            for (String word : words) {
                myStack.push(word);
            }

            System.out.print("Case #" + (i + 1) + (": "));
            while(!myStack.isEmpty()) {
                System.out.print(myStack.pop());
                System.out.print(" ");
            }
        }
    }
}
