package menus;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 * This abstract class represents the basic structure of a restaurant menu.
 * 
 * I Modified this class to ensure that every menu contains a name, period, 
 * and the four key components: entree, main course, dessert, and drink.
 * Each seasonal menu will extend this class to define the specific items for the season.
 * 
 * @author gouraya
 * @author Yazid Mohamed
 * 
 */
public abstract class RestaurantMenu {

    private String name;   // The name of the menu (e.g., "Fall Menu")
    private String period; // The active period for the menu (e.g., "September 1 to November 30")

    // These fields represent the menu items (entree, main course, dessert, drink) for the season
    protected Entree entree;
    protected MainCourse mainCourse;
    protected Dessert dessert;
    protected Drink drink;

    /**
     * Gets the name of the menu.
     * 
     * @return a String representing the name of the menu.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the menu.
     * 
     * @param name the name of the menu (e.g., "Fall Menu").
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the active period of the menu.
     * 
     * @return a String representing the active period of the menu.
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the active period of the menu.
     * 
     * @param period the active period of the menu (e.g., "September 1 to November 30").
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * Populates the menu with items. This method will be implemented by the subclasses
     * to populate the specific seasonal menu with its items (entree, main course, dessert, drink).
     */
    public abstract void populateMenu();

    /**
     * Returns a String representation of the menu, showing its name, active period, 
     * and the items (entree, main course, dessert, drink).
     * 
     * @return a String representing the entire menu and its items.
     * 
     */
    @Override
    public String toString() {
        return getName() + "\nActive: " + getPeriod() + "\n" +
               "Entree: " + entree + "\n" +
               "Main Course: " + mainCourse + "\n" +
               "Dessert: " + dessert + "\n" +
               "Drink: " + drink + "\n";
    }
}

