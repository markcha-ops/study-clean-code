package 인터프리터_페턴;

import java.util.Map;

public class MinuxExpression implements PostfixExpresstion{
    private PostfixExpresstion left, right;

    public MinuxExpression(PostfixExpresstion left, PostfixExpresstion right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return left.interpret(context) - right.interpret(context);
    }
}
