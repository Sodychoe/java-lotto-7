package lotto.lotto;

import static lotto.lotto.constant.LottoConstant.NUM_OF_LOTTO_NUMBERS;

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
        if (numbers.size() != NUM_OF_LOTTO_NUMBERS) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    public int calculateMatchingCount(List<Integer> numbers) {
        return (int) this.numbers.stream()
                .filter(numbers::contains)
                .count();
    }

    public boolean hasNumber(int number) {
        return this.numbers.contains(number);
    }

    @Override
    public String toString() {
        List<Integer> view = List.copyOf(numbers)
                .stream()
                .sorted()
                .toList();

        return view.toString();
    }
}
