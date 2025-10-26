package racingcar;

import racingcar.controller.RacingController;
import racingcar.model.CarNameParser;
import racingcar.model.LapValidator;
import racingcar.model.RaceService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RaceService raceService = new RaceService(new CarNameParser(), new LapValidator());

        RacingController racingController = new RacingController(inputView, outputView, raceService);
        racingController.startRace();
    }
}
