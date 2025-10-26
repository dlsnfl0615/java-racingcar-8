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

    public void initNameLap(String carNames, String lap) {
        List<String> seperatedNames = carNameParser.parse(carNames);
        for (int i = 0; i < seperatedNames.size(); i++) {
            cars.add(new Car(seperatedNames.get(i), 0));
        }

        this.lap = lapValidator.validate(lap);
    }

    public String manage() {
        for (int i = 0; i < lap; i++) {
            moveCar();
            printDistancePerLap();
        }

        List<Car> winners = getWinner.winner(cars);
        return getWinner.winnerListToString(winners);
    }

    public void moveCar() {
        for (int i = 0; i < cars.size(); i++) {
            moveForward.move(cars.get(i));
        }
    }

    public void printDistancePerLap() {
        for (Car car : cars) {
            car.getDistance();
        }
        System.out.println("==================");
    }
}
