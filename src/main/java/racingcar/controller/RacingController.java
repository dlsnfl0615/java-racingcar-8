package racingcar.controller;

import racingcar.model.RaceManager;
import racingcar.model.RaceService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingController {
    private final InputView inputView;
    private final OutputView outputView;
    private final RaceService raceService;

    public RacingController(InputView inputView, OutputView outputView, RaceService raceService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.raceService = raceService;
    }

    public void startRace() {
        String carNames = inputView.inputNameLap();
        String inputLap = inputView.inputNameLap();

        RaceManager raceManager = raceService.createRace(carNames, inputLap);

        for (int i = 0; i < raceManager.getLap(); i++) {
            raceManager.moveCar();
            List<String> raceProgress = raceManager.getDistancesPerLap();
            outputView.printRaceProgress(raceProgress);
        }

        String winners = raceManager.getWinner();
        outputView.printResult(winners);
    }
}
