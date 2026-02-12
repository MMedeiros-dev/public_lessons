public class App {
    public static void main(String[] args) throws Exception {
        Inventory inventory = new Inventory();
        
        inventory.addItem("Apple", 5, "Fuji");
        inventory.addItem("Sword", 1, 10, "Melee");
        inventory.displayInventory();
    }
}
