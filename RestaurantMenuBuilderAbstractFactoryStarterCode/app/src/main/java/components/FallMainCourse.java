package components;

/**
 * The FallMainCourse class represents a main course item for the Fall menu.
 * 
 * I chose "Salmon Avocado Toast" as the main course for the Fall season,as per the provided Doc on bright space.
 * 
 */
public class FallMainCourse implements MainCourse {
    @Override
    public String toString() {
        return "Salmon Avocado Toast\nPesto Chicken "
        		+ "Penne Asiago\nPortobello "
        		+ "Mushroom Chicken";
    }
}
