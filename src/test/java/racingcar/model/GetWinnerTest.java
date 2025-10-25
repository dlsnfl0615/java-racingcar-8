package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GetWinnerTest {
    @Test
    @DisplayName("시도 횟수에 맞게 전진한 경우")
    void finishedCars() {
        List<Car> cars = List.of(new Car("car1", 5), new Car("car2", 3), new Car("car3", 5));
        GetWinner winner = new GetWinner();
        List<Car> winners = winner.winner(cars, 5);
        Assertions.assertThat(winners).containsExactly(cars.get(0), cars.get(2));
    }
}
