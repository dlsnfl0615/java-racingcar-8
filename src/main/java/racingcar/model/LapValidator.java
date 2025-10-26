package racingcar.model;

public class LapValidator {
    public int validate(String lap) {
        int returnLap;
        try {
            returnLap = Integer.parseInt(lap);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도할 횟수는 숫자 형태여야 합니다.");
        }

        return returnLap;
    }
}
