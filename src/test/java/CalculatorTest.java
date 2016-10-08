import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testShouldReturnCorrectResults() {
        Calculator calculator = new Calculator();

        Double actual = calculator.sum(4., 5.);
        Double expected = 9.;

        assertEquals(expected, actual);
    }

    @Test
    public void testShouldWorkWithNegativeNumbers() {
        Calculator calculator = new Calculator();

        Double actual = calculator.sum(-9., 10.);
        Double expected = 1.;

        assertEquals(expected, actual);
    }

    @Test
    public void testShouldWorkWithZeros() {
        Calculator calculator = new Calculator();

        Double actual = calculator.sum(0., 0.);
        Double expected = 0.;

        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testShouldThrowException() {
        Calculator calculator = new Calculator();

        Double actual = calculator.sum(null, 5.);
    }
}
