package builder;

public interface IStarterStep {
    // Si trio entrant, em porta a les opcions del principal
    IMainCourseStep withStarter(String name);


}