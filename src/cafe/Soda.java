package cafe;

public class Soda extends Drink {
    /* field */
    public boolean isCarbonated;

    /* constructor */
    public Soda() {

    }
    /* method */
    public boolean getIsCarbonated() {
        return this.isCarbonated;
    }

    public void setIsCarbonated(boolean newIsCarbonated) {
        this.isCarbonated = newIsCarbonated;
    }
}
