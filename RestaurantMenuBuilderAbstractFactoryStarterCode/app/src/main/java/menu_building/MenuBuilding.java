package menu_building;

import menus.*;

/**
 * The MenuBuilding class provides an abstract framework for constructing seasonal restaurant menus.
 * 
 * This class defines a template for building menus by delegating the creation of seasonal menu components 
 * (entree, main course, dessert, drink) to its subclasses. The actual logic of creating the menu for 
 * specific seasons (Fall, Winter, Spring, Summer) will be implemented in the concrete subclasses.
 * 
 * The goal of this class is to standardize the process of menu construction while allowing flexibility
 * for each season to have its own distinct menu items.
 * 
 * @author gouraya
 * @author Yazid Mohamed
 * 
 */
public abstract class MenuBuilding {

    /**
     * This abstract method is responsible for building the restaurant menu for a specific season.
     * 
     * Subclasses of MenuBuilding, such as {@link ConcreteMenuBuilding}, will implement this method to define
     * how to create a menu for each season (Fall, Winter, Spring, Summer). This method returns the 
     * appropriate {@link RestaurantMenu} object for the given season, but the exact process is determined
     * by the subclass.
     * 
     * @param season the name of the season for which the menu is being constructed (e.g., "Fall", "Winter").
     * @return a {@link RestaurantMenu} object representing the seasonal menu.
     * 
     */
    protected abstract RestaurantMenu makeMenuBuilding(String season);

    /**
     * Constructs and populates the restaurant menu for the specified season.
     * 
     * This method calls the {@link #makeMenuBuilding(String)} method to get the menu for the given season, 
     * and then populates the menu with the correct items (entree, main course, dessert, drink). 
     * Once the menu is fully constructed, it is returned to the caller.
     * 
     * This method ensures that the menu is properly created and populated for each specific season.
     * 
     * @param season the name of the season for which the menu is being built (e.g., "Fall", "Winter").
     * @return a fully constructed and populated {@link RestaurantMenu} object for the given season.
     * 
     */
    public RestaurantMenu buildRestaurantMenu(String season) {
        // Use the concrete subclass to create the seasonal menu
        RestaurantMenu theMenu = makeMenuBuilding(season);
        
        // Populate the seasonal menu with items
        theMenu.populateMenu();
        
        // Return the fully constructed and populated seasonal menu
        return theMenu;
    }
}
