public class App {
    public static void main(String[] args) throws Exception {
        
        Toyota myToyota = new Toyota("Corolla", 2021);
        Dashboard dashboard = new Dashboard();
        dashboard.addCar(myToyota);
        dashboard.displayCars();

        myToyota.drive();
        
    }
}
