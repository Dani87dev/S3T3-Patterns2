package builder;

public interface IMainCourseStep {
    // Retorna una nova interfície que definirem ara (ex: IAfterMainStep)
    IAfterMainStep withMainCourse(String name);
}