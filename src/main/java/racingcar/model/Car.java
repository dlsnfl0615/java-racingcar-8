package racingcar.model;

public class Car {
    private final String name;
    private int moveDistance;
    public Car(String name, int moveDistance) {
        this.name = name;
        this.moveDistance = moveDistance;
    }
    public void move() {
        moveDistance++;
    }
    public boolean isFinished(int lap) {
        if (moveDistance >= lap) {
            return true;
        }
        return false;
    }
}
