package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    private final Sample sample = new Sample();

    @Test
    void test_add_operation() {
        int result = sample.op(Sample.Operation.ADD, 3, 2);
        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    void test_mult_operation() {
        int result = sample.op(Sample.Operation.MULT, 3, 2);
        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    void test_factorial_positive() {
        int result = sample.fact(5);
        Assertions.assertThat(result).isEqualTo(120);
    }

    @Test
    void test_factorial_zero() {
        int result = sample.fact(0);
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void test_factorial_negative() {
        Assertions.assertThatThrownBy(() -> sample.fact(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("N should be positive");
    }
  
}
