package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class GetWinner {
    public List<Car> winner(List<Car> cars, int lap) {
        List<Car> winner = new ArrayList<>();

        for (Car car : cars) {
            if (car.isFinished(lap)) {
                winner.add(car);
            }
        }
        if (!winner.isEmpty()) {
            return winner;
        }

        int maxDistance = 0;
        for (Car car : cars) {
            if (car.getMoveDistance() > maxDistance) {
                maxDistance = car.getMoveDistance();
            }
        }
        for (Car car : cars) {
            if (car.getMoveDistance() == maxDistance) {
                winner.add(car);
            }
        }
        return winner;
    }
}
