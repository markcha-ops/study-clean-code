package 인터프리터_페턴;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PostfixExpresstion expresstion = PostfixParser.parse("xyz+-");
        int result = expresstion.interpret(Map.of('x', 1, 'y', 2, 'z', 3));
        System.out.println(result);


    }
}


