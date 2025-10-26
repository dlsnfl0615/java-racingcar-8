package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class RaceManager {
    private int lap;
    private final List<Car> cars = new ArrayList<>();
    private final MoveForward moveForward = new MoveForward();
    private final GetWinner getWinner = new GetWinner();
    private final CarNameParser carNameParser = new CarNameParser();
    private final LapValidator lapValidator = new LapValidator();

    public void initNameLap(String carNames, int lap) {
        List<String> seperatedNames = carNameParser.parse(carNames);
        for (String name : seperatedNames) {
            cars.add(new Car(name, 0));
        }

        this.lap = lap;
    }

    public String getWinner() {
        List<Car> winners = getWinner.winner(cars);
        return getWinner.winnerListToString(winners);
    }

    public void moveCar() {
        for (Car car : cars) {
            moveForward.move(car);
        }
    }

    public List<String> getDistancesPerLap() {
        List<String> distances = new ArrayList<>();
        for (Car car : cars) {
            distances.add(car.getDistance());
        }
        return distances;
    }

    public int validateLap(String inputLap) {
        return lapValidator.validate(inputLap);
    }
}
