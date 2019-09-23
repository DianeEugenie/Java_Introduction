import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(10.00, 3.00);
    }

    @Test
    public void hasNumber1(){
        assertEquals(10.00, calculator.getNumber1(), 0.01);
    }

    @Test
    public void hasNumber2(){
        assertEquals(3.00, calculator.getNumber2(), 0.01);
    }
//ADD
//    @Test
//    public void canAddNumbers(){
//        assertEquals(13.00, calculator.addNumbers());
//    }


    //Substract

    //Multiply

    //Divide



}

