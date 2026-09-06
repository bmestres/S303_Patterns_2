public class Dessert extends Dish{

    private DessertType dessertType;

    public Dessert(String name, boolean isVegan, boolean isGlutenFree, DessertType dessertType) {
        super(name, isVegan, isGlutenFree);
        this.dessertType = dessertType;
    }
}
