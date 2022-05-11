package co.com.sofka.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long rest(Long number1, Long number2) {
        logger.info( "Resting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2) {
        logger.info( "Multiplying {} * {}", number1, number2 );
        return number1*number2;
    }

    public Double division(Long number1, Long number2) {
        logger.info( "Divising {} / {}", number1, number2 );
        Double result;
        if (number2<=0) {
            throw new ArithmeticException("No se pueden procesar números negativos ni cero");
        }
        result = (double) (number1 / number2);
        return result;
    }

}
