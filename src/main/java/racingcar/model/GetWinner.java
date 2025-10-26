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
    public String winnerListToString(List<Car> winners) {
        String result = "최종 우승자 : ";
        for (Car car : winners) {
            result += car.getWinner() + ", ";
        }
        result = result.substring(0, result.length() - 2);
        return result;
    }
}
