public interface MainCourseStage {
    MainCourseStage isVegan();
    MainCourseStage isGlutenFree();
    MainCourseStage withSuplement(String suplement);

    DessertStage withDessert(String dessert);
    CoffeeStage withCoffee(String coffee);
}
