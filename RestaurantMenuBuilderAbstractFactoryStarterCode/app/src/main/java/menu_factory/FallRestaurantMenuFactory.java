package menu_factory;

import components.*;

/**
 * This class implements the RestaurantMenuFactory interface to create items for the Fall menu.
 * 
 * I Modified this factory to generate each menu component (entree, main course, dessert, drink) for the Fall season.
 * This keeps the menu creation process consistent while allowing each season to have unique items.
 * 
 * @author gouraya
 * @author Yazid Mohamed
 * 
 */
public class FallRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates the drink for the Fall menu.
     * 
     * @return a FallDrink object representing the drink for the Fall menu.
     */
    @Override
    public Drink createDrink() {
        return new FallDrink();
    }

    /**
     * Creates the main course for the Fall menu.
     * 
     * @return a FallMainCourse object representing the main course for the Fall menu.
     */
    @Override
    public MainCourse createMainCourse() {
        return new FallMainCourse();
    }

    /**
     * Creates the entree for the Fall menu.
     * 
     * @return a FallEntree object representing the entree for the Fall menu.
     */
    @Override    
    public Entree createEntree() {
        return new FallEntree();
    }

    /**
     * Creates the dessert for the Fall menu.
     * 
     * @return a FallDessert object representing the dessert for the Fall menu.
     */
    @Override    
    public Dessert createDessert() {
        return new FallDessert();
    }
}
