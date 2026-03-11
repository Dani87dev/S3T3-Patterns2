package builder;

public class Main {

    public static void main(String[] args){

        Menu menu = new MenuBuilder()
                .withStarter("Patates Braves")
                .withMainCourse("Pop a la gallega")
                .withDrink("Kombucha de llimona i gingebre")
                .build();

        System.out.println(menu);

    }
}
