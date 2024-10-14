package menu_factory;

import components.*;

/**
 * This class implements the RestaurantMenuFactory interface to create items for the Summer menu.
 * 
 * I modified/edited this factory to generate the Summer-specific menu items (entree, main course, dessert, drink).
 * This allows for a consistent menu-building process while keeping the items seasonal.
 * 
 * @author gouraya
 * @author Yazid Mohamed
 * 
 */
public class SummerRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public Drink createDrink() {
        return new SummerDrink();
    }

    @Override
    public MainCourse createMainCourse() {
        return new SummerMainCourse();
    }

    @Override    
    public Entree createEntree() {
        return new SummerEntree();
    }

    @Override    
    public Dessert createDessert() {
        return new SummerDessert();
    }
}

