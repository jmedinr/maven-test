package co.com.sofka.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing rest: 2-1=1")
    public void rest() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.rest(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing rest: 2*3=6")
    public void multiply() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 3L;
        Long expectedValue = 6L;

        // Act
        Long result = basicCalculator.multiply(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing rest: 2*3=6")
    public void division() {
        // Arrange
        Long number1 = 4L;
        Long number2 = 2L;
        Double expectedValue = 2.0;

        // Act
        Double result = basicCalculator.division(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

}
