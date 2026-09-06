public class Starter extends Dish {
    private String suplement;

    public Starter(String name, boolean isVegan, boolean isGlutenFree, String suplement) {
        super(name, isVegan, isGlutenFree);
        this.suplement = suplement;
    }
}
