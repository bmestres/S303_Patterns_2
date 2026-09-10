public class Menu {
    private String starterName;
    private boolean veganStarter;
    private boolean glutenFreeStarter;

    private String mainCourseName;
    private boolean veganMainCourse;
    private boolean glutenFreeMainCourse;
    private String suplementMainCourse;

    private String dessertName;
    private String coffeeName;
    private String drinkName;

    public Menu() {
        this.starterName = "";
        this.veganStarter = false;
        this.glutenFreeStarter = false;
        this.mainCourseName = "";
        this.veganMainCourse = false;
        this.glutenFreeMainCourse = false;
        this.suplementMainCourse = "";
        this.dessertName = "";
        this.coffeeName = "";
        this.drinkName = "";
    }

    public String getStarterName() {
        return starterName;
    }

    public boolean isVeganStarter() {
        return veganStarter;
    }

    public boolean isGlutenFreeStarter() {
        return glutenFreeStarter;
    }

    public String getMainCourseName() {
        return mainCourseName;
    }

    public boolean isVeganMainCourse() {
        return veganMainCourse;
    }

    public boolean isGlutenFreeMainCourse() {
        return glutenFreeMainCourse;
    }

    public String getSuplementMainCourse() {
        return suplementMainCourse;
    }

    public String getDessertName() {
        return dessertName;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setStarterName(String starterName) {
        this.starterName = starterName;
    }

    public void setVeganStarter(boolean veganStarter) {
        this.veganStarter = veganStarter;
    }

    public void setGlutenFreeStarter(boolean glutenFreeStarter) {
        this.glutenFreeStarter = glutenFreeStarter;
    }

    public void setMainCourseName(String mainCourseName) {
        this.mainCourseName = mainCourseName;
    }

    public void setVeganMainCourse(boolean veganMainCourse) {
        this.veganMainCourse = veganMainCourse;
    }

    public void setGlutenFreeMainCourse(boolean glutenFreeMainCourse) {
        this.glutenFreeMainCourse = glutenFreeMainCourse;
    }

    public void setSuplementMainCourse(String suplementMainCourse) {
        this.suplementMainCourse = suplementMainCourse;
    }

    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }
}
