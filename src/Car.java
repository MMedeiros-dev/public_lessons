public abstract class Car {
    private String make;
    private String model;
    private int year;

    private CarFunctions carFunctions = new CarFunctions();

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    protected CarFunctions getCarFunctions() {
        return carFunctions;
    }

    public void drive() {
        carFunctions.startCar();        // Sempre executa
        performDrive();                  // Cada carro implementa diferente (abstrato)
        carFunctions.stopCar();         // Sempre executa
    }

    protected abstract void performDrive();

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }

}
