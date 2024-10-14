package menus_main;

import menu_building.*;
import menus.*;

/**
 * This is the main test class where I build and display the menus for each season (Fall, Winter, Spring, Summer).
 * 
 * This class tests how the menu-building process works and ensures that each season's menu 
 * is correctly populated with the appropriate items (entree, main course, dessert, drink).
 * 
 *@author gouraya
 *@author Yazid Mohamed
 *
 */
public class MenuFactoryTest {

    public static void main(String[] args) {

        // Create a MenuBuilding object to build the menus
        MenuBuilding theBuilding = new ConcreteMenuBuilding();

        // Build and display the Fall menu
        RestaurantMenu theFallMenu = theBuilding.buildRestaurantMenu("Fall");
        System.out.println(theFallMenu);

        // Build and display the Winter menu
        RestaurantMenu theWinterMenu = theBuilding.buildRestaurantMenu("Winter");
        System.out.println(theWinterMenu);

        // Build and display the Spring menu
        RestaurantMenu theSpringMenu = theBuilding.buildRestaurantMenu("Spring");
        System.out.println(theSpringMenu);

        // Build and display the Summer menu
        RestaurantMenu theSummerMenu = theBuilding.buildRestaurantMenu("Summer");
        System.out.println(theSummerMenu);
    }
}

