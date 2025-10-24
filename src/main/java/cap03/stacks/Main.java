package cap03.stacks;
import java.util.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        while (sc.hasNext()) {
            try {
                Stack<String> stack = new Stack<>();
                String expression = sc.nextLine();
                for (int i = 0; i < expression.length(); i++) {
                    if (expression.charAt(i) == '(') {
                        stack.push(expression.charAt(i) + "");
                    } else if (expression.charAt(i) == ')') {
                        stack.pop();
                    }
                }
                if (stack.isEmpty()) {
                    System.out.println("correct");
                } else {
                    System.out.println("incorrect");
                }
            } catch (Exception e) {
                System.out.println("incorrect");
            }
        }
    }
}
