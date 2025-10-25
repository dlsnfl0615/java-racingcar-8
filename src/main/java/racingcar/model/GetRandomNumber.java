package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class GetRandomNumber {
    public static boolean random() {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if (randomNumber >= 4) {
            return true;
        }
        return false;
    }
}
