package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CarNameParserTest {
    @Test
    @DisplayName("쉼표로 구분된 기본 양식")
    void carNameParse() {
        CarNameParser carNameParser = new CarNameParser();
        List<String> names = carNameParser.parse("최진우,김성근");
        Assertions.assertThat(names)
                .hasSize(2)
                .containsExactly("최진우", "김성근");
    }

    @Test
    @DisplayName("자동차 이름이 5글자 초과")
    void longCarName() {
        CarNameParser carNameParser = new CarNameParser();
        assertThrows(IllegalArgumentException.class, () ->
            carNameParser.parse("최진우,12345678")
        );
    }

    @Test
    @DisplayName("자동차 이름이 공백")
    void blankCarName() {
        CarNameParser carNameParser = new CarNameParser();
        assertThrows(IllegalArgumentException.class, () ->
            carNameParser.parse("최진우, ")
        );
    }

    @Test
    @DisplayName("자동차 이름 중복")
    void duplicateCarName() {
        CarNameParser carNameParser = new CarNameParser();
        assertThrows(IllegalArgumentException.class, () ->
                carNameParser.parse("최진우,최진우")
        );
    }
}
