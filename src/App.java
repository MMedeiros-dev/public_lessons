public class App {
    public static void main(String[] args) throws Exception {
        Inventory inventory = new Inventory();
        inventory.addItem(new Item("Generic Item", 3));
        inventory.addItem(new Fruit("Apple", 5, "Fuji"));
        inventory.addItem(new Weapon("Sword", 1, 10, "Melee"));
        inventory.displayInventory();
    }
}
