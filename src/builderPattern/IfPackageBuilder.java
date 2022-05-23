package builderPattern;

public interface IfPackageBuilder {
    IfPackageBuilder setIfCondition(IfCondition ifCondition);
    IfPackageBuilder setIfSechedule(IfSchedule ifSchedule);
    IfPackageBuilder setIfTarget(IfTarget ifTarget);
    IfPackageBuilder setIfThen(IfThen ifThen);
    IfPackage getIfPackage();
}
