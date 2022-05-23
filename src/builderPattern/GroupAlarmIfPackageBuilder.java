package builderPattern;

public class GroupAlarmIfPackageBuilder implements IfPackageBuilder{
    private IfCondition ifCondition;
    private IfSchedule ifSchedule;
    private IfTarget ifTarget;
    private IfThen ifThen;
    @Override
    public IfPackageBuilder setIfCondition(IfCondition ifCondition) {
         this.ifCondition = ifCondition;
         return this;
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
    public IfPackage getIfPackage() {
        return new IfPackage(ifCondition, ifSchedule, ifTarget, ifThen);
    }
}
