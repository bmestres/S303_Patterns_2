public class MenuBuilder implements FirstStage {

    private final Menu menu;

    public MenuBuilder(){
        this.menu = new Menu();
    }

    @Override
    public StarterStage withStarter(String starterName) {
        this.menu.setStarterName(starterName);
        return new StartBuilder();
    }

    @Override
    public MainCourseStage withMainCourse(String mainCourseName) {
        this.menu.setMainCourseName(mainCourseName);
        return new MainCourseBuilder();
    }

    private class StartBuilder implements StarterStage {
        @Override
        public StarterStage isVegan() {
            menu.setVeganStarter(true);
            return this;
        }

        @Override
        public StarterStage isGlutenFree() {
            menu.setGlutenFreeStarter(true);
            return this;
        }

        @Override
        public MainCourseStage withMainCourse(String mainCourse) {
            menu.setMainCourseName(mainCourse);
            return new MainCourseBuilder();
        }
    }

        private class MainCourseBuilder implements MainCourseStage {
            @Override
            public MainCourseStage isVegan() {
                menu.setVeganMainCourse(true);
                return this;
            }

            @Override
            public MainCourseStage isGlutenFree() {
                menu.setGlutenFreeMainCourse(true);
                return this;
            }

            @Override
            public MainCourseStage withSuplement(String suplement) {
                menu.setSuplementMainCourse(suplement);
                return this;
            }

            @Override
            public DrinkStage withDessert(String dessert) {
                menu.setDessertName(dessert);
                return new DessertOrCoffeeBuilder();
            }

            @Override
            public DrinkStage withCoffee(String coffee) {
                menu.setCoffeeName(coffee);
                return new DessertOrCoffeeBuilder();
            }

            @Override
            public BuildStage withDrink(String drink) {
                menu.setDrinkName(drink);
                return new FinalBuilder();
            }

            @Override
            public Menu build(){
                return menu;
            }
        }

        private class DessertOrCoffeeBuilder implements DrinkStage {

            @Override
            public BuildStage withDrink(String drink) {
                menu.setDrinkName(drink);
                return new FinalBuilder();
            }

            @Override
            public Menu build() {
                return menu;
            }
        }

        private class FinalBuilder implements BuildStage {
            @Override
            public Menu build() {
                return menu;
            }
        }
    }




