package 인터프리터_페턴;

import java.util.Stack;

public class PostfixParser {

    public static PostfixExpresstion parse(String expression) {
        Stack<PostfixExpresstion> stack = new Stack<>();
        for (char c: expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }

    private static PostfixExpresstion getExpression(char c, Stack<PostfixExpresstion> stack) {
        switch (c) {
            case '+':
                return new PlusExpression(stack.pop(), stack.pop());
            case '-':
                PostfixExpresstion right = stack.pop();
                PostfixExpresstion left = stack.pop();
                return new MinuxExpression(left, right);
            default:
                return new VariableExpression(c);

        }
    }
}
