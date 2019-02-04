import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void canAdd(){
        assertEquals(11, Calculator.add(5, 6));
    }

    @Test
    public void canSubtract(){
        assertEquals(4, Calculator.subtract(9, 5));
    }

    @Test
    public void canMultiply(){
        assertEquals(20, Calculator.multiply(4, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(3, Calculator.divide(27, 9));
    }
}
