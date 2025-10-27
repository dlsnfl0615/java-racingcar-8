package racingcar.view;

import racingcar.model.Car;

import java.util.List;

public class OutputView {
    public void printRaceProgress(List<String> distanceStrings) {
        for (String distance : distanceStrings) {
            System.out.println(distance);
        }
        System.out.println("==================");
    }

    public String formatWinners(List<Car> winners) {
        String result = "최종 우승자 : ";
        for (Car car : winners) {
            result += car.getWinner() + ", ";
        }
        result = result.substring(0, result.length() - 2);

        return result;
    }

    public void printWinners(List<Car> winners) {
        System.out.println(formatWinners(winners));
    }
}
