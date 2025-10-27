package racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetWinner {
    // 가장 멀리 이동한 자동차의 이동거리가 우승자의 기준이 됨
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
