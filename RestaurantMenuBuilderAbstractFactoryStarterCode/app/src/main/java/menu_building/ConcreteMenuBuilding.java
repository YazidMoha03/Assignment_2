package menu_building;
import menu_factory.*;
import menus.*;

/**
 * This class is responsible for building specific seasonal menus based on the season.
 * 
 * I Modified this class to delegate the menu-building process to the appropriate seasonal menu (Fall, Winter, Spring, Summer).
 * Each season's menu is populated with items created by the corresponding factory.
 * 
 * @author gouraya
 * @author Yazid Mohamed
 * 
 */
public class ConcreteMenuBuilding extends MenuBuilding {

    /**
     * Creates a specific seasonal menu based on the provided season.
     * 
     * This method uses different factories to build menus for Fall, Winter, Spring, or Summer.
     * 
     * @param season the name of the season for which the menu will be created.
     * @return a RestaurantMenu object representing the seasonal menu.
     * 
     */
    @Override
    protected RestaurantMenu makeMenuBuilding(String season) {
        RestaurantMenu theMenu = null;
        if ("Fall".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new FallRestaurantMenuFactory();
            theMenu = new FallRestaurantMenu(theFactory);
            theMenu.setName("Fall Menu");
            theMenu.setPeriod("September 1 to November 30.");
        } else if ("Winter".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new WinterRestaurantMenuFactory();
            theMenu = new WinterRestaurantMenu(theFactory);
            theMenu.setName("Winter Menu");
            theMenu.setPeriod("December 1 to February 28.");
        } else if ("Spring".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new SpringRestaurantMenuFactory();
            theMenu = new SpringRestaurantMenu(theFactory);
            theMenu.setName("Spring Menu");
            theMenu.setPeriod("March 1 to May 31.");
        } else if ("Summer".equalsIgnoreCase(season)) {
            RestaurantMenuFactory theFactory = new SummerRestaurantMenuFactory();
            theMenu = new SummerRestaurantMenu(theFactory);
            theMenu.setName("Summer Menu");
            theMenu.setPeriod("June 1 to August 31");
        }
        return theMenu;
    }
}

