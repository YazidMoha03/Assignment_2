package components;

/**
 * This interface represents a Dessert item in the restaurant menu.
 * Each Dessert must implement the toString() method to return the name of the dessert.
 * 
 * @author gouraya
 * 
 */
public interface Dessert {

    /**
     * Returns the name of the dessert.
     * 
     * @return a String representing the dessert's name.
     */
    @Override
    public String toString();
}
