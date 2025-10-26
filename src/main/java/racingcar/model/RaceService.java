package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class RaceService {
    private final CarNameParser carNameParser;
    private final LapValidator lapValidator;

    public RaceService(CarNameParser carNameParser, LapValidator lapValidator) {
        this.carNameParser = carNameParser;
        this.lapValidator = lapValidator;
    }

    // 초기화 및 검증 책임을 전담하여 Race 객체를 생성하고 반환
    public RaceManager createRace(String carNamesInput, String lapInput) {
        List<String> separatedNames = carNameParser.parse(carNamesInput);

        List<Car> cars = new ArrayList<>();
        for (String name : separatedNames) {
            cars.add(new Car(name, 0));
        }

        int totalLap = lapValidator.validate(lapInput);

        return new RaceManager(cars, totalLap);
    }
}
