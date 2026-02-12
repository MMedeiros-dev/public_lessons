
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }   

    // overloading addItem method to accept parameters for creating a Fruit directly
    public void addItem(String name, int quantity, String type) {
        items.add(new Fruit(name, quantity, type));
    }

    public void addItem(String name, int quantity, int damage, String weaponType) {
        items.add(new Weapon(name, quantity, damage, weaponType));
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (Item item : items) {
            item.displayInfo();
        }
    }


}
