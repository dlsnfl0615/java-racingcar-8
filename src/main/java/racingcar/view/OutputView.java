package racingcar.view;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

public class OutputView {
    // 이동거리를 "-"로 시각화
    public List<String> formatProgress(List<Car> cars) {
        List<String> progress = new ArrayList<>();
        for (Car car : cars) {
            String result = car.getName() + " : ";
            result += "-".repeat(car.getDistance());
            progress.add(result);
        }

        return progress;
    }

    public void printRaceProgress(List<Car> cars) {
        List<String> progress = formatProgress(cars);
        for (String distance : progress) {
            System.out.println(distance);
        }
        System.out.println("==================");
    }

    public String formatWinners(List<Car> winners) {
        String result = "최종 우승자 : ";
        for (Car car : winners) {
            result += car.getName() + ", ";
        }
        result = result.substring(0, result.length() - 2);

        return result;
    }

    public void printWinners(List<Car> winners) {
        System.out.println(formatWinners(winners));
    }
}
