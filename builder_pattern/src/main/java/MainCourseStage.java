public interface MainCourseStage {

    MainCourseStage isVegan();
    MainCourseStage isGlutenFree();
    MainCourseStage withSuplement(String suplement);

    DrinkStage withDessert(String dessert);
    DrinkStage withCoffee(String coffee);

    BuildStage withDrink(String drink);

    Menu build();
}
