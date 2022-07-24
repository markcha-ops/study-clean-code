package 인터프리터_페턴;

import java.util.Map;

public interface PostfixExpresstion {
    int interpret(Map<Character, Integer> context);
}
