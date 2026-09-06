public class Starter extends Dish {
    private Suplement suplement;

    public Starter(String name, boolean isVegan, boolean isGlutenFree, Suplement suplement) {
        super(name, isVegan, isGlutenFree);
        this.suplement = suplement;
    }
}
