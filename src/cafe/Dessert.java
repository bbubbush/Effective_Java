package cafe;

public class Dessert extends Item {
    /* field */
    public boolean isFood;

    /* constructor */
    public Dessert() {

    }

    /* method */
    public boolean getIsFood() {
        return this.isFood;
    }

    public void setIsFood(boolean newIsFood) {
        this.isFood = newIsFood;
    }
}
