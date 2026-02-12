public class Toyota extends Car {
    public Toyota(String model, int year) {
        super("Toyota", model, year);
    }
    @Override
    protected void performDrive() {
        System.out.println("Toyota " + getModel() + " está dirigindo suavemente e economizando combustível.");
    }

}
