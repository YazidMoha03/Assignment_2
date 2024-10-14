package components;

/**
 * This interface represents a Main Course item in the restaurant menu.
 * Each Main Course must implement the toString() method to return the name of the dish.
 * 
 * 
 *@author gouraya
 *@author Yazid Mohamed
 *
 */
public interface MainCourse {

    /**
     * Returns the name of the main course.
     * 
     * @return a String representing the main course's name.
     */
    @Override
    public String toString();
}
