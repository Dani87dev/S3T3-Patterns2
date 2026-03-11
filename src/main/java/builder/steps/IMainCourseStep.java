package builder.steps;

import builder.config.IMainCourseConfig;

public interface IMainCourseStep {
    IMainCourseConfig withMainCourse(String name);
}