import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(" Toyota Corolla", 2010));
        cars.add(new Car(" Honda Civic", 2015));
        cars.add(new Car(" Ford Mustang", 2018));
        cars.add(new Car(" Chevrolet Camaro", 2016));
        cars.add(new Car(" BMW 3 Series", 2012));
        cars.add(new Car(" Audi A4", 2014));
        cars.add(new Car(" Mercedes-Benz C-Class", 2013));
        cars.add(new Car(" Volkswagen Golf", 2011));
        cars.add(new Car(" Mazda 3", 2017));
        cars.add(new Car(" Hyundai Elantra", 2019));

        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
