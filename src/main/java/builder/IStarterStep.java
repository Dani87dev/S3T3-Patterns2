package builder;

public interface IStarterStep {
    // Si trio entrant, em porta a les opcions del principal
    IMainCourseStep withStarter(String name);

    // Si salto l'entrant, també em porta al principal
    IMainCourseStep withMainCourse(String name);
}