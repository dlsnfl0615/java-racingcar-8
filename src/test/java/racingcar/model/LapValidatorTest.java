package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LapValidatorTest {
    @Test
    @DisplayName("시도할 횟수로 올바른 형태")
    void properNumberInput() {
        LapValidator validator = new LapValidator();
        Assertions.assertThat(validator.validate("12")).isEqualTo(12);
    }

    @Test
    @DisplayName("시도할 횟수로 문자 입력")
    void inputWithCharacter() {
        LapValidator validator = new LapValidator();
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () ->
            validator.validate("1a2c3")
        );
    }
}
