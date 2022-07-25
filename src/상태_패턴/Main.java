package 상태_패턴;

import 인터프리터_페턴.PostfixExpresstion;
import 인터프리터_페턴.PostfixParser;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
       OnlineCourse onlineCourse = new OnlineCourse();
       Student student = new Student("shiteship");
        System.out.println(onlineCourse.getReviews());


    }
}


