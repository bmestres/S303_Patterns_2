public class MenuBuilder implements StartBuildStep, StarterStage, MainCourseStage, DessertOrCoffeeStage, DessertStage, CoffeeStage {

    private Menu menu;

    public MenuBuilder(){
        this.menu = new Menu();
    }

    @Override
    public StarterStage isGlutenFree() {


        return null;
    }

    @Override
    public CoffeeStage withDrink(String drink) {
        return null;
    }

    @Override
    public Menu build() {
        return null;
    }

    @Override
    public DrinkStage withDessert() {
        return null;
    }

    @Override
    public MainCourseStage withSuplement(String suplement) {
        return null;
    }

    @Override
    public DessertStage withDessert(String dessert) {
        return null;
    }

    @Override
    public CoffeeStage withCoffee(String coffee) {
        return null;
    }

    @Override
    public StarterStage withStarter(String starterName) {
        return null;
    }

    @Override
    public MainCourseStage withMainCourse(String mainCourseName) {
        return null;
    }

    @Override
    public StarterStage isVegan() {
        return null;
    }


}
