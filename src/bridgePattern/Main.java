package bridgePattern;

import builderPattern.GroupAlarmIfPackageBuilder;
import builderPattern.IfCondition;
import builderPattern.IfPackage;
import builderPattern.IfPackageBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillR();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.move();
    }
}


