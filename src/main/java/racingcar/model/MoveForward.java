package racingcar.model;

public class MoveForward {
    public void move(Car car) {
        if (GetRandomNumber.random()) {
            car.move();
        }
    }
}
