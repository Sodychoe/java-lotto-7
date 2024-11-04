package lotto.lotto;

import java.util.List;
import lotto.lotto.providable.NumbersProvidable;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public static Lotto create(NumbersProvidable numbersProvidable) {
        return new Lotto(numbersProvidable.provide());
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
