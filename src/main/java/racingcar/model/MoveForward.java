package racingcar.model;

public class MoveForward {
    public void move(Car car) {
        if (RandomNumberGenerator.random()) {
            car.move();
        }
    }
}
