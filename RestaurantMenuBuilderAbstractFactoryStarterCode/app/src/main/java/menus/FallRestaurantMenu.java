package menus;

import menu_factory.RestaurantMenuFactory;

/**
 * This class represents the Fall menu and populates it with the items from the FallRestaurantMenuFactory.
 * 
 * The idea behind this class is to ensure that each season's menu can be populated 
 * with the correct components (entree, main course, dessert, drink) provided by the factory.
 * 
 * @author gouraya
 * @author Yazid Mohamed
 * 
 */
public class FallRestaurantMenu extends RestaurantMenu {

    RestaurantMenuFactory theFactory;

    /**
     * Constructor for the FallRestaurantMenu class.
     * It initializes the factory for creating the menu components.
     * 
     * @param factory the factory used to create the Fall menu components.
     */
    public FallRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }

    /**
     * Populates the Fall menu with the items created by the factory.
     * This method assigns the entree, main course, dessert, and drink for the Fall menu.
     */
    @Override
    public void populateMenu() {
        System.out.println("Adding items to " + getName());
        this.entree = theFactory.createEntree();
        this.mainCourse = theFactory.createMainCourse();
        this.dessert = theFactory.createDessert();
        this.drink = theFactory.createDrink();
        
    }
    
    @Override 
    public String toString() { return getName() 
    		+ "\nActive: " + getPeriod() 
    		+ "\nEntrees:\n" + 
    		entree 
    		+ "\nMain Courses:\n" + mainCourse 
    		+ "\nDesserts:\n" + dessert 
    		+ "\nDrinks:\n" + drink;
   }
}


