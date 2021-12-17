package co.com.sofka.app.Calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    public Long subtrac(Long number1, Long number2) {
        logger.info( "subtracting {} - {}", number1, number2 );
        return number1 - number2;
    }
    public Long multi(Long number1, Long number2) {
        logger.info( "multiplying {} * {}", number1, number2 );
        return number1 * number2;
    }
    public float divi(float number1, float number2) throws ArithmeticException {
        logger.info( "dividing {} * {}", number1, number2 );
        try {
            return number1 / number2;
        }catch (ArithmeticException e){
            return Float.NaN;
        }

    }
}
