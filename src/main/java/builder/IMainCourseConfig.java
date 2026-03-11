package builder;

public interface IMainCourseConfig extends IAfterMainStep {
    IMainCourseConfig withSupplement(String supplement);
    IMainCourseConfig isVegan();
    IMainCourseConfig isGlutenFree();
}