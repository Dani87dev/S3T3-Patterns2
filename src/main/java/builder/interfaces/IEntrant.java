package builder.interfaces;

public interface IEntrant {

    IEntrant withStarter(String starter);
    IPrincipal withMainCourse(String mainCourse);
    IEntrant isVegan();
    IEntrant isGlutenFree();
    IEntrant withSupplement(String supplement);
}
