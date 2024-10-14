package menu_factory;

import components.*;

/**
 * This class implements the RestaurantMenuFactory interface to create items for the Spring menu.
 * 
 * I modified this factory to handle the creation of the menu components (entree, main course, dessert, drink) 
 * that are specific to the Spring season. This ensures that each season has its own distinct set of dishes.
 * 
 * @author gouraya
 * @author Yazid Mohamed
 * 
 */
public class SpringRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public Drink createDrink() {
        return new SpringDrink();
    }

    @Override
    public MainCourse createMainCourse() {
        return new SpringMainCourse();
    }

    @Override    
    public Entree createEntree() {
        return new SpringEntree();
    }

    @Override    
    public Dessert createDessert() {
        return new SpringDessert();
    }
}
