public class Main {
    static void main(String[] args) {

        Menu executiveMenu = new MenuBuilder()
                .withStarter("Mediterranean Salad")
                .isVegan()
                .isGlutenFree()
                .withMainCourse("Beef Stake")
                .withSuplement("Extra Side")
                .withDessert("Chocolate Mousse")
                .withDrink("Red wine")
                .build();

        Menu kidsMenu = new MenuBuilder()
                .withMainCourse("Penne WithTomato Sauce")
                .withDessert("Vanilla Ice Cream")
                .withDrink("Orange Juice")
                .build();

        Menu halfMenu = new MenuBuilder()
                .withMainCourse("Mushroom Risotto")
                .isVegan()
                .withCoffee("Espresso")
                .withDrink("Water")
                .build();
    }
}
