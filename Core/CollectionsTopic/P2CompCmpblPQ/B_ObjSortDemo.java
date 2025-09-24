package Core.CollectionTopic.P2CompCmpblPQ;

import java.util.Arrays;
import java.util.Comparator;

class Car {
    String carName;
    String carType;

    Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }
}

// ? creating a functional interface from comparator
class CarNameComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.carName.compareTo(o2.carName);
    }
}

public class B_ObjSortDemo {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];
        carArray[0] = new Car("prims", "BMW");
        carArray[1] = new Car("soda", "BMW");
        carArray[2] = new Car("apple", "BMW");

        // without any comparator being passed, it would throw an error saying that unable cast to a comparable meaning it fails to identify how to compareTo.
        // below for string we use compareTo method.

        // ! 1. Using lambda function to define the comparator
        Arrays.sort(carArray, (Car c1, Car c2) -> c2.carName.compareTo(c1.carName));

        // ! 2. Using a new functional interface: class
        Arrays.sort(carArray, new CarNameComparator());

        for (Car car : carArray) {
            System.out.println(car.carName);
        }
    }
}
