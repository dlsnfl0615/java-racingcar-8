package racingcar.controller;

import racingcar.model.Car;
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

        // 시도 횟수(랩)마다 경기 진행 상황 출력
        for (int i = 0; i < raceManager.getLap(); i++) {
            raceManager.moveCar();
            List<Car> raceProgress = raceManager.getCars();
            outputView.printRaceProgress(raceProgress);
        }

        List<Car> winners = raceManager.getWinner();
        outputView.printWinners(winners);
    }
}
