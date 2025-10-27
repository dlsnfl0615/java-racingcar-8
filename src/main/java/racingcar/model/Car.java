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

    // 이동 칸 수(숫자)를 문자열로 시각화하기
    public String getDistance() {
        String result = "";
        result = name + " : ";
        for (int i = 0; i < moveDistance; i++) {
            result += "-";
        }

        return result;
    }

    public String getWinner() {
        return name;
    }
}
