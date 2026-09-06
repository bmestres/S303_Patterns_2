public abstract class Dish {
    private String name;
    private boolean isVegan;
    private boolean isGlutenFree;

    public Dish(String name, boolean isVegan, boolean isGlutenFree){
        this.name = name;
        this.isVegan = isVegan;
        this.isGlutenFree = isGlutenFree;
    }
}
