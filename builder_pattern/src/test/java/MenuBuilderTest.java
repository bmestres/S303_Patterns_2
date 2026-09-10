import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuBuilderTest {

    @Test
    void menu01ShouldHaveExpectedAttributesAfterBuilding() {

        Menu executiveMenu = new MenuBuilder()
                .withStarter("Mediterranean Salad")
                .isVegan()
                .isGlutenFree()
                .withMainCourse("Beef Stake")
                .withSuplement("Extra Side")
                .withDessert("Chocolate Mousse")
                .withDrink("Red Wine")
                .build();

        assertEquals("Mediterranean Salad", executiveMenu.getStarterName());
        assertTrue(executiveMenu.isVeganStarter());
        assertTrue(executiveMenu.isGlutenFreeStarter());
        assertEquals("Beef Stake", executiveMenu.getMainCourseName());
        assertFalse(executiveMenu.isVeganMainCourse());
        assertFalse(executiveMenu.isGlutenFreeMainCourse());
        assertEquals("Extra Side", executiveMenu.getSuplementMainCourse());
        assertEquals("Chocolate Mousse", executiveMenu.getDessertName());
        assertTrue(executiveMenu.getCoffeeName().isBlank());
        assertEquals("Red Wine", executiveMenu.getDrinkName());
    }

    @Test
    void menu02ShouldHaveExpectedAttributesAfterBuilding() {

        Menu kidsMenu = new MenuBuilder()
                .withMainCourse("Penne WithTomato Sauce")
                .withDessert("Vanilla Ice Cream")
                .withDrink("Orange Juice")
                .build();

        assertTrue(kidsMenu.getStarterName().isBlank());
        assertFalse(kidsMenu.isVeganStarter());
        assertFalse(kidsMenu.isGlutenFreeStarter());
        assertEquals("Penne WithTomato Sauce", kidsMenu.getMainCourseName());
        assertFalse(kidsMenu.isVeganMainCourse());
        assertFalse(kidsMenu.isGlutenFreeMainCourse());
        assertTrue(kidsMenu.getSuplementMainCourse().isBlank());
        assertEquals("Vanilla Ice Cream", kidsMenu.getDessertName());
        assertTrue(kidsMenu.getCoffeeName().isBlank());
        assertEquals("Orange Juice", kidsMenu.getDrinkName());

    }

    @Test
    void menu03ShouldHaveExpectedAttributesAfterBuilding() {

        Menu halfMenu = new MenuBuilder()
                .withMainCourse("Mushroom Risotto")
                .isVegan()
                .withCoffee("Espresso")
                .withDrink("Water")
                .build();

        assertTrue(halfMenu.getStarterName().isBlank());
        assertFalse(halfMenu.isVeganStarter());
        assertFalse(halfMenu.isGlutenFreeStarter());
        assertEquals("Mushroom Risotto", halfMenu.getMainCourseName());
        assertTrue(halfMenu.isVeganMainCourse());
        assertFalse(halfMenu.isGlutenFreeMainCourse());
        assertTrue(halfMenu.getSuplementMainCourse().isBlank());
        assertTrue(halfMenu.getDessertName().isBlank());
        assertEquals("Espresso", halfMenu.getCoffeeName());
        assertEquals("Water", halfMenu.getDrinkName());


    }

}