package racingcar.model;

public class CarNameValidator {
    public static boolean isValid(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차의 이름은 5글자 이하여야 합니다.");
        }
        if (carName.equals(" ")) {
            throw new IllegalArgumentException("자동차의 이름은 공백이 될 수 없습니다.");
        }
        return true;
    }
}
