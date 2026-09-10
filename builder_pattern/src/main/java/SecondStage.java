public interface SecondStage {
    DessertStage withDessert();
    CoffeeStage withCoffee();
    SecondStage withDrink();
    Menu build();
}
