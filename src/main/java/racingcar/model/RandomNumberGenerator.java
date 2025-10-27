package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {
    public static boolean random() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        return randomNumber >= 4;
    }
}
