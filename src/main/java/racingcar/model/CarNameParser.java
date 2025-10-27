package racingcar.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarNameParser {
    public List<String> parse(String input) {
        String[] names = input.split(",");

        return Arrays.stream(names)
                .peek(CarNameValidator::isValid) // 이름 입력 양식 검증
                .collect(Collectors.toList());
    }
}
