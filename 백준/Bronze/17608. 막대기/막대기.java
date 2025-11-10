import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int max = 0;

        for (int i = 0; i < num; i++) {
            int value = scan.nextInt();
            myStack.push(value);
            if (max < myStack.peek()) {
                max = myStack.peek();
            }
        }

        int see = 0;

        int result = 0;
        
        for (int i = 0; i < num; i++) {
            int pop = myStack.pop();
            if (see < pop) {
                see = pop;
                result++;
            }

            if (pop == max) {
                break;
            }
        }

        System.out.println(result);
    }
}
