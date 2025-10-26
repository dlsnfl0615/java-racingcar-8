package racingcar.model;

public class Car implements Comparable<Car> {
    private final String name;
    private int moveDistance;
    public Car(String name, int moveDistance) {
        this.name = name;
        this.moveDistance = moveDistance;
    }
    public void move() {
        moveDistance++;
    }
    @Override
    public int compareTo(Car car) {
        return this.moveDistance - car.moveDistance;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return this.moveDistance == ((Car) obj).moveDistance;
    }
    public String getDistanceString() {
        String result = "";
        result = name + " : ";
        for (int i = 0; i < moveDistance; i++) {
            result += "-";
        }
        return result;
    }
}
