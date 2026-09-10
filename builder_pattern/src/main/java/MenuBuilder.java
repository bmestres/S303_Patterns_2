public class MenuBuilder implements FirstStage, StarterStage, MainCourseStage, CoffeeStage, DrinkStage {

    private final Menu menu;

    public MenuBuilder(){
        this.menu = new Menu();
    }

    @Override
    public StarterStage withStarter(String starterName) {
        this.menu.setStarterName(starterName);
        return this;
    }

    @Override
    public MenuBuilder isVegan() {
        if(this.menu.getStarterName() == null){
            this.menu.setVeganStarter(true);
        } else {
            this.menu.setVeganMainCourse(true);
        }
        return this;
    }

    @Override
    public StarterStage isGlutenFree() {
        if(this.menu.getStarterName() == null){
            this.menu.setGlutenFreeStarter(true);
        } else {
            this.menu.setGlutenFreeMainCourse(true);
        }
        return this;
    }

    @Override
    public MainCourseStage withMainCourse(String mainCourseName) {
        this.menu.setMainCourseName(mainCourseName);
        return this;
    }

    @Override
    public MainCourseStage withSuplement(String suplement) {
        this.menu.setSuplementMainCourse(suplement);
        return this;
    }

    @Override
    public DrinkStage withDessert(String dessert) {
        this.menu.setDessertName(dessert);
        return this;
    }

    @Override
    public DrinkStage withCoffee(String coffee) {
        this.menu.setCoffeeName(coffee);
        return this;
    }

    @Override
    public DrinkStage withDrink(String drink) {
        this.menu.setDrinkName(drink);
        return this;
    }

    @Override
    public Menu build() {
        return this.menu;
    }
}
