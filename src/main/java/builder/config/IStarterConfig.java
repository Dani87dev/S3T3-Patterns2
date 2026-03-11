package builder.config;

import builder.steps.IMainCourseStep;

public interface IStarterConfig extends IMainCourseStep {
    IStarterConfig isVegan();
    IStarterConfig isGlutenFree();
}