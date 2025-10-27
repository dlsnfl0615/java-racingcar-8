package racingcar.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CarNameParser {
    public List<String> parse(String input) {
        String[] names = input.split(",");
        Set<String> uniqueNames = new HashSet<>();

        return Arrays.stream(names)
                .peek(CarNameValidator::isValid) // 이름 입력 양식 검증
                .peek(name -> {
                    if (!uniqueNames.add(name)) {
                        throw new IllegalArgumentException("자동차 이름이 중복됩니다.");
                    }
                })
                .collect(Collectors.toList());
    }
}
