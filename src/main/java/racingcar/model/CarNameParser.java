package racingcar.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarNameParser {
    public List<String> parse(String input) {
        String[] names = input.split(",");

        return Arrays.stream(names)
                .peek(CarNameValidator::isValid)
                .collect(Collectors.toList());
    }
}
