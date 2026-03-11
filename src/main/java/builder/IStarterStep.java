package builder;

public interface IStarterStep {
    IStarterConfig withStarter(String name);
    IMainCourseConfig withMainCourse(String name); // Para el medio menú
}