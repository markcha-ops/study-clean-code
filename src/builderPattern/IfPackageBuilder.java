package builderPattern;

public interface IfPackageBuilder {
    IfConditionBuilder setIfCondition(IfCondition ifCondition);
    IfPackageBuilder setIfSechedule(IfSchedule ifSchedule);
    IfPackageBuilder setIfTarget(IfTarget ifTarget);
    IfPackageBuilder setIfThen(IfThen ifThen);

    IfConditionBuilder setIfPackage(IfPackage ifPackage);
    IfPackage getIfPackage();
}
