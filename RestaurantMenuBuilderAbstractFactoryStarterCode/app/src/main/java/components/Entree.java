package components;

/**
 * This interface represents an Entree item in the restaurant menu.
 * Each Entree must implement the toString() method to return the name of the dish.
 * 
 * @author gouraya
 * @author Yazid Mohamed
 * 
 */
public interface Entree {
    
    /**
     * Returns the name of the entree.
     * 
     * @return a String representing the entree's name.
     */
    @Override
    public String toString();
}
