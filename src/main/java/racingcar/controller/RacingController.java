package racingcar.controller;

import racingcar.model.RaceManager;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

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
        String inputLap = inputView.inputNameLap();
        int lap = raceManager.validateLap(inputLap);

        raceManager.initNameLap(carNames, lap);

        for (int i = 0; i < lap; i++) {
            raceManager.moveCar();
            List<String> raceProgress = raceManager.getDistancesPerLap();
            outputView.printRaceProgress(raceProgress);
        }

        String winners = raceManager.getWinner();
        outputView.printResult(winners);
    }
}
