package racingcar.view;

import java.util.List;

public class OutputView {
    public void printResult(String winners) {
        System.out.println(winners);
    }

    public void printRaceProgress(List<String> distanceStrings) {
        for (String distance : distanceStrings) {
            System.out.println(distance);
        }
        System.out.println("==================");
    }
}
