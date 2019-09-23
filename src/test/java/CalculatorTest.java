import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    //Add
    @Test
    public void canAddNumbers(){
        assertEquals(13.00, calculator.add(10.00, 3.00), 0.01);
    }

    //Substract
    @Test
    public void canSubtractNumbers(){
        assertEquals(7, calculator.subtract(10.00, 3.00), 0.01);
    }

    //Multiply
    @Test
    public void canMultiplyNumbers(){
        assertEquals(30, calculator.multiply(10.00, 3.00), 0.01);
    }

    //Divide
    @Test
    public void canDivideNumbers(){
        assertEquals(3.33, calculator.divide(10.00, 3.00), 0.01);
    }



}

