import java.util.ArrayList;

public class Dashboard {
    private ArrayList<Car> cars;

    public Dashboard() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void displayCars() {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
