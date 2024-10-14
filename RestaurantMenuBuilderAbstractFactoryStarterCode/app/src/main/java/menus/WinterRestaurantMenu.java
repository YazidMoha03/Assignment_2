package menus;

import menu_factory.RestaurantMenuFactory;

public class WinterRestaurantMenu extends RestaurantMenu {

    RestaurantMenuFactory theFactory;

    public WinterRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }

    @Override
    public void populateMenu() {
        System.out.println("Adding items to " + getName());
        this.entree = theFactory.createEntree();
        this.mainCourse = theFactory.createMainCourse();
        this.dessert = theFactory.createDessert();
        this.drink = theFactory.createDrink();
    }
}
