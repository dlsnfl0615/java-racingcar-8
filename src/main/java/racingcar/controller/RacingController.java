package racingcar.controller;

import racingcar.model.RaceManager;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {
    private final InputView inputView;
    private final OutputView outputView;
    private final RaceManager raceManager;

    public RacingController(InputView inputView, OutputView outputView, RaceManager raceManager) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.raceManager = raceManager;
    }

    public void startRace() {
        String carNames = inputView.inputNameLap();
        String lap = inputView.inputNameLap();

        raceManager.initNameLap(carNames, lap);
        String winners = raceManager.manage();

        outputView.printResult(winners);
    }
}
