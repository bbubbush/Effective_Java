package cafe;

public class Cake extends Dessert {
    /* field */
    public boolean isFlour;

    /* constructor */
    public Cake() {

    }

    /* method */
    public boolean getIsFlour() {
        return this.isFlour;
    }

    public void setIsFlour(boolean newIsFlour) {
        this.isFlour = newIsFlour;
    }
}
