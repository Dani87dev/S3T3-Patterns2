package builder.interfaces;

public interface IStarter {

    IStarter withStarter(String starter);
    IMainCourse withMainCourse(String mainCourse);
    IStarter isVegan();
    IStarter isGlutenFree();
    IStarter withSupplement(String supplement);
}
