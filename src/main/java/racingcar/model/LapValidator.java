package racingcar.model;

public class LapValidator {
    public boolean validate(String lap) {
        try {
            Integer.parseInt(lap);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도할 횟수는 숫자 형태여야 합니다.");
        }
        return true;
    }
}
