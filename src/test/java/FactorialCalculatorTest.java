import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCalculatorTest {
    @Test
    public void testFactorialPositiveNumber() {
        assertEquals(120, FactorialCalculator.factorial(5), "Факториал 5 должен быть 120");
        assertEquals(1, FactorialCalculator.factorial(0), "Факториал 0 должен быть 1");
        assertEquals(1, FactorialCalculator.factorial(1), "Факториал 1 должен быть 1");
        assertEquals(720, FactorialCalculator.factorial(6), "Факториал 6 должен быть 720");
    }

    @Test
    public void testFactorialLargeNumber() {
        assertEquals(2432902008176640000L, FactorialCalculator.factorial(20), "Факториал 20 должен быть 2432902008176640000");
    }
}
