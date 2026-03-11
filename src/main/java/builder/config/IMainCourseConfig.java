package builder.config;

import builder.steps.IAfterMainStep;

public interface IMainCourseConfig extends IAfterMainStep {
    IMainCourseConfig withSupplement(String supplement);
    IMainCourseConfig isVegan();
    IMainCourseConfig isGlutenFree();
}