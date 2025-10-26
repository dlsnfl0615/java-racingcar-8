package racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetWinner {
    public List<Car> winner(List<Car> cars) {
        Car maxDistanceCar = Collections.max(cars);
        List<Car> winnerCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.equals(maxDistanceCar)) {
                winnerCars.add(car);
            }
        }
        return winnerCars;
    }
}
