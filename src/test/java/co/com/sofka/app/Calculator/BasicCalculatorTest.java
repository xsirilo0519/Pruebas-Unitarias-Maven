package co.com.sofka.app.Calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.lang.Float.NaN;
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

    @Test
    @DisplayName("Testing multi: 1-1=0")
    public void subtrac() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.multi(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing subtrac: 1-1=0")
    public void multi() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.subtrac(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test()
    @DisplayName("Testing divi: 1-1=0")
    public void divi() throws Exception {
        // Arrange
        float number1 = 0;
        float number2 = 0;
        float expectedValue = NaN;

        // Act
        float result = basicCalculator.divi(number1, number2);

        // Assert
        assertEquals(expectedValue,result );
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    // Arrange
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        // Act
        // Assert
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }


    @DisplayName("Testing several subtracs")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "1,    2,   -1",
            "51,  49, 2",
            "100, 1, 99"
    })
    public void severalSubtracs(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtrac(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several multis")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   0",
            "1,    2,   2",
            "5,  4, 20",
            "-2, 1, -2"
    })
    public void severalMultis(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multi(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several divisions")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "17,    0,   Infinity",
            "0,    0,   NaN",
            "10,  2, 5",
            "1,  100, 0.01"
    })
    public void severalDivisions(float first, float second, float expectedResult){
        assertEquals(expectedResult, basicCalculator.divi(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }

}
