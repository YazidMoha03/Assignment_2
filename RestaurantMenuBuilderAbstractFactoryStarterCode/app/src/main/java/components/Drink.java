package components;

/**
 * This interface represents a Drink item in the restaurant menu.
 * Each Drink must implement the toString() method to return the name of the drink.
 * 
 * @author gouraya
 * 
 */
public interface Drink {

    /**
     * Returns the name of the drink.
     * 
     * @return a String representing the drink's name.
     */
    @Override
    public String toString();
}
