package builder.steps;

import builder.config.IMainCourseConfig;
import builder.config.IStarterConfig;

public interface IStarterStep {
    IStarterConfig withStarter(String name);
    IMainCourseConfig withMainCourse(String name); // Para el medio menú
}