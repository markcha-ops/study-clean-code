package builderPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
         IfPackageBuilder ifPackageBuilder = new GroupAlarmIfPackageBuilder();
        IfPackage ifPackage = ifPackageBuilder.setIfCondition(new IfCondition())
                .setIfSechedule(new IfSchedule())
                .setIfThen(new IfThen())
                .setIfTarget(new IfTarget())
                .getIfPackage();

        List<String> strs = new ArrayList<>();


    }
}


