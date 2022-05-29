package builderPattern;

public class GroupAlarmIfPackageBuilder implements IfPackageBuilder{
    private IfCondition ifCondition;
    private IfSchedule ifSchedule;
    private IfTarget ifTarget;
    private IfThen ifThen;
    private IfPackage ifPackage;
    @Override
    public IfConditionBuilder setIfCondition(IfCondition ifCondition) {
         this.ifCondition = ifCondition;
         IfConditionBuilder ifConditionBuilder = new GroupAlarmIfConditionBuilder();
         return ifConditionBuilder;
    }

    @Override
    public IfPackageBuilder setIfSechedule(IfSchedule ifSchedule) {
        this.ifSchedule = ifSchedule;
        return this;
    }

    @Override
    public IfPackageBuilder setIfTarget(IfTarget ifTarget) {
        this.ifTarget = ifTarget;
        return this;
    }

    @Override
    public IfPackageBuilder setIfThen(IfThen ifThen) {
        this.ifThen = ifThen;
        return this;
    }

    @Override
    public IfConditionBuilder setIfPackage(IfPackage ifPackage) {
        this.ifPackage = ifPackage;
        IfConditionBuilder ifConditionBuilder = new GroupAlarmIfConditionBuilder();
        return ifConditionBuilder;
    }

    @Override
    public IfPackage getIfPackage() {
        return null;
    }
}
