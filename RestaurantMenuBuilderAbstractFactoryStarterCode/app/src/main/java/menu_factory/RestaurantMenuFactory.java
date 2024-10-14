package menu_factory;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 * The RestaurantMenuFactory interface defines the methods required to create each component of a restaurant menu.
 * 
 * I edited this interface to ensure that each season-specific menu factory (Fall, Winter, Spring, Summer) 
 * implements these methods consistently. This interface provides the structure for creating the 
 * drink, main course, entree, and dessert for any seasonal menu.
 * 
 * By using this interface, I can create different menu items depending on the season, 
 * while keeping the creation process standardized across all factories.
 * 
 * @author gouraya
 * @author Yazid Mohamed
 * 
 */
public interface RestaurantMenuFactory {
    
    /**
     * Creates a drink for the menu.
     * 
     * @return a Drink object representing the seasonal drink.
     */
    public Drink createDrink();
    
    /**
     * Creates a main course for the menu.
     * 
     * @return a MainCourse object representing the seasonal main course.
     */
    public MainCourse createMainCourse();
    
    /**
     * Creates an entree for the menu.
     * 
     * @return an Entree object representing the seasonal entree.
     */
    public Entree createEntree();
    
    /**
     * Creates a dessert for the menu.
     * 
     * @return a Dessert object representing the seasonal dessert.
     */
    public Dessert createDessert();
}
