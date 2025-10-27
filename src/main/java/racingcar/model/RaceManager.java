package racingcar.model;

import java.util.List;

public class RaceManager {
    private final int lap;
    private final List<Car> cars;
    private final MoveForward moveForward;
    private final GetWinner getWinner;

    public RaceManager(List<Car> cars, int totalLapCount) {
        this.cars = cars;
        this.lap = totalLapCount;
        this.moveForward = new MoveForward();
        this.getWinner = new GetWinner();
    }

    public List<Car> getWinner() {
        return getWinner.winner(cars);
    }

    public void moveCar() {
        for (Car car : cars) {
            moveForward.move(car);
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getLap() {
        return lap;
    }
}
