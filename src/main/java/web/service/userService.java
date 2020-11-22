package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class userService {
    private List<Car> carList = initCarList();

    public List<Car> initCarList() {
        carList = new ArrayList<>();

        carList.add(new Car("BMV", (short) 1991, "green"));
        carList.add(new Car("Ford", (short) 1963, "red"));
        carList.add(new Car("Mazda", (short) 1977, "black"));
        carList.add(new Car("Opel", (short) 2010, "blue"));
        carList.add(new Car("Mers", (short) 2020, "white"));
        return carList;
    }

    public List<Car> getCarList(Integer count) {

        List<Car> countedCar = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (count >= 5) {
                countedCar = carList;
                break;
            }
            countedCar.add(carList.get(i));
        }
        return countedCar;
    }
}
