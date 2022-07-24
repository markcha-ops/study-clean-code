package 인터프리터_페턴;

import bridgePattern.Champion;

import java.util.Map;

public class VariableExpression implements PostfixExpresstion {

    private Character vaiable;

    public VariableExpression(Character vaiable) {
        this.vaiable = vaiable;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(vaiable);
    }
}
