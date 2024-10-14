package menu_factory;

import components.*;

/**
 * This class implements the RestaurantMenuFactory interface to create items for the Winter menu.
 * 
 * I edited/modified this factory to generate the specific menu items (entree, main course, dessert, drink) 
 * that belong to the Winter season. This keeps the menu creation process organized and seasonal.
 * 
 * @author gouraya
 * @author Yazid Mohamed
 * 
 */
public class WinterRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public Drink createDrink() {
        return new WinterDrink();
    }

    @Override
    public MainCourse createMainCourse() {
        return new WinterMainCourse();
    }

    @Override    
    public Entree createEntree() {
        return new WinterEntree();
    }

    @Override    
    public Dessert createDessert() {
        return new WinterDessert();
    }
}
