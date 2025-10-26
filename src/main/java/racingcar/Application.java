package racingcar;

import racingcar.controller.RacingController;
import racingcar.model.RaceManager;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RaceManager raceManager = new RaceManager();

        RacingController racingController = new RacingController(inputView, outputView, raceManager);
        racingController.startRace();
    }
}
